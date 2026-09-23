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

public class Complex_acos_1430561531185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29660;
     Object term29876;
     Object term29873;

    public Complex_acos_1430561531185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29660 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term29660, term29660.getClass(), "real", -9.2052169008569385E18);
        setDoubleField(term29660, term29660.getClass(), "imaginary", 1.125899906842624E16);
        term29876 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term29876, term29876.getClass(), "imaginary", 1.125899906842624E16);
        setDoubleField(term29876, term29876.getClass(), "real", -9.2052169008569385E18);
        term29873 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term29873, term29873.getClass(), "imaginary", -44.35944998023342);
        setDoubleField(term29873, term29873.getClass(), "real", 3.14036954352349);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term29660, args);
        assertTrue(recursiveEquals(term29660, term29876));
        assertTrue(recursiveEquals(retValue, term29873));
    }

};


