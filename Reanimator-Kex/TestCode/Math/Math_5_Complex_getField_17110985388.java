package org.apache.commons.math3.complex;

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
import static org.apache.commons.math3.complex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.complex.EqualityUtils.*;

public class Complex_getField_17110985388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247;
     Object term10702;
     Object term10696;

    public Complex_getField_17110985388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term247 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term247, term247.getClass(), "imaginary", 0.268304014379393);
        setDoubleField(term247, term247.getClass(), "real", 0.7171972879282721);
        setBooleanField(term247, term247.getClass(), "isNaN", true);
        setBooleanField(term247, term247.getClass(), "isInfinite", false);
        term10702 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term10702, term10702.getClass(), "imaginary", 0.268304014379393);
        setDoubleField(term10702, term10702.getClass(), "real", 0.7171972879282721);
        setBooleanField(term10702, term10702.getClass(), "isNaN", true);
        setBooleanField(term10702, term10702.getClass(), "isInfinite", false);
        term10696 = newInstance(Class.forName("org.apache.commons.math3.complex.ComplexField"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getField", argTypes, term247, args);
        assertTrue(recursiveEquals(term247, term10702));
        assertTrue(recursiveEquals(retValue, term10696));
    }

};


