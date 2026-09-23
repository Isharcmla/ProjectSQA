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

public class Fraction_reduce_3355035251013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291315;
     Object term291412;
     Object term291409;

    public Fraction_reduce_3355035251013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291315 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term291315, term291315.getClass(), "numerator", 204066650);
        setIntField(term291315, term291315.getClass(), "denominator", 378175509);
        term291412 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term291412, term291412.getClass(), "numerator", 204066650);
        setIntField(term291412, term291412.getClass(), "denominator", 378175509);
        setField(term291412, term291412.getClass(), "toString", null);
        setField(term291412, term291412.getClass(), "toProperString", null);
        term291409 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term291409, term291409.getClass(), "numerator", 204066650);
        setIntField(term291409, term291409.getClass(), "denominator", 378175509);
        setField(term291409, term291409.getClass(), "toString", null);
        setField(term291409, term291409.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term291315, args);
        assertTrue(recursiveEquals(term291315, term291412));
        assertTrue(recursiveEquals(retValue, term291409));
    }

};


