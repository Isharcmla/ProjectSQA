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

public class Complex_readResolve_1290019647111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7288;
     Object term7311;
     Object term7306;

    public Complex_readResolve_1290019647111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7288 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term7288, term7288.getClass(), "real", -9.2166166374137201E18);
        setDoubleField(term7288, term7288.getClass(), "imaginary", 9.2188684372274053E18);
        term7311 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term7311, term7311.getClass(), "imaginary", 9.2188684372274053E18);
        setDoubleField(term7311, term7311.getClass(), "real", -9.2166166374137201E18);
        setBooleanField(term7311, term7311.getClass(), "isNaN", false);
        setBooleanField(term7311, term7311.getClass(), "isInfinite", false);
        term7306 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term7306, term7306.getClass(), "imaginary", 9.2188684372274053E18);
        setDoubleField(term7306, term7306.getClass(), "real", -9.2166166374137201E18);
        setBooleanField(term7306, term7306.getClass(), "isNaN", false);
        setBooleanField(term7306, term7306.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "readResolve", argTypes, term7288, args);
        assertTrue(recursiveEquals(term7288, term7311));
        assertTrue(recursiveEquals(retValue, term7306));
    }

};


