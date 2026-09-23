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

public class CpioArchiveInputStream_skipRemainderOfLastBlock_167291480238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1543;

    public CpioArchiveInputStream_skipRemainderOfLastBlock_167291480238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1543 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        Object term1545 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term1575 = (byte[]) newByteArray(6);
        byte[] term1583 = (byte[]) newByteArray(4);
        byte[] term1588 = (byte[]) newByteArray(6);
        byte[] term1595 = (byte[]) newByteArray(7);
        byte[] term1604 = (byte[]) newByteArray(0);
        setBooleanField(term1543, term1543.getClass(), "closed", true);
        setShortField(term1545, term1545.getClass(), "fileFormat", (short) -5174);
        setIntField(term1545, term1545.getClass(), "headerSize", 493620644);
        setIntField(term1545, term1545.getClass(), "alignmentBoundary", 1328271830);
        setLongField(term1545, term1545.getClass(), "chksum", 1253549421411622358L);
        setLongField(term1545, term1545.getClass(), "filesize", 3666226122807672448L);
        setLongField(term1545, term1545.getClass(), "gid", 3108750145697087661L);
        setLongField(term1545, term1545.getClass(), "inode", 3752337209837437327L);
        setLongField(term1545, term1545.getClass(), "maj", 1860789353508856614L);
        setLongField(term1545, term1545.getClass(), "min", -7456852906235966771L);
        setLongField(term1545, term1545.getClass(), "mode", -67485388932970712L);
        setLongField(term1545, term1545.getClass(), "mtime", 5806367330808555223L);
        setField(term1545, term1545.getClass(), "name", "ZiaGIbnzTs");
        setLongField(term1545, term1545.getClass(), "nlink", 4576699120365923235L);
        setLongField(term1545, term1545.getClass(), "rmaj", -1635471392209071620L);
        setLongField(term1545, term1545.getClass(), "rmin", -4714000263923324167L);
        setLongField(term1545, term1545.getClass(), "uid", 6906379511067694917L);
        setField(term1543, term1543.getClass(), "entry", term1545);
        setLongField(term1543, term1543.getClass(), "entryBytesRead", -9204303423581447271L);
        setBooleanField(term1543, term1543.getClass(), "entryEOF", true);
        setByteElement(term1575, 0, (byte) 103);
        setByteElement(term1575, 1, (byte) -64);
        setByteElement(term1575, 2, (byte) -107);
        setByteElement(term1575, 3, (byte) 119);
        setByteElement(term1575, 4, (byte) -109);
        setByteElement(term1575, 5, (byte) 87);
        setField(term1543, term1543.getClass(), "tmpbuf", term1575);
        setLongField(term1543, term1543.getClass(), "crc", 6248239231585852341L);
        setField(term1543, term1543.getClass(), "in", null);
        setByteElement(term1583, 0, (byte) 97);
        setByteElement(term1583, 1, (byte) 51);
        setByteElement(term1583, 2, (byte) 24);
        setByteElement(term1583, 3, (byte) -14);
        setField(term1543, term1543.getClass(), "TWO_BYTES_BUF", term1583);
        setByteElement(term1588, 0, (byte) 74);
        setByteElement(term1588, 1, (byte) 56);
        setByteElement(term1588, 2, (byte) -76);
        setByteElement(term1588, 3, (byte) -29);
        setByteElement(term1588, 4, (byte) 121);
        setByteElement(term1588, 5, (byte) -17);
        setField(term1543, term1543.getClass(), "FOUR_BYTES_BUF", term1588);
        setByteElement(term1595, 0, (byte) -123);
        setByteElement(term1595, 1, (byte) -76);
        setByteElement(term1595, 2, (byte) -46);
        setByteElement(term1595, 3, (byte) -82);
        setByteElement(term1595, 4, (byte) -105);
        setByteElement(term1595, 5, (byte) 35);
        setByteElement(term1595, 6, (byte) -80);
        setField(term1543, term1543.getClass(), "SIX_BYTES_BUF", term1595);
        setIntField(term1543, term1543.getClass(), "blockSize", 1596070772);
        setField(term1543, term1543.getClass(), "SINGLE", term1604);
        setLongField(term1543, term1543.getClass(), "bytesRead", -88538481937688851L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "skipRemainderOfLastBlock", argTypes, term1543, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


