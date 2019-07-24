package moh.ask.model;

import java.util.ArrayList;
import java.util.List;

public final class MemberContainer {



    private MemberContainer(){

    }
    static private List<Member> memberList = new ArrayList<>();

    public static List<Member> getMemberList(){
        return memberList;
    }
}
