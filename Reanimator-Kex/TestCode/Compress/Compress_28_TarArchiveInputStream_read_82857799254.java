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

public class TarArchiveInputStream_read_82857799254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4384;
     Object term4457;
     Object term4464;
     Object term4466;
     Object term18562;
     Object term18583;

    public TarArchiveInputStream_read_82857799254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19032 = Class.forName((String) "java.io.File$PathStatus");
        Field term19031 = ((Class) term19032).getDeclaredField((String) "INVALID");
        ((Field) term19031).setAccessible(true);
        Object enum53 = ((Field) term19031).get((Object) null);
        term4384 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term4385 = (byte[]) newByteArray(8);
        Object term4399 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term4435 = newInstance(Class.forName("java.io.File"));
        byte[] term4452 = (byte[]) newByteArray(3);
        setByteElement(term4385, 0, (byte) 12);
        setByteElement(term4385, 1, (byte) -75);
        setByteElement(term4385, 2, (byte) 69);
        setByteElement(term4385, 3, (byte) -6);
        setByteElement(term4385, 4, (byte) 107);
        setByteElement(term4385, 5, (byte) -109);
        setByteElement(term4385, 6, (byte) 122);
        setByteElement(term4385, 7, (byte) 83);
        setField(term4384, term4384.getClass(), "SMALL_BUF", term4385);
        setIntField(term4384, term4384.getClass(), "recordSize", -1565502840);
        setIntField(term4384, term4384.getClass(), "blockSize", 344323424);
        setBooleanField(term4384, term4384.getClass(), "hasHitEOF", false);
        setLongField(term4384, term4384.getClass(), "entrySize", -9040825890007374809L);
        setLongField(term4384, term4384.getClass(), "entryOffset", 1368340889161782793L);
        setField(term4384, term4384.getClass(), "is", null);
        setField(term4399, term4399.getClass(), "name", "");
        setIntField(term4399, term4399.getClass(), "mode", 9726679);
        setIntField(term4399, term4399.getClass(), "userId", -25637976);
        setIntField(term4399, term4399.getClass(), "groupId", 1555897383);
        setLongField(term4399, term4399.getClass(), "size", -5786861555969446503L);
        setLongField(term4399, term4399.getClass(), "modTime", 2354625302846375590L);
        setBooleanField(term4399, term4399.getClass(), "checkSumOK", true);
        setByteField(term4399, term4399.getClass(), "linkFlag", (byte) -123);
        setField(term4399, term4399.getClass(), "linkName", "");
        setField(term4399, term4399.getClass(), "magic", "ustar ");
        setField(term4399, term4399.getClass(), "version", "00");
        setField(term4399, term4399.getClass(), "userName", "root");
        setField(term4399, term4399.getClass(), "groupName", "");
        setIntField(term4399, term4399.getClass(), "devMajor", 202001407);
        setIntField(term4399, term4399.getClass(), "devMinor", 158873461);
        setBooleanField(term4399, term4399.getClass(), "isExtended", false);
        setLongField(term4399, term4399.getClass(), "realSize", 7276637106827860087L);
        setField(term4435, term4435.getClass(), "path", "nyiiPDVjAc");
        setField(term4435, term4435.getClass(), "status", enum53);
        setIntField(term4435, term4435.getClass(), "prefixLength", -430151637);
        setField(term4435, term4435.getClass(), "filePath", null);
        setField(term4399, term4399.getClass(), "file", term4435);
        setField(term4384, term4384.getClass(), "currEntry", term4399);
        setField(term4384, term4384.getClass(), "encoding", null);
        setByteElement(term4452, 0, (byte) -76);
        setByteElement(term4452, 1, (byte) -115);
        setByteElement(term4452, 2, (byte) -48);
        setField(term4384, term4384.getClass(), "SINGLE", term4452);
        setLongField(term4384, term4384.getClass(), "bytesRead", -3936701866695933852L);
        term4457 = (byte[]) newByteArray(6);
        setByteElement(term4457, 0, (byte) 126);
        setByteElement(term4457, 1, (byte) -2);
        setByteElement(term4457, 2, (byte) 103);
        setByteElement(term4457, 3, (byte) 23);
        setByteElement(term4457, 4, (byte) 96);
        setByteElement(term4457, 5, (byte) -70);
        term4464 = new Integer(-1697741339);
        term4466 = new Integer(98922530);
        Class<? extends Object> term19214 = Class.forName((String) "java.io.File$PathStatus");
        Field term19213 = ((Class) term19214).getDeclaredField((String) "INVALID");
        ((Field) term19213).setAccessible(true);
        Object enum54 = ((Field) term19213).get((Object) null);
        term18562 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term18563 = (byte[]) newByteArray(8);
        Object term18564 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term18577 = newInstance(Class.forName("java.io.File"));
        byte[] term18582 = (byte[]) newByteArray(3);
        setByteElement(term18563, 0, (byte) 12);
        setByteElement(term18563, 1, (byte) -75);
        setByteElement(term18563, 2, (byte) 69);
        setByteElement(term18563, 3, (byte) -6);
        setByteElement(term18563, 4, (byte) 107);
        setByteElement(term18563, 5, (byte) -109);
        setByteElement(term18563, 6, (byte) 122);
        setByteElement(term18563, 7, (byte) 83);
        setField(term18562, term18562.getClass(), "SMALL_BUF", term18563);
        setIntField(term18562, term18562.getClass(), "recordSize", -1565502840);
        setIntField(term18562, term18562.getClass(), "blockSize", 344323424);
        setBooleanField(term18562, term18562.getClass(), "hasHitEOF", false);
        setLongField(term18562, term18562.getClass(), "entrySize", -9040825890007374809L);
        setLongField(term18562, term18562.getClass(), "entryOffset", 1368340889161782793L);
        setField(term18562, term18562.getClass(), "is", null);
        setField(term18564, term18564.getClass(), "name", "");
        setIntField(term18564, term18564.getClass(), "mode", 9726679);
        setIntField(term18564, term18564.getClass(), "userId", -25637976);
        setIntField(term18564, term18564.getClass(), "groupId", 1555897383);
        setLongField(term18564, term18564.getClass(), "size", -5786861555969446503L);
        setLongField(term18564, term18564.getClass(), "modTime", 2354625302846375590L);
        setBooleanField(term18564, term18564.getClass(), "checkSumOK", true);
        setByteField(term18564, term18564.getClass(), "linkFlag", (byte) -123);
        setField(term18564, term18564.getClass(), "linkName", "");
        setField(term18564, term18564.getClass(), "magic", "ustar ");
        setField(term18564, term18564.getClass(), "version", "00");
        setField(term18564, term18564.getClass(), "userName", "root");
        setField(term18564, term18564.getClass(), "groupName", "");
        setIntField(term18564, term18564.getClass(), "devMajor", 202001407);
        setIntField(term18564, term18564.getClass(), "devMinor", 158873461);
        setBooleanField(term18564, term18564.getClass(), "isExtended", false);
        setLongField(term18564, term18564.getClass(), "realSize", 7276637106827860087L);
        setField(term18577, term18577.getClass(), "path", "nyiiPDVjAc");
        setField(term18577, term18577.getClass(), "status", enum54);
        setIntField(term18577, term18577.getClass(), "prefixLength", -430151637);
        setField(term18577, term18577.getClass(), "filePath", null);
        setField(term18564, term18564.getClass(), "file", term18577);
        setField(term18562, term18562.getClass(), "currEntry", term18564);
        setField(term18562, term18562.getClass(), "encoding", null);
        setByteElement(term18582, 0, (byte) -76);
        setByteElement(term18582, 1, (byte) -115);
        setByteElement(term18582, 2, (byte) -48);
        setField(term18562, term18562.getClass(), "SINGLE", term18582);
        setLongField(term18562, term18562.getClass(), "bytesRead", -3936701866695933852L);
        term18583 = (byte[]) newByteArray(6);
        setByteElement(term18583, 0, (byte) 126);
        setByteElement(term18583, 1, (byte) -2);
        setByteElement(term18583, 2, (byte) 103);
        setByteElement(term18583, 3, (byte) 23);
        setByteElement(term18583, 4, (byte) 96);
        setByteElement(term18583, 5, (byte) -70);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term4457;
        args[1] = term4464;
        args[2] = term4466;
        Object retValue = callMethod(klass, "read", argTypes, term4384, args);
        assertTrue(recursiveEquals(term4384, term18562));
        assertTrue(recursiveEquals(term4457, term18583));
        assertTrue(recursiveEquals(term4464, -1697741339));
        assertTrue(recursiveEquals(term4466, 98922530));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


