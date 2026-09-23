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

public class CpioArchiveInputStream_skipRemainderOfLastBlock_167291480242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1589;

    public CpioArchiveInputStream_skipRemainderOfLastBlock_167291480242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1589 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        Object term1591 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term1621 = (byte[]) newByteArray(6);
        byte[] term1629 = (byte[]) newByteArray(4);
        byte[] term1634 = (byte[]) newByteArray(6);
        byte[] term1641 = (byte[]) newByteArray(7);
        byte[] term1650 = (byte[]) newByteArray(0);
        setBooleanField(term1589, term1589.getClass(), "closed", true);
        setShortField(term1591, term1591.getClass(), "fileFormat", (short) -5174);
        setIntField(term1591, term1591.getClass(), "headerSize", 1328271830);
        setIntField(term1591, term1591.getClass(), "alignmentBoundary", 1596070772);
        setLongField(term1591, term1591.getClass(), "chksum", 1253549421411622358L);
        setLongField(term1591, term1591.getClass(), "filesize", 3666226122807672448L);
        setLongField(term1591, term1591.getClass(), "gid", 3108750145697087661L);
        setLongField(term1591, term1591.getClass(), "inode", 3752337209837437327L);
        setLongField(term1591, term1591.getClass(), "maj", 1860789353508856614L);
        setLongField(term1591, term1591.getClass(), "min", -7456852906235966771L);
        setLongField(term1591, term1591.getClass(), "mode", -67485388932970712L);
        setLongField(term1591, term1591.getClass(), "mtime", 5806367330808555223L);
        setField(term1591, term1591.getClass(), "name", "HyxfbSQYBe");
        setLongField(term1591, term1591.getClass(), "nlink", 4576699120365923235L);
        setLongField(term1591, term1591.getClass(), "rmaj", -1635471392209071620L);
        setLongField(term1591, term1591.getClass(), "rmin", -4714000263923324167L);
        setLongField(term1591, term1591.getClass(), "uid", 6906379511067694917L);
        setField(term1589, term1589.getClass(), "entry", term1591);
        setLongField(term1589, term1589.getClass(), "entryBytesRead", -9204303423581447271L);
        setBooleanField(term1589, term1589.getClass(), "entryEOF", true);
        setByteElement(term1621, 0, (byte) 103);
        setByteElement(term1621, 1, (byte) -64);
        setByteElement(term1621, 2, (byte) -107);
        setByteElement(term1621, 3, (byte) 119);
        setByteElement(term1621, 4, (byte) -109);
        setByteElement(term1621, 5, (byte) 87);
        setField(term1589, term1589.getClass(), "tmpbuf", term1621);
        setLongField(term1589, term1589.getClass(), "crc", 6248239231585852341L);
        setField(term1589, term1589.getClass(), "in", null);
        setByteElement(term1629, 0, (byte) 97);
        setByteElement(term1629, 1, (byte) 51);
        setByteElement(term1629, 2, (byte) 24);
        setByteElement(term1629, 3, (byte) -14);
        setField(term1589, term1589.getClass(), "TWO_BYTES_BUF", term1629);
        setByteElement(term1634, 0, (byte) 74);
        setByteElement(term1634, 1, (byte) 56);
        setByteElement(term1634, 2, (byte) -76);
        setByteElement(term1634, 3, (byte) -29);
        setByteElement(term1634, 4, (byte) 121);
        setByteElement(term1634, 5, (byte) -17);
        setField(term1589, term1589.getClass(), "FOUR_BYTES_BUF", term1634);
        setByteElement(term1641, 0, (byte) -123);
        setByteElement(term1641, 1, (byte) -76);
        setByteElement(term1641, 2, (byte) -46);
        setByteElement(term1641, 3, (byte) -82);
        setByteElement(term1641, 4, (byte) -105);
        setByteElement(term1641, 5, (byte) 35);
        setByteElement(term1641, 6, (byte) -80);
        setField(term1589, term1589.getClass(), "SIX_BYTES_BUF", term1641);
        setIntField(term1589, term1589.getClass(), "blockSize", 97029295);
        setField(term1589, term1589.getClass(), "zipEncoding", null);
        setField(term1589, term1589.getClass(), "SINGLE", term1650);
        setLongField(term1589, term1589.getClass(), "bytesRead", -88538481937688851L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "skipRemainderOfLastBlock", argTypes, term1589, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


