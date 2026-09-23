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

public class TarArchiveOutputStream_init_121657767199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public TarArchiveOutputStream_init_121657767199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term222116 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(term222116, term222116.getClass(), "oneByte", null);
        setLongField(term222116, term222116.getClass(), "bytesWritten", 0L);
        setIntField(term222116, term222116.getClass(), "longFileMode", 0);
        setIntField(term222116, term222116.getClass(), "bigNumberMode", 0);
        setBooleanField(term222116, term222116.getClass(), "closed", false);
        setBooleanField(term222116, term222116.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term222116, term222116.getClass(), "finished", false);
        setBooleanField(term222116, term222116.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term222116, term222116.getClass(), "out", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = 0;
        args[2] = 0;
        args[3] = "";
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalCharsetNameException e) {
        }

    }

};


