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

public class TarArchiveInputStream_consumeRemainderOfLastBlock_93962847764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6937;
     Object term24343;

    public TarArchiveInputStream_consumeRemainderOfLastBlock_93962847764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24394 = Class.forName((String) "java.io.File$PathStatus");
        Field term24393 = ((Class) term24394).getDeclaredField((String) "INVALID");
        ((Field) term24393).setAccessible(true);
        Object enum68 = ((Field) term24393).get((Object) null);
        term6937 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term6938 = (byte[]) newByteArray(6);
        Object term6950 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term6986 = newInstance(Class.forName("java.io.File"));
        byte[] term7015 = (byte[]) newByteArray(0);
        setByteElement(term6938, 0, (byte) -32);
        setByteElement(term6938, 1, (byte) -52);
        setByteElement(term6938, 2, (byte) 53);
        setByteElement(term6938, 3, (byte) 44);
        setByteElement(term6938, 4, (byte) 49);
        setByteElement(term6938, 5, (byte) 114);
        setField(term6937, term6937.getClass(), "SMALL_BUF", term6938);
        setIntField(term6937, term6937.getClass(), "recordSize", 229204365);
        setIntField(term6937, term6937.getClass(), "blockSize", -461771056);
        setBooleanField(term6937, term6937.getClass(), "hasHitEOF", false);
        setLongField(term6937, term6937.getClass(), "entrySize", -3954795081650780841L);
        setLongField(term6937, term6937.getClass(), "entryOffset", 3288791194263207397L);
        setField(term6937, term6937.getClass(), "is", null);
        setField(term6950, term6950.getClass(), "name", "");
        setIntField(term6950, term6950.getClass(), "mode", -243422082);
        setLongField(term6950, term6950.getClass(), "userId", 3288941170644426558L);
        setLongField(term6950, term6950.getClass(), "groupId", -8338004844694486146L);
        setLongField(term6950, term6950.getClass(), "size", 6426732259596412988L);
        setLongField(term6950, term6950.getClass(), "modTime", 185793058502220865L);
        setBooleanField(term6950, term6950.getClass(), "checkSumOK", true);
        setByteField(term6950, term6950.getClass(), "linkFlag", (byte) -81);
        setField(term6950, term6950.getClass(), "linkName", "");
        setField(term6950, term6950.getClass(), "magic", "ustar ");
        setField(term6950, term6950.getClass(), "version", "00");
        setField(term6950, term6950.getClass(), "userName", "root");
        setField(term6950, term6950.getClass(), "groupName", "");
        setIntField(term6950, term6950.getClass(), "devMajor", 1384592638);
        setIntField(term6950, term6950.getClass(), "devMinor", -1002370457);
        setBooleanField(term6950, term6950.getClass(), "isExtended", false);
        setLongField(term6950, term6950.getClass(), "realSize", -7698746988132548371L);
        setField(term6986, term6986.getClass(), "path", "fhkbdRViHi");
        setField(term6986, term6986.getClass(), "status", enum68);
        setIntField(term6986, term6986.getClass(), "prefixLength", -2014576105);
        setField(term6986, term6986.getClass(), "filePath", null);
        setField(term6950, term6950.getClass(), "file", term6986);
        setField(term6937, term6937.getClass(), "currEntry", term6950);
        setField(term6937, term6937.getClass(), "zipEncoding", null);
        setField(term6937, term6937.getClass(), "encoding", "uWHnvSvaPl");
        setField(term6937, term6937.getClass(), "SINGLE", term7015);
        setLongField(term6937, term6937.getClass(), "bytesRead", 2145420811068634601L);
        Class<? extends Object> term24575 = Class.forName((String) "java.io.File$PathStatus");
        Field term24574 = ((Class) term24575).getDeclaredField((String) "INVALID");
        ((Field) term24574).setAccessible(true);
        Object enum69 = ((Field) term24574).get((Object) null);
        term24343 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term24344 = (byte[]) newByteArray(6);
        Object term24345 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term24358 = newInstance(Class.forName("java.io.File"));
        byte[] term24365 = (byte[]) newByteArray(0);
        setByteElement(term24344, 0, (byte) -32);
        setByteElement(term24344, 1, (byte) -52);
        setByteElement(term24344, 2, (byte) 53);
        setByteElement(term24344, 3, (byte) 44);
        setByteElement(term24344, 4, (byte) 49);
        setByteElement(term24344, 5, (byte) 114);
        setField(term24343, term24343.getClass(), "SMALL_BUF", term24344);
        setIntField(term24343, term24343.getClass(), "recordSize", 229204365);
        setIntField(term24343, term24343.getClass(), "blockSize", -461771056);
        setBooleanField(term24343, term24343.getClass(), "hasHitEOF", false);
        setLongField(term24343, term24343.getClass(), "entrySize", -3954795081650780841L);
        setLongField(term24343, term24343.getClass(), "entryOffset", 3288791194263207397L);
        setField(term24343, term24343.getClass(), "is", null);
        setField(term24345, term24345.getClass(), "name", "");
        setIntField(term24345, term24345.getClass(), "mode", -243422082);
        setLongField(term24345, term24345.getClass(), "userId", 3288941170644426558L);
        setLongField(term24345, term24345.getClass(), "groupId", -8338004844694486146L);
        setLongField(term24345, term24345.getClass(), "size", 6426732259596412988L);
        setLongField(term24345, term24345.getClass(), "modTime", 185793058502220865L);
        setBooleanField(term24345, term24345.getClass(), "checkSumOK", true);
        setByteField(term24345, term24345.getClass(), "linkFlag", (byte) -81);
        setField(term24345, term24345.getClass(), "linkName", "");
        setField(term24345, term24345.getClass(), "magic", "ustar ");
        setField(term24345, term24345.getClass(), "version", "00");
        setField(term24345, term24345.getClass(), "userName", "root");
        setField(term24345, term24345.getClass(), "groupName", "");
        setIntField(term24345, term24345.getClass(), "devMajor", 1384592638);
        setIntField(term24345, term24345.getClass(), "devMinor", -1002370457);
        setBooleanField(term24345, term24345.getClass(), "isExtended", false);
        setLongField(term24345, term24345.getClass(), "realSize", -7698746988132548371L);
        setField(term24358, term24358.getClass(), "path", "fhkbdRViHi");
        setField(term24358, term24358.getClass(), "status", enum69);
        setIntField(term24358, term24358.getClass(), "prefixLength", -2014576105);
        setField(term24358, term24358.getClass(), "filePath", null);
        setField(term24345, term24345.getClass(), "file", term24358);
        setField(term24343, term24343.getClass(), "currEntry", term24345);
        setField(term24343, term24343.getClass(), "zipEncoding", null);
        setField(term24343, term24343.getClass(), "encoding", "uWHnvSvaPl");
        setField(term24343, term24343.getClass(), "SINGLE", term24365);
        setLongField(term24343, term24343.getClass(), "bytesRead", 2145420811068634601L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "consumeRemainderOfLastBlock", argTypes, term6937, args);
        assertTrue(recursiveEquals(term6937, term24343));
    }

};


