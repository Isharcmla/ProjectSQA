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

public class TarArchiveEntry_init_836439475183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public TarArchiveEntry_init_836439475183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term59583 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term59583, term59583.getClass(), "name", "00");
        setLongField(term59583, term59583.getClass(), "userId", 0L);
        setLongField(term59583, term59583.getClass(), "groupId", 0L);
        setLongField(term59583, term59583.getClass(), "size", 0L);
        setField(term59583, term59583.getClass(), "linkName", null);
        setField(term59583, term59583.getClass(), "magic", null);
        setField(term59583, term59583.getClass(), "version", null);
        setField(term59583, term59583.getClass(), "groupName", null);
        setIntField(term59583, term59583.getClass(), "devMajor", 0);
        setIntField(term59583, term59583.getClass(), "devMinor", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


