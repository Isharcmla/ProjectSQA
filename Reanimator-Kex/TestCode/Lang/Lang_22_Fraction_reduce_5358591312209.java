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

public class Fraction_reduce_5358591312209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term719349;
     Object term719847;
     Object term719844;

    public Fraction_reduce_5358591312209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term719349 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term719349, term719349.getClass(), "numerator", 1342865454);
        setIntField(term719349, term719349.getClass(), "denominator", 736493503);
        term719847 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term719847, term719847.getClass(), "numerator", 1342865454);
        setIntField(term719847, term719847.getClass(), "denominator", 736493503);
        setField(term719847, term719847.getClass(), "toString", null);
        setField(term719847, term719847.getClass(), "toProperString", null);
        term719844 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term719844, term719844.getClass(), "numerator", 1342865454);
        setIntField(term719844, term719844.getClass(), "denominator", 736493503);
        setField(term719844, term719844.getClass(), "toString", null);
        setField(term719844, term719844.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term719349, args);
        assertTrue(recursiveEquals(term719349, term719847));
        assertTrue(recursiveEquals(retValue, term719844));
    }

};


