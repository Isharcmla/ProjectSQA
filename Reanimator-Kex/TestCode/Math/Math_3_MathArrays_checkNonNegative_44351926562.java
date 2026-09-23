package org.apache.commons.math3.util;

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
import org.apache.commons.math3.exception.NotPositiveException;
import static org.apache.commons.math3.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MathArrays_checkNonNegative_44351926562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1650;

    public MathArrays_checkNonNegative_44351926562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1650 = (Object[]) newArray("[J", 3);
        long[] term1651 = (long[]) newLongArray(5);
        long[] term1657 = (long[]) newLongArray(5);
        long[] term1663 = (long[]) newLongArray(1);
        setLongElement(term1651, 0, 2120084523938730454L);
        setLongElement(term1651, 1, 6855071767938501807L);
        setLongElement(term1651, 2, -5892135042702373494L);
        setLongElement(term1651, 3, 5262507301787091109L);
        setLongElement(term1651, 4, -6823727938421990489L);
        setElement(term1650, 0, term1651);
        setLongElement(term1657, 0, -484994522244390100L);
        setLongElement(term1657, 1, 1233889271256172047L);
        setLongElement(term1657, 2, 6617340557564669657L);
        setLongElement(term1657, 3, 1439298019805881866L);
        setLongElement(term1657, 4, -8708192233349544946L);
        setElement(term1650, 1, term1657);
        setLongElement(term1663, 0, 5907001541142728739L);
        setElement(term1650, 2, term1663);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.util.MathArrays");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(long.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1650;
        try {
            callMethod(klass, "checkNonNegative", argTypes, null, args);
            assertTrue(false);
        }
        catch (NotPositiveException e) {
        }

    }

};


