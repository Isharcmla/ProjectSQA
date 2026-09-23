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

public class Fraction_reduce_3355035251197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term348878;
     Object term349365;
     Object term349362;

    public Fraction_reduce_3355035251197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term348878 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term348878, term348878.getClass(), "numerator", -1107260761);
        setIntField(term348878, term348878.getClass(), "denominator", 1073741824);
        term349365 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term349365, term349365.getClass(), "numerator", -1107260761);
        setIntField(term349365, term349365.getClass(), "denominator", 1073741824);
        setField(term349365, term349365.getClass(), "toString", null);
        setField(term349365, term349365.getClass(), "toProperString", null);
        term349362 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term349362, term349362.getClass(), "numerator", -1107260761);
        setIntField(term349362, term349362.getClass(), "denominator", 1073741824);
        setField(term349362, term349362.getClass(), "toString", null);
        setField(term349362, term349362.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term348878, args);
        assertTrue(recursiveEquals(term348878, term349365));
        assertTrue(recursiveEquals(retValue, term349362));
    }

};


