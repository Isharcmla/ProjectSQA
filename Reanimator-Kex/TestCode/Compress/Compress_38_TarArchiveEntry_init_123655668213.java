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

public class TarArchiveEntry_init_123655668213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public TarArchiveEntry_init_123655668213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term66659 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term66659, term66659.getClass(), "name", "00");
        setLongField(term66659, term66659.getClass(), "userId", 0L);
        setLongField(term66659, term66659.getClass(), "groupId", 0L);
        setLongField(term66659, term66659.getClass(), "size", 0L);
        setField(term66659, term66659.getClass(), "linkName", null);
        setField(term66659, term66659.getClass(), "magic", null);
        setField(term66659, term66659.getClass(), "version", null);
        setField(term66659, term66659.getClass(), "groupName", null);
        setIntField(term66659, term66659.getClass(), "devMajor", 0);
        setIntField(term66659, term66659.getClass(), "devMinor", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.zip.ZipEncoding");
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


