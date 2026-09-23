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
import java.lang.IndexOutOfBoundsException;
import static org.apache.commons.compress.archivers.cpio.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Integer;

public class CpioArchiveOutputStream_write_185850665232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term770;
     Object term839;
     Object term847;
     Object term849;

    public CpioArchiveOutputStream_write_185850665232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term802 = new HashMap();
        term770 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term771 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term831 = (byte[]) newByteArray(6);
        setShortField(term771, term771.getClass(), "fileFormat", (short) 26404);
        setIntField(term771, term771.getClass(), "headerSize", -817164822);
        setIntField(term771, term771.getClass(), "alignmentBoundary", -1016503459);
        setLongField(term771, term771.getClass(), "chksum", 3752337209837437327L);
        setLongField(term771, term771.getClass(), "filesize", 1860789353508856614L);
        setLongField(term771, term771.getClass(), "gid", -7456852906235966771L);
        setLongField(term771, term771.getClass(), "inode", -67485388932970712L);
        setLongField(term771, term771.getClass(), "maj", 5806367330808555223L);
        setLongField(term771, term771.getClass(), "min", 4576699120365923235L);
        setLongField(term771, term771.getClass(), "mode", -1635471392209071620L);
        setLongField(term771, term771.getClass(), "mtime", -4714000263923324167L);
        setField(term771, term771.getClass(), "name", "OclPbYPkcH");
        setLongField(term771, term771.getClass(), "nlink", 6906379511067694917L);
        setLongField(term771, term771.getClass(), "rmaj", -9204303423581447271L);
        setLongField(term771, term771.getClass(), "rmin", 6248239231585852341L);
        setLongField(term771, term771.getClass(), "uid", -88538481937688851L);
        setField(term770, term770.getClass(), "entry", term771);
        setBooleanField(term770, term770.getClass(), "closed", false);
        setBooleanField(term770, term770.getClass(), "finished", true);
        setShortField(term770, term770.getClass(), "entryFormat", (short) 374);
        setField(term770, term770.getClass(), "names", term802);
        setLongField(term770, term770.getClass(), "crc", -8514728180792822493L);
        setLongField(term770, term770.getClass(), "written", 5315236285592892506L);
        setField(term770, term770.getClass(), "out", null);
        setIntField(term770, term770.getClass(), "blockSize", -14890619);
        setLongField(term770, term770.getClass(), "nextArtificalDeviceAndInode", -6969704322644192945L);
        setField(term770, term770.getClass(), "zipEncoding", null);
        setByteElement(term831, 0, (byte) -111);
        setByteElement(term831, 1, (byte) 23);
        setByteElement(term831, 2, (byte) -15);
        setByteElement(term831, 3, (byte) 36);
        setByteElement(term831, 4, (byte) 118);
        setByteElement(term831, 5, (byte) 106);
        setField(term770, term770.getClass(), "oneByte", term831);
        setLongField(term770, term770.getClass(), "bytesWritten", -6685235643232255177L);
        term839 = (byte[]) newByteArray(7);
        setByteElement(term839, 0, (byte) 98);
        setByteElement(term839, 1, (byte) 67);
        setByteElement(term839, 2, (byte) 66);
        setByteElement(term839, 3, (byte) -121);
        setByteElement(term839, 4, (byte) -119);
        setByteElement(term839, 5, (byte) 71);
        setByteElement(term839, 6, (byte) 80);
        term847 = new Integer(1632125673);
        term849 = new Integer(454281060);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term839;
        args[1] = term847;
        args[2] = term849;
        try {
            callMethod(klass, "write", argTypes, term770, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


