package com.hanbit.user.myapp160702.member;

/**
 * Created by 1027 on 2016-07-09.
 */
public interface MemberService {
    public String join(MemberBean bean);

    public Boolean login(MemberBean bean);
}
