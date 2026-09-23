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

public class Fraction_add_7517755721396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term582015;
     Object term582105;

    public Fraction_add_7517755721396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term582015 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term582015, term582015.getClass(), "numerator", 1048576);
        setIntField(term582015, term582015.getClass(), "denominator", -131988286);
        term582105 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term582105, term582105.getClass(), "numerator", 4194304);
        setIntField(term582105, term582105.getClass(), "denominator", -1044332967);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term582105;
        try {
            callMethod(klass, "add", argTypes, term582015, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


