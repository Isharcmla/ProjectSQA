package org.apache.commons.math.fraction;

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
import static org.apache.commons.math.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_add_1925368547389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136285;
     Object term136373;

    public Fraction_add_1925368547389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136285 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term136285, term136285.getClass(), "numerator", 33554432);
        setIntField(term136285, term136285.getClass(), "denominator", -175781985);
        term136373 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term136373, term136373.getClass(), "numerator", 1073741824);
        setIntField(term136373, term136373.getClass(), "denominator", 1547664115);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term136373;
        callMethod(klass, "add", argTypes, term136285, args);
    }

};


