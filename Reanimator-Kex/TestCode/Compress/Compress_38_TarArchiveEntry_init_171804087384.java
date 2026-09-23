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
import java.lang.NullPointerException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TarArchiveEntry_init_171804087384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public TarArchiveEntry_init_171804087384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term372500 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term372500, term372500.getClass(), "name", "");
        setLongField(term372500, term372500.getClass(), "userId", 0L);
        setLongField(term372500, term372500.getClass(), "groupId", 0L);
        setLongField(term372500, term372500.getClass(), "size", 0L);
        setField(term372500, term372500.getClass(), "linkName", "");
        setField(term372500, term372500.getClass(), "magic", null);
        setField(term372500, term372500.getClass(), "version", null);
        setField(term372500, term372500.getClass(), "groupName", null);
        setIntField(term372500, term372500.getClass(), "devMajor", 0);
        setIntField(term372500, term372500.getClass(), "devMinor", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


