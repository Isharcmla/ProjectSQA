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

public class Fraction_reduce_5358591311963 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term640492;
     Object term641361;
     Object term641358;

    public Fraction_reduce_5358591311963() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term640492 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term640492, term640492.getClass(), "numerator", -1054785146);
        setIntField(term640492, term640492.getClass(), "denominator", 655467877);
        term641361 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term641361, term641361.getClass(), "numerator", -1054785146);
        setIntField(term641361, term641361.getClass(), "denominator", 655467877);
        setField(term641361, term641361.getClass(), "toString", null);
        setField(term641361, term641361.getClass(), "toProperString", null);
        term641358 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term641358, term641358.getClass(), "numerator", -1054785146);
        setIntField(term641358, term641358.getClass(), "denominator", 655467877);
        setField(term641358, term641358.getClass(), "toString", null);
        setField(term641358, term641358.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term640492, args);
        assertTrue(recursiveEquals(term640492, term641361));
        assertTrue(recursiveEquals(retValue, term641358));
    }

};


