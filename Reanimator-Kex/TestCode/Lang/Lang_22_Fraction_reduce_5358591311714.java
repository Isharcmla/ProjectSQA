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

public class Fraction_reduce_5358591311714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term555786;
     Object term556321;
     Object term556318;

    public Fraction_reduce_5358591311714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term555786 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term555786, term555786.getClass(), "numerator", -1633631154);
        setIntField(term555786, term555786.getClass(), "denominator", 1215299857);
        term556321 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term556321, term556321.getClass(), "numerator", -1633631154);
        setIntField(term556321, term556321.getClass(), "denominator", 1215299857);
        setField(term556321, term556321.getClass(), "toString", null);
        setField(term556321, term556321.getClass(), "toProperString", null);
        term556318 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term556318, term556318.getClass(), "numerator", -1633631154);
        setIntField(term556318, term556318.getClass(), "denominator", 1215299857);
        setField(term556318, term556318.getClass(), "toString", null);
        setField(term556318, term556318.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term555786, args);
        assertTrue(recursiveEquals(term555786, term556321));
        assertTrue(recursiveEquals(retValue, term556318));
    }

};


