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

public class SimplexTableau_subtractRow_1706587652104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79436;
     Object term79557;

    public SimplexTableau_subtractRow_1706587652104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79436 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term79538 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(term79436, term79436.getClass(), "tableau", term79538);
        term79557 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term79558 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(term79557, term79557.getClass(), "f", null);
        setField(term79557, term79557.getClass(), "constraints", null);
        setBooleanField(term79557, term79557.getClass(), "restrictToNonNegative", false);
        setIntField(term79558, term79558.getClass(), "rowDimension", 0);
        setIntField(term79558, term79558.getClass(), "columnDimension", 0);
        setField(term79558, term79558.getClass(), "entries", null);
        setField(term79558, term79558.getClass(), "lu", null);
        setField(term79557, term79557.getClass(), "tableau", term79558);
        setIntField(term79557, term79557.getClass(), "numDecisionVariables", 0);
        setIntField(term79557, term79557.getClass(), "numSlackVariables", 0);
        setIntField(term79557, term79557.getClass(), "numArtificialVariables", 0);
        setDoubleField(term79557, term79557.getClass(), "epsilon", 0.0);
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
        callMethod(klass, "subtractRow", argTypes, term79436, args);
        assertTrue(recursiveEquals(term79436, term79557));
    }

};


