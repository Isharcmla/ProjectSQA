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
import java.lang.ArithmeticException;
import static org.apache.commons.math.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_add_1925368547311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104591;
     Object term104679;

    public Fraction_add_1925368547311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104591 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term104591, term104591.getClass(), "numerator", 1048576);
        setIntField(term104591, term104591.getClass(), "denominator", -411574367);
        term104679 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term104679, term104679.getClass(), "numerator", 268435456);
        setIntField(term104679, term104679.getClass(), "denominator", 1240981965);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term104679;
        try {
            callMethod(klass, "add", argTypes, term104591, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


