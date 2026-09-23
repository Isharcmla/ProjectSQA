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

public class Complex_readResolve_129001964781 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230;
     Object term4561;
     Object term4556;

    public Complex_readResolve_129001964781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term230 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term230, term230.getClass(), "imaginary", 0.5412182593116958);
        setDoubleField(term230, term230.getClass(), "real", 0.16988691727397487);
        setBooleanField(term230, term230.getClass(), "isNaN", false);
        setBooleanField(term230, term230.getClass(), "isInfinite", false);
        term4561 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term4561, term4561.getClass(), "imaginary", 0.5412182593116958);
        setDoubleField(term4561, term4561.getClass(), "real", 0.16988691727397487);
        setBooleanField(term4561, term4561.getClass(), "isNaN", false);
        setBooleanField(term4561, term4561.getClass(), "isInfinite", false);
        term4556 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term4556, term4556.getClass(), "imaginary", 0.5412182593116958);
        setDoubleField(term4556, term4556.getClass(), "real", 0.16988691727397487);
        setBooleanField(term4556, term4556.getClass(), "isNaN", false);
        setBooleanField(term4556, term4556.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "readResolve", argTypes, term230, args);
        assertTrue(recursiveEquals(term230, term4561));
        assertTrue(recursiveEquals(retValue, term4556));
    }

};


