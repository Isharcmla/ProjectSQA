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

public class Fraction_reduce_5358591312606 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term853862;
     Object term854838;
     Object term854835;

    public Fraction_reduce_5358591312606() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term853862 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term853862, term853862.getClass(), "numerator", 536870866);
        setIntField(term853862, term853862.getClass(), "denominator", 1610612737);
        term854838 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term854838, term854838.getClass(), "numerator", 536870866);
        setIntField(term854838, term854838.getClass(), "denominator", 1610612737);
        setField(term854838, term854838.getClass(), "toString", null);
        setField(term854838, term854838.getClass(), "toProperString", null);
        term854835 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term854835, term854835.getClass(), "numerator", 536870866);
        setIntField(term854835, term854835.getClass(), "denominator", 1610612737);
        setField(term854835, term854835.getClass(), "toString", null);
        setField(term854835, term854835.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term853862, args);
        assertTrue(recursiveEquals(term853862, term854838));
        assertTrue(recursiveEquals(retValue, term854835));
    }

};


