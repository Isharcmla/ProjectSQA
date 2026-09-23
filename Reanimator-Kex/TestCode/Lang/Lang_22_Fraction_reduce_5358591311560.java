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

public class Fraction_reduce_5358591311560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term507094;
     Object term507765;
     Object term507762;

    public Fraction_reduce_5358591311560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term507094 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term507094, term507094.getClass(), "numerator", 1725487982);
        setIntField(term507094, term507094.getClass(), "denominator", 1401311375);
        term507765 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term507765, term507765.getClass(), "numerator", 1725487982);
        setIntField(term507765, term507765.getClass(), "denominator", 1401311375);
        setField(term507765, term507765.getClass(), "toString", null);
        setField(term507765, term507765.getClass(), "toProperString", null);
        term507762 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term507762, term507762.getClass(), "numerator", 1725487982);
        setIntField(term507762, term507762.getClass(), "denominator", 1401311375);
        setField(term507762, term507762.getClass(), "toString", null);
        setField(term507762, term507762.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term507094, args);
        assertTrue(recursiveEquals(term507094, term507765));
        assertTrue(recursiveEquals(retValue, term507762));
    }

};


