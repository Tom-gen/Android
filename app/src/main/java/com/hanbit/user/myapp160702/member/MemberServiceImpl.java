package com.hanbit.user.myapp160702.member;

import android.util.Log;

/**
 * Created by 1027 on 2016-07-09.
 */
public class MemberServiceImpl implements MemberService {
    private static String sessionID, sessionPW;

    @Override
    public String join(MemberBean bean) {
        String id = bean.getID();
        String pw = bean.getPW();
        String name = bean.getName();
        String email = bean.getEmail();

        Log.d("입력한 ID:", id);
        Log.d("입력한 PW:", pw);
        Log.d("입력한 name:", name);
        Log.d("입력한 email:", email);
        sessionID = id;
        sessionPW = pw;

        return "환영합니다";
    }

    @Override
    public Boolean login(MemberBean bean) {
        Boolean result = false;
        String id = bean.getID();
        String pw = bean.getPW();

        Log.d("입력한 ID:", id);
        Log.d("입력한 PW:", pw);

        if (id.equals(sessionID) && pw.equals(sessionPW))
            result = true;

        return result;
    }
}
