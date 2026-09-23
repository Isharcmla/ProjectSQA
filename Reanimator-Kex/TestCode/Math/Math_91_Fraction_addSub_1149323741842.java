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

public class Fraction_addSub_1149323741842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term317027;
     Object term317115;

    public Fraction_addSub_1149323741842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term317027 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term317027, term317027.getClass(), "numerator", 536870912);
        setIntField(term317027, term317027.getClass(), "denominator", 1);
        term317115 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term317115, term317115.getClass(), "numerator", 536870912);
        setIntField(term317115, term317115.getClass(), "denominator", -2098687124);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term317115;
        args[1] = false;
        callMethod(klass, "addSub", argTypes, term317027, args);
    }

};


