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

public class Fraction_reduce_535859131753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238265;
     Object term238777;
     Object term238774;

    public Fraction_reduce_535859131753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term238265 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term238265, term238265.getClass(), "numerator", -2106714562);
        setIntField(term238265, term238265.getClass(), "denominator", 1085338393);
        term238777 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term238777, term238777.getClass(), "numerator", -2106714562);
        setIntField(term238777, term238777.getClass(), "denominator", 1085338393);
        setField(term238777, term238777.getClass(), "toString", null);
        setField(term238777, term238777.getClass(), "toProperString", null);
        term238774 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term238774, term238774.getClass(), "numerator", -2106714562);
        setIntField(term238774, term238774.getClass(), "denominator", 1085338393);
        setField(term238774, term238774.getClass(), "toString", null);
        setField(term238774, term238774.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term238265, args);
        assertTrue(recursiveEquals(term238265, term238777));
        assertTrue(recursiveEquals(retValue, term238774));
    }

};


