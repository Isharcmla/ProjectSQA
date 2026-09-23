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

public class TarArchiveInputStream_canReadEntryData_75948832447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154131;
     Object term154251;
     Object term154284;
     Object term154285;

    public TarArchiveInputStream_canReadEntryData_75948832447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154131 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        term154251 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        term154284 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setBooleanField(term154284, term154284.getClass(), "hasHitEOF", false);
        setLongField(term154284, term154284.getClass(), "entrySize", 0L);
        setLongField(term154284, term154284.getClass(), "entryOffset", 0L);
        setField(term154284, term154284.getClass(), "readBuf", null);
        setField(term154284, term154284.getClass(), "buffer", null);
        setField(term154284, term154284.getClass(), "currEntry", null);
        setField(term154284, term154284.getClass(), "SINGLE", null);
        setLongField(term154284, term154284.getClass(), "bytesRead", 0L);
        term154285 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term154285, term154285.getClass(), "name", null);
        setIntField(term154285, term154285.getClass(), "mode", 0);
        setIntField(term154285, term154285.getClass(), "userId", 0);
        setIntField(term154285, term154285.getClass(), "groupId", 0);
        setLongField(term154285, term154285.getClass(), "size", 0L);
        setLongField(term154285, term154285.getClass(), "modTime", 0L);
        setByteField(term154285, term154285.getClass(), "linkFlag", (byte) 0);
        setField(term154285, term154285.getClass(), "linkName", null);
        setField(term154285, term154285.getClass(), "magic", null);
        setField(term154285, term154285.getClass(), "version", null);
        setField(term154285, term154285.getClass(), "userName", null);
        setField(term154285, term154285.getClass(), "groupName", null);
        setIntField(term154285, term154285.getClass(), "devMajor", 0);
        setIntField(term154285, term154285.getClass(), "devMinor", 0);
        setBooleanField(term154285, term154285.getClass(), "isExtended", false);
        setLongField(term154285, term154285.getClass(), "realSize", 0L);
        setField(term154285, term154285.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term154251;
        Object retValue = callMethod(klass, "canReadEntryData", argTypes, term154131, args);
        assertTrue(recursiveEquals(term154131, term154284));
        assertTrue(recursiveEquals(term154251, term154285));
        assertTrue(recursiveEquals(retValue, true));
    }

};


