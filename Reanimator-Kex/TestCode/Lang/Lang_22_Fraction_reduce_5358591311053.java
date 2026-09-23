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

public class Fraction_reduce_5358591311053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term339148;
     Object term339622;
     Object term339619;

    public Fraction_reduce_5358591311053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term339148 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term339148, term339148.getClass(), "numerator", 800825554);
        setIntField(term339148, term339148.getClass(), "denominator", 1474003329);
        term339622 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term339622, term339622.getClass(), "numerator", 800825554);
        setIntField(term339622, term339622.getClass(), "denominator", 1474003329);
        setField(term339622, term339622.getClass(), "toString", null);
        setField(term339622, term339622.getClass(), "toProperString", null);
        term339619 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term339619, term339619.getClass(), "numerator", 800825554);
        setIntField(term339619, term339619.getClass(), "denominator", 1474003329);
        setField(term339619, term339619.getClass(), "toString", null);
        setField(term339619, term339619.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term339148, args);
        assertTrue(recursiveEquals(term339148, term339622));
        assertTrue(recursiveEquals(retValue, term339619));
    }

};


