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

public class Fraction_reduce_3355035252640 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term787736;
     Object term788586;
     Object term788583;

    public Fraction_reduce_3355035252640() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term787736 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term787736, term787736.getClass(), "numerator", 280763626);
        setIntField(term787736, term787736.getClass(), "denominator", 115195929);
        term788586 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term788586, term788586.getClass(), "numerator", 280763626);
        setIntField(term788586, term788586.getClass(), "denominator", 115195929);
        setField(term788586, term788586.getClass(), "toString", null);
        setField(term788586, term788586.getClass(), "toProperString", null);
        term788583 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term788583, term788583.getClass(), "numerator", 280763626);
        setIntField(term788583, term788583.getClass(), "denominator", 115195929);
        setField(term788583, term788583.getClass(), "toString", null);
        setField(term788583, term788583.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term787736, args);
        assertTrue(recursiveEquals(term787736, term788586));
        assertTrue(recursiveEquals(retValue, term788583));
    }

};


