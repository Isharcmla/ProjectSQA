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

public class Fraction_reduce_3355035252530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term754067;
     Object term755025;
     Object term755022;

    public Fraction_reduce_3355035252530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term754067 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term754067, term754067.getClass(), "numerator", 2117874170);
        setIntField(term754067, term754067.getClass(), "denominator", 1101347589);
        term755025 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term755025, term755025.getClass(), "numerator", 2117874170);
        setIntField(term755025, term755025.getClass(), "denominator", 1101347589);
        setField(term755025, term755025.getClass(), "toString", null);
        setField(term755025, term755025.getClass(), "toProperString", null);
        term755022 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term755022, term755022.getClass(), "numerator", 2117874170);
        setIntField(term755022, term755022.getClass(), "denominator", 1101347589);
        setField(term755022, term755022.getClass(), "toString", null);
        setField(term755022, term755022.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term754067, args);
        assertTrue(recursiveEquals(term754067, term755025));
        assertTrue(recursiveEquals(retValue, term755022));
    }

};


