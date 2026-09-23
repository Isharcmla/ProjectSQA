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

public class Complex_add_61482636388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6649;
     Object term6733;
     Object term6887;
     Object term6888;
     Object term6882;

    public Complex_add_61482636388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6649 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term6649, term6649.getClass(), "real", 1.8014398509481984E16);
        setDoubleField(term6649, term6649.getClass(), "imaginary", -4.611192336475902E18);
        term6733 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term6733, term6733.getClass(), "real", -4.6122489683808092E18);
        setDoubleField(term6733, term6733.getClass(), "imaginary", 9.2188684372274053E18);
        term6887 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term6887, term6887.getClass(), "imaginary", -4.611192336475902E18);
        setDoubleField(term6887, term6887.getClass(), "real", 1.8014398509481984E16);
        setBooleanField(term6887, term6887.getClass(), "isNaN", false);
        setBooleanField(term6887, term6887.getClass(), "isInfinite", false);
        term6888 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term6888, term6888.getClass(), "imaginary", 9.2188684372274053E18);
        setDoubleField(term6888, term6888.getClass(), "real", -4.6122489683808092E18);
        setBooleanField(term6888, term6888.getClass(), "isNaN", false);
        setBooleanField(term6888, term6888.getClass(), "isInfinite", false);
        term6882 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term6882, term6882.getClass(), "imaginary", 4.6076761007515034E18);
        setDoubleField(term6882, term6882.getClass(), "real", -4.5942345698713272E18);
        setBooleanField(term6882, term6882.getClass(), "isNaN", false);
        setBooleanField(term6882, term6882.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term6733;
        Object retValue = callMethod(klass, "add", argTypes, term6649, args);
        assertTrue(recursiveEquals(term6649, term6887));
        assertTrue(recursiveEquals(term6733, term6888));
        assertTrue(recursiveEquals(retValue, term6882));
    }

};


