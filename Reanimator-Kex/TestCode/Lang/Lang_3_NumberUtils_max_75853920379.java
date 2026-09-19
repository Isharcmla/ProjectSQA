package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.math.EqualityUtils.*;

public class NumberUtils_max_75853920379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term541;
     Object term7000;

    public NumberUtils_max_75853920379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term541 = (double[]) newDoubleArray(6);
        setDoubleElement(term541, 0, 0.5523635872663106);
        setDoubleElement(term541, 1, 0.544608645520025);
        setDoubleElement(term541, 2, 0.28570734989730284);
        setDoubleElement(term541, 3, 0.40176586625454525);
        setDoubleElement(term541, 4, 0.2641345529914265);
        setDoubleElement(term541, 5, 0.36923381893433327);
        term7000 = (double[]) newDoubleArray(6);
        setDoubleElement(term7000, 0, 0.5523635872663106);
        setDoubleElement(term7000, 1, 0.544608645520025);
        setDoubleElement(term7000, 2, 0.28570734989730284);
        setDoubleElement(term7000, 3, 0.40176586625454525);
        setDoubleElement(term7000, 4, 0.2641345529914265);
        setDoubleElement(term7000, 5, 0.36923381893433327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.NumberUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term541;
        Object retValue = callMethod(klass, "max", argTypes, null, args);
        assertTrue(recursiveEquals(term541, term7000));
        assertTrue(recursiveEquals(retValue, 0.5523635872663106));
    }

};


