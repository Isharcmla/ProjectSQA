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

public class Fraction_addSub_17792944762338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1162675;
     Object term1162765;

    public Fraction_addSub_17792944762338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1162675 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1162675, term1162675.getClass(), "numerator", 131072);
        setIntField(term1162675, term1162675.getClass(), "denominator", -1875378175);
        term1162765 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1162765, term1162765.getClass(), "numerator", 131072);
        setIntField(term1162765, term1162765.getClass(), "denominator", -381655231);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term1162765;
        args[1] = false;
        try {
            callMethod(klass, "addSub", argTypes, term1162675, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


