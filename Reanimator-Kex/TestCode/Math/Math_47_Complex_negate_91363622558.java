package org.apache.commons.math.complex;

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
import static org.apache.commons.math.complex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.complex.EqualityUtils.*;

public class Complex_negate_91363622558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99;
     Object term553;
     Object term548;

    public Complex_negate_91363622558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term99, term99.getClass(), "imaginary", 0.22651340641904605);
        setDoubleField(term99, term99.getClass(), "real", 0.8878841294187743);
        setBooleanField(term99, term99.getClass(), "isNaN", false);
        setBooleanField(term99, term99.getClass(), "isInfinite", true);
        term553 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term553, term553.getClass(), "imaginary", 0.22651340641904605);
        setDoubleField(term553, term553.getClass(), "real", 0.8878841294187743);
        setBooleanField(term553, term553.getClass(), "isNaN", false);
        setBooleanField(term553, term553.getClass(), "isInfinite", true);
        term548 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term548, term548.getClass(), "imaginary", -0.22651340641904605);
        setDoubleField(term548, term548.getClass(), "real", -0.8878841294187743);
        setBooleanField(term548, term548.getClass(), "isNaN", false);
        setBooleanField(term548, term548.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "negate", argTypes, term99, args);
        assertTrue(recursiveEquals(term99, term553));
        assertTrue(recursiveEquals(retValue, term548));
    }

};


