/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.office.resource.office.debug;

/**
 * DebugMessages are exchanged between the debug server (the Eclipse debug
 * framework) and the debug client (a running process or interpreter). To exchange
 * messages they are serialized and sent over sockets.
 */
public class OfficeDebugMessage {
	
	private static final char DELIMITER = ':';
	private org.emftext.language.office.resource.office.debug.EOfficeDebugMessageTypes messageType;
	private String[] arguments;
	
	public OfficeDebugMessage(org.emftext.language.office.resource.office.debug.EOfficeDebugMessageTypes messageType, String[] arguments) {
		super();
		this.messageType = messageType;
		this.arguments = arguments;
	}
	
	public OfficeDebugMessage(org.emftext.language.office.resource.office.debug.EOfficeDebugMessageTypes messageType, java.util.List<String> arguments) {
		super();
		this.messageType = messageType;
		this.arguments = new String[arguments.size()];
		for (int i = 0; i < arguments.size(); i++) {
			this.arguments[i] = arguments.get(i);
		}
	}
	
	public org.emftext.language.office.resource.office.debug.EOfficeDebugMessageTypes getMessageType() {
		return messageType;
	}
	
	public String[] getArguments() {
		return arguments;
	}
	
	public String serialize() {
		java.util.List<String> parts = new java.util.ArrayList<String>();
		parts.add(messageType.name());
		for (String argument : arguments) {
			parts.add(argument);
		}
		return org.emftext.language.office.resource.office.util.OfficeStringUtil.encode(DELIMITER, parts);
	}
	
	public static OfficeDebugMessage deserialize(String response) {
		java.util.List<String> parts = org.emftext.language.office.resource.office.util.OfficeStringUtil.decode(response, DELIMITER);
		String messageType = parts.get(0);
		String[] arguments = new String[parts.size() - 1];
		for (int i = 1; i < parts.size(); i++) {
			arguments[i - 1] = parts.get(i);
		}
		org.emftext.language.office.resource.office.debug.EOfficeDebugMessageTypes type = org.emftext.language.office.resource.office.debug.EOfficeDebugMessageTypes.valueOf(messageType);
		OfficeDebugMessage message = new OfficeDebugMessage(type, arguments);
		return message;
	}
	
	public boolean hasType(org.emftext.language.office.resource.office.debug.EOfficeDebugMessageTypes type) {
		return this.messageType == type;
	}
	
	public String getArgument(int index) {
		return getArguments()[index];
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + "[" + messageType.name() + ": " + org.emftext.language.office.resource.office.util.OfficeStringUtil.explode(arguments, ", ") + "]";
	}
	
}
