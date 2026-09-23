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

public class Fraction_reduce_335503525664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184483;
     Object term184958;
     Object term184955;

    public Fraction_reduce_335503525664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184483 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term184483, term184483.getClass(), "numerator", 64520446);
        setIntField(term184483, term184483.getClass(), "denominator", 21226083);
        term184958 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term184958, term184958.getClass(), "numerator", 64520446);
        setIntField(term184958, term184958.getClass(), "denominator", 21226083);
        setField(term184958, term184958.getClass(), "toString", null);
        setField(term184958, term184958.getClass(), "toProperString", null);
        term184955 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term184955, term184955.getClass(), "numerator", 64520446);
        setIntField(term184955, term184955.getClass(), "denominator", 21226083);
        setField(term184955, term184955.getClass(), "toString", null);
        setField(term184955, term184955.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term184483, args);
        assertTrue(recursiveEquals(term184483, term184958));
        assertTrue(recursiveEquals(retValue, term184955));
    }

};


