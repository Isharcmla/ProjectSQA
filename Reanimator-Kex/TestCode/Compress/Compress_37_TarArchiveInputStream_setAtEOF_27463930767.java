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
import java.lang.Boolean;

public class TarArchiveInputStream_setAtEOF_27463930767 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7773;
     Object term7866;
     Object term26218;

    public TarArchiveInputStream_setAtEOF_27463930767() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26269 = Class.forName((String) "java.io.File$PathStatus");
        Field term26268 = ((Class) term26269).getDeclaredField((String) "INVALID");
        ((Field) term26268).setAccessible(true);
        Object enum73 = ((Field) term26268).get((Object) null);
        HashMap term7853 = new HashMap();
        term7773 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term7774 = (byte[]) newByteArray(5);
        Object term7785 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term7824 = newInstance(Class.forName("java.io.File"));
        byte[] term7863 = (byte[]) newByteArray(1);
        setByteElement(term7774, 0, (byte) -98);
        setByteElement(term7774, 1, (byte) -119);
        setByteElement(term7774, 2, (byte) 120);
        setByteElement(term7774, 3, (byte) -15);
        setByteElement(term7774, 4, (byte) 115);
        setField(term7773, term7773.getClass(), "SMALL_BUF", term7774);
        setIntField(term7773, term7773.getClass(), "recordSize", 1296895584);
        setIntField(term7773, term7773.getClass(), "blockSize", 628918458);
        setBooleanField(term7773, term7773.getClass(), "hasHitEOF", true);
        setLongField(term7773, term7773.getClass(), "entrySize", 2191130532479601175L);
        setLongField(term7773, term7773.getClass(), "entryOffset", 860079646007397083L);
        setField(term7773, term7773.getClass(), "is", null);
        setField(term7785, term7785.getClass(), "name", "");
        setBooleanField(term7785, term7785.getClass(), "preserveLeadingSlashes", false);
        setIntField(term7785, term7785.getClass(), "mode", -1274456137);
        setLongField(term7785, term7785.getClass(), "userId", 3230472384687362867L);
        setLongField(term7785, term7785.getClass(), "groupId", -1145146470850585022L);
        setLongField(term7785, term7785.getClass(), "size", 1993646237353405740L);
        setLongField(term7785, term7785.getClass(), "modTime", -4043093655001688454L);
        setBooleanField(term7785, term7785.getClass(), "checkSumOK", false);
        setByteField(term7785, term7785.getClass(), "linkFlag", (byte) 52);
        setField(term7785, term7785.getClass(), "linkName", "");
        setField(term7785, term7785.getClass(), "magic", "ustar ");
        setField(term7785, term7785.getClass(), "version", "00");
        setField(term7785, term7785.getClass(), "userName", "root");
        setField(term7785, term7785.getClass(), "groupName", "");
        setIntField(term7785, term7785.getClass(), "devMajor", 1041916673);
        setIntField(term7785, term7785.getClass(), "devMinor", -601863069);
        setBooleanField(term7785, term7785.getClass(), "isExtended", true);
        setLongField(term7785, term7785.getClass(), "realSize", -419800263764810394L);
        setBooleanField(term7785, term7785.getClass(), "paxGNUSparse", true);
        setBooleanField(term7785, term7785.getClass(), "starSparse", false);
        setField(term7824, term7824.getClass(), "path", "dpNsDgfPso");
        setField(term7824, term7824.getClass(), "status", enum73);
        setIntField(term7824, term7824.getClass(), "prefixLength", 663292551);
        setField(term7824, term7824.getClass(), "filePath", null);
        setField(term7785, term7785.getClass(), "file", term7824);
        setField(term7773, term7773.getClass(), "currEntry", term7785);
        setField(term7773, term7773.getClass(), "zipEncoding", null);
        setField(term7773, term7773.getClass(), "encoding", "hCWPJQKpdc");
        setField(term7773, term7773.getClass(), "globalPaxHeaders", term7853);
        setByteElement(term7863, 0, (byte) 96);
        setField(term7773, term7773.getClass(), "SINGLE", term7863);
        setLongField(term7773, term7773.getClass(), "bytesRead", 5904678961906211249L);
        term7866 = new Boolean(true);
        Class<? extends Object> term26450 = Class.forName((String) "java.io.File$PathStatus");
        Field term26449 = ((Class) term26450).getDeclaredField((String) "INVALID");
        ((Field) term26449).setAccessible(true);
        Object enum74 = ((Field) term26449).get((Object) null);
        HashMap term26240 = new HashMap();
        term26218 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term26219 = (byte[]) newByteArray(5);
        Object term26220 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term26233 = newInstance(Class.forName("java.io.File"));
        byte[] term26241 = (byte[]) newByteArray(1);
        setByteElement(term26219, 0, (byte) -98);
        setByteElement(term26219, 1, (byte) -119);
        setByteElement(term26219, 2, (byte) 120);
        setByteElement(term26219, 3, (byte) -15);
        setByteElement(term26219, 4, (byte) 115);
        setField(term26218, term26218.getClass(), "SMALL_BUF", term26219);
        setIntField(term26218, term26218.getClass(), "recordSize", 1296895584);
        setIntField(term26218, term26218.getClass(), "blockSize", 628918458);
        setBooleanField(term26218, term26218.getClass(), "hasHitEOF", true);
        setLongField(term26218, term26218.getClass(), "entrySize", 2191130532479601175L);
        setLongField(term26218, term26218.getClass(), "entryOffset", 860079646007397083L);
        setField(term26218, term26218.getClass(), "is", null);
        setField(term26220, term26220.getClass(), "name", "");
        setBooleanField(term26220, term26220.getClass(), "preserveLeadingSlashes", false);
        setIntField(term26220, term26220.getClass(), "mode", -1274456137);
        setLongField(term26220, term26220.getClass(), "userId", 3230472384687362867L);
        setLongField(term26220, term26220.getClass(), "groupId", -1145146470850585022L);
        setLongField(term26220, term26220.getClass(), "size", 1993646237353405740L);
        setLongField(term26220, term26220.getClass(), "modTime", -4043093655001688454L);
        setBooleanField(term26220, term26220.getClass(), "checkSumOK", false);
        setByteField(term26220, term26220.getClass(), "linkFlag", (byte) 52);
        setField(term26220, term26220.getClass(), "linkName", "");
        setField(term26220, term26220.getClass(), "magic", "ustar ");
        setField(term26220, term26220.getClass(), "version", "00");
        setField(term26220, term26220.getClass(), "userName", "root");
        setField(term26220, term26220.getClass(), "groupName", "");
        setIntField(term26220, term26220.getClass(), "devMajor", 1041916673);
        setIntField(term26220, term26220.getClass(), "devMinor", -601863069);
        setBooleanField(term26220, term26220.getClass(), "isExtended", true);
        setLongField(term26220, term26220.getClass(), "realSize", -419800263764810394L);
        setBooleanField(term26220, term26220.getClass(), "paxGNUSparse", true);
        setBooleanField(term26220, term26220.getClass(), "starSparse", false);
        setField(term26233, term26233.getClass(), "path", "dpNsDgfPso");
        setField(term26233, term26233.getClass(), "status", enum74);
        setIntField(term26233, term26233.getClass(), "prefixLength", 663292551);
        setField(term26233, term26233.getClass(), "filePath", null);
        setField(term26220, term26220.getClass(), "file", term26233);
        setField(term26218, term26218.getClass(), "currEntry", term26220);
        setField(term26218, term26218.getClass(), "zipEncoding", null);
        setField(term26218, term26218.getClass(), "encoding", "hCWPJQKpdc");
        setField(term26218, term26218.getClass(), "globalPaxHeaders", term26240);
        setByteElement(term26241, 0, (byte) 96);
        setField(term26218, term26218.getClass(), "SINGLE", term26241);
        setLongField(term26218, term26218.getClass(), "bytesRead", 5904678961906211249L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term7866;
        callMethod(klass, "setAtEOF", argTypes, term7773, args);
        assertTrue(recursiveEquals(term7773, term26218));
        assertTrue(recursiveEquals(term7866, true));
    }

};


