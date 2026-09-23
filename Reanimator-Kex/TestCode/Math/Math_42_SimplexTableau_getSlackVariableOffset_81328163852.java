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

public class SimplexTableau_getSlackVariableOffset_81328163852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10879;
     Object term44034;

    public SimplexTableau_getSlackVariableOffset_81328163852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term44057 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term44056 = ((Class) term44057).getDeclaredField((String) "LEQ");
        ((Field) term44056).setAccessible(true);
        Object enum101 = ((Field) term44056).get((Object) null);
        Object term10884 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term10884, term10884.getClass(), "coefficients", null);
        setField(term10884, term10884.getClass(), "relationship", enum101);
        setDoubleField(term10884, term10884.getClass(), "value", 0.7330178886612495);
        ArrayList term10882 = new ArrayList();
        ((ArrayList) term10882).add(term10884);
        ArrayList term10891 = new ArrayList();
        ((ArrayList) term10891).add("ieCtQFdkii");
        ((ArrayList) term10891).add("dEnhdmILtU");
        ((ArrayList) term10891).add("hoicvmsovO");
        ((ArrayList) term10891).add("eqJfYWRaEL");
        ((ArrayList) term10891).add("fhkbdRViHi");
        ((ArrayList) term10891).add("uWHnvSvaPl");
        ((ArrayList) term10891).add("kBdSllIBVz");
        term10879 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term10880 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term10880, term10880.getClass(), "coefficients", null);
        setDoubleField(term10880, term10880.getClass(), "constantTerm", 0.6561919196821765);
        setField(term10879, term10879.getClass(), "f", term10880);
        setField(term10879, term10879.getClass(), "constraints", term10882);
        setBooleanField(term10879, term10879.getClass(), "restrictToNonNegative", false);
        setField(term10879, term10879.getClass(), "columnLabels", term10891);
        setField(term10879, term10879.getClass(), "tableau", null);
        setIntField(term10879, term10879.getClass(), "numDecisionVariables", -112921587);
        setIntField(term10879, term10879.getClass(), "numSlackVariables", 933028652);
        setIntField(term10879, term10879.getClass(), "numArtificialVariables", 287287233);
        setDoubleField(term10879, term10879.getClass(), "epsilon", 0.7618164754425794);
        setIntField(term10879, term10879.getClass(), "maxUlps", 962840079);
        Class<? extends Object> term44423 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term44422 = ((Class) term44423).getDeclaredField((String) "EQ");
        ((Field) term44422).setAccessible(true);
        Object enum102 = ((Field) term44422).get((Object) null);
        Object term44038 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term44038, term44038.getClass(), "coefficients", null);
        setField(term44038, term44038.getClass(), "relationship", enum102);
        setDoubleField(term44038, term44038.getClass(), "value", 0.7330178886612495);
        ArrayList term44036 = new ArrayList();
        ((ArrayList) term44036).add(term44038);
        ArrayList term44040 = new ArrayList();
        ((ArrayList) term44040).add("ieCtQFdkii");
        ((ArrayList) term44040).add("dEnhdmILtU");
        ((ArrayList) term44040).add("hoicvmsovO");
        ((ArrayList) term44040).add("eqJfYWRaEL");
        ((ArrayList) term44040).add("fhkbdRViHi");
        ((ArrayList) term44040).add("uWHnvSvaPl");
        ((ArrayList) term44040).add("kBdSllIBVz");
        term44034 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term44035 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term44035, term44035.getClass(), "coefficients", null);
        setDoubleField(term44035, term44035.getClass(), "constantTerm", 0.6561919196821765);
        setField(term44034, term44034.getClass(), "f", term44035);
        setField(term44034, term44034.getClass(), "constraints", term44036);
        setBooleanField(term44034, term44034.getClass(), "restrictToNonNegative", false);
        setField(term44034, term44034.getClass(), "columnLabels", term44040);
        setField(term44034, term44034.getClass(), "tableau", null);
        setIntField(term44034, term44034.getClass(), "numDecisionVariables", -112921587);
        setIntField(term44034, term44034.getClass(), "numSlackVariables", 933028652);
        setIntField(term44034, term44034.getClass(), "numArtificialVariables", 287287233);
        setDoubleField(term44034, term44034.getClass(), "epsilon", 0.7618164754425794);
        setIntField(term44034, term44034.getClass(), "maxUlps", 962840079);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getSlackVariableOffset", argTypes, term10879, args);
        assertTrue(recursiveEquals(term10879, term44034));
        assertTrue(recursiveEquals(retValue, -112921585));
    }

};


