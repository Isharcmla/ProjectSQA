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

public class Fraction_reduce_5358591311426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term464557;
     Object term465627;
     Object term465624;

    public Fraction_reduce_5358591311426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term464557 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term464557, term464557.getClass(), "numerator", -1308475358);
        setIntField(term464557, term464557.getClass(), "denominator", 1497571879);
        term465627 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term465627, term465627.getClass(), "numerator", -1308475358);
        setIntField(term465627, term465627.getClass(), "denominator", 1497571879);
        setField(term465627, term465627.getClass(), "toString", null);
        setField(term465627, term465627.getClass(), "toProperString", null);
        term465624 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term465624, term465624.getClass(), "numerator", -1308475358);
        setIntField(term465624, term465624.getClass(), "denominator", 1497571879);
        setField(term465624, term465624.getClass(), "toString", null);
        setField(term465624, term465624.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term464557, args);
        assertTrue(recursiveEquals(term464557, term465627));
        assertTrue(recursiveEquals(retValue, term465624));
    }

};


