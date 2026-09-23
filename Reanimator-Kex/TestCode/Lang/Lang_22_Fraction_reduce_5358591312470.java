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

public class Fraction_reduce_5358591312470 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term809007;
     Object term809400;
     Object term809397;

    public Fraction_reduce_5358591312470() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term809007 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term809007, term809007.getClass(), "numerator", 1398839338);
        setIntField(term809007, term809007.getClass(), "denominator", 738302205);
        term809400 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term809400, term809400.getClass(), "numerator", 1398839338);
        setIntField(term809400, term809400.getClass(), "denominator", 738302205);
        setField(term809400, term809400.getClass(), "toString", null);
        setField(term809400, term809400.getClass(), "toProperString", null);
        term809397 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term809397, term809397.getClass(), "numerator", 1398839338);
        setIntField(term809397, term809397.getClass(), "denominator", 738302205);
        setField(term809397, term809397.getClass(), "toString", null);
        setField(term809397, term809397.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term809007, args);
        assertTrue(recursiveEquals(term809007, term809400));
        assertTrue(recursiveEquals(retValue, term809397));
    }

};


