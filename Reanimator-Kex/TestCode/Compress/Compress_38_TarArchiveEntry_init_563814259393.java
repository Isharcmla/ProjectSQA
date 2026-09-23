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

public class TarArchiveEntry_init_563814259393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public TarArchiveEntry_init_563814259393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term616284 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term616284, term616284.getClass(), "name", "00");
        setLongField(term616284, term616284.getClass(), "userId", 0L);
        setLongField(term616284, term616284.getClass(), "groupId", 0L);
        setLongField(term616284, term616284.getClass(), "size", 0L);
        setField(term616284, term616284.getClass(), "linkName", null);
        setField(term616284, term616284.getClass(), "magic", null);
        setField(term616284, term616284.getClass(), "version", null);
        setField(term616284, term616284.getClass(), "groupName", null);
        setIntField(term616284, term616284.getClass(), "devMajor", 0);
        setIntField(term616284, term616284.getClass(), "devMinor", 0);
        setField(term616284, term616284.getClass(), "userName", null);
        setField(term616284, term616284.getClass(), "file", null);
        setBooleanField(term616284, term616284.getClass(), "preserveLeadingSlashes", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = byte.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = (byte) 0;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


