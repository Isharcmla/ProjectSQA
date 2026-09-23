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

public class Fraction_reduce_535859131260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69439;
     Object term70064;
     Object term70061;

    public Fraction_reduce_535859131260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69439 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term69439, term69439.getClass(), "numerator", -190642554);
        setIntField(term69439, term69439.getClass(), "denominator", 777881701);
        term70064 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term70064, term70064.getClass(), "numerator", -190642554);
        setIntField(term70064, term70064.getClass(), "denominator", 777881701);
        setField(term70064, term70064.getClass(), "toString", null);
        setField(term70064, term70064.getClass(), "toProperString", null);
        term70061 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term70061, term70061.getClass(), "numerator", -190642554);
        setIntField(term70061, term70061.getClass(), "denominator", 777881701);
        setField(term70061, term70061.getClass(), "toString", null);
        setField(term70061, term70061.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term69439, args);
        assertTrue(recursiveEquals(term69439, term70064));
        assertTrue(recursiveEquals(retValue, term70061));
    }

};


