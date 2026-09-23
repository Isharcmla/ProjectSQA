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

public class Fraction_reduce_335503525264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65922;
     Object term66404;
     Object term66401;

    public Fraction_reduce_335503525264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65922 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term65922, term65922.getClass(), "numerator", -122406);
        setIntField(term65922, term65922.getClass(), "denominator", 1073737483);
        term66404 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term66404, term66404.getClass(), "numerator", -122406);
        setIntField(term66404, term66404.getClass(), "denominator", 1073737483);
        setField(term66404, term66404.getClass(), "toString", null);
        setField(term66404, term66404.getClass(), "toProperString", null);
        term66401 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term66401, term66401.getClass(), "numerator", -122406);
        setIntField(term66401, term66401.getClass(), "denominator", 1073737483);
        setField(term66401, term66401.getClass(), "toString", null);
        setField(term66401, term66401.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term65922, args);
        assertTrue(recursiveEquals(term65922, term66404));
        assertTrue(recursiveEquals(retValue, term66401));
    }

};


