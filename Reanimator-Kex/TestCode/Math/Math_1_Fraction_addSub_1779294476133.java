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

public class Fraction_addSub_1779294476133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46154;
     Object term46244;
     Object term46339;
     Object term46340;
     Object term46329;

    public Fraction_addSub_1779294476133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46154 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term46154, term46154.getClass(), "numerator", 134217728);
        setIntField(term46154, term46154.getClass(), "denominator", -10403);
        term46244 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term46244, term46244.getClass(), "numerator", 134217728);
        setIntField(term46244, term46244.getClass(), "denominator", -20806);
        term46339 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term46339, term46339.getClass(), "denominator", -10403);
        setIntField(term46339, term46339.getClass(), "numerator", 134217728);
        term46340 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term46340, term46340.getClass(), "denominator", -20806);
        setIntField(term46340, term46340.getClass(), "numerator", 134217728);
        term46329 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term46329, term46329.getClass(), "denominator", 10403);
        setIntField(term46329, term46329.getClass(), "numerator", -67108864);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term46244;
        args[1] = false;
        Object retValue = callMethod(klass, "addSub", argTypes, term46154, args);
        assertTrue(recursiveEquals(term46154, term46339));
        assertTrue(recursiveEquals(term46244, term46340));
        assertTrue(recursiveEquals(retValue, term46329));
    }

};
