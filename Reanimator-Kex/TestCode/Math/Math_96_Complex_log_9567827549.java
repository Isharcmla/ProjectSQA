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

public class Complex_log_9567827549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75;
     Object term1384;
     Object term1381;

    public Complex_log_9567827549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term75, term75.getClass(), "imaginary", 0.7591353014991907);
        setDoubleField(term75, term75.getClass(), "real", 0.791695029600875);
        term1384 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term1384, term1384.getClass(), "imaginary", 0.7591353014991907);
        setDoubleField(term1384, term1384.getClass(), "real", 0.791695029600875);
        term1381 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term1381, term1381.getClass(), "imaginary", 0.7644062181799394);
        setDoubleField(term1381, term1381.getClass(), "real", 0.09243724176622993);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "log", argTypes, term75, args);
        assertTrue(recursiveEquals(term75, term1384));
        assertTrue(recursiveEquals(retValue, term1381));
    }

};


