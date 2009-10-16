/*
 * Copyright (c) 2009 by Naohide Sano, All rights reserved.
 *
 * Programmed by Naohide Sano
 */

package vavi.apps.yamatonadeshiko;

import java.sql.SQLException;
import java.util.List;

import vavi.apps.yamatonadeshiko.Shuffler.Member;


/**
 * MailDAO. 
 *
 * @author <a href="mailto:vavivavi@yahoo.co.jp">Naohide Sano</a> (nsano)
 * @version 0.00 090419 nsano initial version <br>
 */
public interface MailDAO {

    /**
     * ���j�b�g���Ɩ{�����ōi�荞�񂾃��[�����M�҂��擾���܂��B
     * @return 0: female manager, 1: female, 2: male manager, 3:male 
     */
    List<Member>[] load(String unit) throws SQLException;

    /** ���j�b�g���Ɩ{�����ōi�荞�񂾃��[�����M�҂��폜���܂��B */
    void clear(String unit) throws SQLException;
}

/* */
