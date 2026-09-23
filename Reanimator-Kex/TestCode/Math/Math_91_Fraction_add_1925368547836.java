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

public class Fraction_add_1925368547836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315148;
     Object term315236;

    public Fraction_add_1925368547836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term315148 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term315148, term315148.getClass(), "numerator", 33554432);
        setIntField(term315148, term315148.getClass(), "denominator", -200015823);
        term315236 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term315236, term315236.getClass(), "numerator", 4);
        setIntField(term315236, term315236.getClass(), "denominator", 851705917);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term315236;
        callMethod(klass, "add", argTypes, term315148, args);
    }

};


