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

public class ArchiveStreamFactory_createArchiveInputStream_188557935432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70639;
     Object term70747;

    public ArchiveStreamFactory_createArchiveInputStream_188557935432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70639 = newInstance(Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory"));
        term70747 = newInstance(Class.forName("org.tukaani.xz.SimpleInputStream"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.io.InputStream");
        Object[] args = new Object[2];
        args[0] = "zip";
        args[1] = term70747;
        callMethod(klass, "createArchiveInputStream", argTypes, term70639, args);
    }

};


