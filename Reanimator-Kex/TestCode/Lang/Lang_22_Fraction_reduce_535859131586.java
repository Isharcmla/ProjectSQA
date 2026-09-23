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

public class Fraction_reduce_535859131586 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181438;
     Object term182000;
     Object term181997;

    public Fraction_reduce_535859131586() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181438 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term181438, term181438.getClass(), "numerator", 560695602);
        setIntField(term181438, term181438.getClass(), "denominator", 1347425345);
        term182000 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term182000, term182000.getClass(), "numerator", 560695602);
        setIntField(term182000, term182000.getClass(), "denominator", 1347425345);
        setField(term182000, term182000.getClass(), "toString", null);
        setField(term182000, term182000.getClass(), "toProperString", null);
        term181997 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term181997, term181997.getClass(), "numerator", 560695602);
        setIntField(term181997, term181997.getClass(), "denominator", 1347425345);
        setField(term181997, term181997.getClass(), "toString", null);
        setField(term181997, term181997.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term181438, args);
        assertTrue(recursiveEquals(term181438, term182000));
        assertTrue(recursiveEquals(retValue, term181997));
    }

};


