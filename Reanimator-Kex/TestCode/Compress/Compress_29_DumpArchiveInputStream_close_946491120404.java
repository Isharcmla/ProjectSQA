package org.apache.commons.compress.archivers.dump;

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
import static org.apache.commons.compress.archivers.dump.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DumpArchiveInputStream_close_946491120404 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term661560;

    public DumpArchiveInputStream_close_946491120404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term661560 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term661682 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term661752 = newInstance(Class.forName("java.util.zip.CheckedInputStream"));
        setBooleanField(term661560, term661560.getClass(), "isClosed", false);
        setField(term661682, term661682.getClass(), "in", term661752);
        setField(term661560, term661560.getClass(), "raw", term661682);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term661560, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


