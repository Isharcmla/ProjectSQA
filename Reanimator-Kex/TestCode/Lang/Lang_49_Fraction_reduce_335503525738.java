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

public class Fraction_reduce_335503525738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206547;
     Object term206778;
     Object term206772;

    public Fraction_reduce_335503525738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206547 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term206547, term206547.getClass(), "numerator", 142614722);
        setIntField(term206547, term206547.getClass(), "denominator", 1547702361);
        term206778 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term206778, term206778.getClass(), "numerator", 142614722);
        setIntField(term206778, term206778.getClass(), "denominator", 1547702361);
        setField(term206778, term206778.getClass(), "toString", null);
        setField(term206778, term206778.getClass(), "toProperString", null);
        term206772 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term206772, term206772.getClass(), "numerator", 7506038);
        setIntField(term206772, term206772.getClass(), "denominator", 81458019);
        setField(term206772, term206772.getClass(), "toString", null);
        setField(term206772, term206772.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term206547, args);
        assertTrue(recursiveEquals(term206547, term206778));
        assertTrue(recursiveEquals(retValue, term206772));
    }

};


