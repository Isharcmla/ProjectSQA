package org.apache.commons.compress.compressors.deflate;

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
import static org.apache.commons.compress.compressors.deflate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.compressors.deflate.EqualityUtils.*;
import java.lang.Object;

public class DeflateCompressorInputStream_available_55439933563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16756;
     Object term17827;

    public DeflateCompressorInputStream_available_55439933563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16756 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        Object term16888 = newInstance(Class.forName("org.apache.commons.compress.archivers.arj.ArjArchiveInputStream"));
        setField(term16756, term16756.getClass(), "in", term16888);
        term17827 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        Object term17828 = newInstance(Class.forName("org.apache.commons.compress.archivers.arj.ArjArchiveInputStream"));
        setField(term17828, term17828.getClass(), "in", null);
        setField(term17828, term17828.getClass(), "charsetName", null);
        setField(term17828, term17828.getClass(), "mainHeader", null);
        setField(term17828, term17828.getClass(), "currentLocalFileHeader", null);
        setField(term17828, term17828.getClass(), "currentInputStream", null);
        setField(term17828, term17828.getClass(), "SINGLE", null);
        setLongField(term17828, term17828.getClass(), "bytesRead", 0L);
        setField(term17827, term17827.getClass(), "in", term17828);
        setLongField(term17827, term17827.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "available", argTypes, term16756, args);
        assertTrue(recursiveEquals(term16756, term17827));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


