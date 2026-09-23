package org.apache.commons.lang3;

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
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.EqualityUtils.*;
import java.lang.Double;

public class ArrayUtils_lastIndexOf_71253075251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term877;
     Object term885;
     Object term13444;

    public ArrayUtils_lastIndexOf_71253075251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term877 = (double[]) newDoubleArray(7);
        setDoubleElement(term877, 0, 0.3202192021706908);
        setDoubleElement(term877, 1, 0.22651340641904605);
        setDoubleElement(term877, 2, 0.8878841294187743);
        setDoubleElement(term877, 3, 0.6588948704887806);
        setDoubleElement(term877, 4, 0.6397214730945112);
        setDoubleElement(term877, 5, 0.25937345430928016);
        setDoubleElement(term877, 6, 0.5873228247510078);
        term885 = new Double(0.8823181080774973);
        term13444 = (double[]) newDoubleArray(7);
        setDoubleElement(term13444, 0, 0.3202192021706908);
        setDoubleElement(term13444, 1, 0.22651340641904605);
        setDoubleElement(term13444, 2, 0.8878841294187743);
        setDoubleElement(term13444, 3, 0.6588948704887806);
        setDoubleElement(term13444, 4, 0.6397214730945112);
        setDoubleElement(term13444, 5, 0.25937345430928016);
        setDoubleElement(term13444, 6, 0.5873228247510078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term877;
        args[1] = term885;
        Object retValue = callMethod(klass, "lastIndexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term877, term13444));
        assertTrue(recursiveEquals(term885, 0.8823181080774973));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


