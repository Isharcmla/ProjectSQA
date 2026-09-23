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

public class Fraction_reduce_535859131913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291006;
     Object term291812;
     Object term291809;

    public Fraction_reduce_535859131913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291006 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term291006, term291006.getClass(), "numerator", 141658830);
        setIntField(term291006, term291006.getClass(), "denominator", 1132552831);
        term291812 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term291812, term291812.getClass(), "numerator", 141658830);
        setIntField(term291812, term291812.getClass(), "denominator", 1132552831);
        setField(term291812, term291812.getClass(), "toString", null);
        setField(term291812, term291812.getClass(), "toProperString", null);
        term291809 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term291809, term291809.getClass(), "numerator", 141658830);
        setIntField(term291809, term291809.getClass(), "denominator", 1132552831);
        setField(term291809, term291809.getClass(), "toString", null);
        setField(term291809, term291809.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term291006, args);
        assertTrue(recursiveEquals(term291006, term291812));
        assertTrue(recursiveEquals(retValue, term291809));
    }

};


