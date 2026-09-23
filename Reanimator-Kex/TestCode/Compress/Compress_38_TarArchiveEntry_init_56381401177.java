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
import java.lang.Boolean;

public class TarArchiveEntry_init_56381401177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35;
     Object term16375;

    public TarArchiveEntry_init_56381401177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35 = new Boolean(false);
        term16375 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term16375, term16375.getClass(), "name", "sjlJAEtRrb");
        setBooleanField(term16375, term16375.getClass(), "preserveLeadingSlashes", false);
        setIntField(term16375, term16375.getClass(), "mode", 33188);
        setLongField(term16375, term16375.getClass(), "userId", 0L);
        setLongField(term16375, term16375.getClass(), "groupId", 0L);
        setLongField(term16375, term16375.getClass(), "size", 0L);
        setLongField(term16375, term16375.getClass(), "modTime", 1790003307L);
        setBooleanField(term16375, term16375.getClass(), "checkSumOK", false);
        setByteField(term16375, term16375.getClass(), "linkFlag", (byte) 48);
        setField(term16375, term16375.getClass(), "linkName", "");
        setField(term16375, term16375.getClass(), "magic", "ustar ");
        setField(term16375, term16375.getClass(), "version", "00");
        setField(term16375, term16375.getClass(), "userName", "");
        setField(term16375, term16375.getClass(), "groupName", "");
        setIntField(term16375, term16375.getClass(), "devMajor", 0);
        setIntField(term16375, term16375.getClass(), "devMinor", 0);
        setBooleanField(term16375, term16375.getClass(), "isExtended", false);
        setLongField(term16375, term16375.getClass(), "realSize", 0L);
        setBooleanField(term16375, term16375.getClass(), "paxGNUSparse", false);
        setBooleanField(term16375, term16375.getClass(), "starSparse", false);
        setField(term16375, term16375.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "sjlJAEtRrb";
        args[1] = term35;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term16375));
        assertTrue(recursiveEquals(term35, false));
    }

};


