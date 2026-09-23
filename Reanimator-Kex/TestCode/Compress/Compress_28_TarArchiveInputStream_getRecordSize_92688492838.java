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

public class TarArchiveInputStream_getRecordSize_92688492838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term346;
     Object term11397;

    public TarArchiveInputStream_getRecordSize_92688492838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11444 = Class.forName((String) "java.io.File$PathStatus");
        Field term11443 = ((Class) term11444).getDeclaredField((String) "CHECKED");
        ((Field) term11443).setAccessible(true);
        Object enum25 = ((Field) term11443).get((Object) null);
        term346 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term347 = (byte[]) newByteArray(4);
        Object term357 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term393 = newInstance(Class.forName("java.io.File"));
        byte[] term410 = (byte[]) newByteArray(5);
        setByteElement(term347, 0, (byte) -119);
        setByteElement(term347, 1, (byte) -66);
        setByteElement(term347, 2, (byte) 83);
        setByteElement(term347, 3, (byte) 74);
        setField(term346, term346.getClass(), "SMALL_BUF", term347);
        setIntField(term346, term346.getClass(), "recordSize", 1585847225);
        setIntField(term346, term346.getClass(), "blockSize", 597278769);
        setBooleanField(term346, term346.getClass(), "hasHitEOF", false);
        setLongField(term346, term346.getClass(), "entrySize", 4872422362414183754L);
        setLongField(term346, term346.getClass(), "entryOffset", 6811161968424632369L);
        setField(term346, term346.getClass(), "is", null);
        setField(term357, term357.getClass(), "name", "");
        setIntField(term357, term357.getClass(), "mode", -1685132342);
        setIntField(term357, term357.getClass(), "userId", -1456670397);
        setIntField(term357, term357.getClass(), "groupId", 1622346318);
        setLongField(term357, term357.getClass(), "size", -7237588299778557629L);
        setLongField(term357, term357.getClass(), "modTime", 6967924379644551255L);
        setBooleanField(term357, term357.getClass(), "checkSumOK", true);
        setByteField(term357, term357.getClass(), "linkFlag", (byte) -71);
        setField(term357, term357.getClass(), "linkName", "");
        setField(term357, term357.getClass(), "magic", "ustar ");
        setField(term357, term357.getClass(), "version", "00");
        setField(term357, term357.getClass(), "userName", "root");
        setField(term357, term357.getClass(), "groupName", "");
        setIntField(term357, term357.getClass(), "devMajor", 1048535127);
        setIntField(term357, term357.getClass(), "devMinor", -655067527);
        setBooleanField(term357, term357.getClass(), "isExtended", true);
        setLongField(term357, term357.getClass(), "realSize", -2813493605142626659L);
        setField(term393, term393.getClass(), "path", "jJCZpVmanW");
        setField(term393, term393.getClass(), "status", enum25);
        setIntField(term393, term393.getClass(), "prefixLength", -6029667);
        setField(term393, term393.getClass(), "filePath", null);
        setField(term357, term357.getClass(), "file", term393);
        setField(term346, term346.getClass(), "currEntry", term357);
        setField(term346, term346.getClass(), "encoding", null);
        setByteElement(term410, 0, (byte) 49);
        setByteElement(term410, 1, (byte) -54);
        setByteElement(term410, 2, (byte) 67);
        setByteElement(term410, 3, (byte) 78);
        setByteElement(term410, 4, (byte) 87);
        setField(term346, term346.getClass(), "SINGLE", term410);
        setLongField(term346, term346.getClass(), "bytesRead", -8885298608300233488L);
        Class<? extends Object> term11618 = Class.forName((String) "java.io.File$PathStatus");
        Field term11617 = ((Class) term11618).getDeclaredField((String) "INVALID");
        ((Field) term11617).setAccessible(true);
        Object enum26 = ((Field) term11617).get((Object) null);
        term11397 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term11398 = (byte[]) newByteArray(4);
        Object term11399 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term11412 = newInstance(Class.forName("java.io.File"));
        byte[] term11417 = (byte[]) newByteArray(5);
        setByteElement(term11398, 0, (byte) -119);
        setByteElement(term11398, 1, (byte) -66);
        setByteElement(term11398, 2, (byte) 83);
        setByteElement(term11398, 3, (byte) 74);
        setField(term11397, term11397.getClass(), "SMALL_BUF", term11398);
        setIntField(term11397, term11397.getClass(), "recordSize", 1585847225);
        setIntField(term11397, term11397.getClass(), "blockSize", 597278769);
        setBooleanField(term11397, term11397.getClass(), "hasHitEOF", false);
        setLongField(term11397, term11397.getClass(), "entrySize", 4872422362414183754L);
        setLongField(term11397, term11397.getClass(), "entryOffset", 6811161968424632369L);
        setField(term11397, term11397.getClass(), "is", null);
        setField(term11399, term11399.getClass(), "name", "");
        setIntField(term11399, term11399.getClass(), "mode", -1685132342);
        setIntField(term11399, term11399.getClass(), "userId", -1456670397);
        setIntField(term11399, term11399.getClass(), "groupId", 1622346318);
        setLongField(term11399, term11399.getClass(), "size", -7237588299778557629L);
        setLongField(term11399, term11399.getClass(), "modTime", 6967924379644551255L);
        setBooleanField(term11399, term11399.getClass(), "checkSumOK", true);
        setByteField(term11399, term11399.getClass(), "linkFlag", (byte) -71);
        setField(term11399, term11399.getClass(), "linkName", "");
        setField(term11399, term11399.getClass(), "magic", "ustar ");
        setField(term11399, term11399.getClass(), "version", "00");
        setField(term11399, term11399.getClass(), "userName", "root");
        setField(term11399, term11399.getClass(), "groupName", "");
        setIntField(term11399, term11399.getClass(), "devMajor", 1048535127);
        setIntField(term11399, term11399.getClass(), "devMinor", -655067527);
        setBooleanField(term11399, term11399.getClass(), "isExtended", true);
        setLongField(term11399, term11399.getClass(), "realSize", -2813493605142626659L);
        setField(term11412, term11412.getClass(), "path", "jJCZpVmanW");
        setField(term11412, term11412.getClass(), "status", enum26);
        setIntField(term11412, term11412.getClass(), "prefixLength", -6029667);
        setField(term11412, term11412.getClass(), "filePath", null);
        setField(term11399, term11399.getClass(), "file", term11412);
        setField(term11397, term11397.getClass(), "currEntry", term11399);
        setField(term11397, term11397.getClass(), "encoding", null);
        setByteElement(term11417, 0, (byte) 49);
        setByteElement(term11417, 1, (byte) -54);
        setByteElement(term11417, 2, (byte) 67);
        setByteElement(term11417, 3, (byte) 78);
        setByteElement(term11417, 4, (byte) 87);
        setField(term11397, term11397.getClass(), "SINGLE", term11417);
        setLongField(term11397, term11397.getClass(), "bytesRead", -8885298608300233488L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRecordSize", argTypes, term346, args);
        assertTrue(recursiveEquals(term346, term11397));
        assertTrue(recursiveEquals(retValue, 1585847225));
    }

};


