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

public class Fraction_reduce_5358591311869 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term610526;
     Object term611400;
     Object term611397;

    public Fraction_reduce_5358591311869() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term610526 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term610526, term610526.getClass(), "numerator", 536870866);
        setIntField(term610526, term610526.getClass(), "denominator", 1610612737);
        term611400 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term611400, term611400.getClass(), "numerator", 536870866);
        setIntField(term611400, term611400.getClass(), "denominator", 1610612737);
        setField(term611400, term611400.getClass(), "toString", null);
        setField(term611400, term611400.getClass(), "toProperString", null);
        term611397 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term611397, term611397.getClass(), "numerator", 536870866);
        setIntField(term611397, term611397.getClass(), "denominator", 1610612737);
        setField(term611397, term611397.getClass(), "toString", null);
        setField(term611397, term611397.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term610526, args);
        assertTrue(recursiveEquals(term610526, term611400));
        assertTrue(recursiveEquals(retValue, term611397));
    }

};


