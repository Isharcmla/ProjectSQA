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

public class Fraction_multiplyBy_457422138275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74797;
     Object term74879;
     Object term75522;
     Object term75523;
     Object term75513;

    public Fraction_multiplyBy_457422138275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74797 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term74797, term74797.getClass(), "numerator", 1866465354);
        setIntField(term74797, term74797.getClass(), "denominator", 147800245);
        term74879 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term74879, term74879.getClass(), "numerator", 295600490);
        setIntField(term74879, term74879.getClass(), "denominator", 1621900185);
        term75522 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term75522, term75522.getClass(), "numerator", 1866465354);
        setIntField(term75522, term75522.getClass(), "denominator", 147800245);
        setField(term75522, term75522.getClass(), "toString", null);
        setField(term75522, term75522.getClass(), "toProperString", null);
        term75523 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term75523, term75523.getClass(), "numerator", 295600490);
        setIntField(term75523, term75523.getClass(), "denominator", 1621900185);
        setField(term75523, term75523.getClass(), "toString", null);
        setField(term75523, term75523.getClass(), "toProperString", null);
        term75513 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term75513, term75513.getClass(), "numerator", 1244310236);
        setIntField(term75513, term75513.getClass(), "denominator", 540633395);
        setField(term75513, term75513.getClass(), "toString", null);
        setField(term75513, term75513.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term74879;
        Object retValue = callMethod(klass, "multiplyBy", argTypes, term74797, args);
        assertTrue(recursiveEquals(term74797, term75522));
        assertTrue(recursiveEquals(term74879, term75523));
        assertTrue(recursiveEquals(retValue, term75513));
    }

};


