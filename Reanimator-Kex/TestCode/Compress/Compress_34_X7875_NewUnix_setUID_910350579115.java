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

public class X7875_NewUnix_setUID_910350579115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35209;
     Object term35433;

    public X7875_NewUnix_setUID_910350579115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35209 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        term35433 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        Object term35434 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term35435 = (int[]) newIntArray(1);
        setIntField(term35433, term35433.getClass(), "version", 0);
        setIntField(term35434, term35434.getClass(), "signum", 1);
        setIntElement(term35435, 0, -2147483648);
        setField(term35434, term35434.getClass(), "mag", term35435);
        setIntField(term35434, term35434.getClass(), "bitCountPlusOne", 0);
        setIntField(term35434, term35434.getClass(), "bitLengthPlusOne", 0);
        setIntField(term35434, term35434.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term35434, term35434.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term35433, term35433.getClass(), "uid", term35434);
        setField(term35433, term35433.getClass(), "gid", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = 2147483648L;
        callMethod(klass, "setUID", argTypes, term35209, args);
        assertTrue(recursiveEquals(term35209, term35433));
    }

};


