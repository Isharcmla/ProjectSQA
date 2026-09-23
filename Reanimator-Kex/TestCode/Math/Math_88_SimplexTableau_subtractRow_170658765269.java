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

public class SimplexTableau_subtractRow_170658765269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56980;
     Object term58186;

    public SimplexTableau_subtractRow_170658765269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56980 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term57076 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        setField(term56980, term56980.getClass(), "tableau", term57076);
        term58186 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term58187 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        setField(term58186, term58186.getClass(), "f", null);
        setField(term58186, term58186.getClass(), "constraints", null);
        setBooleanField(term58186, term58186.getClass(), "restrictToNonNegative", false);
        setField(term58187, term58187.getClass(), "data", null);
        setField(term58187, term58187.getClass(), "lu", null);
        setField(term58186, term58186.getClass(), "tableau", term58187);
        setIntField(term58186, term58186.getClass(), "numDecisionVariables", 0);
        setIntField(term58186, term58186.getClass(), "numSlackVariables", 0);
        setIntField(term58186, term58186.getClass(), "numArtificialVariables", 0);
        setDoubleField(term58186, term58186.getClass(), "epsilon", 0.0);
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
        callMethod(klass, "subtractRow", argTypes, term56980, args);
        assertTrue(recursiveEquals(term56980, term58186));
    }

};


