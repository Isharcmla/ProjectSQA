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
import static org.apache.commons.math3.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.fraction.EqualityUtils.*;

public class Fraction_percentageValue_112809405558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119;
     Object term6354;

    public Fraction_percentageValue_112809405558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term119, term119.getClass(), "denominator", 1324040357);
        setIntField(term119, term119.getClass(), "numerator", -1588772968);
        term6354 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term6354, term6354.getClass(), "denominator", 1324040357);
        setIntField(term6354, term6354.getClass(), "numerator", -1588772968);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "percentageValue", argTypes, term119, args);
        assertTrue(recursiveEquals(term119, term6354));
        assertTrue(recursiveEquals(retValue, -119.99430074773771));
    }

};
