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
import java.lang.NullPointerException;
import static org.apache.commons.math.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Integer;
import java.lang.Double;

public class SimplexTableau_subtractRow_170658765245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6829;
     Object term6845;
     Object term6847;
     Object term6849;

    public SimplexTableau_subtractRow_170658765245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term39853 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term39852 = ((Class) term39853).getDeclaredField((String) "EQ");
        ((Field) term39852).setAccessible(true);
        Object enum99 = ((Field) term39852).get((Object) null);
        Object term6834 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term6834, term6834.getClass(), "coefficients", null);
        setField(term6834, term6834.getClass(), "relationship", enum99);
        setDoubleField(term6834, term6834.getClass(), "value", 0.0027299293098262956);
        ArrayList term6832 = new ArrayList();
        ((ArrayList) term6832).add(term6834);
        term6829 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term6830 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term6830, term6830.getClass(), "coefficients", null);
        setDoubleField(term6830, term6830.getClass(), "constantTerm", 0.426231085465289);
        setField(term6829, term6829.getClass(), "f", term6830);
        setField(term6829, term6829.getClass(), "constraints", term6832);
        setBooleanField(term6829, term6829.getClass(), "restrictToNonNegative", true);
        setField(term6829, term6829.getClass(), "tableau", null);
        setIntField(term6829, term6829.getClass(), "numDecisionVariables", -1530420153);
        setIntField(term6829, term6829.getClass(), "numSlackVariables", -469968304);
        setIntField(term6829, term6829.getClass(), "numArtificialVariables", -1145578966);
        setDoubleField(term6829, term6829.getClass(), "epsilon", 0.29874017652881824);
        term6845 = new Integer(679763016);
        term6847 = new Integer(1962444399);
        term6849 = new Double(0.32554480512985284);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term6845;
        args[1] = term6847;
        args[2] = term6849;
        try {
            callMethod(klass, "subtractRow", argTypes, term6829, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


