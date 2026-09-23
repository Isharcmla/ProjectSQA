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

public class Fraction_reduce_5358591311677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term544174;
     Object term545202;
     Object term545199;

    public Fraction_reduce_5358591311677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term544174 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term544174, term544174.getClass(), "numerator", 960856274);
        setIntField(term544174, term544174.getClass(), "denominator", 705891777);
        term545202 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term545202, term545202.getClass(), "numerator", 960856274);
        setIntField(term545202, term545202.getClass(), "denominator", 705891777);
        setField(term545202, term545202.getClass(), "toString", null);
        setField(term545202, term545202.getClass(), "toProperString", null);
        term545199 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term545199, term545199.getClass(), "numerator", 960856274);
        setIntField(term545199, term545199.getClass(), "denominator", 705891777);
        setField(term545199, term545199.getClass(), "toString", null);
        setField(term545199, term545199.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term544174, args);
        assertTrue(recursiveEquals(term544174, term545202));
        assertTrue(recursiveEquals(retValue, term545199));
    }

};


