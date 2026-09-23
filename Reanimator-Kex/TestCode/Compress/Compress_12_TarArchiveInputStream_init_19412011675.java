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
import java.lang.Object;

public class TarArchiveInputStream_init_19412011675 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239167;

    public TarArchiveInputStream_init_19412011675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term239035 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term239035, term239035.getClass(), "SINGLE", null);
        setLongField(term239035, term239035.getClass(), "bytesRead", 0L);
        term239167 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term239167;
        args[1] = 0;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


