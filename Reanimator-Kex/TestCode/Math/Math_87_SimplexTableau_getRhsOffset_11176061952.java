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

public class SimplexTableau_getRhsOffset_11176061952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11143;

    public SimplexTableau_getRhsOffset_11176061952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term45574 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term45573 = ((Class) term45574).getDeclaredField((String) "LEQ");
        ((Field) term45573).setAccessible(true);
        Object enum114 = ((Field) term45573).get((Object) null);
        Object term11148 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term11148, term11148.getClass(), "coefficients", null);
        setField(term11148, term11148.getClass(), "relationship", enum114);
        setDoubleField(term11148, term11148.getClass(), "value", 0.19625398866403143);
        Object term11152 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term11152, term11152.getClass(), "coefficients", null);
        setField(term11152, term11152.getClass(), "relationship", enum114);
        setDoubleField(term11152, term11152.getClass(), "value", 0.45069204793711093);
        Class<? extends Object> term45870 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term45869 = ((Class) term45870).getDeclaredField((String) "LEQ");
        ((Field) term45869).setAccessible(true);
        Object enum115 = ((Field) term45869).get((Object) null);
        Object term11154 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term11154, term11154.getClass(), "coefficients", null);
        setField(term11154, term11154.getClass(), "relationship", enum115);
        setDoubleField(term11154, term11154.getClass(), "value", 0.9341364461850963);
        Object term11158 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term11158, term11158.getClass(), "coefficients", null);
        setField(term11158, term11158.getClass(), "relationship", enum115);
        setDoubleField(term11158, term11158.getClass(), "value", 0.9022041121474429);
        Object term11160 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term11160, term11160.getClass(), "coefficients", null);
        setField(term11160, term11160.getClass(), "relationship", enum115);
        setDoubleField(term11160, term11160.getClass(), "value", 0.6512870939318848);
        Object term11162 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term11162, term11162.getClass(), "coefficients", null);
        setField(term11162, term11162.getClass(), "relationship", enum115);
        setDoubleField(term11162, term11162.getClass(), "value", 0.8777038609128434);
        Class<? extends Object> term46166 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term46165 = ((Class) term46166).getDeclaredField((String) "LEQ");
        ((Field) term46165).setAccessible(true);
        Object enum116 = ((Field) term46165).get((Object) null);
        Object term11164 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term11164, term11164.getClass(), "coefficients", null);
        setField(term11164, term11164.getClass(), "relationship", enum116);
        setDoubleField(term11164, term11164.getClass(), "value", 0.008025683154629148);
        Object term11168 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term11168, term11168.getClass(), "coefficients", null);
        setField(term11168, term11168.getClass(), "relationship", null);
        setDoubleField(term11168, term11168.getClass(), "value", 0.0);
        ArrayList term11146 = new ArrayList();
        ((ArrayList) term11146).add(term11148);
        ((ArrayList) term11146).add(term11152);
        ((ArrayList) term11146).add(term11154);
        ((ArrayList) term11146).add(term11158);
        ((ArrayList) term11146).add(term11160);
        ((ArrayList) term11146).add(term11162);
        ((ArrayList) term11146).add(term11164);
        ((ArrayList) term11146).add(term11168);
        term11143 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term11144 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term11144, term11144.getClass(), "coefficients", null);
        setDoubleField(term11144, term11144.getClass(), "constantTerm", 0.34010089048558567);
        setField(term11143, term11143.getClass(), "f", term11144);
        setField(term11143, term11143.getClass(), "constraints", term11146);
        setBooleanField(term11143, term11143.getClass(), "restrictToNonNegative", true);
        setField(term11143, term11143.getClass(), "tableau", null);
        setIntField(term11143, term11143.getClass(), "numDecisionVariables", 0);
        setIntField(term11143, term11143.getClass(), "numSlackVariables", 0);
        setIntField(term11143, term11143.getClass(), "numArtificialVariables", 0);
        setDoubleField(term11143, term11143.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRhsOffset", argTypes, term11143, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


