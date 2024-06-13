package lomboktest;

public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDTO user = new UserDTO("hong", 20, "hong@e.com");
		
		UserDTO user2 = UserDTO.builder()
				.name("hong2")
				.age(33)
				.email("hong2@e.com")
				.build();
		
		System.out.println(user2 .toString());
		System.out.println(user2.getName());
		System.out.println(user2.getAge());
		System.out.println(user2.getEmail());
	}

}
