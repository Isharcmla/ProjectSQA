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

public class Fraction_reduce_3355035252619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term781403;
     Object term782019;
     Object term782016;

    public Fraction_reduce_3355035252619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term781403 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term781403, term781403.getClass(), "numerator", 1342177234);
        setIntField(term781403, term781403.getClass(), "denominator", 1879048193);
        term782019 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term782019, term782019.getClass(), "numerator", 1342177234);
        setIntField(term782019, term782019.getClass(), "denominator", 1879048193);
        setField(term782019, term782019.getClass(), "toString", null);
        setField(term782019, term782019.getClass(), "toProperString", null);
        term782016 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term782016, term782016.getClass(), "numerator", 1342177234);
        setIntField(term782016, term782016.getClass(), "denominator", 1879048193);
        setField(term782016, term782016.getClass(), "toString", null);
        setField(term782016, term782016.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term781403, args);
        assertTrue(recursiveEquals(term781403, term782019));
        assertTrue(recursiveEquals(retValue, term782016));
    }

};


