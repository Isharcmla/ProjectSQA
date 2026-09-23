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

public class Fraction_reduce_3355035251844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term540175;
     Object term541228;
     Object term541225;

    public Fraction_reduce_3355035251844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term540175 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term540175, term540175.getClass(), "numerator", 847262498);
        setIntField(term540175, term540175.getClass(), "denominator", 150342857);
        term541228 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term541228, term541228.getClass(), "numerator", 847262498);
        setIntField(term541228, term541228.getClass(), "denominator", 150342857);
        setField(term541228, term541228.getClass(), "toString", null);
        setField(term541228, term541228.getClass(), "toProperString", null);
        term541225 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term541225, term541225.getClass(), "numerator", 847262498);
        setIntField(term541225, term541225.getClass(), "denominator", 150342857);
        setField(term541225, term541225.getClass(), "toString", null);
        setField(term541225, term541225.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term540175, args);
        assertTrue(recursiveEquals(term540175, term541228));
        assertTrue(recursiveEquals(retValue, term541225));
    }

};


