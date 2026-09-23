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

public class Fraction_hashCode_58589850735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50;
     Object term1314;

    public Fraction_hashCode_58589850735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term50, term50.getClass(), "denominator", -2068769794);
        setIntField(term50, term50.getClass(), "numerator", -117576464);
        term1314 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term1314, term1314.getClass(), "denominator", -2068769794);
        setIntField(term1314, term1314.getClass(), "numerator", -117576464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term50, args);
        assertTrue(recursiveEquals(term50, term1314));
        assertTrue(recursiveEquals(retValue, -2124108393));
    }

};


