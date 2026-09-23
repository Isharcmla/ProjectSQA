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

public class Fraction_reduce_335503525655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181682;
     Object term182787;
     Object term182784;

    public Fraction_reduce_335503525655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181682 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term181682, term181682.getClass(), "numerator", 1476395058);
        setIntField(term181682, term181682.getClass(), "denominator", 1073807393);
        term182787 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term182787, term182787.getClass(), "numerator", 1476395058);
        setIntField(term182787, term182787.getClass(), "denominator", 1073807393);
        setField(term182787, term182787.getClass(), "toString", null);
        setField(term182787, term182787.getClass(), "toProperString", null);
        term182784 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term182784, term182784.getClass(), "numerator", 1476395058);
        setIntField(term182784, term182784.getClass(), "denominator", 1073807393);
        setField(term182784, term182784.getClass(), "toString", null);
        setField(term182784, term182784.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term181682, args);
        assertTrue(recursiveEquals(term181682, term182787));
        assertTrue(recursiveEquals(retValue, term182784));
    }

};


