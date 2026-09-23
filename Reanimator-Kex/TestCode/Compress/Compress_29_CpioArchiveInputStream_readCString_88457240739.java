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
import java.lang.NegativeArraySizeException;
import static org.apache.commons.compress.archivers.cpio.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class CpioArchiveInputStream_readCString_88457240739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1333;
     Object term1391;

    public CpioArchiveInputStream_readCString_88457240739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1333 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        Object term1335 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term1365 = (byte[]) newByteArray(6);
        byte[] term1373 = (byte[]) newByteArray(5);
        byte[] term1379 = (byte[]) newByteArray(1);
        byte[] term1381 = (byte[]) newByteArray(0);
        byte[] term1383 = (byte[]) newByteArray(6);
        setBooleanField(term1333, term1333.getClass(), "closed", true);
        setShortField(term1335, term1335.getClass(), "fileFormat", (short) -2742);
        setIntField(term1335, term1335.getClass(), "headerSize", -14890619);
        setIntField(term1335, term1335.getClass(), "alignmentBoundary", 1632125673);
        setLongField(term1335, term1335.getClass(), "chksum", -7310273014364148916L);
        setLongField(term1335, term1335.getClass(), "filesize", 8863790908271299748L);
        setLongField(term1335, term1335.getClass(), "gid", 9205327385733285058L);
        setLongField(term1335, term1335.getClass(), "inode", 4199886998224701110L);
        setLongField(term1335, term1335.getClass(), "maj", 8540994973773607992L);
        setLongField(term1335, term1335.getClass(), "min", -2338103433822116635L);
        setLongField(term1335, term1335.getClass(), "mode", -1885698929232124806L);
        setLongField(term1335, term1335.getClass(), "mtime", 5731563613239387113L);
        setField(term1335, term1335.getClass(), "name", "aJlieCFVtF");
        setLongField(term1335, term1335.getClass(), "nlink", 3381333711768010594L);
        setLongField(term1335, term1335.getClass(), "rmaj", 3580984732036213717L);
        setLongField(term1335, term1335.getClass(), "rmin", 5330761990446327930L);
        setLongField(term1335, term1335.getClass(), "uid", -3954795081650780841L);
        setField(term1333, term1333.getClass(), "entry", term1335);
        setLongField(term1333, term1333.getClass(), "entryBytesRead", 3288791194263207397L);
        setBooleanField(term1333, term1333.getClass(), "entryEOF", true);
        setByteElement(term1365, 0, (byte) -88);
        setByteElement(term1365, 1, (byte) -73);
        setByteElement(term1365, 2, (byte) 105);
        setByteElement(term1365, 3, (byte) -86);
        setByteElement(term1365, 4, (byte) 84);
        setByteElement(term1365, 5, (byte) -70);
        setField(term1333, term1333.getClass(), "tmpbuf", term1365);
        setLongField(term1333, term1333.getClass(), "crc", 3288941170644426558L);
        setField(term1333, term1333.getClass(), "in", null);
        setByteElement(term1373, 0, (byte) 84);
        setByteElement(term1373, 1, (byte) 114);
        setByteElement(term1373, 2, (byte) 60);
        setByteElement(term1373, 3, (byte) -20);
        setByteElement(term1373, 4, (byte) 100);
        setField(term1333, term1333.getClass(), "TWO_BYTES_BUF", term1373);
        setByteElement(term1379, 0, (byte) -41);
        setField(term1333, term1333.getClass(), "FOUR_BYTES_BUF", term1379);
        setField(term1333, term1333.getClass(), "SIX_BYTES_BUF", term1381);
        setIntField(term1333, term1333.getClass(), "blockSize", 454281060);
        setField(term1333, term1333.getClass(), "zipEncoding", null);
        setByteElement(term1383, 0, (byte) -70);
        setByteElement(term1383, 1, (byte) -5);
        setByteElement(term1383, 2, (byte) 119);
        setByteElement(term1383, 3, (byte) 81);
        setByteElement(term1383, 4, (byte) -28);
        setByteElement(term1383, 5, (byte) -18);
        setField(term1333, term1333.getClass(), "SINGLE", term1383);
        setLongField(term1333, term1333.getClass(), "bytesRead", -8338004844694486146L);
        term1391 = new Integer(-1786399638);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1391;
        try {
            callMethod(klass, "readCString", argTypes, term1333, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


