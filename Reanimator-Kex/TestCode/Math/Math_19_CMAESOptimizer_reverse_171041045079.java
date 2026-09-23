package org.apache.commons.math3.optimization.direct;

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
import static org.apache.commons.math3.optimization.direct.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.optimization.direct.EqualityUtils.*;

public class CMAESOptimizer_reverse_171041045079 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16380;
     Object term47660;
     Object term47646;

    public CMAESOptimizer_reverse_171041045079() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16380 = (int[]) newIntArray(6);
        setIntElement(term16380, 0, 1141317871);
        setIntElement(term16380, 1, 890669485);
        setIntElement(term16380, 2, 691577392);
        setIntElement(term16380, 3, -893623680);
        setIntElement(term16380, 4, -1963434938);
        setIntElement(term16380, 5, 906181092);
        term47660 = (int[]) newIntArray(6);
        setIntElement(term47660, 0, 1141317871);
        setIntElement(term47660, 1, 890669485);
        setIntElement(term47660, 2, 691577392);
        setIntElement(term47660, 3, -893623680);
        setIntElement(term47660, 4, -1963434938);
        setIntElement(term47660, 5, 906181092);
        term47646 = (int[]) newIntArray(6);
        setIntElement(term47646, 0, 906181092);
        setIntElement(term47646, 1, -1963434938);
        setIntElement(term47646, 2, -893623680);
        setIntElement(term47646, 3, 691577392);
        setIntElement(term47646, 4, 890669485);
        setIntElement(term47646, 5, 1141317871);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term16380;
        Object retValue = callMethod(klass, "reverse", argTypes, null, args);
        assertTrue(recursiveEquals(term16380, term47660));
        assertTrue(recursiveEquals(retValue, term47646));
    }

};


