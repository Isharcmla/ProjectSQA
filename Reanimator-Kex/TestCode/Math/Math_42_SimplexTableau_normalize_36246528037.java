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

public class SimplexTableau_normalize_36246528037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1972;
     Object term2065;
     Object term30186;
     Object term30210;
     Object term30093;

    public SimplexTableau_normalize_36246528037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30276 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term30275 = ((Class) term30276).getDeclaredField((String) "GEQ");
        ((Field) term30275).setAccessible(true);
        Object enum67 = ((Field) term30275).get((Object) null);
        Object term1977 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term1977, term1977.getClass(), "coefficients", null);
        setField(term1977, term1977.getClass(), "relationship", enum67);
        setDoubleField(term1977, term1977.getClass(), "value", 0.3800088629986428);
        ArrayList term1975 = new ArrayList();
        ((ArrayList) term1975).add(term1977);
        ArrayList term1984 = new ArrayList();
        ((ArrayList) term1984).add("uuaPigETmJ");
        ((ArrayList) term1984).add("MxlszYVzRf");
        ((ArrayList) term1984).add("LQFpaHEwXR");
        ((ArrayList) term1984).add("oVcInYnLWB");
        ((ArrayList) term1984).add("aJlieCFVtF");
        ((ArrayList) term1984).add("ZiaGIbnzTs");
        term1972 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term1973 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term1973, term1973.getClass(), "coefficients", null);
        setDoubleField(term1973, term1973.getClass(), "constantTerm", 0.13481025392611334);
        setField(term1972, term1972.getClass(), "f", term1973);
        setField(term1972, term1972.getClass(), "constraints", term1975);
        setBooleanField(term1972, term1972.getClass(), "restrictToNonNegative", true);
        setField(term1972, term1972.getClass(), "columnLabels", term1984);
        setField(term1972, term1972.getClass(), "tableau", null);
        setIntField(term1972, term1972.getClass(), "numDecisionVariables", 1134449235);
        setIntField(term1972, term1972.getClass(), "numSlackVariables", -883034806);
        setIntField(term1972, term1972.getClass(), "numArtificialVariables", 1585847225);
        setDoubleField(term1972, term1972.getClass(), "epsilon", 0.5840714198152577);
        setIntField(term1972, term1972.getClass(), "maxUlps", 597278769);
        Class<? extends Object> term30632 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term30631 = ((Class) term30632).getDeclaredField((String) "EQ");
        ((Field) term30631).setAccessible(true);
        Object enum68 = ((Field) term30631).get((Object) null);
        term2065 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term2065, term2065.getClass(), "coefficients", null);
        setField(term2065, term2065.getClass(), "relationship", enum68);
        setDoubleField(term2065, term2065.getClass(), "value", 0.7559240768573477);
        Class<? extends Object> term30925 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term30924 = ((Class) term30925).getDeclaredField((String) "EQ");
        ((Field) term30924).setAccessible(true);
        Object enum69 = ((Field) term30924).get((Object) null);
        Object term30190 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term30190, term30190.getClass(), "coefficients", null);
        setField(term30190, term30190.getClass(), "relationship", enum69);
        setDoubleField(term30190, term30190.getClass(), "value", 0.3800088629986428);
        ArrayList term30188 = new ArrayList();
        ((ArrayList) term30188).add(term30190);
        ArrayList term30196 = new ArrayList();
        ((ArrayList) term30196).add("uuaPigETmJ");
        ((ArrayList) term30196).add("MxlszYVzRf");
        ((ArrayList) term30196).add("LQFpaHEwXR");
        ((ArrayList) term30196).add("oVcInYnLWB");
        ((ArrayList) term30196).add("aJlieCFVtF");
        ((ArrayList) term30196).add("ZiaGIbnzTs");
        term30186 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term30187 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term30187, term30187.getClass(), "coefficients", null);
        setDoubleField(term30187, term30187.getClass(), "constantTerm", 0.13481025392611334);
        setField(term30186, term30186.getClass(), "f", term30187);
        setField(term30186, term30186.getClass(), "constraints", term30188);
        setBooleanField(term30186, term30186.getClass(), "restrictToNonNegative", true);
        setField(term30186, term30186.getClass(), "columnLabels", term30196);
        setField(term30186, term30186.getClass(), "tableau", null);
        setIntField(term30186, term30186.getClass(), "numDecisionVariables", 1134449235);
        setIntField(term30186, term30186.getClass(), "numSlackVariables", -883034806);
        setIntField(term30186, term30186.getClass(), "numArtificialVariables", 1585847225);
        setDoubleField(term30186, term30186.getClass(), "epsilon", 0.5840714198152577);
        setIntField(term30186, term30186.getClass(), "maxUlps", 597278769);
        Class<? extends Object> term31278 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term31277 = ((Class) term31278).getDeclaredField((String) "EQ");
        ((Field) term31277).setAccessible(true);
        Object enum70 = ((Field) term31277).get((Object) null);
        term30210 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term30210, term30210.getClass(), "coefficients", null);
        setField(term30210, term30210.getClass(), "relationship", enum70);
        setDoubleField(term30210, term30210.getClass(), "value", 0.7559240768573477);
        Class<? extends Object> term31571 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term31570 = ((Class) term31571).getDeclaredField((String) "EQ");
        ((Field) term31570).setAccessible(true);
        Object enum71 = ((Field) term31570).get((Object) null);
        term30093 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term30093, term30093.getClass(), "coefficients", null);
        setField(term30093, term30093.getClass(), "relationship", enum71);
        setDoubleField(term30093, term30093.getClass(), "value", 0.7559240768573477);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint");
        Object[] args = new Object[1];
        args[0] = term2065;
        Object retValue = callMethod(klass, "normalize", argTypes, term1972, args);
        assertTrue(recursiveEquals(term1972, term30186));
        assertTrue(recursiveEquals(term2065, term30210));
        assertTrue(recursiveEquals(retValue, term30093));
    }

};


