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

public class Fraction_reduce_3355035252500 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term744969;
     Object term745407;
     Object term745401;

    public Fraction_reduce_3355035252500() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term744969 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term744969, term744969.getClass(), "numerator", -478013418);
        setIntField(term744969, term744969.getClass(), "denominator", 1346373261);
        term745407 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term745407, term745407.getClass(), "numerator", -478013418);
        setIntField(term745407, term745407.getClass(), "denominator", 1346373261);
        setField(term745407, term745407.getClass(), "toString", null);
        setField(term745407, term745407.getClass(), "toProperString", null);
        term745401 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term745401, term745401.getClass(), "numerator", -53112602);
        setIntField(term745401, term745401.getClass(), "denominator", 149597029);
        setField(term745401, term745401.getClass(), "toString", null);
        setField(term745401, term745401.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term744969, args);
        assertTrue(recursiveEquals(term744969, term745407));
        assertTrue(recursiveEquals(retValue, term745401));
    }

};


