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

public class BitInputStream_close_190125753626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3525;
     Object term4268;

    public BitInputStream_close_190125753626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3525 = newInstance(Class.forName("org.apache.commons.compress.utils.BitInputStream"));
        Object term3695 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$BoundedInputStream"));
        setField(term3525, term3525.getClass(), "in", term3695);
        term4268 = newInstance(Class.forName("org.apache.commons.compress.utils.BitInputStream"));
        Object term4269 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$BoundedInputStream"));
        setField(term4269, term4269.getClass(), "in", null);
        setLongField(term4269, term4269.getClass(), "max", 0L);
        setLongField(term4269, term4269.getClass(), "pos", 0L);
        setField(term4269, term4269.getClass(), "this$0", null);
        setField(term4268, term4268.getClass(), "in", term4269);
        setField(term4268, term4268.getClass(), "byteOrder", null);
        setLongField(term4268, term4268.getClass(), "bitsCached", 0L);
        setIntField(term4268, term4268.getClass(), "bitsCachedSize", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.BitInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term3525, args);
        assertTrue(recursiveEquals(term3525, term4268));
    }

};


