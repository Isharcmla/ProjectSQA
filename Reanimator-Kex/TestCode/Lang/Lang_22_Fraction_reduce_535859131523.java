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

public class Fraction_reduce_535859131523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159507;
     Object term160727;
     Object term160724;

    public Fraction_reduce_535859131523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159507 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term159507, term159507.getClass(), "numerator", 1342177234);
        setIntField(term159507, term159507.getClass(), "denominator", 1879048193);
        term160727 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term160727, term160727.getClass(), "numerator", 1342177234);
        setIntField(term160727, term160727.getClass(), "denominator", 1879048193);
        setField(term160727, term160727.getClass(), "toString", null);
        setField(term160727, term160727.getClass(), "toProperString", null);
        term160724 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term160724, term160724.getClass(), "numerator", 1342177234);
        setIntField(term160724, term160724.getClass(), "denominator", 1879048193);
        setField(term160724, term160724.getClass(), "toString", null);
        setField(term160724, term160724.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term159507, args);
        assertTrue(recursiveEquals(term159507, term160727));
        assertTrue(recursiveEquals(retValue, term160724));
    }

};


