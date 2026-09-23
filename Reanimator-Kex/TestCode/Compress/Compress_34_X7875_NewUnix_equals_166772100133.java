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

public class X7875_NewUnix_equals_166772100133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187;
     Object term197;
     Object term1032;
     Object term1035;

    public X7875_NewUnix_equals_166772100133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term187 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        Object term189 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term191 = (int[]) newIntArray(1);
        setIntField(term187, term187.getClass(), "version", 1);
        setIntField(term189, term189.getClass(), "signum", 1);
        setIntElement(term191, 0, 1000);
        setField(term189, term189.getClass(), "mag", term191);
        setIntField(term189, term189.getClass(), "bitCountPlusOne", 0);
        setIntField(term189, term189.getClass(), "bitLengthPlusOne", 0);
        setIntField(term189, term189.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term189, term189.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term187, term187.getClass(), "uid", term189);
        setField(term187, term187.getClass(), "gid", term189);
        term197 = newInstance(Class.forName("java.lang.Object"));
        term1032 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        Object term1033 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1034 = (int[]) newIntArray(1);
        setIntField(term1032, term1032.getClass(), "version", 1);
        setIntField(term1033, term1033.getClass(), "signum", 1);
        setIntElement(term1034, 0, 1000);
        setField(term1033, term1033.getClass(), "mag", term1034);
        setIntField(term1033, term1033.getClass(), "bitCountPlusOne", 0);
        setIntField(term1033, term1033.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1033, term1033.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1033, term1033.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1032, term1032.getClass(), "uid", term1033);
        setField(term1032, term1032.getClass(), "gid", term1033);
        term1035 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term197;
        Object retValue = callMethod(klass, "equals", argTypes, term187, args);
        assertTrue(recursiveEquals(term187, term1032));
        assertTrue(recursiveEquals(term197, term1035));
        assertTrue(recursiveEquals(retValue, false));
    }

};


