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

public class Fraction_reduce_3355035252652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term791173;
     Object term791782;
     Object term791779;

    public Fraction_reduce_3355035252652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term791173 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term791173, term791173.getClass(), "numerator", -930621046);
        setIntField(term791173, term791173.getClass(), "denominator", 1778553059);
        term791782 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term791782, term791782.getClass(), "numerator", -930621046);
        setIntField(term791782, term791782.getClass(), "denominator", 1778553059);
        setField(term791782, term791782.getClass(), "toString", null);
        setField(term791782, term791782.getClass(), "toProperString", null);
        term791779 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term791779, term791779.getClass(), "numerator", -930621046);
        setIntField(term791779, term791779.getClass(), "denominator", 1778553059);
        setField(term791779, term791779.getClass(), "toString", null);
        setField(term791779, term791779.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term791173, args);
        assertTrue(recursiveEquals(term791173, term791782));
        assertTrue(recursiveEquals(retValue, term791779));
    }

};


