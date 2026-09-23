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

public class TarArchiveInputStream_canReadEntryData_75948832490 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28767;
     Object term28887;
     Object term29189;
     Object term29190;

    public TarArchiveInputStream_canReadEntryData_75948832490() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28767 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        term28887 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        term29189 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term29189, term29189.getClass(), "SMALL_BUF", null);
        setIntField(term29189, term29189.getClass(), "recordSize", 0);
        setIntField(term29189, term29189.getClass(), "blockSize", 0);
        setBooleanField(term29189, term29189.getClass(), "hasHitEOF", false);
        setLongField(term29189, term29189.getClass(), "entrySize", 0L);
        setLongField(term29189, term29189.getClass(), "entryOffset", 0L);
        setField(term29189, term29189.getClass(), "is", null);
        setField(term29189, term29189.getClass(), "currEntry", null);
        setField(term29189, term29189.getClass(), "zipEncoding", null);
        setField(term29189, term29189.getClass(), "SINGLE", null);
        setLongField(term29189, term29189.getClass(), "bytesRead", 0L);
        term29190 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term29190, term29190.getClass(), "name", null);
        setIntField(term29190, term29190.getClass(), "mode", 0);
        setIntField(term29190, term29190.getClass(), "userId", 0);
        setIntField(term29190, term29190.getClass(), "groupId", 0);
        setLongField(term29190, term29190.getClass(), "size", 0L);
        setLongField(term29190, term29190.getClass(), "modTime", 0L);
        setBooleanField(term29190, term29190.getClass(), "checkSumOK", false);
        setByteField(term29190, term29190.getClass(), "linkFlag", (byte) 0);
        setField(term29190, term29190.getClass(), "linkName", null);
        setField(term29190, term29190.getClass(), "magic", null);
        setField(term29190, term29190.getClass(), "version", null);
        setField(term29190, term29190.getClass(), "userName", null);
        setField(term29190, term29190.getClass(), "groupName", null);
        setIntField(term29190, term29190.getClass(), "devMajor", 0);
        setIntField(term29190, term29190.getClass(), "devMinor", 0);
        setBooleanField(term29190, term29190.getClass(), "isExtended", false);
        setLongField(term29190, term29190.getClass(), "realSize", 0L);
        setField(term29190, term29190.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term28887;
        Object retValue = callMethod(klass, "canReadEntryData", argTypes, term28767, args);
        assertTrue(recursiveEquals(term28767, term29189));
        assertTrue(recursiveEquals(term28887, term29190));
        assertTrue(recursiveEquals(retValue, true));
    }

};


