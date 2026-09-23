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
import java.util.ArrayList;
import java.lang.String;

public class SimplexTableau_getArtificialVariableOffset_128992991353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11510;
     Object term46622;

    public SimplexTableau_getArtificialVariableOffset_128992991353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term46636 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term46635 = ((Class) term46636).getDeclaredField((String) "LEQ");
        ((Field) term46635).setAccessible(true);
        Object enum101 = ((Field) term46635).get((Object) null);
        Object term11515 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term11515, term11515.getClass(), "coefficients", null);
        setField(term11515, term11515.getClass(), "relationship", enum101);
        setDoubleField(term11515, term11515.getClass(), "value", 0.7080134263823477);
        Class<? extends Object> term46937 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term46936 = ((Class) term46937).getDeclaredField((String) "EQ");
        ((Field) term46936).setAccessible(true);
        Object enum102 = ((Field) term46936).get((Object) null);
        Object term11519 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term11519, term11519.getClass(), "coefficients", null);
        setField(term11519, term11519.getClass(), "relationship", enum102);
        setDoubleField(term11519, term11519.getClass(), "value", 0.6059734092898602);
        Object term11523 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term11523, term11523.getClass(), "coefficients", null);
        setField(term11523, term11523.getClass(), "relationship", enum102);
        setDoubleField(term11523, term11523.getClass(), "value", 0.3074693824288357);
        Object term11525 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term11525, term11525.getClass(), "coefficients", null);
        setField(term11525, term11525.getClass(), "relationship", enum102);
        setDoubleField(term11525, term11525.getClass(), "value", 0.1245258965512791);
        Object term11527 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term11527, term11527.getClass(), "coefficients", null);
        setField(term11527, term11527.getClass(), "relationship", enum101);
        setDoubleField(term11527, term11527.getClass(), "value", 0.9511861072660375);
        ArrayList term11513 = new ArrayList();
        ((ArrayList) term11513).add(term11515);
        ((ArrayList) term11513).add(term11519);
        ((ArrayList) term11513).add(term11523);
        ((ArrayList) term11513).add(term11525);
        ((ArrayList) term11513).add(term11527);
        ArrayList term11532 = new ArrayList();
        term11510 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term11511 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setField(term11511, term11511.getClass(), "coefficients", null);
        setDoubleField(term11511, term11511.getClass(), "constantTerm", 0.7385589312559342);
        setField(term11510, term11510.getClass(), "f", term11511);
        setField(term11510, term11510.getClass(), "constraints", term11513);
        setBooleanField(term11510, term11510.getClass(), "restrictToNonNegative", false);
        setField(term11510, term11510.getClass(), "columnLabels", term11532);
        setField(term11510, term11510.getClass(), "tableau", null);
        setIntField(term11510, term11510.getClass(), "numDecisionVariables", 1540719661);
        setIntField(term11510, term11510.getClass(), "numSlackVariables", 1265463001);
        setIntField(term11510, term11510.getClass(), "numArtificialVariables", 335112684);
        setDoubleField(term11510, term11510.getClass(), "epsilon", 0.05880719443135807);
        setIntField(term11510, term11510.getClass(), "maxUlps", 1551099402);
        Class<? extends Object> term47235 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term47234 = ((Class) term47235).getDeclaredField((String) "LEQ");
        ((Field) term47234).setAccessible(true);
        Object enum103 = ((Field) term47234).get((Object) null);
        Object term46626 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term46626, term46626.getClass(), "coefficients", null);
        setField(term46626, term46626.getClass(), "relationship", enum103);
        setDoubleField(term46626, term46626.getClass(), "value", 0.7080134263823477);
        Class<? extends Object> term47536 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term47535 = ((Class) term47536).getDeclaredField((String) "EQ");
        ((Field) term47535).setAccessible(true);
        Object enum104 = ((Field) term47535).get((Object) null);
        Object term46628 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term46628, term46628.getClass(), "coefficients", null);
        setField(term46628, term46628.getClass(), "relationship", enum104);
        setDoubleField(term46628, term46628.getClass(), "value", 0.6059734092898602);
        Object term46630 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term46630, term46630.getClass(), "coefficients", null);
        setField(term46630, term46630.getClass(), "relationship", enum104);
        setDoubleField(term46630, term46630.getClass(), "value", 0.3074693824288357);
        Object term46631 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term46631, term46631.getClass(), "coefficients", null);
        setField(term46631, term46631.getClass(), "relationship", enum104);
        setDoubleField(term46631, term46631.getClass(), "value", 0.1245258965512791);
        Object term46632 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term46632, term46632.getClass(), "coefficients", null);
        setField(term46632, term46632.getClass(), "relationship", enum103);
        setDoubleField(term46632, term46632.getClass(), "value", 0.9511861072660375);
        ArrayList term46624 = new ArrayList();
        ((ArrayList) term46624).add(term46626);
        ((ArrayList) term46624).add(term46628);
        ((ArrayList) term46624).add(term46630);
        ((ArrayList) term46624).add(term46631);
        ((ArrayList) term46624).add(term46632);
        ArrayList term46633 = new ArrayList();
        term46622 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term46623 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setField(term46623, term46623.getClass(), "coefficients", null);
        setDoubleField(term46623, term46623.getClass(), "constantTerm", 0.7385589312559342);
        setField(term46622, term46622.getClass(), "f", term46623);
        setField(term46622, term46622.getClass(), "constraints", term46624);
        setBooleanField(term46622, term46622.getClass(), "restrictToNonNegative", false);
        setField(term46622, term46622.getClass(), "columnLabels", term46633);
        setField(term46622, term46622.getClass(), "tableau", null);
        setIntField(term46622, term46622.getClass(), "numDecisionVariables", 1540719661);
        setIntField(term46622, term46622.getClass(), "numSlackVariables", 1265463001);
        setIntField(term46622, term46622.getClass(), "numArtificialVariables", 335112684);
        setDoubleField(term46622, term46622.getClass(), "epsilon", 0.05880719443135807);
        setIntField(term46622, term46622.getClass(), "maxUlps", 1551099402);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getArtificialVariableOffset", argTypes, term11510, args);
        assertTrue(recursiveEquals(term11510, term46622));
        assertTrue(recursiveEquals(retValue, -1488784632));
    }

};


