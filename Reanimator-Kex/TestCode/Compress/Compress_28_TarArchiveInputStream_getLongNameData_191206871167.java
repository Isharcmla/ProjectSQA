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

public class TarArchiveInputStream_getLongNameData_191206871167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23918;
     Object term24069;
     Object term24072;
     Object term24068;

    public TarArchiveInputStream_getLongNameData_191206871167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23918 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term23684 = (byte[]) newByteArray(0);
        Object term24038 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term23918, term23918.getClass(), "SMALL_BUF", term23684);
        setBooleanField(term23918, term23918.getClass(), "hasHitEOF", true);
        setField(term23918, term23918.getClass(), "currEntry", term24038);
        term24069 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term24070 = (byte[]) newByteArray(0);
        Object term24071 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term24069, term24069.getClass(), "SMALL_BUF", term24070);
        setIntField(term24069, term24069.getClass(), "recordSize", 0);
        setIntField(term24069, term24069.getClass(), "blockSize", 0);
        setBooleanField(term24069, term24069.getClass(), "hasHitEOF", true);
        setLongField(term24069, term24069.getClass(), "entrySize", 0L);
        setLongField(term24069, term24069.getClass(), "entryOffset", 0L);
        setField(term24069, term24069.getClass(), "is", null);
        setField(term24071, term24071.getClass(), "name", null);
        setIntField(term24071, term24071.getClass(), "mode", 0);
        setIntField(term24071, term24071.getClass(), "userId", 0);
        setIntField(term24071, term24071.getClass(), "groupId", 0);
        setLongField(term24071, term24071.getClass(), "size", 0L);
        setLongField(term24071, term24071.getClass(), "modTime", 0L);
        setBooleanField(term24071, term24071.getClass(), "checkSumOK", false);
        setByteField(term24071, term24071.getClass(), "linkFlag", (byte) 0);
        setField(term24071, term24071.getClass(), "linkName", null);
        setField(term24071, term24071.getClass(), "magic", null);
        setField(term24071, term24071.getClass(), "version", null);
        setField(term24071, term24071.getClass(), "userName", null);
        setField(term24071, term24071.getClass(), "groupName", null);
        setIntField(term24071, term24071.getClass(), "devMajor", 0);
        setIntField(term24071, term24071.getClass(), "devMinor", 0);
        setBooleanField(term24071, term24071.getClass(), "isExtended", false);
        setLongField(term24071, term24071.getClass(), "realSize", 0L);
        setField(term24071, term24071.getClass(), "file", null);
        setField(term24069, term24069.getClass(), "currEntry", term24071);
        setField(term24069, term24069.getClass(), "encoding", null);
        setField(term24069, term24069.getClass(), "SINGLE", null);
        setLongField(term24069, term24069.getClass(), "bytesRead", 0L);
        term24072 = (byte[]) newByteArray(0);
        term24068 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLongNameData", argTypes, term23918, args);
        assertTrue(recursiveEquals(term23918, term24069));
        assertTrue(recursiveEquals(retValue, term24068));
    }

};


