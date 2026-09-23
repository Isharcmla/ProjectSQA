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

public class DeflateCompressorInputStream_close_122107455694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28068;
     Object term30895;

    public DeflateCompressorInputStream_close_122107455694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28068 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        Object term28226 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        Object term28384 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        Object term28542 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        Object term28700 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        Object term28858 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        Object term29016 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        Object term29174 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        Object term29332 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        Object term29490 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        Object term29648 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        Object term29806 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        Object term29964 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        Object term30122 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        Object term30280 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        Object term30438 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        Object term30596 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        Object term30734 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.AES256SHA256Decoder$1"));
        setField(term30596, term30596.getClass(), "in", term30734);
        setField(term30438, term30438.getClass(), "in", term30596);
        setField(term30280, term30280.getClass(), "in", term30438);
        setField(term30122, term30122.getClass(), "in", term30280);
        setField(term29964, term29964.getClass(), "in", term30122);
        setField(term29806, term29806.getClass(), "in", term29964);
        setField(term29648, term29648.getClass(), "in", term29806);
        setField(term29490, term29490.getClass(), "in", term29648);
        setField(term29332, term29332.getClass(), "in", term29490);
        setField(term29174, term29174.getClass(), "in", term29332);
        setField(term29016, term29016.getClass(), "in", term29174);
        setField(term28858, term28858.getClass(), "in", term29016);
        setField(term28700, term28700.getClass(), "in", term28858);
        setField(term28542, term28542.getClass(), "in", term28700);
        setField(term28384, term28384.getClass(), "in", term28542);
        setField(term28226, term28226.getClass(), "in", term28384);
        setField(term28068, term28068.getClass(), "in", term28226);
        term30895 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        Object term30896 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        Object term30897 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        Object term30898 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        Object term30899 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        setField(term30899, term30899.getClass(), "in", null);
        setLongField(term30899, term30899.getClass(), "bytesRead", 0L);
        setField(term30898, term30898.getClass(), "in", term30899);
        setLongField(term30898, term30898.getClass(), "bytesRead", 0L);
        setField(term30897, term30897.getClass(), "in", term30898);
        setLongField(term30897, term30897.getClass(), "bytesRead", 0L);
        setField(term30896, term30896.getClass(), "in", term30897);
        setLongField(term30896, term30896.getClass(), "bytesRead", 0L);
        setField(term30895, term30895.getClass(), "in", term30896);
        setLongField(term30895, term30895.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term28068, args);
        assertTrue(recursiveEquals(term28068, term30895));
    }

};


