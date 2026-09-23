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

public class Fraction_reduce_5358591312005 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term653529;
     Object term653743;
     Object term653740;

    public Fraction_reduce_5358591312005() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term653529 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term653529, term653529.getClass(), "numerator", -704231038);
        setIntField(term653529, term653529.getClass(), "denominator", 354443335);
        term653743 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term653743, term653743.getClass(), "numerator", -704231038);
        setIntField(term653743, term653743.getClass(), "denominator", 354443335);
        setField(term653743, term653743.getClass(), "toString", null);
        setField(term653743, term653743.getClass(), "toProperString", null);
        term653740 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term653740, term653740.getClass(), "numerator", -704231038);
        setIntField(term653740, term653740.getClass(), "denominator", 354443335);
        setField(term653740, term653740.getClass(), "toString", null);
        setField(term653740, term653740.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term653529, args);
        assertTrue(recursiveEquals(term653529, term653743));
        assertTrue(recursiveEquals(retValue, term653740));
    }

};


