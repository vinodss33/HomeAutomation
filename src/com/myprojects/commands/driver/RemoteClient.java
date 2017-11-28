package com.myprojects.commands.driver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myprojects.commands.Command;
import com.myprojects.commands.LightCommandOff;
import com.myprojects.commands.LightCommandOn;
import com.myprojects.commands.invoker.RemoteRequestor;
import com.myprojects.receiver.Light;

public class RemoteClient {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
		RemoteRequestor remoteRequestor=	(RemoteRequestor) context.getBean("invoker");
		//RemoteRequestor invoker=new RemoteRequestor(new Command[7], new Command[7]);
		//invoker.setCommand(1, new LightCommandOn(new Light()), new LightCommandOff(new Light()));
		//invoker.setonCommands(onCommands);
		System.out.println("hi");
	Command command=remoteRequestor.getonCommands()[0];
	command.excute();
	System.out.println();
		remoteRequestor.getOffCommands()[0].excute();
	}

}
