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

public class Fraction_subtract_265003123725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term229090;
     Object term229172;

    public Fraction_subtract_265003123725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term229090 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term229090, term229090.getClass(), "numerator", -2147483648);
        setIntField(term229090, term229090.getClass(), "denominator", -2099255368);
        term229172 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term229172, term229172.getClass(), "numerator", -2147483648);
        setIntField(term229172, term229172.getClass(), "denominator", 1190051516);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term229172;
        try {
            callMethod(klass, "subtract", argTypes, term229090, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


