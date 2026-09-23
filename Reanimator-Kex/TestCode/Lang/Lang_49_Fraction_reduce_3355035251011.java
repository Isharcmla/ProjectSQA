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

public class Fraction_reduce_3355035251011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290826;
     Object term291035;
     Object term291032;

    public Fraction_reduce_3355035251011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290826 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term290826, term290826.getClass(), "numerator", 295813950);
        setIntField(term290826, term290826.getClass(), "denominator", 726276151);
        term291035 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term291035, term291035.getClass(), "numerator", 295813950);
        setIntField(term291035, term291035.getClass(), "denominator", 726276151);
        setField(term291035, term291035.getClass(), "toString", null);
        setField(term291035, term291035.getClass(), "toProperString", null);
        term291032 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term291032, term291032.getClass(), "numerator", 295813950);
        setIntField(term291032, term291032.getClass(), "denominator", 726276151);
        setField(term291032, term291032.getClass(), "toString", null);
        setField(term291032, term291032.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term290826, args);
        assertTrue(recursiveEquals(term290826, term291035));
        assertTrue(recursiveEquals(retValue, term291032));
    }

};


