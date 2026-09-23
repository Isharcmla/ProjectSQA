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
import java.nio.charset.IllegalCharsetNameException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TarArchiveOutputStream_init_1086974585203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term320462;

    public TarArchiveOutputStream_init_1086974585203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term320328 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(term320328, term320328.getClass(), "oneByte", null);
        setLongField(term320328, term320328.getClass(), "bytesWritten", 0L);
        setIntField(term320328, term320328.getClass(), "longFileMode", 0);
        setIntField(term320328, term320328.getClass(), "bigNumberMode", 0);
        setBooleanField(term320328, term320328.getClass(), "closed", false);
        setBooleanField(term320328, term320328.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term320328, term320328.getClass(), "finished", false);
        setBooleanField(term320328, term320328.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term320328, term320328.getClass(), "out", null);
        term320462 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term320462;
        args[1] = "";
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalCharsetNameException e) {
        }

    }

};


