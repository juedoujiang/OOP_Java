package chapter5_castlegame;

import java.util.*;

public class Game {
	private Room currentRoom;

	public Game() {
  		createRooms();
 	}

	public void createRooms() {
  		Room outside,lobby,pub,study,bedroom;
  
  		//创造房间
  		outside = new Room("城堡外");
  		lobby = new Room("大堂");
  		pub = new Room("小酒吧");
  		study = new Room("书房");
 	 	bedroom = new Room("卧室");
  
  		// 初始化房间的出口
  		outside.setExits(null,lobby,study,pub);
  		lobby.setExits(null,null,null,outside);
  		pub.setExits(outside,bedroom,null,null);
  		bedroom.setExits(null,null,null,study);
   
  		currentRoom = outside;        //从城堡门外开始
 	}

	private void printWelcome()
 	{
  		System.out.println();
  		System.out.println("欢迎来到城堡!");
  		System.out.println("这是一个超级无聊的游戏。");
  		System.out.println("如果需要帮助，请输入'help'");
  		System.out.println();
  		showPrompt();
 	}
 	
//  以下为用户命令
 
 	private void printHelp()
 	{
  		System.out.println("迷路了吗？你可以做的命令有：go bye help");
  		System.out.println("如：\tgo east");
 	}

	private void goRoom(String direction){
  		Room nextRoom = currentRoom.getExit(direction);
  		if(nextRoom == null){
   			System.out.println("那里没有门！");
  		}
  		else{
   			currentRoom = nextRoom;
   			showPrompt();
  		}
 	}
	
	public void showPrompt() {
		System.out.println("你在"+ currentRoom);
		System.out.println("出口有：");
		System.out.print(currentRoom.getExitDesc());
		System.out.println();
	}

	public static void main(String[] args) {
  		Scanner in = new Scanner(System.in);
  		Game game = new Game();
  		game.printWelcome();
  
  		while (true){
   			String line = in.nextLine();
   			String[] words = line.split(" ");
   			if ( words[0].equals("help")){
    				game.printHelp();
   			}else if ( words[0].equals("go")){
    				game.goRoom(words[1]);
   			}else if ( words[0].equals("bye")){
    				break;
   			}
  		}
  
  		System.out.println("感谢您的光临。再见！");
  		in.close();
 	}
 }
