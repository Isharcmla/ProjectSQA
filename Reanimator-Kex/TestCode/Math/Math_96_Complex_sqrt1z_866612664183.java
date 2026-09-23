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

public class Complex_sqrt1z_866612664183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29080;
     Object term29177;
     Object term29174;

    public Complex_sqrt1z_866612664183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29080 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term29080, term29080.getClass(), "real", 9.2188684372274053E18);
        setDoubleField(term29080, term29080.getClass(), "imaginary", -9.2166166374137201E18);
        term29177 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term29177, term29177.getClass(), "imaginary", -9.2166166374137201E18);
        setDoubleField(term29177, term29177.getClass(), "real", 9.2188684372274053E18);
        term29174 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term29174, term29174.getClass(), "imaginary", 9.2188684372274053E18);
        setDoubleField(term29174, term29174.getClass(), "real", 9.2166166374137201E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sqrt1z", argTypes, term29080, args);
        assertTrue(recursiveEquals(term29080, term29177));
        assertTrue(recursiveEquals(retValue, term29174));
    }

};


