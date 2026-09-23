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
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.tar.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;

public class TarArchiveInputStream_getLongNameData_191206871150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2603;
     Object term17467;
     Object term17491;
     Object term17466;

    public TarArchiveInputStream_getLongNameData_191206871150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17520 = Class.forName((String) "java.io.File$PathStatus");
        Field term17519 = ((Class) term17520).getDeclaredField((String) "INVALID");
        ((Field) term17519).setAccessible(true);
        Object enum46 = ((Field) term17519).get((Object) null);
        HashMap term2684 = new HashMap();
        term2603 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term2604 = (byte[]) newByteArray(6);
        Object term2616 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term2655 = newInstance(Class.forName("java.io.File"));
        byte[] term2694 = (byte[]) newByteArray(1);
        setByteElement(term2604, 0, (byte) 35);
        setByteElement(term2604, 1, (byte) 66);
        setByteElement(term2604, 2, (byte) 123);
        setByteElement(term2604, 3, (byte) -5);
        setByteElement(term2604, 4, (byte) 84);
        setByteElement(term2604, 5, (byte) -97);
        setField(term2603, term2603.getClass(), "SMALL_BUF", term2604);
        setIntField(term2603, term2603.getClass(), "recordSize", 97029295);
        setIntField(term2603, term2603.getClass(), "blockSize", -1371869594);
        setBooleanField(term2603, term2603.getClass(), "hasHitEOF", true);
        setLongField(term2603, term2603.getClass(), "entrySize", 6682528376118987775L);
        setLongField(term2603, term2603.getClass(), "entryOffset", 682356318767179819L);
        setField(term2603, term2603.getClass(), "is", null);
        setField(term2616, term2616.getClass(), "name", "");
        setBooleanField(term2616, term2616.getClass(), "preserveLeadingSlashes", false);
        setIntField(term2616, term2616.getClass(), "mode", -2095575670);
        setLongField(term2616, term2616.getClass(), "userId", -7291743527973326814L);
        setLongField(term2616, term2616.getClass(), "groupId", -5963439350418910964L);
        setLongField(term2616, term2616.getClass(), "size", 9013624480170062917L);
        setLongField(term2616, term2616.getClass(), "modTime", 7862575738391801707L);
        setBooleanField(term2616, term2616.getClass(), "checkSumOK", false);
        setByteField(term2616, term2616.getClass(), "linkFlag", (byte) -24);
        setField(term2616, term2616.getClass(), "linkName", "");
        setField(term2616, term2616.getClass(), "magic", "ustar ");
        setField(term2616, term2616.getClass(), "version", "00");
        setField(term2616, term2616.getClass(), "userName", "root");
        setField(term2616, term2616.getClass(), "groupName", "");
        setIntField(term2616, term2616.getClass(), "devMajor", 1225272962);
        setIntField(term2616, term2616.getClass(), "devMinor", 1324040357);
        setBooleanField(term2616, term2616.getClass(), "isExtended", true);
        setLongField(term2616, term2616.getClass(), "realSize", 50358265865610362L);
        setBooleanField(term2616, term2616.getClass(), "paxGNUSparse", false);
        setBooleanField(term2616, term2616.getClass(), "starSparse", false);
        setField(term2655, term2655.getClass(), "path", "aKnKipADSo");
        setField(term2655, term2655.getClass(), "status", enum46);
        setIntField(term2655, term2655.getClass(), "prefixLength", -1588772968);
        setField(term2655, term2655.getClass(), "filePath", null);
        setField(term2616, term2616.getClass(), "file", term2655);
        setField(term2603, term2603.getClass(), "currEntry", term2616);
        setField(term2603, term2603.getClass(), "zipEncoding", null);
        setField(term2603, term2603.getClass(), "encoding", "wSQxaModmm");
        setField(term2603, term2603.getClass(), "globalPaxHeaders", term2684);
        setByteElement(term2694, 0, (byte) 88);
        setField(term2603, term2603.getClass(), "SINGLE", term2694);
        setLongField(term2603, term2603.getClass(), "bytesRead", 5510783420697225605L);
        Class<? extends Object> term17702 = Class.forName((String) "java.io.File$PathStatus");
        Field term17701 = ((Class) term17702).getDeclaredField((String) "INVALID");
        ((Field) term17701).setAccessible(true);
        Object enum47 = ((Field) term17701).get((Object) null);
        HashMap term17489 = new HashMap();
        term17467 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term17468 = (byte[]) newByteArray(6);
        Object term17469 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term17482 = newInstance(Class.forName("java.io.File"));
        byte[] term17490 = (byte[]) newByteArray(1);
        setByteElement(term17468, 0, (byte) 35);
        setByteElement(term17468, 1, (byte) 66);
        setByteElement(term17468, 2, (byte) 123);
        setByteElement(term17468, 3, (byte) -5);
        setByteElement(term17468, 4, (byte) 84);
        setByteElement(term17468, 5, (byte) -97);
        setField(term17467, term17467.getClass(), "SMALL_BUF", term17468);
        setIntField(term17467, term17467.getClass(), "recordSize", 97029295);
        setIntField(term17467, term17467.getClass(), "blockSize", -1371869594);
        setBooleanField(term17467, term17467.getClass(), "hasHitEOF", true);
        setLongField(term17467, term17467.getClass(), "entrySize", 6682528376118987775L);
        setLongField(term17467, term17467.getClass(), "entryOffset", 682356318767179819L);
        setField(term17467, term17467.getClass(), "is", null);
        setField(term17469, term17469.getClass(), "name", "");
        setBooleanField(term17469, term17469.getClass(), "preserveLeadingSlashes", false);
        setIntField(term17469, term17469.getClass(), "mode", -2095575670);
        setLongField(term17469, term17469.getClass(), "userId", -7291743527973326814L);
        setLongField(term17469, term17469.getClass(), "groupId", -5963439350418910964L);
        setLongField(term17469, term17469.getClass(), "size", 9013624480170062917L);
        setLongField(term17469, term17469.getClass(), "modTime", 7862575738391801707L);
        setBooleanField(term17469, term17469.getClass(), "checkSumOK", false);
        setByteField(term17469, term17469.getClass(), "linkFlag", (byte) -24);
        setField(term17469, term17469.getClass(), "linkName", "");
        setField(term17469, term17469.getClass(), "magic", "ustar ");
        setField(term17469, term17469.getClass(), "version", "00");
        setField(term17469, term17469.getClass(), "userName", "root");
        setField(term17469, term17469.getClass(), "groupName", "");
        setIntField(term17469, term17469.getClass(), "devMajor", 1225272962);
        setIntField(term17469, term17469.getClass(), "devMinor", 1324040357);
        setBooleanField(term17469, term17469.getClass(), "isExtended", true);
        setLongField(term17469, term17469.getClass(), "realSize", 50358265865610362L);
        setBooleanField(term17469, term17469.getClass(), "paxGNUSparse", false);
        setBooleanField(term17469, term17469.getClass(), "starSparse", false);
        setField(term17482, term17482.getClass(), "path", "aKnKipADSo");
        setField(term17482, term17482.getClass(), "status", enum47);
        setIntField(term17482, term17482.getClass(), "prefixLength", -1588772968);
        setField(term17482, term17482.getClass(), "filePath", null);
        setField(term17469, term17469.getClass(), "file", term17482);
        setField(term17467, term17467.getClass(), "currEntry", term17469);
        setField(term17467, term17467.getClass(), "zipEncoding", null);
        setField(term17467, term17467.getClass(), "encoding", "wSQxaModmm");
        setField(term17467, term17467.getClass(), "globalPaxHeaders", term17489);
        setByteElement(term17490, 0, (byte) 88);
        setField(term17467, term17467.getClass(), "SINGLE", term17490);
        setLongField(term17467, term17467.getClass(), "bytesRead", 5510783420697225605L);
        term17491 = (byte[]) newByteArray(6);
        setByteElement(term17491, 0, (byte) 35);
        setByteElement(term17491, 1, (byte) 66);
        setByteElement(term17491, 2, (byte) 123);
        setByteElement(term17491, 3, (byte) -5);
        setByteElement(term17491, 4, (byte) 84);
        setByteElement(term17491, 5, (byte) -97);
        term17466 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLongNameData", argTypes, term2603, args);
        assertTrue(recursiveEquals(term2603, term17467));
        assertTrue(recursiveEquals(retValue, term17466));
    }

};


