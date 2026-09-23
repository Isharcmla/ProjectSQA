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
import java.lang.ArithmeticException;
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_multiplyBy_457422138775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244624;
     Object term244706;

    public Fraction_multiplyBy_457422138775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term244624 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term244624, term244624.getClass(), "numerator", 555762846);
        setIntField(term244624, term244624.getClass(), "denominator", 113242909);
        term244706 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term244706, term244706.getClass(), "numerator", 75495438);
        setIntField(term244706, term244706.getClass(), "denominator", 826413587);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term244706;
        try {
            callMethod(klass, "multiplyBy", argTypes, term244624, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


