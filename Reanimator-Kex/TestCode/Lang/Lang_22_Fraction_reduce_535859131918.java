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

public class Fraction_reduce_535859131918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292665;
     Object term293224;
     Object term293221;

    public Fraction_reduce_535859131918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term292665 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term292665, term292665.getClass(), "numerator", 1614557698);
        setIntField(term292665, term292665.getClass(), "denominator", 809507353);
        term293224 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term293224, term293224.getClass(), "numerator", 1614557698);
        setIntField(term293224, term293224.getClass(), "denominator", 809507353);
        setField(term293224, term293224.getClass(), "toString", null);
        setField(term293224, term293224.getClass(), "toProperString", null);
        term293221 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term293221, term293221.getClass(), "numerator", 1614557698);
        setIntField(term293221, term293221.getClass(), "denominator", 809507353);
        setField(term293221, term293221.getClass(), "toString", null);
        setField(term293221, term293221.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term292665, args);
        assertTrue(recursiveEquals(term292665, term293224));
        assertTrue(recursiveEquals(retValue, term293221));
    }

};


