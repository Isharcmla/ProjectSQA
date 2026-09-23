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

public class Fraction_floatValue_142457396332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41;
     Object term1297;

    public Fraction_floatValue_142457396332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term41, term41.getClass(), "denominator", -1685132342);
        setIntField(term41, term41.getClass(), "numerator", -1456670397);
        term1297 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term1297, term1297.getClass(), "denominator", -1685132342);
        setIntField(term1297, term1297.getClass(), "numerator", -1456670397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "floatValue", argTypes, term41, args);
        assertTrue(recursiveEquals(term41, term1297));
        assertTrue(recursiveEquals(retValue, 0.86442494F));
    }

};


