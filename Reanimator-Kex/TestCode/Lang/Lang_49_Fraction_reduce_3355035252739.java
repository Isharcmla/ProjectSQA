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

public class Fraction_reduce_3355035252739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term816443;
     Object term817051;
     Object term817048;

    public Fraction_reduce_3355035252739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term816443 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term816443, term816443.getClass(), "numerator", 549903610);
        setIntField(term816443, term816443.getClass(), "denominator", 1338285381);
        term817051 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term817051, term817051.getClass(), "numerator", 549903610);
        setIntField(term817051, term817051.getClass(), "denominator", 1338285381);
        setField(term817051, term817051.getClass(), "toString", null);
        setField(term817051, term817051.getClass(), "toProperString", null);
        term817048 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term817048, term817048.getClass(), "numerator", 549903610);
        setIntField(term817048, term817048.getClass(), "denominator", 1338285381);
        setField(term817048, term817048.getClass(), "toString", null);
        setField(term817048, term817048.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term816443, args);
        assertTrue(recursiveEquals(term816443, term817051));
        assertTrue(recursiveEquals(retValue, term817048));
    }

};


