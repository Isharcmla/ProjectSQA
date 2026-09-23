package org.apache.commons.math3.fraction;

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
import org.apache.commons.math3.exception.MathArithmeticException;
import static org.apache.commons.math3.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_addSub_1779294476632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term294055;
     Object term294145;

    public Fraction_addSub_1779294476632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term294055 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term294055, term294055.getClass(), "numerator", -1610612736);
        setIntField(term294055, term294055.getClass(), "denominator", -1163927871);
        term294145 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term294145, term294145.getClass(), "numerator", 1610612736);
        setIntField(term294145, term294145.getClass(), "denominator", -53481727);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term294145;
        args[1] = false;
        try {
            callMethod(klass, "addSub", argTypes, term294055, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


