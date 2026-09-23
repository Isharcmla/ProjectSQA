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

public class Fraction_reduce_5358591312690 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term881412;
     Object term882453;
     Object term882450;

    public Fraction_reduce_5358591312690() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term881412 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term881412, term881412.getClass(), "numerator", -36588542);
        setIntField(term881412, term881412.getClass(), "denominator", 2116871719);
        term882453 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term882453, term882453.getClass(), "numerator", -36588542);
        setIntField(term882453, term882453.getClass(), "denominator", 2116871719);
        setField(term882453, term882453.getClass(), "toString", null);
        setField(term882453, term882453.getClass(), "toProperString", null);
        term882450 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term882450, term882450.getClass(), "numerator", -36588542);
        setIntField(term882450, term882450.getClass(), "denominator", 2116871719);
        setField(term882450, term882450.getClass(), "toString", null);
        setField(term882450, term882450.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term881412, args);
        assertTrue(recursiveEquals(term881412, term882453));
        assertTrue(recursiveEquals(retValue, term882450));
    }

};


