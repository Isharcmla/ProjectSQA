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

public class SimplexTableau_discardArtificialVariables_191429919646 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5864;

    public SimplexTableau_discardArtificialVariables_191429919646() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term41216 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term41215 = ((Class) term41216).getDeclaredField((String) "LEQ");
        ((Field) term41215).setAccessible(true);
        Object enum101 = ((Field) term41215).get((Object) null);
        Object term5869 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term5869, term5869.getClass(), "coefficients", null);
        setField(term5869, term5869.getClass(), "relationship", enum101);
        setDoubleField(term5869, term5869.getClass(), "value", 0.8454723071922143);
        Class<? extends Object> term41512 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term41511 = ((Class) term41512).getDeclaredField((String) "GEQ");
        ((Field) term41511).setAccessible(true);
        Object enum102 = ((Field) term41511).get((Object) null);
        Object term5873 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term5873, term5873.getClass(), "coefficients", null);
        setField(term5873, term5873.getClass(), "relationship", enum102);
        setDoubleField(term5873, term5873.getClass(), "value", 0.8566567697571895);
        Object term5877 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term5877, term5877.getClass(), "coefficients", null);
        setField(term5877, term5877.getClass(), "relationship", enum101);
        setDoubleField(term5877, term5877.getClass(), "value", 0.9203805380592256);
        Object term5879 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term5879, term5879.getClass(), "coefficients", null);
        setField(term5879, term5879.getClass(), "relationship", enum102);
        setDoubleField(term5879, term5879.getClass(), "value", 0.5804948995371725);
        Object term5881 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term5881, term5881.getClass(), "coefficients", null);
        setField(term5881, term5881.getClass(), "relationship", enum102);
        setDoubleField(term5881, term5881.getClass(), "value", 0.20737514139742264);
        Object term5883 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term5883, term5883.getClass(), "coefficients", null);
        setField(term5883, term5883.getClass(), "relationship", enum102);
        setDoubleField(term5883, term5883.getClass(), "value", 0.7919370314903882);
        ArrayList term5867 = new ArrayList();
        ((ArrayList) term5867).add(term5869);
        ((ArrayList) term5867).add(term5873);
        ((ArrayList) term5867).add(term5877);
        ((ArrayList) term5867).add(term5879);
        ((ArrayList) term5867).add(term5881);
        ((ArrayList) term5867).add(term5883);
        term5864 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term5865 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term5865, term5865.getClass(), "coefficients", null);
        setDoubleField(term5865, term5865.getClass(), "constantTerm", 0.9374115574082594);
        setField(term5864, term5864.getClass(), "f", term5865);
        setField(term5864, term5864.getClass(), "constraints", term5867);
        setBooleanField(term5864, term5864.getClass(), "restrictToNonNegative", false);
        setField(term5864, term5864.getClass(), "tableau", null);
        setIntField(term5864, term5864.getClass(), "numDecisionVariables", -203030934);
        setIntField(term5864, term5864.getClass(), "numSlackVariables", -1179120542);
        setIntField(term5864, term5864.getClass(), "numArtificialVariables", -73683645);
        setDoubleField(term5864, term5864.getClass(), "epsilon", 0.2109867221632754);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "discardArtificialVariables", argTypes, term5864, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


