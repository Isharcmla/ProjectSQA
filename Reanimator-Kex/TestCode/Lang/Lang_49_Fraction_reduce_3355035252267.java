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

public class Fraction_reduce_3355035252267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term670717;
     Object term671226;
     Object term671220;

    public Fraction_reduce_3355035252267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term670717 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term670717, term670717.getClass(), "numerator", 1074806798);
        setIntField(term670717, term670717.getClass(), "denominator", 1685577647);
        term671226 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term671226, term671226.getClass(), "numerator", 1074806798);
        setIntField(term671226, term671226.getClass(), "denominator", 1685577647);
        setField(term671226, term671226.getClass(), "toString", null);
        setField(term671226, term671226.getClass(), "toProperString", null);
        term671220 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term671220, term671220.getClass(), "numerator", 82677446);
        setIntField(term671220, term671220.getClass(), "denominator", 129659819);
        setField(term671220, term671220.getClass(), "toString", null);
        setField(term671220, term671220.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term670717, args);
        assertTrue(recursiveEquals(term670717, term671226));
        assertTrue(recursiveEquals(retValue, term671220));
    }

};


