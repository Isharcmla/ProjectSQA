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

public class Fraction_negate_207398307347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61;
     Object term1791;
     Object term1783;

    public Fraction_negate_207398307347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term61, term61.getClass(), "denominator", -244121226);
        setIntField(term61, term61.getClass(), "numerator", -203030934);
        term1791 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1791, term1791.getClass(), "denominator", -244121226);
        setIntField(term1791, term1791.getClass(), "numerator", -203030934);
        term1783 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1783, term1783.getClass(), "denominator", 40686871);
        setIntField(term1783, term1783.getClass(), "numerator", -33838489);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "negate", argTypes, term61, args);
        assertTrue(recursiveEquals(term61, term1791));
        assertTrue(recursiveEquals(retValue, term1783));
    }

};
