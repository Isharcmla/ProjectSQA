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

public class Fraction_reduce_535859131950 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term304002;
     Object term304487;
     Object term304484;

    public Fraction_reduce_535859131950() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term304002 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term304002, term304002.getClass(), "numerator", -393756394);
        setIntField(term304002, term304002.getClass(), "denominator", 543154413);
        term304487 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term304487, term304487.getClass(), "numerator", -393756394);
        setIntField(term304487, term304487.getClass(), "denominator", 543154413);
        setField(term304487, term304487.getClass(), "toString", null);
        setField(term304487, term304487.getClass(), "toProperString", null);
        term304484 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term304484, term304484.getClass(), "numerator", -393756394);
        setIntField(term304484, term304484.getClass(), "denominator", 543154413);
        setField(term304484, term304484.getClass(), "toString", null);
        setField(term304484, term304484.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term304002, args);
        assertTrue(recursiveEquals(term304002, term304487));
        assertTrue(recursiveEquals(retValue, term304484));
    }

};


