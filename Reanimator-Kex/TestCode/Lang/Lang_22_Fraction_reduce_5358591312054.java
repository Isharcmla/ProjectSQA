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

public class Fraction_reduce_5358591312054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term669005;
     Object term669553;
     Object term669550;

    public Fraction_reduce_5358591312054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term669005 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term669005, term669005.getClass(), "numerator", 1342177234);
        setIntField(term669005, term669005.getClass(), "denominator", 1879048193);
        term669553 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term669553, term669553.getClass(), "numerator", 1342177234);
        setIntField(term669553, term669553.getClass(), "denominator", 1879048193);
        setField(term669553, term669553.getClass(), "toString", null);
        setField(term669553, term669553.getClass(), "toProperString", null);
        term669550 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term669550, term669550.getClass(), "numerator", 1342177234);
        setIntField(term669550, term669550.getClass(), "denominator", 1879048193);
        setField(term669550, term669550.getClass(), "toString", null);
        setField(term669550, term669550.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term669005, args);
        assertTrue(recursiveEquals(term669005, term669553));
        assertTrue(recursiveEquals(retValue, term669550));
    }

};


