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

public class Fraction_reduce_335503525858 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243201;
     Object term243603;
     Object term243600;

    public Fraction_reduce_335503525858() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term243201 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term243201, term243201.getClass(), "numerator", -2021918378);
        setIntField(term243201, term243201.getClass(), "denominator", 1178713101);
        term243603 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term243603, term243603.getClass(), "numerator", -2021918378);
        setIntField(term243603, term243603.getClass(), "denominator", 1178713101);
        setField(term243603, term243603.getClass(), "toString", null);
        setField(term243603, term243603.getClass(), "toProperString", null);
        term243600 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term243600, term243600.getClass(), "numerator", -2021918378);
        setIntField(term243600, term243600.getClass(), "denominator", 1178713101);
        setField(term243600, term243600.getClass(), "toString", null);
        setField(term243600, term243600.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term243201, args);
        assertTrue(recursiveEquals(term243201, term243603));
        assertTrue(recursiveEquals(retValue, term243600));
    }

};


