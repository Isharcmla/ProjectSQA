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

public class Fraction_reduce_5358591311816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term592103;
     Object term592677;
     Object term592674;

    public Fraction_reduce_5358591311816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term592103 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term592103, term592103.getClass(), "numerator", -2134759362);
        setIntField(term592103, term592103.getClass(), "denominator", 1812223321);
        term592677 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term592677, term592677.getClass(), "numerator", -2134759362);
        setIntField(term592677, term592677.getClass(), "denominator", 1812223321);
        setField(term592677, term592677.getClass(), "toString", null);
        setField(term592677, term592677.getClass(), "toProperString", null);
        term592674 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term592674, term592674.getClass(), "numerator", -2134759362);
        setIntField(term592674, term592674.getClass(), "denominator", 1812223321);
        setField(term592674, term592674.getClass(), "toString", null);
        setField(term592674, term592674.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term592103, args);
        assertTrue(recursiveEquals(term592103, term592677));
        assertTrue(recursiveEquals(retValue, term592674));
    }

};


