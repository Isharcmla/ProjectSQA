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

public class Fraction_add_75177557281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16477;
     Object term16567;

    public Fraction_add_75177557281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16477 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term16477, term16477.getClass(), "numerator", -1610612736);
        setIntField(term16477, term16477.getClass(), "denominator", -1802853187);
        term16567 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term16567, term16567.getClass(), "numerator", 1610612736);
        setIntField(term16567, term16567.getClass(), "denominator", -1446968045);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term16567;
        try {
            callMethod(klass, "add", argTypes, term16477, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};
