import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Exam1 {

	private static ArrayList<Aticle> aticles;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		aticles = new ArrayList<>();

		Aticle a1 = new Aticle(1, "����1", "����1", "�͸�", getCyrrentDate());
		Aticle a2 = new Aticle(2, "����2", "����2", "�͸�", getCyrrentDate());
		Aticle a3 = new Aticle(3, "����3", "����3", "�͸�", getCyrrentDate());

		aticles.add(a1);
		aticles.add(a2);
		aticles.add(a3);

		int no = 4;

		while (true) {
			System.out.print("��ɾ �Է����ּ��� : ");
			String str = sc.next();

			if (str.equals("exit")) {
				System.out.println("����");
				break;
			}
			if (str.equals("add")) {
				Aticle a = new Aticle();
				a.setId(no);
				no++;

				System.out.print("������ �Է����ּ��� : ");
				String title = sc.next();
				a.setTitle(title);
				System.out.print("������ �Է����ּ��� : ");
				String body = sc.next();
				a.setBody(body);
				a.setNickName("�͸�");
				a.setRegDay(getCyrrentDate());

				aticles.add(a);
				System.out.println("�Խù��� ��ϵǾ����ϴ�");
			}
			if (str.equals("list")) {
				for (int i = 0; i < aticles.size(); i++) {
					Aticle aticle = aticles.get(i);
					System.out.println("----------�Խù�------------");
					System.out.println("��ȣ : " + aticle.getId());
					System.out.println("���� : " + aticle.getTitle());
					System.out.println("�ۼ��� : " + aticle.getNickName());
					System.out.println("�ۼ��� : " + aticle.getRegDay());
					System.out.println("��ȸ�� : " + aticle.getHit());
					System.out.println("--------------------------");
				}
			}
			if (str.equals("update")) {
				System.out.print("������ �Խù��� �����ϼ��� : ");
				int targetid = sc.nextInt();
				Aticle target = getAticleById(targetid);
				if (target == null) {
					System.out.println("���� �Խù� �Դϴ�");

				} else {
					System.out.print("������ �Է��ϼ��� : ");
					String newtitle = sc.next();
					System.out.print("������ �Է��ϼ��� : ");
					String newbody = sc.next();


					
					target.setTitle(newtitle);
					target.setBody(newbody);

				}

			}
			if (str.equals("delete")) {
				System.out.println("������ �Խù��� �����ϼ��� : ");
				int targetid = sc.nextInt();
				Aticle target = getAticleById(targetid);
				if (target == null) {
					System.out.println("���� �Խù��Դϴ�");

				} else {
					aticles.remove(target);

				}
			}
			if (str.equals("read")) {
				System.out.println("�󼼺����� �Խù��� �����ϼ��� : ");
				int targetid = sc.nextInt();
				Aticle target = getAticleById(targetid);
				if (target == null) {
					System.out.println("���� �Խù� �Դϴ�");
				} else {
					target.setHit(target.getHit()+1);
					System.out.println("��ȣ : " + target.getId());
					System.out.println("���� : " + target.getTitle());
					System.out.println("���� : " + target.getBody());
					System.out.println("�ۼ��� : " + target.getNickName());
					System.out.println("�ۼ���  : " + target.getRegDay());
				}
			}

		}

	}

	private static Aticle getAticleById(int targetid) {
		for (int i = 0; i < aticles.size(); i++) {
			int id = aticles.get(i).getId();
			if (id == targetid) {
				return aticles.get(i);
			}
		}

		return null;
	}
	
	private static String getCyrrentDate() {
		Date time = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String time1 = df.format(time);
		
		return time1;
	}
}
