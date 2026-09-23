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

public class SimplexTableau_getNumVariables_166278949672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57569;
     Object term58573;

    public SimplexTableau_getNumVariables_166278949672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57569 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term57709 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        Object term57811 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(term57709, term57709.getClass(), "coefficients", term57811);
        setField(term57569, term57569.getClass(), "f", term57709);
        term58573 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term58574 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        Object term58575 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(term58575, term58575.getClass(), "entries", null);
        setIntField(term58575, term58575.getClass(), "virtualSize", 0);
        setDoubleField(term58575, term58575.getClass(), "epsilon", 0.0);
        setField(term58574, term58574.getClass(), "coefficients", term58575);
        setDoubleField(term58574, term58574.getClass(), "constantTerm", 0.0);
        setField(term58573, term58573.getClass(), "f", term58574);
        setField(term58573, term58573.getClass(), "constraints", null);
        setBooleanField(term58573, term58573.getClass(), "restrictToNonNegative", false);
        setField(term58573, term58573.getClass(), "tableau", null);
        setIntField(term58573, term58573.getClass(), "numDecisionVariables", 0);
        setIntField(term58573, term58573.getClass(), "numSlackVariables", 0);
        setIntField(term58573, term58573.getClass(), "numArtificialVariables", 0);
        setDoubleField(term58573, term58573.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNumVariables", argTypes, term57569, args);
        assertTrue(recursiveEquals(term57569, term58573));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


