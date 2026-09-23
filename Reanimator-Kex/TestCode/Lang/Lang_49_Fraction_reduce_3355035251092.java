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

public class Fraction_reduce_3355035251092 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315550;
     Object term316511;
     Object term316508;

    public Fraction_reduce_3355035251092() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term315550 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term315550, term315550.getClass(), "numerator", -1023814174);
        setIntField(term315550, term315550.getClass(), "denominator", 2011171527);
        term316511 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term316511, term316511.getClass(), "numerator", -1023814174);
        setIntField(term316511, term316511.getClass(), "denominator", 2011171527);
        setField(term316511, term316511.getClass(), "toString", null);
        setField(term316511, term316511.getClass(), "toProperString", null);
        term316508 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term316508, term316508.getClass(), "numerator", -1023814174);
        setIntField(term316508, term316508.getClass(), "denominator", 2011171527);
        setField(term316508, term316508.getClass(), "toString", null);
        setField(term316508, term316508.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term315550, args);
        assertTrue(recursiveEquals(term315550, term316511));
        assertTrue(recursiveEquals(retValue, term316508));
    }

};


