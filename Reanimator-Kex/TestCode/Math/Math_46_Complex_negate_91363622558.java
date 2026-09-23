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
     Object term116;
     Object term604;
     Object term598;

    public Complex_negate_91363622558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term116, term116.getClass(), "imaginary", 0.22651340641904605);
        setDoubleField(term116, term116.getClass(), "real", 0.8878841294187743);
        setBooleanField(term116, term116.getClass(), "isNaN", false);
        setBooleanField(term116, term116.getClass(), "isInfinite", true);
        setBooleanField(term116, term116.getClass(), "isZero", false);
        term604 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term604, term604.getClass(), "imaginary", 0.22651340641904605);
        setDoubleField(term604, term604.getClass(), "real", 0.8878841294187743);
        setBooleanField(term604, term604.getClass(), "isNaN", false);
        setBooleanField(term604, term604.getClass(), "isInfinite", true);
        setBooleanField(term604, term604.getClass(), "isZero", false);
        term598 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term598, term598.getClass(), "imaginary", -0.22651340641904605);
        setDoubleField(term598, term598.getClass(), "real", -0.8878841294187743);
        setBooleanField(term598, term598.getClass(), "isNaN", false);
        setBooleanField(term598, term598.getClass(), "isInfinite", false);
        setBooleanField(term598, term598.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "negate", argTypes, term116, args);
        assertTrue(recursiveEquals(term116, term604));
        assertTrue(recursiveEquals(retValue, term598));
    }

};


