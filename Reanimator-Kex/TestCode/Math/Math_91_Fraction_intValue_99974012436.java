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
import static org.apache.commons.math.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.fraction.EqualityUtils.*;

public class Fraction_intValue_99974012436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53;
     Object term1320;

    public Fraction_intValue_99974012436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term53, term53.getClass(), "denominator", -1007160944);
        setIntField(term53, term53.getClass(), "numerator", 1135664017);
        term1320 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term1320, term1320.getClass(), "denominator", -1007160944);
        setIntField(term1320, term1320.getClass(), "numerator", 1135664017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "intValue", argTypes, term53, args);
        assertTrue(recursiveEquals(term53, term1320));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


