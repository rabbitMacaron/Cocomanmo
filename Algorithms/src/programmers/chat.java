package programmers;

/*import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class chat {

	
	 [����ä�ù�]
	īī���� ����ä�ù濡���� ģ���� �ƴ� ������ ��ȭ�� �� �� �ִµ�, 
	���� �г����� �ƴ� ������ �г����� ����Ͽ� ä�ù濡 �� �� �ִ�.
	
	���Ի���� ��ũ��� īī���� ���� ä�ù��� ������ ����� ����, �پ��� ������� ������, ������ ���� ���Ѻ� �� �ִ� ������â�� ������ �ߴ�. 
	ä�ù濡 ������ ������ ���� �޽����� ��µȴ�.
	
	"[�г���]���� ���Խ��ϴ�."
	
	ä�ù濡�� ������ ������ ���� �޽����� ��µȴ�.
	
	"[�г���]���� �������ϴ�."
	
	ä�ù濡�� �г����� �����ϴ� ����� ������ ���� �� �����̴�.
	
	ä�ù��� ���� ��, ���ο� �г������� �ٽ� ����.
	ä�ù濡�� �г����� �����Ѵ�.
	�г����� ������ ���� ������ ä�ù濡 ��µǾ� �ִ� �޽����� �г��ӵ� ���� ����ȴ�.
	
	���� ���, ä�ù濡 "Muzi"�� "Prodo"��� �г����� ����ϴ� ����� ������� ������ ä�ù濡�� ������ ���� �޽����� ��µȴ�.
	
	"Muzi���� ���Խ��ϴ�."
	"Prodo���� ���Խ��ϴ�."
	
	ä�ù濡 �ִ� ����� ������ ä�ù濡�� ������ ���� �޽����� ���´�.
	
	"Muzi���� ���Խ��ϴ�."
	"Prodo���� ���Խ��ϴ�."
	"Muzi���� �������ϴ�."
	
	Muzi�� ������ �ٽ� ���� ��, Prodo ��� �г������� ���� ��� ������ ä�ù濡 �����ִ� Muzi�� Prodo�� ������ ���� ����ȴ�.
	
	"Prodo���� ���Խ��ϴ�."
	"Prodo���� ���Խ��ϴ�."
	"Prodo���� �������ϴ�."
	"Prodo���� ���Խ��ϴ�."
	
	ä�ù��� �ߺ� �г����� ����ϱ� ������, ���� ä�ù濡�� Prodo��� �г����� ����ϴ� ����� �� ���� �ִ�. ����, ä�ù濡 �� ��°�� ���Դ� Prodo�� Ryan���� �г����� �����ϸ� ä�ù� �޽����� ������ ���� ����ȴ�.
	
	"Prodo���� ���Խ��ϴ�."
	"Ryan���� ���Խ��ϴ�."
	"Prodo���� �������ϴ�."
	"Prodo���� ���Խ��ϴ�."
	
	ä�ù濡 ������ �����ų�, �г����� ������ ����� ��� ���ڿ� �迭 record�� �Ű������� �־��� ��, ��� ����� ó���� ��, ���������� ���� ������ ����� ���� �Ǵ� �޽����� ���ڿ� �迭 ���·� return �ϵ��� solution �Լ��� �ϼ��϶�.
	
	���ѻ���
	record�� ������ ���� ���ڿ��� ��� �迭�̸�, ���̴� 1 �̻� 100,000 �����̴�.
	������ record�� ��� ���ڿ��� ���� �����̴�.
	��� ������ [���� ���̵�]�� �����Ѵ�.
	[���� ���̵�] ����ڰ� [�г���]���� ä�ù濡 ���� - "Enter [���� ���̵�] [�г���]" (ex. "Enter uid1234 Muzi")
	[���� ���̵�] ����ڰ� ä�ù濡�� ���� - "Leave [���� ���̵�]" (ex. "Leave uid1234")
	[���� ���̵�] ����ڰ� �г����� [�г���]���� ���� - "Change [���� ���̵�] [�г���]" (ex. "Change uid1234 Muzi")
	ù �ܾ�� Enter, Leave, Change �� �ϳ��̴�.
	�� �ܾ�� �������� ���еǾ� ������, ���ĺ� �빮��, �ҹ���, ���ڷθ� �̷�����ִ�.
	���� ���̵�� �г����� ���ĺ� �빮��, �ҹ��ڸ� �����Ѵ�.
	���� ���̵�� �г����� ���̴� 1 �̻� 10 �����̴�.
	ä�ù濡�� ���� ������ �г����� �����ϴ� �� �߸� �� �Է��� �־����� �ʴ´�.
	 
	
	public static void main(String[] args) {
	//	String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		
		System.out.println(solution(record));
	}
	
	// �������̵� <-
	public static String[] solution(String[] record) {
		ArrayList<String> chatLog = new ArrayList<>();
        HashMap<String, String> nickMap = new HashMap<>();
        
        for(String log : record){
            StringTokenizer st = new StringTokenizer(log);
            String command = st.nextToken();
            String userId = st.nextToken();
            String nickname = "";
            
            if(!command.equals("Leave")){
                nickname = st.nextToken();
            }
            
            switch(command){
                case "Enter":
                    nickMap.put(userId, nickname);
                    chatLog.add(userId + "���� ���Խ��ϴ�.");
                    break;
                case "Leave":
                    chatLog.add(userId + "���� �������ϴ�.");
                    break;
                case "Change":
                    nickMap.put(userId, nickname);
                    break;
            }
        }
        
        String[] answer = new String[chatLog.size()];
        int logIdx = 0;
        
        for(String str : chatLog){
            int endOfId = str.indexOf("��");
            String userId = str.substring(0, endOfId);
            
            answer[logIdx++] = str.replace(userId, nickMap.get(userId));
        }
        
        return answer;
	}
}*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class chat {
	public static void main(String[] args) {
	}
	
	/*	private static final String ENTER_FORMAT = "%s���� ���Խ��ϴ�.";
		private static final String LEAVE_FORMAT = "%s���� �������ϴ�.";
	
		private HashMap<String, UserInfo> userMap = new HashMap<>();
	
		private class UserInfo {
			public String userId;
			public String nickName;
	
			public UserInfo(String userId, String nickName) {
				this.userId = userId;
				this.nickName = nickName;
			}
	
		}
	
		private class Command {
			public char command;
			public String userId;
	
			public Command(char command, String userName) {
				this.command = command;
				this.userId = userName;
			}
		}
	
		public String[] solution(String[] records) {
			ArrayList<Command> commandList = new ArrayList<>();
	
			for (String record : records) {
				String[] split = record.split(" ");
				String command = split[0];
				String userId = split[1];
				String nickName = null;
	
				switch (command.charAt(0)) {
				case 'E': // Enter
					nickName = split[2];
					if (userMap.containsKey(userId) == false) {
						userMap.put(userId, new UserInfo(userId, nickName));
					} else {
						userMap.get(userId).nickName = nickName;
					}
	
					commandList.add(new Command(command.charAt(0), userId));
					break;
				case 'L': // Leave
					commandList.add(new Command(command.charAt(0), userId));
					break;
				case 'C': // Change
					nickName = split[2];
					userMap.get(userId).nickName = nickName;
					break;
				}
			}
	
			return commandList.stream().map(cmd -> String.format(cmd.command == 'E' ? ENTER_FORMAT : LEAVE_FORMAT,
					userMap.get(cmd.userId).nickName)).toArray(ary -> new String[commandList.size()]);
		}*/
	
	public String[] solution(String[] record) {
        HashMap<String, String> codeMap = new HashMap<String, String>();
        codeMap.put("enter","���Խ��ϴ�.");
        codeMap.put("leave","�������ϴ�.");

        HashMap<String, String> uidMap = new HashMap<String, String>();
        List<String> list = new ArrayList<String>();
        for(String str:record){
            String[] split = str.split("\\s+");
            String code = split[0];
            String uid = split[1];
            if(split.length > 2) {
                String name = split[2];
                uidMap.put(uid, name);
            }
            if(!"Change".equalsIgnoreCase(code)){
                list.add(code +" "+uid);
            }

        }
        String[] answer = new String[list.size()];
        for(int i=0;i<answer.length;i++){
            String[] split = list.get(i).split("\\s+");
            String name = uidMap.get(split[1]);
            answer[i] = name+"���� "+ codeMap.get(split[0].toLowerCase());
        }

        return answer;
    }
}
