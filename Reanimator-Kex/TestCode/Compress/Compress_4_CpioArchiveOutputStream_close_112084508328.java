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
import java.lang.NullPointerException;
import static org.apache.commons.compress.archivers.cpio.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class CpioArchiveOutputStream_close_112084508328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term690;

    public CpioArchiveOutputStream_close_112084508328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term722 = new HashMap();
        term690 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term691 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term729 = (byte[]) newByteArray(6);
        setShortField(term691, term691.getClass(), "fileFormat", (short) -4880);
        setIntField(term691, term691.getClass(), "headerSize", -1275173084);
        setIntField(term691, term691.getClass(), "alignmentBoundary", -244121226);
        setLongField(term691, term691.getClass(), "chksum", -5447369594017685765L);
        setLongField(term691, term691.getClass(), "filesize", -5724112525188606013L);
        setLongField(term691, term691.getClass(), "gid", -6100012593724108983L);
        setLongField(term691, term691.getClass(), "inode", 5465527210299101732L);
        setLongField(term691, term691.getClass(), "maj", 4699157009689333952L);
        setLongField(term691, term691.getClass(), "min", -78240609295693193L);
        setLongField(term691, term691.getClass(), "mode", 3090901538358721367L);
        setLongField(term691, term691.getClass(), "mtime", -1677189124507026637L);
        setField(term691, term691.getClass(), "name", "LQFpaHEwXR");
        setLongField(term691, term691.getClass(), "nlink", 4795660804170399986L);
        setLongField(term691, term691.getClass(), "rmaj", -4030863184426321096L);
        setLongField(term691, term691.getClass(), "rmin", -8010214112439224349L);
        setLongField(term691, term691.getClass(), "uid", -6673920710396545553L);
        setField(term690, term690.getClass(), "entry", term691);
        setBooleanField(term690, term690.getClass(), "closed", false);
        setBooleanField(term690, term690.getClass(), "finished", true);
        setShortField(term690, term690.getClass(), "entryFormat", (short) -3696);
        setField(term690, term690.getClass(), "names", term722);
        setLongField(term690, term690.getClass(), "crc", 3412644969878030772L);
        setLongField(term690, term690.getClass(), "written", 6698455537431331246L);
        setField(term690, term690.getClass(), "out", null);
        setByteElement(term729, 0, (byte) 72);
        setByteElement(term729, 1, (byte) 111);
        setByteElement(term729, 2, (byte) 99);
        setByteElement(term729, 3, (byte) -12);
        setByteElement(term729, 4, (byte) -61);
        setByteElement(term729, 5, (byte) -85);
        setField(term690, term690.getClass(), "oneByte", term729);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term690, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


