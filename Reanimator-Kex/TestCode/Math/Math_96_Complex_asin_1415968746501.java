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

public class Complex_asin_1415968746501 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126688;
     Object term126978;
     Object term126975;

    public Complex_asin_1415968746501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126688 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term126688, term126688.getClass(), "real", 5.7646075230349773E17);
        setDoubleField(term126688, term126688.getClass(), "imaginary", -9.223372036854776E18);
        term126978 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term126978, term126978.getClass(), "imaginary", -9.223372036854776E18);
        setDoubleField(term126978, term126978.getClass(), "real", 5.7646075230349773E17);
        term126975 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term126975, term126975.getClass(), "imaginary", -44.363368876044326);
        setDoubleField(term126975, term126975.getClass(), "real", 0.062418809995965364);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term126688, args);
        assertTrue(recursiveEquals(term126688, term126978));
        assertTrue(recursiveEquals(retValue, term126975));
    }

};


