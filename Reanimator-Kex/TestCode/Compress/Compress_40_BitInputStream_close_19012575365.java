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

public class BitInputStream_close_19012575365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24;

    public BitInputStream_close_19012575365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24 = newInstance(Class.forName("org.apache.commons.compress.utils.BitInputStream"));
        Object term25 = newInstance(Class.forName("java.nio.ByteOrder"));
        setField(term24, term24.getClass(), "in", null);
        setField(term25, term25.getClass(), "name", "sjlJAEtRrb");
        setField(term24, term24.getClass(), "byteOrder", term25);
        setLongField(term24, term24.getClass(), "bitsCached", 2442117782898005296L);
        setIntField(term24, term24.getClass(), "bitsCachedSize", 568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.BitInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term24, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


