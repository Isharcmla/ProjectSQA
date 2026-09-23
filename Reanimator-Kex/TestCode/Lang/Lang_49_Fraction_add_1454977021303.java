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

public class Fraction_add_1454977021303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79322;
     Object term79402;
     Object term79508;
     Object term79509;
     Object term79505;

    public Fraction_add_1454977021303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79322 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term79322, term79322.getClass(), "numerator", 1024);
        setIntField(term79322, term79322.getClass(), "denominator", 174764);
        term79402 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term79402, term79402.getClass(), "numerator", 8);
        setIntField(term79402, term79402.getClass(), "denominator", -262146);
        term79508 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term79508, term79508.getClass(), "numerator", 1024);
        setIntField(term79508, term79508.getClass(), "denominator", 174764);
        setField(term79508, term79508.getClass(), "toString", null);
        setField(term79508, term79508.getClass(), "toProperString", null);
        term79509 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term79509, term79509.getClass(), "numerator", 8);
        setIntField(term79509, term79509.getClass(), "denominator", -262146);
        setField(term79509, term79509.getClass(), "toString", null);
        setField(term79509, term79509.getClass(), "toProperString", null);
        term79505 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term79505, term79505.getClass(), "numerator", -1528);
        setIntField(term79505, term79505.getClass(), "denominator", -262146);
        setField(term79505, term79505.getClass(), "toString", null);
        setField(term79505, term79505.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term79402;
        Object retValue = callMethod(klass, "add", argTypes, term79322, args);
        assertTrue(recursiveEquals(term79322, term79508));
        assertTrue(recursiveEquals(term79402, term79509));
        assertTrue(recursiveEquals(retValue, term79505));
    }

};


