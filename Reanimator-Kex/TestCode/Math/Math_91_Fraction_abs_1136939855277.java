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

public class Fraction_abs_1136939855277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91932;
     Object term91937;
     Object term91934;

    public Fraction_abs_1136939855277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91932 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term91932, term91932.getClass(), "numerator", 0);
        term91937 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term91937, term91937.getClass(), "denominator", 0);
        setIntField(term91937, term91937.getClass(), "numerator", 0);
        term91934 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term91934, term91934.getClass(), "denominator", 0);
        setIntField(term91934, term91934.getClass(), "numerator", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "abs", argTypes, term91932, args);
        assertTrue(recursiveEquals(term91932, term91937));
        assertTrue(recursiveEquals(retValue, term91934));
    }

};


