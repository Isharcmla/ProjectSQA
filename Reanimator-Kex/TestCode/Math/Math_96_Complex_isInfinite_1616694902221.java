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

public class Complex_isInfinite_1616694902221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37980;
     Object term37991;

    public Complex_isInfinite_1616694902221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37980 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term37980, term37980.getClass(), "real", 9.2188684372274053E18);
        setDoubleField(term37980, term37980.getClass(), "imaginary", -9.2188684372274053E18);
        term37991 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term37991, term37991.getClass(), "imaginary", -9.2188684372274053E18);
        setDoubleField(term37991, term37991.getClass(), "real", 9.2188684372274053E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isInfinite", argTypes, term37980, args);
        assertTrue(recursiveEquals(term37980, term37991));
        assertTrue(recursiveEquals(retValue, false));
    }

};


