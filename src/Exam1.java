import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Exam1 {

	private static ArrayList<Aticle> aticles;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		aticles = new ArrayList<>();

		Aticle a1 = new Aticle(1, "제목1", "내용1", "익명", getCyrrentDate());
		Aticle a2 = new Aticle(2, "제목2", "내용2", "익명", getCyrrentDate());
		Aticle a3 = new Aticle(3, "제목3", "내용3", "익명", getCyrrentDate());

		aticles.add(a1);
		aticles.add(a2);
		aticles.add(a3);

		int no = 4;

		while (true) {
			System.out.print("명령어를 입력해주세요 : ");
			String str = sc.next();

			if (str.equals("exit")) {
				System.out.println("종료");
				break;
			}
			if (str.equals("add")) {
				Aticle a = new Aticle();
				a.setId(no);
				no++;

				System.out.print("제목을 입력해주세요 : ");
				String title = sc.next();
				a.setTitle(title);
				System.out.print("내용을 입력해주세요 : ");
				String body = sc.next();
				a.setBody(body);
				a.setNickName("익명");
				a.setRegDay(getCyrrentDate());

				aticles.add(a);
				System.out.println("게시물이 등록되었습니다");
			}
			if (str.equals("list")) {
				for (int i = 0; i < aticles.size(); i++) {
					Aticle aticle = aticles.get(i);
					System.out.println("----------게시물------------");
					System.out.println("번호 : " + aticle.getId());
					System.out.println("제목 : " + aticle.getTitle());
					System.out.println("작성자 : " + aticle.getNickName());
					System.out.println("작성일 : " + aticle.getRegDay());
					System.out.println("조회수 : " + aticle.getHit());
					System.out.println("--------------------------");
				}
			}
			if (str.equals("update")) {
				System.out.print("수정할 게시물을 선택하세요 : ");
				int targetid = sc.nextInt();
				Aticle target = getAticleById(targetid);
				if (target == null) {
					System.out.println("없는 게시물 입니다");

				} else {
					System.out.print("제목을 입력하세요 : ");
					String newtitle = sc.next();
					System.out.print("내용을 입력하세요 : ");
					String newbody = sc.next();


					
					target.setTitle(newtitle);
					target.setBody(newbody);

				}

			}
			if (str.equals("delete")) {
				System.out.println("삭제할 게시물을 선택하세요 : ");
				int targetid = sc.nextInt();
				Aticle target = getAticleById(targetid);
				if (target == null) {
					System.out.println("없는 게시물입니다");

				} else {
					aticles.remove(target);

				}
			}
			if (str.equals("read")) {
				System.out.println("상세보기할 게시물을 선택하세요 : ");
				int targetid = sc.nextInt();
				Aticle target = getAticleById(targetid);
				if (target == null) {
					System.out.println("없는 게시물 입니다");
				} else {
					target.setHit(target.getHit()+1);
					System.out.println("번호 : " + target.getId());
					System.out.println("제목 : " + target.getTitle());
					System.out.println("내용 : " + target.getBody());
					System.out.println("작성자 : " + target.getNickName());
					System.out.println("작성일  : " + target.getRegDay());
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
