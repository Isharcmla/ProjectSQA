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
import java.util.ArrayList;
import java.lang.String;

public class SimplexTableau_getNumDecisionVariables_147284326059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14797;
     Object term54961;

    public SimplexTableau_getNumDecisionVariables_147284326059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term54968 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term54967 = ((Class) term54968).getDeclaredField((String) "LEQ");
        ((Field) term54967).setAccessible(true);
        Object enum139 = ((Field) term54967).get((Object) null);
        Object term14802 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term14802, term14802.getClass(), "coefficients", null);
        setField(term14802, term14802.getClass(), "relationship", enum139);
        setDoubleField(term14802, term14802.getClass(), "value", 0.18717846301066243);
        ArrayList term14800 = new ArrayList();
        ((ArrayList) term14800).add(term14802);
        term14797 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term14798 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term14798, term14798.getClass(), "coefficients", null);
        setDoubleField(term14798, term14798.getClass(), "constantTerm", 0.07901636960861558);
        setField(term14797, term14797.getClass(), "f", term14798);
        setField(term14797, term14797.getClass(), "constraints", term14800);
        setBooleanField(term14797, term14797.getClass(), "restrictToNonNegative", false);
        setField(term14797, term14797.getClass(), "tableau", null);
        setIntField(term14797, term14797.getClass(), "numDecisionVariables", 962840079);
        setIntField(term14797, term14797.getClass(), "numSlackVariables", 1540719661);
        setIntField(term14797, term14797.getClass(), "numArtificialVariables", 1265463001);
        setDoubleField(term14797, term14797.getClass(), "epsilon", 0.5335953039331021);
        Class<? extends Object> term56497 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term56496 = ((Class) term56497).getDeclaredField((String) "EQ");
        ((Field) term56496).setAccessible(true);
        Object enum144 = ((Field) term56496).get((Object) null);
        Object term54965 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term54965, term54965.getClass(), "coefficients", null);
        setField(term54965, term54965.getClass(), "relationship", enum144);
        setDoubleField(term54965, term54965.getClass(), "value", 0.18717846301066243);
        ArrayList term54963 = new ArrayList();
        ((ArrayList) term54963).add(term54965);
        term54961 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term54962 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term54962, term54962.getClass(), "coefficients", null);
        setDoubleField(term54962, term54962.getClass(), "constantTerm", 0.07901636960861558);
        setField(term54961, term54961.getClass(), "f", term54962);
        setField(term54961, term54961.getClass(), "constraints", term54963);
        setBooleanField(term54961, term54961.getClass(), "restrictToNonNegative", false);
        setField(term54961, term54961.getClass(), "tableau", null);
        setIntField(term54961, term54961.getClass(), "numDecisionVariables", 962840079);
        setIntField(term54961, term54961.getClass(), "numSlackVariables", 1540719661);
        setIntField(term54961, term54961.getClass(), "numArtificialVariables", 1265463001);
        setDoubleField(term54961, term54961.getClass(), "epsilon", 0.5335953039331021);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNumDecisionVariables", argTypes, term14797, args);
        assertTrue(recursiveEquals(term14797, term54961));
        assertTrue(recursiveEquals(retValue, 962840079));
    }

};


