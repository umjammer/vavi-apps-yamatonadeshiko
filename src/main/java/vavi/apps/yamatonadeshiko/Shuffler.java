/*
 * Copyright (c) 2005 by Naohide Sano, All rights reserved.
 *
 * Programmed by Naohide Sano
 */

package vavi.apps.yamatonadeshiko;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.SortedMap;
import java.util.TreeMap;


/**
 * Shuffler.
 * 
 * @author <a href="vavivavi@yahoo.co.jp">Naohide Sano</a> (nsano)
 * @version 0.00 050830 nsano initial version <br>
 */
public abstract class Shuffler {

    /** �����o�[�̃^�C�v��\���܂��B */
    public enum Type {
        /** ����` */
        Unknown,
        /** ������ */
        FemaleManager,
        /** �������o�[ */
        Female,
        /** �j����  */
        MaleManager,
        /** �j�����o�[ */
        Male;
        /** �������ǂ����B */
        public boolean isManager() {
            return (ordinal() & 0x01) != 0;
        }
    }

    /** �����o�[��\���܂��B */
    public static class Member implements Comparable<Member> {
        public String email;
        public Type type;
        public String toString() {
            return email;
        }
        public int compareTo(Member member) {
            return email.compareToIgnoreCase(member.email);
        }
    }

    /**
     * �����_�}�C�U�[
     * TODO �ꏊ���܂����A���ꂼ��Ŏ������ׂ�
     */
    protected Random random = new Random(System.currentTimeMillis());

    /**
     * �V���b�t�����ʂ��X�g�A���܂��B
     * TODO �ꏊ���܂����A���ꂼ��Ŏ������ׂ�
     */
    protected SortedMap<Member, Member> pair = new TreeMap<Member, Member>();

    /** �V���b�t���A���S���Y�����������Ă��������B */
    public abstract Map<Member, Member> shuffle(List<Member> females, List<Member> males);
}

/* */
