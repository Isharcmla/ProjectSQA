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

public class X7875_NewUnix_hashCode_211640767634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199;
     Object term1053;

    public X7875_NewUnix_hashCode_211640767634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term199 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        Object term201 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term203 = (int[]) newIntArray(1);
        setIntField(term199, term199.getClass(), "version", 1);
        setIntField(term201, term201.getClass(), "signum", 1);
        setIntElement(term203, 0, 1000);
        setField(term201, term201.getClass(), "mag", term203);
        setIntField(term201, term201.getClass(), "bitCountPlusOne", 0);
        setIntField(term201, term201.getClass(), "bitLengthPlusOne", 0);
        setIntField(term201, term201.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term201, term201.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term199, term199.getClass(), "uid", term201);
        setField(term199, term199.getClass(), "gid", term201);
        term1053 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        Object term1054 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1055 = (int[]) newIntArray(1);
        setIntField(term1053, term1053.getClass(), "version", 1);
        setIntField(term1054, term1054.getClass(), "signum", 1);
        setIntElement(term1055, 0, 1000);
        setField(term1054, term1054.getClass(), "mag", term1055);
        setIntField(term1054, term1054.getClass(), "bitCountPlusOne", 0);
        setIntField(term1054, term1054.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1054, term1054.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1054, term1054.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1053, term1053.getClass(), "uid", term1054);
        setField(term1053, term1053.getClass(), "gid", term1054);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term199, args);
        assertTrue(recursiveEquals(term199, term1053));
        assertTrue(recursiveEquals(retValue, -66770287));
    }

};


