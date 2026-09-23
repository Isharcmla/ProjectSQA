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
import java.lang.Long;

public class DeflateCompressorInputStream_skip_54964369511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;
     Object term25;

    public DeflateCompressorInputStream_skip_54964369511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        setField(term23, term23.getClass(), "in", null);
        setLongField(term23, term23.getClass(), "bytesRead", -8257434502486459194L);
        term25 = new Long(-8400487765614892086L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term25;
        try {
            callMethod(klass, "skip", argTypes, term23, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


