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

public class TarArchiveEntry_isPaxHeader_253447802179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58610;
     Object term58629;

    public TarArchiveEntry_isPaxHeader_253447802179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58610 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setByteField(term58610, term58610.getClass(), "linkFlag", (byte) 88);
        term58629 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term58629, term58629.getClass(), "name", null);
        setBooleanField(term58629, term58629.getClass(), "preserveLeadingSlashes", false);
        setIntField(term58629, term58629.getClass(), "mode", 0);
        setLongField(term58629, term58629.getClass(), "userId", 0L);
        setLongField(term58629, term58629.getClass(), "groupId", 0L);
        setLongField(term58629, term58629.getClass(), "size", 0L);
        setLongField(term58629, term58629.getClass(), "modTime", 0L);
        setBooleanField(term58629, term58629.getClass(), "checkSumOK", false);
        setByteField(term58629, term58629.getClass(), "linkFlag", (byte) 88);
        setField(term58629, term58629.getClass(), "linkName", null);
        setField(term58629, term58629.getClass(), "magic", null);
        setField(term58629, term58629.getClass(), "version", null);
        setField(term58629, term58629.getClass(), "userName", null);
        setField(term58629, term58629.getClass(), "groupName", null);
        setIntField(term58629, term58629.getClass(), "devMajor", 0);
        setIntField(term58629, term58629.getClass(), "devMinor", 0);
        setBooleanField(term58629, term58629.getClass(), "isExtended", false);
        setLongField(term58629, term58629.getClass(), "realSize", 0L);
        setBooleanField(term58629, term58629.getClass(), "paxGNUSparse", false);
        setBooleanField(term58629, term58629.getClass(), "starSparse", false);
        setField(term58629, term58629.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isPaxHeader", argTypes, term58610, args);
        assertTrue(recursiveEquals(term58610, term58629));
        assertTrue(recursiveEquals(retValue, true));
    }

};


