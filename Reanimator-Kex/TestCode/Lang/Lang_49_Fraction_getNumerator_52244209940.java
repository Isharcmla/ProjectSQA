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

public class Fraction_getNumerator_52244209940 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43;
     Object term2495;

    public Fraction_getNumerator_52244209940() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term43, term43.getClass(), "numerator", -1339778481);
        setIntField(term43, term43.getClass(), "denominator", 1725571209);
        setField(term43, term43.getClass(), "toString", "sjlJAEtRrb");
        setField(term43, term43.getClass(), "toProperString", "MuLcgQHgqz");
        term2495 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term2495, term2495.getClass(), "numerator", -1339778481);
        setIntField(term2495, term2495.getClass(), "denominator", 1725571209);
        setField(term2495, term2495.getClass(), "toString", "sjlJAEtRrb");
        setField(term2495, term2495.getClass(), "toProperString", "MuLcgQHgqz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNumerator", argTypes, term43, args);
        assertTrue(recursiveEquals(term43, term2495));
        assertTrue(recursiveEquals(retValue, -1339778481));
    }

};


