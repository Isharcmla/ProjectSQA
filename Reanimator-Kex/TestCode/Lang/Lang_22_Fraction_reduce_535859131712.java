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

public class Fraction_reduce_535859131712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225561;
     Object term226321;
     Object term226318;

    public Fraction_reduce_535859131712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term225561 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term225561, term225561.getClass(), "numerator", -166805502);
        setIntField(term225561, term225561.getClass(), "denominator", 106315831);
        term226321 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term226321, term226321.getClass(), "numerator", -166805502);
        setIntField(term226321, term226321.getClass(), "denominator", 106315831);
        setField(term226321, term226321.getClass(), "toString", null);
        setField(term226321, term226321.getClass(), "toProperString", null);
        term226318 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term226318, term226318.getClass(), "numerator", -166805502);
        setIntField(term226318, term226318.getClass(), "denominator", 106315831);
        setField(term226318, term226318.getClass(), "toString", null);
        setField(term226318, term226318.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term225561, args);
        assertTrue(recursiveEquals(term225561, term226321));
        assertTrue(recursiveEquals(retValue, term226318));
    }

};


