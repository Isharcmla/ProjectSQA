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

public class Fraction_abs_119362782551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term560;
     Object term3435;
     Object term3432;

    public Fraction_abs_119362782551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term560 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term560, term560.getClass(), "numerator", -602026508);
        setIntField(term560, term560.getClass(), "denominator", -157887805);
        setField(term560, term560.getClass(), "toString", "eZFUvlxvGV");
        setField(term560, term560.getClass(), "toProperString", "BYqFIqCKAV");
        term3435 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term3435, term3435.getClass(), "numerator", -602026508);
        setIntField(term3435, term3435.getClass(), "denominator", -157887805);
        setField(term3435, term3435.getClass(), "toString", "eZFUvlxvGV");
        setField(term3435, term3435.getClass(), "toProperString", "BYqFIqCKAV");
        term3432 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term3432, term3432.getClass(), "numerator", 602026508);
        setIntField(term3432, term3432.getClass(), "denominator", -157887805);
        setField(term3432, term3432.getClass(), "toString", null);
        setField(term3432, term3432.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "abs", argTypes, term560, args);
        assertTrue(recursiveEquals(term560, term3435));
        assertTrue(recursiveEquals(retValue, term3432));
    }

};


