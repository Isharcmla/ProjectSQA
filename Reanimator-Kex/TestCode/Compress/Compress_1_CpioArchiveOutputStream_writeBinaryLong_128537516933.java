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
import java.lang.UnsupportedOperationException;
import static org.apache.commons.compress.archivers.cpio.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Boolean;

public class CpioArchiveOutputStream_writeBinaryLong_128537516933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term787;
     Object term825;
     Object term827;
     Object term829;

    public CpioArchiveOutputStream_writeBinaryLong_128537516933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term818 = new HashMap();
        term787 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term788 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term788, term788.getClass(), "chksum", -7456852906235966771L);
        setShortField(term788, term788.getClass(), "fileFormat", (short) 3170);
        setLongField(term788, term788.getClass(), "filesize", -67485388932970712L);
        setLongField(term788, term788.getClass(), "gid", 5806367330808555223L);
        setLongField(term788, term788.getClass(), "headerSize", 4576699120365923235L);
        setLongField(term788, term788.getClass(), "inode", -1635471392209071620L);
        setLongField(term788, term788.getClass(), "maj", -4714000263923324167L);
        setLongField(term788, term788.getClass(), "min", 6906379511067694917L);
        setLongField(term788, term788.getClass(), "mode", -9204303423581447271L);
        setLongField(term788, term788.getClass(), "mtime", 6248239231585852341L);
        setField(term788, term788.getClass(), "name", "tbcdzjIfER");
        setLongField(term788, term788.getClass(), "nlink", -88538481937688851L);
        setLongField(term788, term788.getClass(), "rmaj", 4069264186851023313L);
        setLongField(term788, term788.getClass(), "rmin", 5184635470881147510L);
        setLongField(term788, term788.getClass(), "uid", 918397384129253729L);
        setField(term787, term787.getClass(), "cpioEntry", term788);
        setBooleanField(term787, term787.getClass(), "closed", false);
        setBooleanField(term787, term787.getClass(), "finished", false);
        setShortField(term787, term787.getClass(), "entryFormat", (short) -21181);
        setField(term787, term787.getClass(), "names", term818);
        setLongField(term787, term787.getClass(), "crc", -2187638136407967948L);
        setLongField(term787, term787.getClass(), "written", 8708846223293804408L);
        setField(term787, term787.getClass(), "out", null);
        term825 = new Long(-2986201902216133814L);
        term827 = new Integer(391863371);
        term829 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = long.class;
        argTypes[1] = int.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term825;
        args[1] = term827;
        args[2] = term829;
        try {
            callMethod(klass, "writeBinaryLong", argTypes, term787, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};
