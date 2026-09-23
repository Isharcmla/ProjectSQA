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
import java.lang.NullPointerException;
import static org.apache.commons.compress.compressors.deflate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DeflateCompressorInputStream_close_122107455613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29;

    public DeflateCompressorInputStream_close_122107455613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        setField(term29, term29.getClass(), "in", null);
        setLongField(term29, term29.getClass(), "bytesRead", 7411271909051562686L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term29, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


