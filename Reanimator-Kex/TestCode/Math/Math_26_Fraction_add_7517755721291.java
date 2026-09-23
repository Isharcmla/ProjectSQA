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

public class Fraction_add_7517755721291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term643585;
     Object term643675;

    public Fraction_add_7517755721291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term643585 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term643585, term643585.getClass(), "numerator", 1073741824);
        setIntField(term643585, term643585.getClass(), "denominator", -2105539742);
        term643675 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term643675, term643675.getClass(), "numerator", 67108864);
        setIntField(term643675, term643675.getClass(), "denominator", -1246992039);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term643675;
        try {
            callMethod(klass, "add", argTypes, term643585, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


