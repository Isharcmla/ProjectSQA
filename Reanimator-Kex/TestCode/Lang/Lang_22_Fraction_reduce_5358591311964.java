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

public class Fraction_reduce_5358591311964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term640840;
     Object term641468;
     Object term641465;

    public Fraction_reduce_5358591311964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term640840 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term640840, term640840.getClass(), "numerator", -1920718778);
        setIntField(term640840, term640840.getClass(), "denominator", 1580103845);
        term641468 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term641468, term641468.getClass(), "numerator", -1920718778);
        setIntField(term641468, term641468.getClass(), "denominator", 1580103845);
        setField(term641468, term641468.getClass(), "toString", null);
        setField(term641468, term641468.getClass(), "toProperString", null);
        term641465 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term641465, term641465.getClass(), "numerator", -1920718778);
        setIntField(term641465, term641465.getClass(), "denominator", 1580103845);
        setField(term641465, term641465.getClass(), "toString", null);
        setField(term641465, term641465.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term640840, args);
        assertTrue(recursiveEquals(term640840, term641468));
        assertTrue(recursiveEquals(retValue, term641465));
    }

};


