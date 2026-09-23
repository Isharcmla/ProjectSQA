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

public class TarArchiveEntry_init_702366907237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public TarArchiveEntry_init_702366907237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term73547 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term73547, term73547.getClass(), "name", null);
        setLongField(term73547, term73547.getClass(), "userId", 0L);
        setLongField(term73547, term73547.getClass(), "groupId", 0L);
        setLongField(term73547, term73547.getClass(), "size", 0L);
        setField(term73547, term73547.getClass(), "linkName", null);
        setField(term73547, term73547.getClass(), "magic", "");
        setField(term73547, term73547.getClass(), "version", null);
        setField(term73547, term73547.getClass(), "groupName", "");
        setIntField(term73547, term73547.getClass(), "devMajor", 0);
        setIntField(term73547, term73547.getClass(), "devMinor", 0);
        setField(term73547, term73547.getClass(), "userName", null);
        setField(term73547, term73547.getClass(), "file", null);
        setBooleanField(term73547, term73547.getClass(), "preserveLeadingSlashes", false);
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


