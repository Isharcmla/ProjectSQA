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

public class Fraction_add_751775572956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term463304;
     Object term463394;

    public Fraction_add_751775572956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term463304 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term463304, term463304.getClass(), "numerator", 1073741824);
        setIntField(term463304, term463304.getClass(), "denominator", -190);
        term463394 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term463394, term463394.getClass(), "numerator", 1073741824);
        setIntField(term463394, term463394.getClass(), "denominator", -1073741815);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term463394;
        try {
            callMethod(klass, "add", argTypes, term463304, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


