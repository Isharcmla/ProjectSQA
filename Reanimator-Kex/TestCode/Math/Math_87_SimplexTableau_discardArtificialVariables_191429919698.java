package org.apache.commons.math.optimization.linear;

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
import java.lang.NegativeArraySizeException;
import static org.apache.commons.math.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SimplexTableau_discardArtificialVariables_191429919698 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69148;

    public SimplexTableau_discardArtificialVariables_191429919698() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69148 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term69246 = newInstance(Class.forName("org.apache.commons.math.linear.DenseRealMatrix"));
        setIntField(term69148, term69148.getClass(), "numArtificialVariables", -1);
        setField(term69148, term69148.getClass(), "tableau", term69246);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "discardArtificialVariables", argTypes, term69148, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


