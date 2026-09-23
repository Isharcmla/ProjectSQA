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

public class Fraction_add_1925368547472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172804;
     Object term172892;

    public Fraction_add_1925368547472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172804 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term172804, term172804.getClass(), "numerator", 512);
        setIntField(term172804, term172804.getClass(), "denominator", -142589911);
        term172892 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term172892, term172892.getClass(), "numerator", 262144);
        setIntField(term172892, term172892.getClass(), "denominator", 1837299093);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term172892;
        try {
            callMethod(klass, "add", argTypes, term172804, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


