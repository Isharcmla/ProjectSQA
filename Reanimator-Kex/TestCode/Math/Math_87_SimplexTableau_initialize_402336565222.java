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
import org.apache.commons.math.linear.MatrixIndexException;
import static org.apache.commons.math.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SimplexTableau_initialize_402336565222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134581;

    public SimplexTableau_initialize_402336565222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134581 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term134683 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setIntField(term134581, term134581.getClass(), "numArtificialVariables", 1);
        setIntField(term134581, term134581.getClass(), "numDecisionVariables", 0);
        setIntField(term134581, term134581.getClass(), "numSlackVariables", 0);
        setIntField(term134683, term134683.getClass(), "rowDimension", 3);
        setField(term134581, term134581.getClass(), "tableau", term134683);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "initialize", argTypes, term134581, args);
            assertTrue(false);
        }
        catch (MatrixIndexException e) {
        }

    }

};


