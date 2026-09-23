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

public class TarArchiveInputStream_reset_143190083729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1051;
     Object term105169;

    public TarArchiveInputStream_reset_143190083729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term105218 = Class.forName((String) "java.io.File$PathStatus");
        Field term105217 = ((Class) term105218).getDeclaredField((String) "CHECKED");
        ((Field) term105217).setAccessible(true);
        Object enum27 = ((Field) term105217).get((Object) null);
        term1051 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term1055 = (byte[]) newByteArray(3);
        Object term1059 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term1060 = (byte[]) newByteArray(1);
        Object term1067 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term1102 = newInstance(Class.forName("java.io.File"));
        byte[] term1119 = (byte[]) newByteArray(0);
        setBooleanField(term1051, term1051.getClass(), "hasHitEOF", false);
        setLongField(term1051, term1051.getClass(), "entrySize", 7009926388951271268L);
        setLongField(term1051, term1051.getClass(), "entryOffset", -7672528020740371001L);
        setByteElement(term1055, 0, (byte) 106);
        setByteElement(term1055, 1, (byte) -57);
        setByteElement(term1055, 2, (byte) -103);
        setField(term1051, term1051.getClass(), "readBuf", term1055);
        setField(term1059, term1059.getClass(), "inStream", null);
        setField(term1059, term1059.getClass(), "outStream", null);
        setByteElement(term1060, 0, (byte) 98);
        setField(term1059, term1059.getClass(), "blockBuffer", term1060);
        setIntField(term1059, term1059.getClass(), "currBlkIdx", -1968847291);
        setIntField(term1059, term1059.getClass(), "currRecIdx", 579005622);
        setIntField(term1059, term1059.getClass(), "blockSize", -14890619);
        setIntField(term1059, term1059.getClass(), "recordSize", 1632125673);
        setIntField(term1059, term1059.getClass(), "recsPerBlock", 454281060);
        setField(term1051, term1051.getClass(), "buffer", term1059);
        setField(term1067, term1067.getClass(), "name", "");
        setIntField(term1067, term1067.getClass(), "mode", -1786399638);
        setIntField(term1067, term1067.getClass(), "userId", 2055867847);
        setIntField(term1067, term1067.getClass(), "groupId", -1048298087);
        setLongField(term1067, term1067.getClass(), "size", -4502405999831680926L);
        setLongField(term1067, term1067.getClass(), "modTime", 1967728129628047933L);
        setByteField(term1067, term1067.getClass(), "linkFlag", (byte) 79);
        setField(term1067, term1067.getClass(), "linkName", "");
        setField(term1067, term1067.getClass(), "magic", "ustar ");
        setField(term1067, term1067.getClass(), "version", "00");
        setField(term1067, term1067.getClass(), "userName", "root");
        setField(term1067, term1067.getClass(), "groupName", "");
        setIntField(term1067, term1067.getClass(), "devMajor", 292681826);
        setIntField(term1067, term1067.getClass(), "devMinor", 458147407);
        setBooleanField(term1067, term1067.getClass(), "isExtended", true);
        setLongField(term1067, term1067.getClass(), "realSize", 2120084523938730454L);
        setField(term1102, term1102.getClass(), "path", "jJCZpVmanW");
        setField(term1102, term1102.getClass(), "status", enum27);
        setIntField(term1102, term1102.getClass(), "prefixLength", -184153539);
        setField(term1102, term1102.getClass(), "filePath", null);
        setField(term1067, term1067.getClass(), "file", term1102);
        setField(term1051, term1051.getClass(), "currEntry", term1067);
        setField(term1051, term1051.getClass(), "SINGLE", term1119);
        setLongField(term1051, term1051.getClass(), "bytesRead", 6855071767938501807L);
        Class<? extends Object> term105387 = Class.forName((String) "java.io.File$PathStatus");
        Field term105386 = ((Class) term105387).getDeclaredField((String) "INVALID");
        ((Field) term105386).setAccessible(true);
        Object enum28 = ((Field) term105386).get((Object) null);
        term105169 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term105170 = (byte[]) newByteArray(3);
        Object term105171 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term105172 = (byte[]) newByteArray(1);
        Object term105173 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term105186 = newInstance(Class.forName("java.io.File"));
        byte[] term105191 = (byte[]) newByteArray(0);
        setBooleanField(term105169, term105169.getClass(), "hasHitEOF", false);
        setLongField(term105169, term105169.getClass(), "entrySize", 7009926388951271268L);
        setLongField(term105169, term105169.getClass(), "entryOffset", -7672528020740371001L);
        setByteElement(term105170, 0, (byte) 106);
        setByteElement(term105170, 1, (byte) -57);
        setByteElement(term105170, 2, (byte) -103);
        setField(term105169, term105169.getClass(), "readBuf", term105170);
        setField(term105171, term105171.getClass(), "inStream", null);
        setField(term105171, term105171.getClass(), "outStream", null);
        setByteElement(term105172, 0, (byte) 98);
        setField(term105171, term105171.getClass(), "blockBuffer", term105172);
        setIntField(term105171, term105171.getClass(), "currBlkIdx", -1968847291);
        setIntField(term105171, term105171.getClass(), "currRecIdx", 579005622);
        setIntField(term105171, term105171.getClass(), "blockSize", -14890619);
        setIntField(term105171, term105171.getClass(), "recordSize", 1632125673);
        setIntField(term105171, term105171.getClass(), "recsPerBlock", 454281060);
        setField(term105169, term105169.getClass(), "buffer", term105171);
        setField(term105173, term105173.getClass(), "name", "");
        setIntField(term105173, term105173.getClass(), "mode", -1786399638);
        setIntField(term105173, term105173.getClass(), "userId", 2055867847);
        setIntField(term105173, term105173.getClass(), "groupId", -1048298087);
        setLongField(term105173, term105173.getClass(), "size", -4502405999831680926L);
        setLongField(term105173, term105173.getClass(), "modTime", 1967728129628047933L);
        setByteField(term105173, term105173.getClass(), "linkFlag", (byte) 79);
        setField(term105173, term105173.getClass(), "linkName", "");
        setField(term105173, term105173.getClass(), "magic", "ustar ");
        setField(term105173, term105173.getClass(), "version", "00");
        setField(term105173, term105173.getClass(), "userName", "root");
        setField(term105173, term105173.getClass(), "groupName", "");
        setIntField(term105173, term105173.getClass(), "devMajor", 292681826);
        setIntField(term105173, term105173.getClass(), "devMinor", 458147407);
        setBooleanField(term105173, term105173.getClass(), "isExtended", true);
        setLongField(term105173, term105173.getClass(), "realSize", 2120084523938730454L);
        setField(term105186, term105186.getClass(), "path", "jJCZpVmanW");
        setField(term105186, term105186.getClass(), "status", enum28);
        setIntField(term105186, term105186.getClass(), "prefixLength", -184153539);
        setField(term105186, term105186.getClass(), "filePath", null);
        setField(term105173, term105173.getClass(), "file", term105186);
        setField(term105169, term105169.getClass(), "currEntry", term105173);
        setField(term105169, term105169.getClass(), "SINGLE", term105191);
        setLongField(term105169, term105169.getClass(), "bytesRead", 6855071767938501807L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reset", argTypes, term1051, args);
        assertTrue(recursiveEquals(term1051, term105169));
    }

};


