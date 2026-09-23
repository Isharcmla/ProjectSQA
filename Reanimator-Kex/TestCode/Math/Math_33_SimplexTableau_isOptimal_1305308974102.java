package org.apache.commons.math3.optimization.linear;

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
import static org.apache.commons.math3.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.optimization.linear.EqualityUtils.*;
import java.lang.Object;

public class SimplexTableau_isOptimal_1305308974102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66638;
     Object term67317;

    public SimplexTableau_isOptimal_1305308974102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66638 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term66748 = newInstance(Class.forName("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setIntField(term66638, term66638.getClass(), "numArtificialVariables", 0);
        setField(term66638, term66638.getClass(), "tableau", term66748);
        term67317 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term67318 = newInstance(Class.forName("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setField(term67317, term67317.getClass(), "f", null);
        setField(term67317, term67317.getClass(), "constraints", null);
        setBooleanField(term67317, term67317.getClass(), "restrictToNonNegative", false);
        setField(term67317, term67317.getClass(), "columnLabels", null);
        setField(term67318, term67318.getClass(), "data", null);
        setField(term67317, term67317.getClass(), "tableau", term67318);
        setIntField(term67317, term67317.getClass(), "numDecisionVariables", 0);
        setIntField(term67317, term67317.getClass(), "numSlackVariables", 0);
        setIntField(term67317, term67317.getClass(), "numArtificialVariables", 0);
        setDoubleField(term67317, term67317.getClass(), "epsilon", 0.0);
        setIntField(term67317, term67317.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isOptimal", argTypes, term66638, args);
        assertTrue(recursiveEquals(term66638, term67317));
        assertTrue(recursiveEquals(retValue, true));
    }

};


