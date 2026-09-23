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
import java.lang.ArithmeticException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TarArchiveOutputStream_init_1216577671190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103785;

    public TarArchiveOutputStream_init_1216577671190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term103589 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term103651 = newInstance(Class.forName("java.io.BufferedOutputStream"));
        setField(term103589, term103589.getClass(), "oneByte", null);
        setLongField(term103589, term103589.getClass(), "bytesWritten", 0L);
        setIntField(term103589, term103589.getClass(), "longFileMode", 0);
        setIntField(term103589, term103589.getClass(), "bigNumberMode", 0);
        setBooleanField(term103589, term103589.getClass(), "closed", false);
        setBooleanField(term103589, term103589.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term103589, term103589.getClass(), "finished", false);
        setBooleanField(term103589, term103589.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term103589, term103589.getClass(), "out", term103651);
        term103785 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
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
        args[0] = term103785;
        args[1] = 0;
        args[2] = 0;
        args[3] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


