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
import java.lang.NullPointerException;
import static org.apache.commons.compress.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ChecksumCalculatingInputStream_skip_80559823223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3725;

    public ChecksumCalculatingInputStream_skip_80559823223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3725 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term3859 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term3993 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        setField(term3859, term3859.getClass(), "in", term3993);
        setField(term3725, term3725.getClass(), "in", term3859);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = 0L;
        try {
            callMethod(klass, "skip", argTypes, term3725, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


