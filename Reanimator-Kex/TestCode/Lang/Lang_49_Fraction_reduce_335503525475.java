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

public class Fraction_reduce_335503525475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131573;
     Object term131679;
     Object term131673;

    public Fraction_reduce_335503525475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131573 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term131573, term131573.getClass(), "numerator", -62768190);
        setIntField(term131573, term131573.getClass(), "denominator", 549480455);
        term131679 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term131679, term131679.getClass(), "numerator", -62768190);
        setIntField(term131679, term131679.getClass(), "denominator", 549480455);
        setField(term131679, term131679.getClass(), "toString", null);
        setField(term131679, term131679.getClass(), "toProperString", null);
        term131673 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term131673, term131673.getClass(), "numerator", -12553638);
        setIntField(term131673, term131673.getClass(), "denominator", 109896091);
        setField(term131673, term131673.getClass(), "toString", null);
        setField(term131673, term131673.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term131573, args);
        assertTrue(recursiveEquals(term131573, term131679));
        assertTrue(recursiveEquals(retValue, term131673));
    }

};


