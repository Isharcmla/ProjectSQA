package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.math.EqualityUtils.*;

public class Fraction_reduce_5358591312502 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term819496;
     Object term820451;
     Object term820445;

    public Fraction_reduce_5358591312502() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term819496 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term819496, term819496.getClass(), "numerator", 536870802);
        setIntField(term819496, term819496.getClass(), "denominator", 1610612769);
        term820451 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term820451, term820451.getClass(), "numerator", 536870802);
        setIntField(term820451, term820451.getClass(), "denominator", 1610612769);
        setField(term820451, term820451.getClass(), "toString", null);
        setField(term820451, term820451.getClass(), "toProperString", null);
        term820445 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term820445, term820445.getClass(), "numerator", 178956934);
        setIntField(term820445, term820445.getClass(), "denominator", 536870923);
        setField(term820445, term820445.getClass(), "toString", null);
        setField(term820445, term820445.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term819496, args);
        assertTrue(recursiveEquals(term819496, term820451));
        assertTrue(recursiveEquals(retValue, term820445));
    }

};


