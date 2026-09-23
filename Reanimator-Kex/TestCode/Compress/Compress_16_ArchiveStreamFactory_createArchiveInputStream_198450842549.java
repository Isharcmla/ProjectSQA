package org.apache.commons.compress.archivers;

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
import java.lang.IllegalArgumentException;
import static org.apache.commons.compress.archivers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ArchiveStreamFactory_createArchiveInputStream_198450842549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107750;
     Object term107852;

    public ArchiveStreamFactory_createArchiveInputStream_198450842549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107750 = newInstance(Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory"));
        term107852 = newInstance(Class.forName("java.util.zip.ZipFile$ZipFileInflaterInputStream"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.InputStream");
        Object[] args = new Object[1];
        args[0] = term107852;
        try {
            callMethod(klass, "createArchiveInputStream", argTypes, term107750, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


