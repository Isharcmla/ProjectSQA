package org.apache.commons.compress.utils;

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
import static org.apache.commons.compress.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.utils.EqualityUtils.*;
import java.lang.Object;

public class IOUtils_skip_176195832198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36052;
     Object term37190;

    public IOUtils_skip_176195832198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36052 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$BoundedInputStream"));
        Object term36216 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.BoundedRandomAccessFileInputStream"));
        setLongField(term36052, term36052.getClass(), "max", 0L);
        setLongField(term36052, term36052.getClass(), "pos", -9223372036854775808L);
        setField(term36052, term36052.getClass(), "in", term36216);
        term37190 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$BoundedInputStream"));
        Object term37191 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.BoundedRandomAccessFileInputStream"));
        setField(term37191, term37191.getClass(), "file", null);
        setLongField(term37191, term37191.getClass(), "bytesRemaining", 0L);
        setField(term37190, term37190.getClass(), "in", term37191);
        setLongField(term37190, term37190.getClass(), "max", 0L);
        setLongField(term37190, term37190.getClass(), "pos", -9223372036854775808L);
        setField(term37190, term37190.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.IOUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term36052;
        args[1] = 9223372034707292159L;
        Object retValue = callMethod(klass, "skip", argTypes, null, args);
        assertTrue(recursiveEquals(term36052, term37190));
        assertTrue(recursiveEquals(retValue, 0L));
    }

};


