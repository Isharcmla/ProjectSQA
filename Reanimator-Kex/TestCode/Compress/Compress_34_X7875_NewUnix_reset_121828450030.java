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

public class X7875_NewUnix_reset_121828450030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154;
     Object term911;

    public X7875_NewUnix_reset_121828450030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        Object term156 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term158 = (int[]) newIntArray(1);
        setIntField(term154, term154.getClass(), "version", 1);
        setIntField(term156, term156.getClass(), "signum", 1);
        setIntElement(term158, 0, 1000);
        setField(term156, term156.getClass(), "mag", term158);
        setIntField(term156, term156.getClass(), "bitCountPlusOne", 0);
        setIntField(term156, term156.getClass(), "bitLengthPlusOne", 0);
        setIntField(term156, term156.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term156, term156.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term154, term154.getClass(), "uid", term156);
        setField(term154, term154.getClass(), "gid", term156);
        term911 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        Object term918 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term922 = (int[]) newIntArray(1);
        setIntField(term911, term911.getClass(), "version", 1);
        setIntField(term918, term918.getClass(), "signum", 1);
        setIntElement(term922, 0, 1000);
        setField(term918, term918.getClass(), "mag", term922);
        setIntField(term918, term918.getClass(), "bitCountPlusOne", 0);
        setIntField(term918, term918.getClass(), "bitLengthPlusOne", 0);
        setIntField(term918, term918.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term918, term918.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term911, term911.getClass(), "uid", term918);
        setField(term911, term911.getClass(), "gid", term918);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reset", argTypes, term154, args);
        assertTrue(recursiveEquals(term154, term911));
    }

};


