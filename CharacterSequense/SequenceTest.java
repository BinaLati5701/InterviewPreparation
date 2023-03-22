package CharacterSequense;

public class SequenceTest {
    public static  void main(String[]args){
        Sequence s = new Sequence();

        System.out.println("\n With While Loop");
        System.out.println(s.isSequence("abc", "ahbgdc"));
        System.out.println(s.isSequence("axc", "ahbgdc"));

        System.out.println("\n With For Loop");
        System.out.println(s.isSequenceWithForLoop("abc", "ahbgdc"));
        System.out.println(s.isSequenceWithForLoop("axc", "ahbgdc"));

    }
}
