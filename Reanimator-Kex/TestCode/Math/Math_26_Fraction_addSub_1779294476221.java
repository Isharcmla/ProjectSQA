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

public class Fraction_addSub_1779294476221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85631;
     Object term85721;

    public Fraction_addSub_1779294476221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85631 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term85631, term85631.getClass(), "numerator", -1073741824);
        setIntField(term85631, term85631.getClass(), "denominator", -1612861631);
        term85721 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term85721, term85721.getClass(), "numerator", 671088640);
        setIntField(term85721, term85721.getClass(), "denominator", -1610612607);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term85721;
        args[1] = false;
        try {
            callMethod(klass, "addSub", argTypes, term85631, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


