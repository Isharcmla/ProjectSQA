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

public class TarArchiveInputStream_consumeRemainderOfLastBlock_93962847760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5921;
     Object term21493;

    public TarArchiveInputStream_consumeRemainderOfLastBlock_93962847760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21542 = Class.forName((String) "java.io.File$PathStatus");
        Field term21541 = ((Class) term21542).getDeclaredField((String) "CHECKED");
        ((Field) term21541).setAccessible(true);
        Object enum65 = ((Field) term21541).get((Object) null);
        term5921 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term5922 = (byte[]) newByteArray(6);
        Object term5934 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term5970 = newInstance(Class.forName("java.io.File"));
        byte[] term5987 = (byte[]) newByteArray(7);
        setByteElement(term5922, 0, (byte) -54);
        setByteElement(term5922, 1, (byte) 9);
        setByteElement(term5922, 2, (byte) 19);
        setByteElement(term5922, 3, (byte) -103);
        setByteElement(term5922, 4, (byte) 61);
        setByteElement(term5922, 5, (byte) -90);
        setField(term5921, term5921.getClass(), "SMALL_BUF", term5922);
        setIntField(term5921, term5921.getClass(), "recordSize", 1152356969);
        setIntField(term5921, term5921.getClass(), "blockSize", -1667990367);
        setBooleanField(term5921, term5921.getClass(), "hasHitEOF", false);
        setLongField(term5921, term5921.getClass(), "entrySize", -2924531382671518368L);
        setLongField(term5921, term5921.getClass(), "entryOffset", -3948863953565024517L);
        setField(term5921, term5921.getClass(), "is", null);
        setField(term5934, term5934.getClass(), "name", "");
        setIntField(term5934, term5934.getClass(), "mode", -1214628358);
        setIntField(term5934, term5934.getClass(), "userId", 1102721075);
        setIntField(term5934, term5934.getClass(), "groupId", -426764678);
        setLongField(term5934, term5934.getClass(), "size", -6587807377747738663L);
        setLongField(term5934, term5934.getClass(), "modTime", -6301101997917060727L);
        setBooleanField(term5934, term5934.getClass(), "checkSumOK", false);
        setByteField(term5934, term5934.getClass(), "linkFlag", (byte) -27);
        setField(term5934, term5934.getClass(), "linkName", "");
        setField(term5934, term5934.getClass(), "magic", "ustar ");
        setField(term5934, term5934.getClass(), "version", "00");
        setField(term5934, term5934.getClass(), "userName", "root");
        setField(term5934, term5934.getClass(), "groupName", "");
        setIntField(term5934, term5934.getClass(), "devMajor", -1222614956);
        setIntField(term5934, term5934.getClass(), "devMinor", -1870495012);
        setBooleanField(term5934, term5934.getClass(), "isExtended", false);
        setLongField(term5934, term5934.getClass(), "realSize", 8166095254618543564L);
        setField(term5970, term5970.getClass(), "path", "GzFkzHGYFt");
        setField(term5970, term5970.getClass(), "status", enum65);
        setIntField(term5970, term5970.getClass(), "prefixLength", -1310015129);
        setField(term5970, term5970.getClass(), "filePath", null);
        setField(term5934, term5934.getClass(), "file", term5970);
        setField(term5921, term5921.getClass(), "currEntry", term5934);
        setField(term5921, term5921.getClass(), "encoding", null);
        setByteElement(term5987, 0, (byte) 119);
        setByteElement(term5987, 1, (byte) -125);
        setByteElement(term5987, 2, (byte) 100);
        setByteElement(term5987, 3, (byte) -1);
        setByteElement(term5987, 4, (byte) -127);
        setByteElement(term5987, 5, (byte) -118);
        setByteElement(term5987, 6, (byte) 69);
        setField(term5921, term5921.getClass(), "SINGLE", term5987);
        setLongField(term5921, term5921.getClass(), "bytesRead", -4598158870068953328L);
        Class<? extends Object> term21720 = Class.forName((String) "java.io.File$PathStatus");
        Field term21719 = ((Class) term21720).getDeclaredField((String) "CHECKED");
        ((Field) term21719).setAccessible(true);
        Object enum66 = ((Field) term21719).get((Object) null);
        term21493 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term21494 = (byte[]) newByteArray(6);
        Object term21495 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term21508 = newInstance(Class.forName("java.io.File"));
        byte[] term21513 = (byte[]) newByteArray(7);
        setByteElement(term21494, 0, (byte) -54);
        setByteElement(term21494, 1, (byte) 9);
        setByteElement(term21494, 2, (byte) 19);
        setByteElement(term21494, 3, (byte) -103);
        setByteElement(term21494, 4, (byte) 61);
        setByteElement(term21494, 5, (byte) -90);
        setField(term21493, term21493.getClass(), "SMALL_BUF", term21494);
        setIntField(term21493, term21493.getClass(), "recordSize", 1152356969);
        setIntField(term21493, term21493.getClass(), "blockSize", -1667990367);
        setBooleanField(term21493, term21493.getClass(), "hasHitEOF", false);
        setLongField(term21493, term21493.getClass(), "entrySize", -2924531382671518368L);
        setLongField(term21493, term21493.getClass(), "entryOffset", -3948863953565024517L);
        setField(term21493, term21493.getClass(), "is", null);
        setField(term21495, term21495.getClass(), "name", "");
        setIntField(term21495, term21495.getClass(), "mode", -1214628358);
        setIntField(term21495, term21495.getClass(), "userId", 1102721075);
        setIntField(term21495, term21495.getClass(), "groupId", -426764678);
        setLongField(term21495, term21495.getClass(), "size", -6587807377747738663L);
        setLongField(term21495, term21495.getClass(), "modTime", -6301101997917060727L);
        setBooleanField(term21495, term21495.getClass(), "checkSumOK", false);
        setByteField(term21495, term21495.getClass(), "linkFlag", (byte) -27);
        setField(term21495, term21495.getClass(), "linkName", "");
        setField(term21495, term21495.getClass(), "magic", "ustar ");
        setField(term21495, term21495.getClass(), "version", "00");
        setField(term21495, term21495.getClass(), "userName", "root");
        setField(term21495, term21495.getClass(), "groupName", "");
        setIntField(term21495, term21495.getClass(), "devMajor", -1222614956);
        setIntField(term21495, term21495.getClass(), "devMinor", -1870495012);
        setBooleanField(term21495, term21495.getClass(), "isExtended", false);
        setLongField(term21495, term21495.getClass(), "realSize", 8166095254618543564L);
        setField(term21508, term21508.getClass(), "path", "GzFkzHGYFt");
        setField(term21508, term21508.getClass(), "status", enum66);
        setIntField(term21508, term21508.getClass(), "prefixLength", -1310015129);
        setField(term21508, term21508.getClass(), "filePath", null);
        setField(term21495, term21495.getClass(), "file", term21508);
        setField(term21493, term21493.getClass(), "currEntry", term21495);
        setField(term21493, term21493.getClass(), "encoding", null);
        setByteElement(term21513, 0, (byte) 119);
        setByteElement(term21513, 1, (byte) -125);
        setByteElement(term21513, 2, (byte) 100);
        setByteElement(term21513, 3, (byte) -1);
        setByteElement(term21513, 4, (byte) -127);
        setByteElement(term21513, 5, (byte) -118);
        setByteElement(term21513, 6, (byte) 69);
        setField(term21493, term21493.getClass(), "SINGLE", term21513);
        setLongField(term21493, term21493.getClass(), "bytesRead", -4598158870068953328L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "consumeRemainderOfLastBlock", argTypes, term5921, args);
        assertTrue(recursiveEquals(term5921, term21493));
    }

};


