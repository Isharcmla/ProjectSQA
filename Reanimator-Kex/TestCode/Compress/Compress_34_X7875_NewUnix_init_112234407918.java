package org.apache.commons.compress.archivers.zip;

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
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.zip.EqualityUtils.*;
import java.lang.Object;

public class X7875_NewUnix_init_112234407918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227;

    public X7875_NewUnix_init_112234407918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        Object term228 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term229 = (int[]) newIntArray(1);
        setIntField(term227, term227.getClass(), "version", 1);
        setIntField(term228, term228.getClass(), "signum", 1);
        setIntElement(term229, 0, 1000);
        setField(term228, term228.getClass(), "mag", term229);
        setIntField(term228, term228.getClass(), "bitCountPlusOne", 0);
        setIntField(term228, term228.getClass(), "bitLengthPlusOne", 0);
        setIntField(term228, term228.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term228, term228.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term227, term227.getClass(), "uid", term228);
        setField(term227, term227.getClass(), "gid", term228);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term227));
    }

};


