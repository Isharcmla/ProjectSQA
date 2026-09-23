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

public class Fraction_reduce_535859131191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46499;
     Object term47366;
     Object term47363;

    public Fraction_reduce_535859131191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46499 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term46499, term46499.getClass(), "numerator", -97580018);
        setIntField(term46499, term46499.getClass(), "denominator", 1004112497);
        term47366 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term47366, term47366.getClass(), "numerator", -97580018);
        setIntField(term47366, term47366.getClass(), "denominator", 1004112497);
        setField(term47366, term47366.getClass(), "toString", null);
        setField(term47366, term47366.getClass(), "toProperString", null);
        term47363 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term47363, term47363.getClass(), "numerator", -97580018);
        setIntField(term47363, term47363.getClass(), "denominator", 1004112497);
        setField(term47363, term47363.getClass(), "toString", null);
        setField(term47363, term47363.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term46499, args);
        assertTrue(recursiveEquals(term46499, term47366));
        assertTrue(recursiveEquals(retValue, term47363));
    }

};


