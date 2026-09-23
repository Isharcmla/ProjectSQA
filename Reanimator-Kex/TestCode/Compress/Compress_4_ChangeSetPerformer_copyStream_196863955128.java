package org.apache.commons.compress.changes;

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
import java.lang.ClassCastException;
import static org.apache.commons.compress.changes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ChangeSetPerformer_copyStream_196863955128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5538;
     Object term5672;
     Object term5788;

    public ChangeSetPerformer_copyStream_196863955128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5538 = newInstance(Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer"));
        term5672 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        term5788 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveEntry"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.ArchiveOutputStream");
        argTypes[2] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term5672;
        args[2] = term5788;
        try {
            callMethod(klass, "copyStream", argTypes, term5538, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


