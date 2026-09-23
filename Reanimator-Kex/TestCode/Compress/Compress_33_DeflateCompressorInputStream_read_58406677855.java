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
import java.lang.Object;

public class DeflateCompressorInputStream_read_58406677855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14501;

    public DeflateCompressorInputStream_read_58406677855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14501 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        Object term14659 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        Object term14817 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        Object term14975 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        setField(term14817, term14817.getClass(), "in", term14975);
        setField(term14659, term14659.getClass(), "in", term14817);
        setField(term14501, term14501.getClass(), "in", term14659);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term14501, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


