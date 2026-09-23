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

public class DeflateCompressorInputStream_close_122107455692 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27124;
     Object term27642;

    public DeflateCompressorInputStream_close_122107455692() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27124 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        Object term27282 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        Object term27368 = newInstance(Class.forName("java.lang.ProcessBuilder$NullInputStream"));
        setField(term27282, term27282.getClass(), "in", term27368);
        setField(term27124, term27124.getClass(), "in", term27282);
        term27642 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        Object term27643 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        Object term27644 = newInstance(Class.forName("java.lang.ProcessBuilder$NullInputStream"));
        setField(term27643, term27643.getClass(), "in", term27644);
        setLongField(term27643, term27643.getClass(), "bytesRead", 0L);
        setField(term27642, term27642.getClass(), "in", term27643);
        setLongField(term27642, term27642.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term27124, args);
        assertTrue(recursiveEquals(term27124, term27642));
    }

};


