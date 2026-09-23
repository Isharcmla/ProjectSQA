package org.apache.commons.compress.compressors.bzip2;

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
import static org.apache.commons.compress.compressors.bzip2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BZip2CompressorInputStream_read0_1920932186246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192151;

    public BZip2CompressorInputStream_read0_1920932186246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term192151 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setIntField(term192151, term192151.getClass(), "currentChar", 0);
        setIntField(term192151, term192151.getClass(), "currentState", 4);
        setIntField(term192151, term192151.getClass(), "su_j2", 0);
        setCharField(term192151, term192151.getClass(), "su_z", (char) 0);
        setIntField(term192151, term192151.getClass(), "su_i2", 2147483646);
        setIntField(term192151, term192151.getClass(), "su_count", 0);
        setIntField(term192151, term192151.getClass(), "last", 2147483647);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read0", argTypes, term192151, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


