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

public class CpioArchiveInputStream_skip_110344255536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1375;
     Object term1427;

    public CpioArchiveInputStream_skip_110344255536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1375 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        Object term1377 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term1407 = (byte[]) newByteArray(5);
        byte[] term1414 = (byte[]) newByteArray(1);
        byte[] term1416 = (byte[]) newByteArray(4);
        byte[] term1421 = (byte[]) newByteArray(1);
        byte[] term1424 = (byte[]) newByteArray(1);
        setBooleanField(term1375, term1375.getClass(), "closed", true);
        setShortField(term1377, term1377.getClass(), "fileFormat", (short) 7097);
        setIntField(term1377, term1377.getClass(), "headerSize", -1786399638);
        setIntField(term1377, term1377.getClass(), "alignmentBoundary", 2055867847);
        setLongField(term1377, term1377.getClass(), "chksum", 6426732259596412988L);
        setLongField(term1377, term1377.getClass(), "filesize", 185793058502220865L);
        setLongField(term1377, term1377.getClass(), "gid", -7698746988132548371L);
        setLongField(term1377, term1377.getClass(), "inode", 2145420811068634601L);
        setLongField(term1377, term1377.getClass(), "maj", 2191130532479601175L);
        setLongField(term1377, term1377.getClass(), "min", 860079646007397083L);
        setLongField(term1377, term1377.getClass(), "mode", 3230472384687362867L);
        setLongField(term1377, term1377.getClass(), "mtime", -1145146470850585022L);
        setField(term1377, term1377.getClass(), "name", "oVcInYnLWB");
        setLongField(term1377, term1377.getClass(), "nlink", 1993646237353405740L);
        setLongField(term1377, term1377.getClass(), "rmaj", -4043093655001688454L);
        setLongField(term1377, term1377.getClass(), "rmin", -419800263764810394L);
        setLongField(term1377, term1377.getClass(), "uid", 5904678961906211249L);
        setField(term1375, term1375.getClass(), "entry", term1377);
        setLongField(term1375, term1375.getClass(), "entryBytesRead", -1820639665251914495L);
        setBooleanField(term1375, term1375.getClass(), "entryEOF", true);
        setByteElement(term1407, 0, (byte) -61);
        setByteElement(term1407, 1, (byte) 70);
        setByteElement(term1407, 2, (byte) 89);
        setByteElement(term1407, 3, (byte) -99);
        setByteElement(term1407, 4, (byte) 59);
        setField(term1375, term1375.getClass(), "tmpbuf", term1407);
        setLongField(term1375, term1375.getClass(), "crc", 3238645206498300107L);
        setField(term1375, term1375.getClass(), "in", null);
        setByteElement(term1414, 0, (byte) -99);
        setField(term1375, term1375.getClass(), "TWO_BYTES_BUF", term1414);
        setByteElement(term1416, 0, (byte) 61);
        setByteElement(term1416, 1, (byte) 100);
        setByteElement(term1416, 2, (byte) 55);
        setByteElement(term1416, 3, (byte) -111);
        setField(term1375, term1375.getClass(), "FOUR_BYTES_BUF", term1416);
        setByteElement(term1421, 0, (byte) -127);
        setField(term1375, term1375.getClass(), "SIX_BYTES_BUF", term1421);
        setIntField(term1375, term1375.getClass(), "blockSize", -1048298087);
        setByteElement(term1424, 0, (byte) 19);
        setField(term1375, term1375.getClass(), "SINGLE", term1424);
        setLongField(term1375, term1375.getClass(), "bytesRead", -1592696983130738594L);
        term1427 = new Long(6902365338255307910L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1427;
        try {
            callMethod(klass, "skip", argTypes, term1375, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


