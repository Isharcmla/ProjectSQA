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

public class Fraction_compareTo_139986917938 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30;
     Object term33;
     Object term1690;
     Object term1691;

    public Fraction_compareTo_139986917938() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term30, term30.getClass(), "denominator", -1339778481);
        setIntField(term30, term30.getClass(), "numerator", 1725571209);
        term33 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term33, term33.getClass(), "denominator", -522618178);
        setIntField(term33, term33.getClass(), "numerator", 1134449235);
        term1690 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1690, term1690.getClass(), "denominator", -1339778481);
        setIntField(term1690, term1690.getClass(), "numerator", 1725571209);
        term1691 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1691, term1691.getClass(), "denominator", -522618178);
        setIntField(term1691, term1691.getClass(), "numerator", 1134449235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term33;
        Object retValue = callMethod(klass, "compareTo", argTypes, term30, args);
        assertTrue(recursiveEquals(term30, term1690));
        assertTrue(recursiveEquals(term33, term1691));
        assertTrue(recursiveEquals(retValue, 1));
    }

};
