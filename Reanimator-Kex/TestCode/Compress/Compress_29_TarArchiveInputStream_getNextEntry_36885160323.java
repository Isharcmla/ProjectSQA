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
import java.lang.Object;
import java.lang.String;

public class TarArchiveInputStream_getNextEntry_36885160323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4340;

    public TarArchiveInputStream_getNextEntry_36885160323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4444 = Class.forName((String) "java.io.File$PathStatus");
        Field term4443 = ((Class) term4444).getDeclaredField((String) "CHECKED");
        ((Field) term4443).setAccessible(true);
        Object enum17 = ((Field) term4443).get((Object) null);
        term4340 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term4341 = (byte[]) newByteArray(8);
        Object term4355 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term4391 = newInstance(Class.forName("java.io.File"));
        byte[] term4408 = (byte[]) newByteArray(3);
        setByteElement(term4341, 0, (byte) 122);
        setByteElement(term4341, 1, (byte) 83);
        setByteElement(term4341, 2, (byte) -123);
        setByteElement(term4341, 3, (byte) -76);
        setByteElement(term4341, 4, (byte) -115);
        setByteElement(term4341, 5, (byte) -48);
        setByteElement(term4341, 6, (byte) 126);
        setByteElement(term4341, 7, (byte) -2);
        setField(term4340, term4340.getClass(), "SMALL_BUF", term4341);
        setIntField(term4340, term4340.getClass(), "recordSize", 344323424);
        setIntField(term4340, term4340.getClass(), "blockSize", 9726679);
        setBooleanField(term4340, term4340.getClass(), "hasHitEOF", false);
        setLongField(term4340, term4340.getClass(), "entrySize", -9040825890007374809L);
        setLongField(term4340, term4340.getClass(), "entryOffset", 1368340889161782793L);
        setField(term4340, term4340.getClass(), "is", null);
        setField(term4355, term4355.getClass(), "name", "");
        setIntField(term4355, term4355.getClass(), "mode", -25637976);
        setIntField(term4355, term4355.getClass(), "userId", 1555897383);
        setIntField(term4355, term4355.getClass(), "groupId", 202001407);
        setLongField(term4355, term4355.getClass(), "size", -5786861555969446503L);
        setLongField(term4355, term4355.getClass(), "modTime", 2354625302846375590L);
        setBooleanField(term4355, term4355.getClass(), "checkSumOK", true);
        setByteField(term4355, term4355.getClass(), "linkFlag", (byte) 103);
        setField(term4355, term4355.getClass(), "linkName", "");
        setField(term4355, term4355.getClass(), "magic", "ustar ");
        setField(term4355, term4355.getClass(), "version", "00");
        setField(term4355, term4355.getClass(), "userName", "root");
        setField(term4355, term4355.getClass(), "groupName", "");
        setIntField(term4355, term4355.getClass(), "devMajor", 158873461);
        setIntField(term4355, term4355.getClass(), "devMinor", -430151637);
        setBooleanField(term4355, term4355.getClass(), "isExtended", false);
        setLongField(term4355, term4355.getClass(), "realSize", 7276637106827860087L);
        setField(term4391, term4391.getClass(), "path", "OWDIEULEFu");
        setField(term4391, term4391.getClass(), "status", enum17);
        setIntField(term4391, term4391.getClass(), "prefixLength", -1697741339);
        setField(term4391, term4391.getClass(), "filePath", null);
        setField(term4355, term4355.getClass(), "file", term4391);
        setField(term4340, term4340.getClass(), "currEntry", term4355);
        setField(term4340, term4340.getClass(), "zipEncoding", null);
        setByteElement(term4408, 0, (byte) 23);
        setByteElement(term4408, 1, (byte) 96);
        setByteElement(term4408, 2, (byte) -70);
        setField(term4340, term4340.getClass(), "SINGLE", term4408);
        setLongField(term4340, term4340.getClass(), "bytesRead", -3936701866695933852L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNextEntry", argTypes, term4340, args);
    }

};


