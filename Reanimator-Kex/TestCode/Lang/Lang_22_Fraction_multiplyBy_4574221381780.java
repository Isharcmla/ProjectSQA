package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_multiplyBy_4574221381780 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term578736;
     Object term578818;

    public Fraction_multiplyBy_4574221381780() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term578736 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term578736, term578736.getClass(), "numerator", 261113134);
        setIntField(term578736, term578736.getClass(), "denominator", 2013364011);
        term578818 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term578818, term578818.getClass(), "numerator", 1342243042);
        setIntField(term578818, term578818.getClass(), "denominator", 1086751947);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term578818;
        try {
            callMethod(klass, "multiplyBy", argTypes, term578736, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


