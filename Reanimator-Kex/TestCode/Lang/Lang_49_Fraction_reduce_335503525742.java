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

public class Fraction_reduce_335503525742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206921;
     Object term207312;
     Object term207306;

    public Fraction_reduce_335503525742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206921 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term206921, term206921.getClass(), "numerator", -118857806);
        setIntField(term206921, term206921.getClass(), "denominator", 416002321);
        term207312 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term207312, term207312.getClass(), "numerator", -118857806);
        setIntField(term207312, term207312.getClass(), "denominator", 416002321);
        setField(term207312, term207312.getClass(), "toString", null);
        setField(term207312, term207312.getClass(), "toProperString", null);
        term207306 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term207306, term207306.getClass(), "numerator", -2);
        setIntField(term207306, term207306.getClass(), "denominator", 7);
        setField(term207306, term207306.getClass(), "toString", null);
        setField(term207306, term207306.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term206921, args);
        assertTrue(recursiveEquals(term206921, term207312));
        assertTrue(recursiveEquals(retValue, term207306));
    }

};


