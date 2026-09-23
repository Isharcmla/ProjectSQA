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

public class TarArchiveInputStream_canReadEntryData_75948832473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24965;
     Object term25085;
     Object term25122;
     Object term25123;

    public TarArchiveInputStream_canReadEntryData_75948832473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24965 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        term25085 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        term25122 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term25122, term25122.getClass(), "SMALL_BUF", null);
        setIntField(term25122, term25122.getClass(), "recordSize", 0);
        setIntField(term25122, term25122.getClass(), "blockSize", 0);
        setBooleanField(term25122, term25122.getClass(), "hasHitEOF", false);
        setLongField(term25122, term25122.getClass(), "entrySize", 0L);
        setLongField(term25122, term25122.getClass(), "entryOffset", 0L);
        setField(term25122, term25122.getClass(), "is", null);
        setField(term25122, term25122.getClass(), "currEntry", null);
        setField(term25122, term25122.getClass(), "encoding", null);
        setField(term25122, term25122.getClass(), "SINGLE", null);
        setLongField(term25122, term25122.getClass(), "bytesRead", 0L);
        term25123 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term25123, term25123.getClass(), "name", null);
        setIntField(term25123, term25123.getClass(), "mode", 0);
        setIntField(term25123, term25123.getClass(), "userId", 0);
        setIntField(term25123, term25123.getClass(), "groupId", 0);
        setLongField(term25123, term25123.getClass(), "size", 0L);
        setLongField(term25123, term25123.getClass(), "modTime", 0L);
        setBooleanField(term25123, term25123.getClass(), "checkSumOK", false);
        setByteField(term25123, term25123.getClass(), "linkFlag", (byte) 0);
        setField(term25123, term25123.getClass(), "linkName", null);
        setField(term25123, term25123.getClass(), "magic", null);
        setField(term25123, term25123.getClass(), "version", null);
        setField(term25123, term25123.getClass(), "userName", null);
        setField(term25123, term25123.getClass(), "groupName", null);
        setIntField(term25123, term25123.getClass(), "devMajor", 0);
        setIntField(term25123, term25123.getClass(), "devMinor", 0);
        setBooleanField(term25123, term25123.getClass(), "isExtended", false);
        setLongField(term25123, term25123.getClass(), "realSize", 0L);
        setField(term25123, term25123.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term25085;
        Object retValue = callMethod(klass, "canReadEntryData", argTypes, term24965, args);
        assertTrue(recursiveEquals(term24965, term25122));
        assertTrue(recursiveEquals(term25085, term25123));
        assertTrue(recursiveEquals(retValue, true));
    }

};


