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

public class Fraction_reduce_3355035252224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term656573;
     Object term656859;
     Object term656856;

    public Fraction_reduce_3355035252224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term656573 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term656573, term656573.getClass(), "numerator", 2006471682);
        setIntField(term656573, term656573.getClass(), "denominator", 805761725);
        term656859 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term656859, term656859.getClass(), "numerator", 2006471682);
        setIntField(term656859, term656859.getClass(), "denominator", 805761725);
        setField(term656859, term656859.getClass(), "toString", null);
        setField(term656859, term656859.getClass(), "toProperString", null);
        term656856 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term656856, term656856.getClass(), "numerator", 2006471682);
        setIntField(term656856, term656856.getClass(), "denominator", 805761725);
        setField(term656856, term656856.getClass(), "toString", null);
        setField(term656856, term656856.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term656573, args);
        assertTrue(recursiveEquals(term656573, term656859));
        assertTrue(recursiveEquals(retValue, term656856));
    }

};


