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

public class Fraction_reduce_335503525831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234337;
     Object term235677;
     Object term235674;

    public Fraction_reduce_335503525831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term234337 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term234337, term234337.getClass(), "numerator", 407110338);
        setIntField(term234337, term234337.getClass(), "denominator", 1763833177);
        term235677 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term235677, term235677.getClass(), "numerator", 407110338);
        setIntField(term235677, term235677.getClass(), "denominator", 1763833177);
        setField(term235677, term235677.getClass(), "toString", null);
        setField(term235677, term235677.getClass(), "toProperString", null);
        term235674 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term235674, term235674.getClass(), "numerator", 407110338);
        setIntField(term235674, term235674.getClass(), "denominator", 1763833177);
        setField(term235674, term235674.getClass(), "toString", null);
        setField(term235674, term235674.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term234337, args);
        assertTrue(recursiveEquals(term234337, term235677));
        assertTrue(recursiveEquals(retValue, term235674));
    }

};


