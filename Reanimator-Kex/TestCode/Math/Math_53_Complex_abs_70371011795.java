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

public class Complex_abs_70371011795 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8067;
     Object term8099;

    public Complex_abs_70371011795() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8067 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term8067, term8067.getClass(), "isNaN", false);
        setBooleanField(term8067, term8067.getClass(), "isInfinite", false);
        setDoubleField(term8067, term8067.getClass(), "real", 9.2195614560039731E18);
        setDoubleField(term8067, term8067.getClass(), "imaginary", -3.810580850802688E15);
        term8099 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term8099, term8099.getClass(), "imaginary", -3.810580850802688E15);
        setDoubleField(term8099, term8099.getClass(), "real", 9.2195614560039731E18);
        setBooleanField(term8099, term8099.getClass(), "isNaN", false);
        setBooleanField(term8099, term8099.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "abs", argTypes, term8067, args);
        assertTrue(recursiveEquals(term8067, term8099));
        assertTrue(recursiveEquals(retValue, 9.219562243488599E18));
    }

};


