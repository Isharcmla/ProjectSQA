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

public class SimplexTableau_equals_1450061279116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74695;
     Object term74957;
     Object term74987;
     Object term74989;

    public SimplexTableau_equals_1450061279116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74695 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term74835 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setBooleanField(term74695, term74695.getClass(), "restrictToNonNegative", true);
        setIntField(term74695, term74695.getClass(), "numDecisionVariables", 0);
        setIntField(term74695, term74695.getClass(), "numSlackVariables", 0);
        setIntField(term74695, term74695.getClass(), "numArtificialVariables", 0);
        setDoubleField(term74695, term74695.getClass(), "epsilon", -9.2166166374137201E18);
        setField(term74695, term74695.getClass(), "f", term74835);
        term74957 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setBooleanField(term74957, term74957.getClass(), "restrictToNonNegative", true);
        setIntField(term74957, term74957.getClass(), "numDecisionVariables", 0);
        setIntField(term74957, term74957.getClass(), "numSlackVariables", 0);
        setIntField(term74957, term74957.getClass(), "numArtificialVariables", 0);
        setDoubleField(term74957, term74957.getClass(), "epsilon", -9.2166166374137201E18);
        setField(term74957, term74957.getClass(), "f", null);
        term74987 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term74988 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term74988, term74988.getClass(), "coefficients", null);
        setDoubleField(term74988, term74988.getClass(), "constantTerm", 0.0);
        setField(term74987, term74987.getClass(), "f", term74988);
        setField(term74987, term74987.getClass(), "constraints", null);
        setBooleanField(term74987, term74987.getClass(), "restrictToNonNegative", true);
        setField(term74987, term74987.getClass(), "tableau", null);
        setIntField(term74987, term74987.getClass(), "numDecisionVariables", 0);
        setIntField(term74987, term74987.getClass(), "numSlackVariables", 0);
        setIntField(term74987, term74987.getClass(), "numArtificialVariables", 0);
        setDoubleField(term74987, term74987.getClass(), "epsilon", -9.2166166374137201E18);
        term74989 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term74989, term74989.getClass(), "f", null);
        setField(term74989, term74989.getClass(), "constraints", null);
        setBooleanField(term74989, term74989.getClass(), "restrictToNonNegative", true);
        setField(term74989, term74989.getClass(), "tableau", null);
        setIntField(term74989, term74989.getClass(), "numDecisionVariables", 0);
        setIntField(term74989, term74989.getClass(), "numSlackVariables", 0);
        setIntField(term74989, term74989.getClass(), "numArtificialVariables", 0);
        setDoubleField(term74989, term74989.getClass(), "epsilon", -9.2166166374137201E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term74957;
        Object retValue = callMethod(klass, "equals", argTypes, term74695, args);
        assertTrue(recursiveEquals(term74695, term74987));
        assertTrue(recursiveEquals(term74957, term74989));
        assertTrue(recursiveEquals(retValue, false));
    }

};


