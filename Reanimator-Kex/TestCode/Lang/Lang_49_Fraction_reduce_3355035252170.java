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

public class Fraction_reduce_3355035252170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term640891;
     Object term641930;
     Object term641927;

    public Fraction_reduce_3355035252170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term640891 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term640891, term640891.getClass(), "numerator", 536871182);
        setIntField(term640891, term640891.getClass(), "denominator", 1871149039);
        term641930 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term641930, term641930.getClass(), "numerator", 536871182);
        setIntField(term641930, term641930.getClass(), "denominator", 1871149039);
        setField(term641930, term641930.getClass(), "toString", null);
        setField(term641930, term641930.getClass(), "toProperString", null);
        term641927 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term641927, term641927.getClass(), "numerator", 536871182);
        setIntField(term641927, term641927.getClass(), "denominator", 1871149039);
        setField(term641927, term641927.getClass(), "toString", null);
        setField(term641927, term641927.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term640891, args);
        assertTrue(recursiveEquals(term640891, term641930));
        assertTrue(recursiveEquals(retValue, term641927));
    }

};


