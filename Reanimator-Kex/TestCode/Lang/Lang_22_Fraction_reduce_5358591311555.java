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

public class Fraction_reduce_5358591311555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term506092;
     Object term506592;
     Object term506586;

    public Fraction_reduce_5358591311555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term506092 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term506092, term506092.getClass(), "numerator", -352189150);
        setIntField(term506092, term506092.getClass(), "denominator", 2110822935);
        term506592 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term506592, term506592.getClass(), "numerator", -352189150);
        setIntField(term506592, term506592.getClass(), "denominator", 2110822935);
        setField(term506592, term506592.getClass(), "toString", null);
        setField(term506592, term506592.getClass(), "toProperString", null);
        term506586 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term506586, term506586.getClass(), "numerator", -70437830);
        setIntField(term506586, term506586.getClass(), "denominator", 422164587);
        setField(term506586, term506586.getClass(), "toString", null);
        setField(term506586, term506586.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term506092, args);
        assertTrue(recursiveEquals(term506092, term506592));
        assertTrue(recursiveEquals(retValue, term506586));
    }

};


