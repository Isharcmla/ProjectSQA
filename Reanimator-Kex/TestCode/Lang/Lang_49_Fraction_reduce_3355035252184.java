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

public class Fraction_reduce_3355035252184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term645197;
     Object term645662;
     Object term645659;

    public Fraction_reduce_3355035252184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term645197 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term645197, term645197.getClass(), "numerator", 534372206);
        setIntField(term645197, term645197.getClass(), "denominator", 536870927);
        term645662 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term645662, term645662.getClass(), "numerator", 534372206);
        setIntField(term645662, term645662.getClass(), "denominator", 536870927);
        setField(term645662, term645662.getClass(), "toString", null);
        setField(term645662, term645662.getClass(), "toProperString", null);
        term645659 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term645659, term645659.getClass(), "numerator", 534372206);
        setIntField(term645659, term645659.getClass(), "denominator", 536870927);
        setField(term645659, term645659.getClass(), "toString", null);
        setField(term645659, term645659.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term645197, args);
        assertTrue(recursiveEquals(term645197, term645662));
        assertTrue(recursiveEquals(retValue, term645659));
    }

};


