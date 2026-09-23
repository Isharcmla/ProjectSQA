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
import java.lang.Integer;

public class TarArchiveInputStream_read_82857799258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4834;
     Object term4906;
     Object term4911;
     Object term4913;
     Object term19995;
     Object term20016;

    public TarArchiveInputStream_read_82857799258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20046 = Class.forName((String) "java.io.File$PathStatus");
        Field term20045 = ((Class) term20046).getDeclaredField((String) "INVALID");
        ((Field) term20045).setAccessible(true);
        Object enum54 = ((Field) term20045).get((Object) null);
        term4834 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term4835 = (byte[]) newByteArray(7);
        Object term4848 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term4884 = newInstance(Class.forName("java.io.File"));
        byte[] term4901 = (byte[]) newByteArray(3);
        setByteElement(term4835, 0, (byte) -35);
        setByteElement(term4835, 1, (byte) 3);
        setByteElement(term4835, 2, (byte) -10);
        setByteElement(term4835, 3, (byte) -106);
        setByteElement(term4835, 4, (byte) -124);
        setByteElement(term4835, 5, (byte) -71);
        setByteElement(term4835, 6, (byte) 113);
        setField(term4834, term4834.getClass(), "SMALL_BUF", term4835);
        setIntField(term4834, term4834.getClass(), "recordSize", 1953277050);
        setIntField(term4834, term4834.getClass(), "blockSize", 1283079251);
        setBooleanField(term4834, term4834.getClass(), "hasHitEOF", true);
        setLongField(term4834, term4834.getClass(), "entrySize", -4924950707540628022L);
        setLongField(term4834, term4834.getClass(), "entryOffset", -4393710401270724527L);
        setField(term4834, term4834.getClass(), "is", null);
        setField(term4848, term4848.getClass(), "name", "");
        setIntField(term4848, term4848.getClass(), "mode", -523949691);
        setIntField(term4848, term4848.getClass(), "userId", 1398204340);
        setIntField(term4848, term4848.getClass(), "groupId", 229204365);
        setLongField(term4848, term4848.getClass(), "size", -4822736661741380518L);
        setLongField(term4848, term4848.getClass(), "modTime", -5386201758403679145L);
        setBooleanField(term4848, term4848.getClass(), "checkSumOK", false);
        setByteField(term4848, term4848.getClass(), "linkFlag", (byte) -77);
        setField(term4848, term4848.getClass(), "linkName", "");
        setField(term4848, term4848.getClass(), "magic", "ustar ");
        setField(term4848, term4848.getClass(), "version", "00");
        setField(term4848, term4848.getClass(), "userName", "root");
        setField(term4848, term4848.getClass(), "groupName", "");
        setIntField(term4848, term4848.getClass(), "devMajor", -461771056);
        setIntField(term4848, term4848.getClass(), "devMinor", -243422082);
        setBooleanField(term4848, term4848.getClass(), "isExtended", false);
        setLongField(term4848, term4848.getClass(), "realSize", -7268507582722666254L);
        setField(term4884, term4884.getClass(), "path", "AijpHYOFuy");
        setField(term4884, term4884.getClass(), "status", enum54);
        setIntField(term4884, term4884.getClass(), "prefixLength", 1384592638);
        setField(term4884, term4884.getClass(), "filePath", null);
        setField(term4848, term4848.getClass(), "file", term4884);
        setField(term4834, term4834.getClass(), "currEntry", term4848);
        setField(term4834, term4834.getClass(), "zipEncoding", null);
        setByteElement(term4901, 0, (byte) -12);
        setByteElement(term4901, 1, (byte) 58);
        setByteElement(term4901, 2, (byte) 12);
        setField(term4834, term4834.getClass(), "SINGLE", term4901);
        setLongField(term4834, term4834.getClass(), "bytesRead", 5671808784468963649L);
        term4906 = (byte[]) newByteArray(4);
        setByteElement(term4906, 0, (byte) 79);
        setByteElement(term4906, 1, (byte) -4);
        setByteElement(term4906, 2, (byte) -27);
        setByteElement(term4906, 3, (byte) 120);
        term4911 = new Integer(-1002370457);
        term4913 = new Integer(-2014576105);
        Class<? extends Object> term20297 = Class.forName((String) "java.io.File$PathStatus");
        Field term20296 = ((Class) term20297).getDeclaredField((String) "CHECKED");
        ((Field) term20296).setAccessible(true);
        Object enum55 = ((Field) term20296).get((Object) null);
        term19995 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term19996 = (byte[]) newByteArray(7);
        Object term19997 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term20010 = newInstance(Class.forName("java.io.File"));
        byte[] term20015 = (byte[]) newByteArray(3);
        setByteElement(term19996, 0, (byte) -35);
        setByteElement(term19996, 1, (byte) 3);
        setByteElement(term19996, 2, (byte) -10);
        setByteElement(term19996, 3, (byte) -106);
        setByteElement(term19996, 4, (byte) -124);
        setByteElement(term19996, 5, (byte) -71);
        setByteElement(term19996, 6, (byte) 113);
        setField(term19995, term19995.getClass(), "SMALL_BUF", term19996);
        setIntField(term19995, term19995.getClass(), "recordSize", 1953277050);
        setIntField(term19995, term19995.getClass(), "blockSize", 1283079251);
        setBooleanField(term19995, term19995.getClass(), "hasHitEOF", true);
        setLongField(term19995, term19995.getClass(), "entrySize", -4924950707540628022L);
        setLongField(term19995, term19995.getClass(), "entryOffset", -4393710401270724527L);
        setField(term19995, term19995.getClass(), "is", null);
        setField(term19997, term19997.getClass(), "name", "");
        setIntField(term19997, term19997.getClass(), "mode", -523949691);
        setIntField(term19997, term19997.getClass(), "userId", 1398204340);
        setIntField(term19997, term19997.getClass(), "groupId", 229204365);
        setLongField(term19997, term19997.getClass(), "size", -4822736661741380518L);
        setLongField(term19997, term19997.getClass(), "modTime", -5386201758403679145L);
        setBooleanField(term19997, term19997.getClass(), "checkSumOK", false);
        setByteField(term19997, term19997.getClass(), "linkFlag", (byte) -77);
        setField(term19997, term19997.getClass(), "linkName", "");
        setField(term19997, term19997.getClass(), "magic", "ustar ");
        setField(term19997, term19997.getClass(), "version", "00");
        setField(term19997, term19997.getClass(), "userName", "root");
        setField(term19997, term19997.getClass(), "groupName", "");
        setIntField(term19997, term19997.getClass(), "devMajor", -461771056);
        setIntField(term19997, term19997.getClass(), "devMinor", -243422082);
        setBooleanField(term19997, term19997.getClass(), "isExtended", false);
        setLongField(term19997, term19997.getClass(), "realSize", -7268507582722666254L);
        setField(term20010, term20010.getClass(), "path", "AijpHYOFuy");
        setField(term20010, term20010.getClass(), "status", enum55);
        setIntField(term20010, term20010.getClass(), "prefixLength", 1384592638);
        setField(term20010, term20010.getClass(), "filePath", null);
        setField(term19997, term19997.getClass(), "file", term20010);
        setField(term19995, term19995.getClass(), "currEntry", term19997);
        setField(term19995, term19995.getClass(), "zipEncoding", null);
        setByteElement(term20015, 0, (byte) -12);
        setByteElement(term20015, 1, (byte) 58);
        setByteElement(term20015, 2, (byte) 12);
        setField(term19995, term19995.getClass(), "SINGLE", term20015);
        setLongField(term19995, term19995.getClass(), "bytesRead", 5671808784468963649L);
        term20016 = (byte[]) newByteArray(4);
        setByteElement(term20016, 0, (byte) 79);
        setByteElement(term20016, 1, (byte) -4);
        setByteElement(term20016, 2, (byte) -27);
        setByteElement(term20016, 3, (byte) 120);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term4906;
        args[1] = term4911;
        args[2] = term4913;
        Object retValue = callMethod(klass, "read", argTypes, term4834, args);
        assertTrue(recursiveEquals(term4834, term19995));
        assertTrue(recursiveEquals(term4906, term20016));
        assertTrue(recursiveEquals(term4911, -1002370457));
        assertTrue(recursiveEquals(term4913, -2014576105));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


