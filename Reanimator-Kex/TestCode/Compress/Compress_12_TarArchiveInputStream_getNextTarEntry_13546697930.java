package org.apache.commons.compress.archivers.tar;

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
import java.lang.RuntimeException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class TarArchiveInputStream_getNextTarEntry_13546697930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1290;

    public TarArchiveInputStream_getNextTarEntry_13546697930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term114157 = Class.forName((String) "java.io.File$PathStatus");
        Field term114156 = ((Class) term114157).getDeclaredField((String) "CHECKED");
        ((Field) term114156).setAccessible(true);
        Object enum29 = ((Field) term114156).get((Object) null);
        term1290 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term1294 = (byte[]) newByteArray(5);
        Object term1300 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term1301 = (byte[]) newByteArray(5);
        Object term1312 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term1347 = newInstance(Class.forName("java.io.File"));
        byte[] term1364 = (byte[]) newByteArray(4);
        setBooleanField(term1290, term1290.getClass(), "hasHitEOF", false);
        setLongField(term1290, term1290.getClass(), "entrySize", -5892135042702373494L);
        setLongField(term1290, term1290.getClass(), "entryOffset", 5262507301787091109L);
        setByteElement(term1294, 0, (byte) 61);
        setByteElement(term1294, 1, (byte) -92);
        setByteElement(term1294, 2, (byte) -42);
        setByteElement(term1294, 3, (byte) 116);
        setByteElement(term1294, 4, (byte) -81);
        setField(term1290, term1290.getClass(), "readBuf", term1294);
        setField(term1300, term1300.getClass(), "inStream", null);
        setField(term1300, term1300.getClass(), "outStream", null);
        setByteElement(term1301, 0, (byte) 102);
        setByteElement(term1301, 1, (byte) -118);
        setByteElement(term1301, 2, (byte) -126);
        setByteElement(term1301, 3, (byte) -91);
        setByteElement(term1301, 4, (byte) -104);
        setField(term1300, term1300.getClass(), "blockBuffer", term1301);
        setIntField(term1300, term1300.getClass(), "currBlkIdx", 493620644);
        setIntField(term1300, term1300.getClass(), "currRecIdx", 1328271830);
        setIntField(term1300, term1300.getClass(), "blockSize", 1596070772);
        setIntField(term1300, term1300.getClass(), "recordSize", 97029295);
        setIntField(term1300, term1300.getClass(), "recsPerBlock", -1371869594);
        setField(term1290, term1290.getClass(), "buffer", term1300);
        setField(term1312, term1312.getClass(), "name", "");
        setIntField(term1312, term1312.getClass(), "mode", -2095575670);
        setIntField(term1312, term1312.getClass(), "userId", 1225272962);
        setIntField(term1312, term1312.getClass(), "groupId", 1324040357);
        setLongField(term1312, term1312.getClass(), "size", -6823727938421990489L);
        setLongField(term1312, term1312.getClass(), "modTime", -484994522244390100L);
        setByteField(term1312, term1312.getClass(), "linkFlag", (byte) -89);
        setField(term1312, term1312.getClass(), "linkName", "");
        setField(term1312, term1312.getClass(), "magic", "ustar ");
        setField(term1312, term1312.getClass(), "version", "00");
        setField(term1312, term1312.getClass(), "userName", "root");
        setField(term1312, term1312.getClass(), "groupName", "");
        setIntField(term1312, term1312.getClass(), "devMajor", -1588772968);
        setIntField(term1312, term1312.getClass(), "devMinor", -93135961);
        setBooleanField(term1312, term1312.getClass(), "isExtended", true);
        setLongField(term1312, term1312.getClass(), "realSize", 1233889271256172047L);
        setField(term1347, term1347.getClass(), "path", "EGtDIRbSSb");
        setField(term1347, term1347.getClass(), "status", enum29);
        setIntField(term1347, term1347.getClass(), "prefixLength", -112921587);
        setField(term1347, term1347.getClass(), "filePath", null);
        setField(term1312, term1312.getClass(), "file", term1347);
        setField(term1290, term1290.getClass(), "currEntry", term1312);
        setByteElement(term1364, 0, (byte) 13);
        setByteElement(term1364, 1, (byte) 44);
        setByteElement(term1364, 2, (byte) -63);
        setByteElement(term1364, 3, (byte) 15);
        setField(term1290, term1290.getClass(), "SINGLE", term1364);
        setLongField(term1290, term1290.getClass(), "bytesRead", 6617340557564669657L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getNextTarEntry", argTypes, term1290, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


