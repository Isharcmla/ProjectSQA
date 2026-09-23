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
import java.lang.Long;

public class CpioArchiveInputStream_skip_110344255540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1421;
     Object term1473;

    public CpioArchiveInputStream_skip_110344255540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1421 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        Object term1423 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term1453 = (byte[]) newByteArray(5);
        byte[] term1460 = (byte[]) newByteArray(1);
        byte[] term1462 = (byte[]) newByteArray(4);
        byte[] term1467 = (byte[]) newByteArray(1);
        byte[] term1470 = (byte[]) newByteArray(1);
        setBooleanField(term1421, term1421.getClass(), "closed", true);
        setShortField(term1423, term1423.getClass(), "fileFormat", (short) 7097);
        setIntField(term1423, term1423.getClass(), "headerSize", 2055867847);
        setIntField(term1423, term1423.getClass(), "alignmentBoundary", -1048298087);
        setLongField(term1423, term1423.getClass(), "chksum", 6426732259596412988L);
        setLongField(term1423, term1423.getClass(), "filesize", 185793058502220865L);
        setLongField(term1423, term1423.getClass(), "gid", -7698746988132548371L);
        setLongField(term1423, term1423.getClass(), "inode", 2145420811068634601L);
        setLongField(term1423, term1423.getClass(), "maj", 2191130532479601175L);
        setLongField(term1423, term1423.getClass(), "min", 860079646007397083L);
        setLongField(term1423, term1423.getClass(), "mode", 3230472384687362867L);
        setLongField(term1423, term1423.getClass(), "mtime", -1145146470850585022L);
        setField(term1423, term1423.getClass(), "name", "ZiaGIbnzTs");
        setLongField(term1423, term1423.getClass(), "nlink", 1993646237353405740L);
        setLongField(term1423, term1423.getClass(), "rmaj", -4043093655001688454L);
        setLongField(term1423, term1423.getClass(), "rmin", -419800263764810394L);
        setLongField(term1423, term1423.getClass(), "uid", 5904678961906211249L);
        setField(term1421, term1421.getClass(), "entry", term1423);
        setLongField(term1421, term1421.getClass(), "entryBytesRead", -1820639665251914495L);
        setBooleanField(term1421, term1421.getClass(), "entryEOF", true);
        setByteElement(term1453, 0, (byte) -61);
        setByteElement(term1453, 1, (byte) 70);
        setByteElement(term1453, 2, (byte) 89);
        setByteElement(term1453, 3, (byte) -99);
        setByteElement(term1453, 4, (byte) 59);
        setField(term1421, term1421.getClass(), "tmpbuf", term1453);
        setLongField(term1421, term1421.getClass(), "crc", 3238645206498300107L);
        setField(term1421, term1421.getClass(), "in", null);
        setByteElement(term1460, 0, (byte) -99);
        setField(term1421, term1421.getClass(), "TWO_BYTES_BUF", term1460);
        setByteElement(term1462, 0, (byte) 61);
        setByteElement(term1462, 1, (byte) 100);
        setByteElement(term1462, 2, (byte) 55);
        setByteElement(term1462, 3, (byte) -111);
        setField(term1421, term1421.getClass(), "FOUR_BYTES_BUF", term1462);
        setByteElement(term1467, 0, (byte) -127);
        setField(term1421, term1421.getClass(), "SIX_BYTES_BUF", term1467);
        setIntField(term1421, term1421.getClass(), "blockSize", 292681826);
        setField(term1421, term1421.getClass(), "zipEncoding", null);
        setByteElement(term1470, 0, (byte) 19);
        setField(term1421, term1421.getClass(), "SINGLE", term1470);
        setLongField(term1421, term1421.getClass(), "bytesRead", -1592696983130738594L);
        term1473 = new Long(6902365338255307910L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1473;
        try {
            callMethod(klass, "skip", argTypes, term1421, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


