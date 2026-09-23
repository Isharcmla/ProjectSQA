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
import java.util.ArrayList;
import java.lang.String;

public class SimplexTableau_getSolution_171131825748 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6821;

    public SimplexTableau_getSolution_171131825748() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term43036 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term43035 = ((Class) term43036).getDeclaredField((String) "GEQ");
        ((Field) term43035).setAccessible(true);
        Object enum105 = ((Field) term43035).get((Object) null);
        Object term6826 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term6826, term6826.getClass(), "coefficients", null);
        setField(term6826, term6826.getClass(), "relationship", enum105);
        setDoubleField(term6826, term6826.getClass(), "value", 0.6767213143579776);
        ArrayList term6824 = new ArrayList();
        ((ArrayList) term6824).add(term6826);
        term6821 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term6822 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term6822, term6822.getClass(), "coefficients", null);
        setDoubleField(term6822, term6822.getClass(), "constantTerm", 0.6047137830113202);
        setField(term6821, term6821.getClass(), "f", term6822);
        setField(term6821, term6821.getClass(), "constraints", term6824);
        setBooleanField(term6821, term6821.getClass(), "restrictToNonNegative", false);
        setField(term6821, term6821.getClass(), "tableau", null);
        setIntField(term6821, term6821.getClass(), "numDecisionVariables", -469968304);
        setIntField(term6821, term6821.getClass(), "numSlackVariables", -1145578966);
        setIntField(term6821, term6821.getClass(), "numArtificialVariables", 679763016);
        setDoubleField(term6821, term6821.getClass(), "epsilon", 0.48862955528902696);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getSolution", argTypes, term6821, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


