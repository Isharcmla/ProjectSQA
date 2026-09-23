package org.apache.commons.math.util;

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
import static org.apache.commons.math.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.util.EqualityUtils.*;

public class MathUtils_hash_140333341694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107;
     Object term4522;

    public MathUtils_hash_140333341694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107 = (double[]) newDoubleArray(3);
        setDoubleElement(term107, 0, 0.8598297828918529);
        setDoubleElement(term107, 1, 0.43692187681405226);
        setDoubleElement(term107, 2, 0.7633268466829064);
        term4522 = (double[]) newDoubleArray(3);
        setDoubleElement(term4522, 0, 0.8598297828918529);
        setDoubleElement(term4522, 1, 0.43692187681405226);
        setDoubleElement(term4522, 2, 0.7633268466829064);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MathUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term107;
        Object retValue = callMethod(klass, "hash", argTypes, null, args);
        assertTrue(recursiveEquals(term107, term4522));
        assertTrue(recursiveEquals(retValue, -1948393037));
    }

};


