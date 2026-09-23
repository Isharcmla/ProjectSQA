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
import java.lang.Boolean;

public class SimplexTableau_createTableau_31454001032 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5;
     Object term33;

    public SimplexTableau_createTableau_31454001032() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24781 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term24780 = ((Class) term24781).getDeclaredField((String) "GEQ");
        ((Field) term24780).setAccessible(true);
        Object enum57 = ((Field) term24780).get((Object) null);
        Object term10 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term10, term10.getClass(), "coefficients", null);
        setField(term10, term10.getClass(), "relationship", enum57);
        setDoubleField(term10, term10.getClass(), "value", 0.5523635872663106);
        Class<? extends Object> term25077 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term25076 = ((Class) term25077).getDeclaredField((String) "LEQ");
        ((Field) term25076).setAccessible(true);
        Object enum58 = ((Field) term25076).get((Object) null);
        Object term14 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term14, term14.getClass(), "coefficients", null);
        setField(term14, term14.getClass(), "relationship", enum58);
        setDoubleField(term14, term14.getClass(), "value", 0.544608645520025);
        Object term18 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term18, term18.getClass(), "coefficients", null);
        setField(term18, term18.getClass(), "relationship", enum57);
        setDoubleField(term18, term18.getClass(), "value", 0.28570734989730284);
        Object term20 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term20, term20.getClass(), "coefficients", null);
        setField(term20, term20.getClass(), "relationship", enum58);
        setDoubleField(term20, term20.getClass(), "value", 0.40176586625454525);
        Class<? extends Object> term25373 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term25372 = ((Class) term25373).getDeclaredField((String) "LEQ");
        ((Field) term25372).setAccessible(true);
        Object enum59 = ((Field) term25372).get((Object) null);
        Object term22 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term22, term22.getClass(), "coefficients", null);
        setField(term22, term22.getClass(), "relationship", enum59);
        setDoubleField(term22, term22.getClass(), "value", 0.2641345529914265);
        ArrayList term8 = new ArrayList();
        ((ArrayList) term8).add(term10);
        ((ArrayList) term8).add(term14);
        ((ArrayList) term8).add(term18);
        ((ArrayList) term8).add(term20);
        ((ArrayList) term8).add(term22);
        term5 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term6 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term6, term6.getClass(), "coefficients", null);
        setDoubleField(term6, term6.getClass(), "constantTerm", 0.3455959125047594);
        setField(term5, term5.getClass(), "f", term6);
        setField(term5, term5.getClass(), "constraints", term8);
        setBooleanField(term5, term5.getClass(), "restrictToNonNegative", false);
        setField(term5, term5.getClass(), "tableau", null);
        setIntField(term5, term5.getClass(), "numDecisionVariables", 568599855);
        setIntField(term5, term5.getClass(), "numSlackVariables", 1162663216);
        setIntField(term5, term5.getClass(), "numArtificialVariables", 1484323161);
        setDoubleField(term5, term5.getClass(), "epsilon", 0.36923381893433327);
        term33 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term33;
        try {
            callMethod(klass, "createTableau", argTypes, term5, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


