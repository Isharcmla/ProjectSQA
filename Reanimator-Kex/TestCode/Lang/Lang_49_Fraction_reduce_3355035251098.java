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

public class Fraction_reduce_3355035251098 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term317709;
     Object term318569;
     Object term318566;

    public Fraction_reduce_3355035251098() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term317709 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term317709, term317709.getClass(), "numerator", 1164947874);
        setIntField(term317709, term317709.getClass(), "denominator", 1342713833);
        term318569 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term318569, term318569.getClass(), "numerator", 1164947874);
        setIntField(term318569, term318569.getClass(), "denominator", 1342713833);
        setField(term318569, term318569.getClass(), "toString", null);
        setField(term318569, term318569.getClass(), "toProperString", null);
        term318566 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term318566, term318566.getClass(), "numerator", 1164947874);
        setIntField(term318566, term318566.getClass(), "denominator", 1342713833);
        setField(term318566, term318566.getClass(), "toString", null);
        setField(term318566, term318566.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term317709, args);
        assertTrue(recursiveEquals(term317709, term318569));
        assertTrue(recursiveEquals(retValue, term318566));
    }

};


