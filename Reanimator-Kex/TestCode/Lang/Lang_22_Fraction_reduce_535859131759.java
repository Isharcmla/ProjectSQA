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

public class Fraction_reduce_535859131759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239566;
     Object term239887;
     Object term239884;

    public Fraction_reduce_535859131759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term239566 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term239566, term239566.getClass(), "numerator", -620685842);
        setIntField(term239566, term239566.getClass(), "denominator", 2121799329);
        term239887 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term239887, term239887.getClass(), "numerator", -620685842);
        setIntField(term239887, term239887.getClass(), "denominator", 2121799329);
        setField(term239887, term239887.getClass(), "toString", null);
        setField(term239887, term239887.getClass(), "toProperString", null);
        term239884 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term239884, term239884.getClass(), "numerator", -620685842);
        setIntField(term239884, term239884.getClass(), "denominator", 2121799329);
        setField(term239884, term239884.getClass(), "toString", null);
        setField(term239884, term239884.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term239566, args);
        assertTrue(recursiveEquals(term239566, term239887));
        assertTrue(recursiveEquals(retValue, term239884));
    }

};


