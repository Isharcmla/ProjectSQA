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
import static org.apache.commons.compress.archivers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ArchiveStreamFactory_createArchiveOutputStream_15789812933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70921;
     Object term71119;

    public ArchiveStreamFactory_createArchiveOutputStream_15789812933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70921 = newInstance(Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory"));
        term71119 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.io.OutputStream");
        Object[] args = new Object[2];
        args[0] = "tar";
        args[1] = term71119;
        callMethod(klass, "createArchiveOutputStream", argTypes, term70921, args);
    }

};


