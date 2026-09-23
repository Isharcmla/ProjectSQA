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

public class Fraction_add_2763527042536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term830791;
     Object term830873;

    public Fraction_add_2763527042536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term830791 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term830791, term830791.getClass(), "numerator", -2147483648);
        setIntField(term830791, term830791.getClass(), "denominator", 1356092996);
        term830873 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term830873, term830873.getClass(), "numerator", -2147483648);
        setIntField(term830873, term830873.getClass(), "denominator", -1980119886);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term830873;
        try {
            callMethod(klass, "add", argTypes, term830791, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


