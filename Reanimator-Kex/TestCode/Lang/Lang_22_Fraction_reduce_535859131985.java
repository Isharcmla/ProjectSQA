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

public class Fraction_reduce_535859131985 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315339;
     Object term316265;
     Object term316262;

    public Fraction_reduce_535859131985() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term315339 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term315339, term315339.getClass(), "numerator", 680821394);
        setIntField(term315339, term315339.getClass(), "denominator", 1545883697);
        term316265 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term316265, term316265.getClass(), "numerator", 680821394);
        setIntField(term316265, term316265.getClass(), "denominator", 1545883697);
        setField(term316265, term316265.getClass(), "toString", null);
        setField(term316265, term316265.getClass(), "toProperString", null);
        term316262 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term316262, term316262.getClass(), "numerator", 680821394);
        setIntField(term316262, term316262.getClass(), "denominator", 1545883697);
        setField(term316262, term316262.getClass(), "toString", null);
        setField(term316262, term316262.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term315339, args);
        assertTrue(recursiveEquals(term315339, term316265));
        assertTrue(recursiveEquals(retValue, term316262));
    }

};


