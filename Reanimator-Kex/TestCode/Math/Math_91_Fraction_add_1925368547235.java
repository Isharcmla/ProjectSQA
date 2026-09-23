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

public class Fraction_add_1925368547235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75213;
     Object term75301;

    public Fraction_add_1925368547235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75213 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term75213, term75213.getClass(), "numerator", 1073741824);
        setIntField(term75213, term75213.getClass(), "denominator", -37639485);
        term75301 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term75301, term75301.getClass(), "numerator", 1073741824);
        setIntField(term75301, term75301.getClass(), "denominator", 959141159);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term75301;
        try {
            callMethod(klass, "add", argTypes, term75213, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


