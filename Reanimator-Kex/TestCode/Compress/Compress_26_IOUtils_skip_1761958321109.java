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

public class IOUtils_skip_1761958321109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40254;
     Object term47609;

    public IOUtils_skip_1761958321109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40254 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$BoundedInputStream"));
        Object term40418 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.BoundedRandomAccessFileInputStream"));
        setLongField(term40254, term40254.getClass(), "max", 0L);
        setLongField(term40254, term40254.getClass(), "pos", -9223372036854775808L);
        setField(term40254, term40254.getClass(), "in", term40418);
        term47609 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$BoundedInputStream"));
        Object term47610 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.BoundedRandomAccessFileInputStream"));
        setField(term47610, term47610.getClass(), "file", null);
        setLongField(term47610, term47610.getClass(), "bytesRemaining", 0L);
        setField(term47609, term47609.getClass(), "in", term47610);
        setLongField(term47609, term47609.getClass(), "max", 0L);
        setLongField(term47609, term47609.getClass(), "pos", -9223372036854775808L);
        setField(term47609, term47609.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.IOUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term40254;
        args[1] = 9223372034707292159L;
        Object retValue = callMethod(klass, "skip", argTypes, null, args);
        assertTrue(recursiveEquals(term40254, term47609));
        assertTrue(recursiveEquals(retValue, 0L));
    }

};


