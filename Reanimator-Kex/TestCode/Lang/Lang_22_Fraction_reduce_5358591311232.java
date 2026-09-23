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

public class Fraction_reduce_5358591311232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term398741;
     Object term399376;
     Object term399370;

    public Fraction_reduce_5358591311232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term398741 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term398741, term398741.getClass(), "numerator", 1275093906);
        setIntField(term398741, term398741.getClass(), "denominator", 1760573025);
        term399376 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term399376, term399376.getClass(), "numerator", 1275093906);
        setIntField(term399376, term399376.getClass(), "denominator", 1760573025);
        setField(term399376, term399376.getClass(), "toString", null);
        setField(term399376, term399376.getClass(), "toProperString", null);
        term399370 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term399370, term399370.getClass(), "numerator", 425031302);
        setIntField(term399370, term399370.getClass(), "denominator", 586857675);
        setField(term399370, term399370.getClass(), "toString", null);
        setField(term399370, term399370.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term398741, args);
        assertTrue(recursiveEquals(term398741, term399376));
        assertTrue(recursiveEquals(retValue, term399370));
    }

};


