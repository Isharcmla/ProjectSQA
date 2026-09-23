package org.apache.commons.lang.math;

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
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.math.EqualityUtils.*;

public class Fraction_reduce_335503525819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term229972;
     Object term231366;
     Object term231363;

    public Fraction_reduce_335503525819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term229972 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term229972, term229972.getClass(), "numerator", -90166770);
        setIntField(term229972, term229972.getClass(), "denominator", 2115201239);
        term231366 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term231366, term231366.getClass(), "numerator", -90166770);
        setIntField(term231366, term231366.getClass(), "denominator", 2115201239);
        setField(term231366, term231366.getClass(), "toString", null);
        setField(term231366, term231366.getClass(), "toProperString", null);
        term231363 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term231363, term231363.getClass(), "numerator", -90166770);
        setIntField(term231363, term231363.getClass(), "denominator", 2115201239);
        setField(term231363, term231363.getClass(), "toString", null);
        setField(term231363, term231363.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term229972, args);
        assertTrue(recursiveEquals(term229972, term231366));
        assertTrue(recursiveEquals(retValue, term231363));
    }

};


