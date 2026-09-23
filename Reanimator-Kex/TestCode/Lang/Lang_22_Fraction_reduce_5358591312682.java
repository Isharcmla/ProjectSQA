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

public class Fraction_reduce_5358591312682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term879614;
     Object term879907;
     Object term879904;

    public Fraction_reduce_5358591312682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term879614 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term879614, term879614.getClass(), "numerator", -408919878);
        setIntField(term879614, term879614.getClass(), "denominator", 1120573931);
        term879907 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term879907, term879907.getClass(), "numerator", -408919878);
        setIntField(term879907, term879907.getClass(), "denominator", 1120573931);
        setField(term879907, term879907.getClass(), "toString", null);
        setField(term879907, term879907.getClass(), "toProperString", null);
        term879904 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term879904, term879904.getClass(), "numerator", -408919878);
        setIntField(term879904, term879904.getClass(), "denominator", 1120573931);
        setField(term879904, term879904.getClass(), "toString", null);
        setField(term879904, term879904.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term879614, args);
        assertTrue(recursiveEquals(term879614, term879907));
        assertTrue(recursiveEquals(retValue, term879904));
    }

};


