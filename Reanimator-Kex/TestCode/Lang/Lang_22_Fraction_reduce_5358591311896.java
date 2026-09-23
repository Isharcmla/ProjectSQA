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

public class Fraction_reduce_5358591311896 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term618897;
     Object term619736;
     Object term619733;

    public Fraction_reduce_5358591311896() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term618897 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term618897, term618897.getClass(), "numerator", -1073215486);
        setIntField(term618897, term618897.getClass(), "denominator", 981465063);
        term619736 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term619736, term619736.getClass(), "numerator", -1073215486);
        setIntField(term619736, term619736.getClass(), "denominator", 981465063);
        setField(term619736, term619736.getClass(), "toString", null);
        setField(term619736, term619736.getClass(), "toProperString", null);
        term619733 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term619733, term619733.getClass(), "numerator", -1073215486);
        setIntField(term619733, term619733.getClass(), "denominator", 981465063);
        setField(term619733, term619733.getClass(), "toString", null);
        setField(term619733, term619733.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term618897, args);
        assertTrue(recursiveEquals(term618897, term619736));
        assertTrue(recursiveEquals(retValue, term619733));
    }

};


