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

public class Fraction_reduce_335503525770 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214547;
     Object term215306;
     Object term215300;

    public Fraction_reduce_335503525770() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term214547 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term214547, term214547.getClass(), "numerator", -662050306);
        setIntField(term214547, term214547.getClass(), "denominator", 1073741824);
        term215306 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term215306, term215306.getClass(), "numerator", -662050306);
        setIntField(term215306, term215306.getClass(), "denominator", 1073741824);
        setField(term215306, term215306.getClass(), "toString", null);
        setField(term215306, term215306.getClass(), "toProperString", null);
        term215300 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term215300, term215300.getClass(), "numerator", -331025153);
        setIntField(term215300, term215300.getClass(), "denominator", 536870912);
        setField(term215300, term215300.getClass(), "toString", null);
        setField(term215300, term215300.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term214547, args);
        assertTrue(recursiveEquals(term214547, term215306));
        assertTrue(recursiveEquals(retValue, term215300));
    }

};


