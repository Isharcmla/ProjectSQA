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

public class Fraction_abs_113693985528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25;
     Object term906;
     Object term903;

    public Fraction_abs_113693985528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term25, term25.getClass(), "denominator", -1955890973);
        setIntField(term25, term25.getClass(), "numerator", -2038273078);
        term906 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term906, term906.getClass(), "denominator", -1955890973);
        setIntField(term906, term906.getClass(), "numerator", -2038273078);
        term903 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term903, term903.getClass(), "denominator", 1955890973);
        setIntField(term903, term903.getClass(), "numerator", -2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "abs", argTypes, term25, args);
        assertTrue(recursiveEquals(term25, term906));
        assertTrue(recursiveEquals(retValue, term903));
    }

};


