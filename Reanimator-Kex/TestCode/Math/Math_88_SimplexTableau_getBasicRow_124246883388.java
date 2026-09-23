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
import static org.apache.commons.math.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.optimization.linear.EqualityUtils.*;
import java.lang.Object;

public class SimplexTableau_getBasicRow_124246883388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66061;
     Object term66599;

    public SimplexTableau_getBasicRow_124246883388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66061 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term66163 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setIntField(term66061, term66061.getClass(), "numArtificialVariables", 0);
        setField(term66061, term66061.getClass(), "tableau", term66163);
        term66599 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term66600 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(term66599, term66599.getClass(), "f", null);
        setField(term66599, term66599.getClass(), "constraints", null);
        setBooleanField(term66599, term66599.getClass(), "restrictToNonNegative", false);
        setIntField(term66600, term66600.getClass(), "rowDimension", 0);
        setIntField(term66600, term66600.getClass(), "columnDimension", 0);
        setField(term66600, term66600.getClass(), "entries", null);
        setField(term66600, term66600.getClass(), "lu", null);
        setField(term66599, term66599.getClass(), "tableau", term66600);
        setIntField(term66599, term66599.getClass(), "numDecisionVariables", 0);
        setIntField(term66599, term66599.getClass(), "numSlackVariables", 0);
        setIntField(term66599, term66599.getClass(), "numArtificialVariables", 0);
        setDoubleField(term66599, term66599.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "getBasicRow", argTypes, term66061, args);
        assertTrue(recursiveEquals(term66061, term66599));
        assertTrue(recursiveEquals(retValue, null));
    }

};


