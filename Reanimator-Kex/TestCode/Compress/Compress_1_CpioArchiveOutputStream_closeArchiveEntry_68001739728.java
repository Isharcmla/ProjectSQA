package org.apache.commons.compress.archivers.cpio;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.io.IOException;
import static org.apache.commons.compress.archivers.cpio.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class CpioArchiveOutputStream_closeArchiveEntry_68001739728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term528;

    public CpioArchiveOutputStream_closeArchiveEntry_68001739728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term559 = new HashMap();
        term528 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term529 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term529, term529.getClass(), "chksum", 3427570961451840069L);
        setShortField(term529, term529.getClass(), "fileFormat", (short) -355);
        setLongField(term529, term529.getClass(), "filesize", 4502292577098212311L);
        setLongField(term529, term529.getClass(), "gid", -3730936709704460408L);
        setLongField(term529, term529.getClass(), "headerSize", -8614778293741404325L);
        setLongField(term529, term529.getClass(), "inode", -5447369594017685765L);
        setLongField(term529, term529.getClass(), "maj", -5724112525188606013L);
        setLongField(term529, term529.getClass(), "min", -6100012593724108983L);
        setLongField(term529, term529.getClass(), "mode", 5465527210299101732L);
        setLongField(term529, term529.getClass(), "mtime", 4699157009689333952L);
        setField(term529, term529.getClass(), "name", "MxlszYVzRf");
        setLongField(term529, term529.getClass(), "nlink", -78240609295693193L);
        setLongField(term529, term529.getClass(), "rmaj", 3090901538358721367L);
        setLongField(term529, term529.getClass(), "rmin", -1677189124507026637L);
        setLongField(term529, term529.getClass(), "uid", 4795660804170399986L);
        setField(term528, term528.getClass(), "cpioEntry", term529);
        setBooleanField(term528, term528.getClass(), "closed", false);
        setBooleanField(term528, term528.getClass(), "finished", true);
        setShortField(term528, term528.getClass(), "entryFormat", (short) 5118);
        setField(term528, term528.getClass(), "names", term559);
        setLongField(term528, term528.getClass(), "crc", -4030863184426321096L);
        setLongField(term528, term528.getClass(), "written", -8010214112439224349L);
        setField(term528, term528.getClass(), "out", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "closeArchiveEntry", argTypes, term528, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};
