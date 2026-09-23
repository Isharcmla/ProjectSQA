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

public class Fraction_reduce_535859131788 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249226;
     Object term249864;
     Object term249861;

    public Fraction_reduce_535859131788() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term249226 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term249226, term249226.getClass(), "numerator", 1342177234);
        setIntField(term249226, term249226.getClass(), "denominator", 1879048193);
        term249864 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term249864, term249864.getClass(), "numerator", 1342177234);
        setIntField(term249864, term249864.getClass(), "denominator", 1879048193);
        setField(term249864, term249864.getClass(), "toString", null);
        setField(term249864, term249864.getClass(), "toProperString", null);
        term249861 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term249861, term249861.getClass(), "numerator", 1342177234);
        setIntField(term249861, term249861.getClass(), "denominator", 1879048193);
        setField(term249861, term249861.getClass(), "toString", null);
        setField(term249861, term249861.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term249226, args);
        assertTrue(recursiveEquals(term249226, term249864));
        assertTrue(recursiveEquals(retValue, term249861));
    }

};


