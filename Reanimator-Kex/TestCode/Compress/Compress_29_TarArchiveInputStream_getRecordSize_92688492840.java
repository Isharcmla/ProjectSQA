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

public class TarArchiveInputStream_getRecordSize_92688492840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term346;
     Object term11316;

    public TarArchiveInputStream_getRecordSize_92688492840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11363 = Class.forName((String) "java.io.File$PathStatus");
        Field term11362 = ((Class) term11363).getDeclaredField((String) "INVALID");
        ((Field) term11362).setAccessible(true);
        Object enum27 = ((Field) term11362).get((Object) null);
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
        setField(term393, term393.getClass(), "status", enum27);
        setIntField(term393, term393.getClass(), "prefixLength", -6029667);
        setField(term393, term393.getClass(), "filePath", null);
        setField(term357, term357.getClass(), "file", term393);
        setField(term346, term346.getClass(), "currEntry", term357);
        setField(term346, term346.getClass(), "zipEncoding", null);
        setByteElement(term410, 0, (byte) 49);
        setByteElement(term410, 1, (byte) -54);
        setByteElement(term410, 2, (byte) 67);
        setByteElement(term410, 3, (byte) 78);
        setByteElement(term410, 4, (byte) 87);
        setField(term346, term346.getClass(), "SINGLE", term410);
        setLongField(term346, term346.getClass(), "bytesRead", -8885298608300233488L);
        Class<? extends Object> term11540 = Class.forName((String) "java.io.File$PathStatus");
        Field term11539 = ((Class) term11540).getDeclaredField((String) "INVALID");
        ((Field) term11539).setAccessible(true);
        Object enum28 = ((Field) term11539).get((Object) null);
        term11316 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term11317 = (byte[]) newByteArray(4);
        Object term11318 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term11331 = newInstance(Class.forName("java.io.File"));
        byte[] term11336 = (byte[]) newByteArray(5);
        setByteElement(term11317, 0, (byte) -119);
        setByteElement(term11317, 1, (byte) -66);
        setByteElement(term11317, 2, (byte) 83);
        setByteElement(term11317, 3, (byte) 74);
        setField(term11316, term11316.getClass(), "SMALL_BUF", term11317);
        setIntField(term11316, term11316.getClass(), "recordSize", 1585847225);
        setIntField(term11316, term11316.getClass(), "blockSize", 597278769);
        setBooleanField(term11316, term11316.getClass(), "hasHitEOF", false);
        setLongField(term11316, term11316.getClass(), "entrySize", 4872422362414183754L);
        setLongField(term11316, term11316.getClass(), "entryOffset", 6811161968424632369L);
        setField(term11316, term11316.getClass(), "is", null);
        setField(term11318, term11318.getClass(), "name", "");
        setIntField(term11318, term11318.getClass(), "mode", -1685132342);
        setIntField(term11318, term11318.getClass(), "userId", -1456670397);
        setIntField(term11318, term11318.getClass(), "groupId", 1622346318);
        setLongField(term11318, term11318.getClass(), "size", -7237588299778557629L);
        setLongField(term11318, term11318.getClass(), "modTime", 6967924379644551255L);
        setBooleanField(term11318, term11318.getClass(), "checkSumOK", true);
        setByteField(term11318, term11318.getClass(), "linkFlag", (byte) -71);
        setField(term11318, term11318.getClass(), "linkName", "");
        setField(term11318, term11318.getClass(), "magic", "ustar ");
        setField(term11318, term11318.getClass(), "version", "00");
        setField(term11318, term11318.getClass(), "userName", "root");
        setField(term11318, term11318.getClass(), "groupName", "");
        setIntField(term11318, term11318.getClass(), "devMajor", 1048535127);
        setIntField(term11318, term11318.getClass(), "devMinor", -655067527);
        setBooleanField(term11318, term11318.getClass(), "isExtended", true);
        setLongField(term11318, term11318.getClass(), "realSize", -2813493605142626659L);
        setField(term11331, term11331.getClass(), "path", "jJCZpVmanW");
        setField(term11331, term11331.getClass(), "status", enum28);
        setIntField(term11331, term11331.getClass(), "prefixLength", -6029667);
        setField(term11331, term11331.getClass(), "filePath", null);
        setField(term11318, term11318.getClass(), "file", term11331);
        setField(term11316, term11316.getClass(), "currEntry", term11318);
        setField(term11316, term11316.getClass(), "zipEncoding", null);
        setByteElement(term11336, 0, (byte) 49);
        setByteElement(term11336, 1, (byte) -54);
        setByteElement(term11336, 2, (byte) 67);
        setByteElement(term11336, 3, (byte) 78);
        setByteElement(term11336, 4, (byte) 87);
        setField(term11316, term11316.getClass(), "SINGLE", term11336);
        setLongField(term11316, term11316.getClass(), "bytesRead", -8885298608300233488L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRecordSize", argTypes, term346, args);
        assertTrue(recursiveEquals(term346, term11316));
        assertTrue(recursiveEquals(retValue, 1585847225));
    }

};


