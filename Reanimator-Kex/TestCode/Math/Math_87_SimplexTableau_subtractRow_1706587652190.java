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

public class SimplexTableau_subtractRow_1706587652190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113434;
     Object term113555;

    public SimplexTableau_subtractRow_1706587652190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113434 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term113536 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(term113434, term113434.getClass(), "tableau", term113536);
        term113555 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term113556 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(term113555, term113555.getClass(), "f", null);
        setField(term113555, term113555.getClass(), "constraints", null);
        setBooleanField(term113555, term113555.getClass(), "restrictToNonNegative", false);
        setIntField(term113556, term113556.getClass(), "rowDimension", 0);
        setIntField(term113556, term113556.getClass(), "columnDimension", 0);
        setField(term113556, term113556.getClass(), "entries", null);
        setField(term113556, term113556.getClass(), "lu", null);
        setField(term113555, term113555.getClass(), "tableau", term113556);
        setIntField(term113555, term113555.getClass(), "numDecisionVariables", 0);
        setIntField(term113555, term113555.getClass(), "numSlackVariables", 0);
        setIntField(term113555, term113555.getClass(), "numArtificialVariables", 0);
        setDoubleField(term113555, term113555.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = 0;
        args[1] = 0;
        args[2] = 0.0;
        callMethod(klass, "subtractRow", argTypes, term113434, args);
        assertTrue(recursiveEquals(term113434, term113555));
    }

};


