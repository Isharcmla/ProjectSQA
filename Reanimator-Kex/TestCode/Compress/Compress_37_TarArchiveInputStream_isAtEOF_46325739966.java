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

public class TarArchiveInputStream_isAtEOF_46325739966 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7487;
     Object term25732;

    public TarArchiveInputStream_isAtEOF_46325739966() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25782 = Class.forName((String) "java.io.File$PathStatus");
        Field term25781 = ((Class) term25782).getDeclaredField((String) "INVALID");
        ((Field) term25781).setAccessible(true);
        Object enum71 = ((Field) term25781).get((Object) null);
        HashMap term7566 = new HashMap();
        term7487 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term7488 = (byte[]) newByteArray(4);
        Object term7498 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term7537 = newInstance(Class.forName("java.io.File"));
        byte[] term7576 = (byte[]) newByteArray(8);
        setByteElement(term7488, 0, (byte) 35);
        setByteElement(term7488, 1, (byte) -46);
        setByteElement(term7488, 2, (byte) -14);
        setByteElement(term7488, 3, (byte) 124);
        setField(term7487, term7487.getClass(), "SMALL_BUF", term7488);
        setIntField(term7487, term7487.getClass(), "recordSize", 229204365);
        setIntField(term7487, term7487.getClass(), "blockSize", -461771056);
        setBooleanField(term7487, term7487.getClass(), "hasHitEOF", false);
        setLongField(term7487, term7487.getClass(), "entrySize", -3954795081650780841L);
        setLongField(term7487, term7487.getClass(), "entryOffset", 3288791194263207397L);
        setField(term7487, term7487.getClass(), "is", null);
        setField(term7498, term7498.getClass(), "name", "");
        setBooleanField(term7498, term7498.getClass(), "preserveLeadingSlashes", false);
        setIntField(term7498, term7498.getClass(), "mode", -243422082);
        setLongField(term7498, term7498.getClass(), "userId", 3288941170644426558L);
        setLongField(term7498, term7498.getClass(), "groupId", -8338004844694486146L);
        setLongField(term7498, term7498.getClass(), "size", 6426732259596412988L);
        setLongField(term7498, term7498.getClass(), "modTime", 185793058502220865L);
        setBooleanField(term7498, term7498.getClass(), "checkSumOK", true);
        setByteField(term7498, term7498.getClass(), "linkFlag", (byte) -124);
        setField(term7498, term7498.getClass(), "linkName", "");
        setField(term7498, term7498.getClass(), "magic", "ustar ");
        setField(term7498, term7498.getClass(), "version", "00");
        setField(term7498, term7498.getClass(), "userName", "root");
        setField(term7498, term7498.getClass(), "groupName", "");
        setIntField(term7498, term7498.getClass(), "devMajor", 1384592638);
        setIntField(term7498, term7498.getClass(), "devMinor", -1002370457);
        setBooleanField(term7498, term7498.getClass(), "isExtended", false);
        setLongField(term7498, term7498.getClass(), "realSize", -7698746988132548371L);
        setBooleanField(term7498, term7498.getClass(), "paxGNUSparse", false);
        setBooleanField(term7498, term7498.getClass(), "starSparse", false);
        setField(term7537, term7537.getClass(), "path", "iNwOJRBEjp");
        setField(term7537, term7537.getClass(), "status", enum71);
        setIntField(term7537, term7537.getClass(), "prefixLength", -2014576105);
        setField(term7537, term7537.getClass(), "filePath", null);
        setField(term7498, term7498.getClass(), "file", term7537);
        setField(term7487, term7487.getClass(), "currEntry", term7498);
        setField(term7487, term7487.getClass(), "zipEncoding", null);
        setField(term7487, term7487.getClass(), "encoding", "XylxrMBraH");
        setField(term7487, term7487.getClass(), "globalPaxHeaders", term7566);
        setByteElement(term7576, 0, (byte) -72);
        setByteElement(term7576, 1, (byte) 90);
        setByteElement(term7576, 2, (byte) -34);
        setByteElement(term7576, 3, (byte) -2);
        setByteElement(term7576, 4, (byte) 96);
        setByteElement(term7576, 5, (byte) 55);
        setByteElement(term7576, 6, (byte) -103);
        setByteElement(term7576, 7, (byte) -103);
        setField(term7487, term7487.getClass(), "SINGLE", term7576);
        setLongField(term7487, term7487.getClass(), "bytesRead", 2145420811068634601L);
        Class<? extends Object> term25969 = Class.forName((String) "java.io.File$PathStatus");
        Field term25968 = ((Class) term25969).getDeclaredField((String) "INVALID");
        ((Field) term25968).setAccessible(true);
        Object enum72 = ((Field) term25968).get((Object) null);
        HashMap term25754 = new HashMap();
        term25732 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term25733 = (byte[]) newByteArray(4);
        Object term25734 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term25747 = newInstance(Class.forName("java.io.File"));
        byte[] term25755 = (byte[]) newByteArray(8);
        setByteElement(term25733, 0, (byte) 35);
        setByteElement(term25733, 1, (byte) -46);
        setByteElement(term25733, 2, (byte) -14);
        setByteElement(term25733, 3, (byte) 124);
        setField(term25732, term25732.getClass(), "SMALL_BUF", term25733);
        setIntField(term25732, term25732.getClass(), "recordSize", 229204365);
        setIntField(term25732, term25732.getClass(), "blockSize", -461771056);
        setBooleanField(term25732, term25732.getClass(), "hasHitEOF", false);
        setLongField(term25732, term25732.getClass(), "entrySize", -3954795081650780841L);
        setLongField(term25732, term25732.getClass(), "entryOffset", 3288791194263207397L);
        setField(term25732, term25732.getClass(), "is", null);
        setField(term25734, term25734.getClass(), "name", "");
        setBooleanField(term25734, term25734.getClass(), "preserveLeadingSlashes", false);
        setIntField(term25734, term25734.getClass(), "mode", -243422082);
        setLongField(term25734, term25734.getClass(), "userId", 3288941170644426558L);
        setLongField(term25734, term25734.getClass(), "groupId", -8338004844694486146L);
        setLongField(term25734, term25734.getClass(), "size", 6426732259596412988L);
        setLongField(term25734, term25734.getClass(), "modTime", 185793058502220865L);
        setBooleanField(term25734, term25734.getClass(), "checkSumOK", true);
        setByteField(term25734, term25734.getClass(), "linkFlag", (byte) -124);
        setField(term25734, term25734.getClass(), "linkName", "");
        setField(term25734, term25734.getClass(), "magic", "ustar ");
        setField(term25734, term25734.getClass(), "version", "00");
        setField(term25734, term25734.getClass(), "userName", "root");
        setField(term25734, term25734.getClass(), "groupName", "");
        setIntField(term25734, term25734.getClass(), "devMajor", 1384592638);
        setIntField(term25734, term25734.getClass(), "devMinor", -1002370457);
        setBooleanField(term25734, term25734.getClass(), "isExtended", false);
        setLongField(term25734, term25734.getClass(), "realSize", -7698746988132548371L);
        setBooleanField(term25734, term25734.getClass(), "paxGNUSparse", false);
        setBooleanField(term25734, term25734.getClass(), "starSparse", false);
        setField(term25747, term25747.getClass(), "path", "iNwOJRBEjp");
        setField(term25747, term25747.getClass(), "status", enum72);
        setIntField(term25747, term25747.getClass(), "prefixLength", -2014576105);
        setField(term25747, term25747.getClass(), "filePath", null);
        setField(term25734, term25734.getClass(), "file", term25747);
        setField(term25732, term25732.getClass(), "currEntry", term25734);
        setField(term25732, term25732.getClass(), "zipEncoding", null);
        setField(term25732, term25732.getClass(), "encoding", "XylxrMBraH");
        setField(term25732, term25732.getClass(), "globalPaxHeaders", term25754);
        setByteElement(term25755, 0, (byte) -72);
        setByteElement(term25755, 1, (byte) 90);
        setByteElement(term25755, 2, (byte) -34);
        setByteElement(term25755, 3, (byte) -2);
        setByteElement(term25755, 4, (byte) 96);
        setByteElement(term25755, 5, (byte) 55);
        setByteElement(term25755, 6, (byte) -103);
        setByteElement(term25755, 7, (byte) -103);
        setField(term25732, term25732.getClass(), "SINGLE", term25755);
        setLongField(term25732, term25732.getClass(), "bytesRead", 2145420811068634601L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAtEOF", argTypes, term7487, args);
        assertTrue(recursiveEquals(term7487, term25732));
    }

};


