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

public class DeflateCompressorInputStream_close_122107455673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19850;
     Object term20438;

    public DeflateCompressorInputStream_close_122107455673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19850 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        Object term19932 = newInstance(Class.forName("java.util.jar.Manifest$FastInputStream"));
        setField(term19850, term19850.getClass(), "in", term19932);
        term20438 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        Object term20439 = newInstance(Class.forName("java.util.jar.Manifest$FastInputStream"));
        setField(term20439, term20439.getClass(), "buf", null);
        setIntField(term20439, term20439.getClass(), "count", 0);
        setIntField(term20439, term20439.getClass(), "pos", 0);
        setField(term20439, term20439.getClass(), "in", null);
        setField(term20438, term20438.getClass(), "in", term20439);
        setLongField(term20438, term20438.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term19850, args);
        assertTrue(recursiveEquals(term19850, term20438));
    }

};


