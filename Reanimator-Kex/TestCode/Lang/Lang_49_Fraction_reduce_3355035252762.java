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

public class Fraction_reduce_3355035252762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term824562;
     Object term825501;
     Object term825495;

    public Fraction_reduce_3355035252762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term824562 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term824562, term824562.getClass(), "numerator", 1073741790);
        setIntField(term824562, term824562.getClass(), "denominator", 536870919);
        term825501 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term825501, term825501.getClass(), "numerator", 1073741790);
        setIntField(term825501, term825501.getClass(), "denominator", 536870919);
        setField(term825501, term825501.getClass(), "toString", null);
        setField(term825501, term825501.getClass(), "toProperString", null);
        term825495 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term825495, term825495.getClass(), "numerator", 357913930);
        setIntField(term825495, term825495.getClass(), "denominator", 178956973);
        setField(term825495, term825495.getClass(), "toString", null);
        setField(term825495, term825495.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term824562, args);
        assertTrue(recursiveEquals(term824562, term825501));
        assertTrue(recursiveEquals(retValue, term825495));
    }

};


