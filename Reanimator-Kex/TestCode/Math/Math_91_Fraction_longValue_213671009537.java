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

public class Fraction_longValue_213671009537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56;
     Object term1326;

    public Fraction_longValue_213671009537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term56, term56.getClass(), "denominator", 590364439);
        setIntField(term56, term56.getClass(), "numerator", 865208305);
        term1326 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term1326, term1326.getClass(), "denominator", 590364439);
        setIntField(term1326, term1326.getClass(), "numerator", 865208305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "longValue", argTypes, term56, args);
        assertTrue(recursiveEquals(term56, term1326));
        assertTrue(recursiveEquals(retValue, 1L));
    }

};


