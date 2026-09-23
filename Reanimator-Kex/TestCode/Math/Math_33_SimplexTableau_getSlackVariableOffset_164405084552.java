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

public class SimplexTableau_getSlackVariableOffset_164405084552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11034;
     Object term45827;

    public SimplexTableau_getSlackVariableOffset_164405084552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term45850 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term45849 = ((Class) term45850).getDeclaredField((String) "LEQ");
        ((Field) term45849).setAccessible(true);
        Object enum99 = ((Field) term45849).get((Object) null);
        Object term11039 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term11039, term11039.getClass(), "coefficients", null);
        setField(term11039, term11039.getClass(), "relationship", enum99);
        setDoubleField(term11039, term11039.getClass(), "value", 0.7330178886612495);
        ArrayList term11037 = new ArrayList();
        ((ArrayList) term11037).add(term11039);
        ArrayList term11046 = new ArrayList();
        ((ArrayList) term11046).add("ieCtQFdkii");
        ((ArrayList) term11046).add("dEnhdmILtU");
        ((ArrayList) term11046).add("hoicvmsovO");
        ((ArrayList) term11046).add("eqJfYWRaEL");
        ((ArrayList) term11046).add("fhkbdRViHi");
        ((ArrayList) term11046).add("uWHnvSvaPl");
        ((ArrayList) term11046).add("kBdSllIBVz");
        term11034 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term11035 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setField(term11035, term11035.getClass(), "coefficients", null);
        setDoubleField(term11035, term11035.getClass(), "constantTerm", 0.6561919196821765);
        setField(term11034, term11034.getClass(), "f", term11035);
        setField(term11034, term11034.getClass(), "constraints", term11037);
        setBooleanField(term11034, term11034.getClass(), "restrictToNonNegative", false);
        setField(term11034, term11034.getClass(), "columnLabels", term11046);
        setField(term11034, term11034.getClass(), "tableau", null);
        setIntField(term11034, term11034.getClass(), "numDecisionVariables", -112921587);
        setIntField(term11034, term11034.getClass(), "numSlackVariables", 933028652);
        setIntField(term11034, term11034.getClass(), "numArtificialVariables", 287287233);
        setDoubleField(term11034, term11034.getClass(), "epsilon", 0.7618164754425794);
        setIntField(term11034, term11034.getClass(), "maxUlps", 962840079);
        Class<? extends Object> term46221 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term46220 = ((Class) term46221).getDeclaredField((String) "EQ");
        ((Field) term46220).setAccessible(true);
        Object enum100 = ((Field) term46220).get((Object) null);
        Object term45831 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term45831, term45831.getClass(), "coefficients", null);
        setField(term45831, term45831.getClass(), "relationship", enum100);
        setDoubleField(term45831, term45831.getClass(), "value", 0.7330178886612495);
        ArrayList term45829 = new ArrayList();
        ((ArrayList) term45829).add(term45831);
        ArrayList term45833 = new ArrayList();
        ((ArrayList) term45833).add("ieCtQFdkii");
        ((ArrayList) term45833).add("dEnhdmILtU");
        ((ArrayList) term45833).add("hoicvmsovO");
        ((ArrayList) term45833).add("eqJfYWRaEL");
        ((ArrayList) term45833).add("fhkbdRViHi");
        ((ArrayList) term45833).add("uWHnvSvaPl");
        ((ArrayList) term45833).add("kBdSllIBVz");
        term45827 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term45828 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setField(term45828, term45828.getClass(), "coefficients", null);
        setDoubleField(term45828, term45828.getClass(), "constantTerm", 0.6561919196821765);
        setField(term45827, term45827.getClass(), "f", term45828);
        setField(term45827, term45827.getClass(), "constraints", term45829);
        setBooleanField(term45827, term45827.getClass(), "restrictToNonNegative", false);
        setField(term45827, term45827.getClass(), "columnLabels", term45833);
        setField(term45827, term45827.getClass(), "tableau", null);
        setIntField(term45827, term45827.getClass(), "numDecisionVariables", -112921587);
        setIntField(term45827, term45827.getClass(), "numSlackVariables", 933028652);
        setIntField(term45827, term45827.getClass(), "numArtificialVariables", 287287233);
        setDoubleField(term45827, term45827.getClass(), "epsilon", 0.7618164754425794);
        setIntField(term45827, term45827.getClass(), "maxUlps", 962840079);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getSlackVariableOffset", argTypes, term11034, args);
        assertTrue(recursiveEquals(term11034, term45827));
        assertTrue(recursiveEquals(retValue, -112921585));
    }

};


