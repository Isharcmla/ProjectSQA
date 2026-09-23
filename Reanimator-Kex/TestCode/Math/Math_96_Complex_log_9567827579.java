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

public class Complex_log_9567827579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5253;
     Object term5489;
     Object term5486;

    public Complex_log_9567827579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5253 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term5253, term5253.getClass(), "real", 2.8823037789654221E18);
        setDoubleField(term5253, term5253.getClass(), "imaginary", 5.8006363203221586E18);
        term5489 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term5489, term5489.getClass(), "imaginary", 5.8006363203221586E18);
        setDoubleField(term5489, term5489.getClass(), "real", 2.8823037789654221E18);
        term5486 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term5486, term5486.getClass(), "imaginary", 1.1096362724582851);
        setDoubleField(term5486, term5486.getClass(), "real", 43.31483115840809);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "log", argTypes, term5253, args);
        assertTrue(recursiveEquals(term5253, term5489));
        assertTrue(recursiveEquals(retValue, term5486));
    }

};


