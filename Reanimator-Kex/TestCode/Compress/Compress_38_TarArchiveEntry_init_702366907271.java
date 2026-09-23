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

public class TarArchiveEntry_init_702366907271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public TarArchiveEntry_init_702366907271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term83147 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term83367 = newInstance(Class.forName("java.io.File"));
        setField(term83147, term83147.getClass(), "name", null);
        setLongField(term83147, term83147.getClass(), "userId", 0L);
        setLongField(term83147, term83147.getClass(), "groupId", 0L);
        setLongField(term83147, term83147.getClass(), "size", 0L);
        setField(term83147, term83147.getClass(), "linkName", "");
        setField(term83147, term83147.getClass(), "magic", "");
        setField(term83147, term83147.getClass(), "version", "en");
        setField(term83147, term83147.getClass(), "groupName", "windows");
        setIntField(term83147, term83147.getClass(), "devMajor", 0);
        setIntField(term83147, term83147.getClass(), "devMinor", 0);
        setField(term83147, term83147.getClass(), "userName", "");
        setField(term83147, term83147.getClass(), "file", term83367);
        setBooleanField(term83147, term83147.getClass(), "preserveLeadingSlashes", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = byte.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = (byte) 0;
        args[2] = true;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


