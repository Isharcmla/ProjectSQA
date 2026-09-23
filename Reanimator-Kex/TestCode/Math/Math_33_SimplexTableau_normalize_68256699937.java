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

public class SimplexTableau_normalize_68256699937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2002;
     Object term2095;
     Object term31809;
     Object term31833;
     Object term31716;

    public SimplexTableau_normalize_68256699937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31840 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term31839 = ((Class) term31840).getDeclaredField((String) "GEQ");
        ((Field) term31839).setAccessible(true);
        Object enum65 = ((Field) term31839).get((Object) null);
        Object term2007 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term2007, term2007.getClass(), "coefficients", null);
        setField(term2007, term2007.getClass(), "relationship", enum65);
        setDoubleField(term2007, term2007.getClass(), "value", 0.3800088629986428);
        ArrayList term2005 = new ArrayList();
        ((ArrayList) term2005).add(term2007);
        ArrayList term2014 = new ArrayList();
        ((ArrayList) term2014).add("uuaPigETmJ");
        ((ArrayList) term2014).add("MxlszYVzRf");
        ((ArrayList) term2014).add("LQFpaHEwXR");
        ((ArrayList) term2014).add("oVcInYnLWB");
        ((ArrayList) term2014).add("aJlieCFVtF");
        ((ArrayList) term2014).add("ZiaGIbnzTs");
        term2002 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term2003 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setField(term2003, term2003.getClass(), "coefficients", null);
        setDoubleField(term2003, term2003.getClass(), "constantTerm", 0.13481025392611334);
        setField(term2002, term2002.getClass(), "f", term2003);
        setField(term2002, term2002.getClass(), "constraints", term2005);
        setBooleanField(term2002, term2002.getClass(), "restrictToNonNegative", true);
        setField(term2002, term2002.getClass(), "columnLabels", term2014);
        setField(term2002, term2002.getClass(), "tableau", null);
        setIntField(term2002, term2002.getClass(), "numDecisionVariables", 1134449235);
        setIntField(term2002, term2002.getClass(), "numSlackVariables", -883034806);
        setIntField(term2002, term2002.getClass(), "numArtificialVariables", 1585847225);
        setDoubleField(term2002, term2002.getClass(), "epsilon", 0.5840714198152577);
        setIntField(term2002, term2002.getClass(), "maxUlps", 597278769);
        Class<? extends Object> term32201 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term32200 = ((Class) term32201).getDeclaredField((String) "EQ");
        ((Field) term32200).setAccessible(true);
        Object enum66 = ((Field) term32200).get((Object) null);
        term2095 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term2095, term2095.getClass(), "coefficients", null);
        setField(term2095, term2095.getClass(), "relationship", enum66);
        setDoubleField(term2095, term2095.getClass(), "value", 0.7559240768573477);
        Class<? extends Object> term32499 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term32498 = ((Class) term32499).getDeclaredField((String) "EQ");
        ((Field) term32498).setAccessible(true);
        Object enum67 = ((Field) term32498).get((Object) null);
        Object term31813 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term31813, term31813.getClass(), "coefficients", null);
        setField(term31813, term31813.getClass(), "relationship", enum67);
        setDoubleField(term31813, term31813.getClass(), "value", 0.3800088629986428);
        ArrayList term31811 = new ArrayList();
        ((ArrayList) term31811).add(term31813);
        ArrayList term31819 = new ArrayList();
        ((ArrayList) term31819).add("uuaPigETmJ");
        ((ArrayList) term31819).add("MxlszYVzRf");
        ((ArrayList) term31819).add("LQFpaHEwXR");
        ((ArrayList) term31819).add("oVcInYnLWB");
        ((ArrayList) term31819).add("aJlieCFVtF");
        ((ArrayList) term31819).add("ZiaGIbnzTs");
        term31809 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term31810 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setField(term31810, term31810.getClass(), "coefficients", null);
        setDoubleField(term31810, term31810.getClass(), "constantTerm", 0.13481025392611334);
        setField(term31809, term31809.getClass(), "f", term31810);
        setField(term31809, term31809.getClass(), "constraints", term31811);
        setBooleanField(term31809, term31809.getClass(), "restrictToNonNegative", true);
        setField(term31809, term31809.getClass(), "columnLabels", term31819);
        setField(term31809, term31809.getClass(), "tableau", null);
        setIntField(term31809, term31809.getClass(), "numDecisionVariables", 1134449235);
        setIntField(term31809, term31809.getClass(), "numSlackVariables", -883034806);
        setIntField(term31809, term31809.getClass(), "numArtificialVariables", 1585847225);
        setDoubleField(term31809, term31809.getClass(), "epsilon", 0.5840714198152577);
        setIntField(term31809, term31809.getClass(), "maxUlps", 597278769);
        Class<? extends Object> term32857 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term32856 = ((Class) term32857).getDeclaredField((String) "EQ");
        ((Field) term32856).setAccessible(true);
        Object enum68 = ((Field) term32856).get((Object) null);
        term31833 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term31833, term31833.getClass(), "coefficients", null);
        setField(term31833, term31833.getClass(), "relationship", enum68);
        setDoubleField(term31833, term31833.getClass(), "value", 0.7559240768573477);
        Class<? extends Object> term33155 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term33154 = ((Class) term33155).getDeclaredField((String) "EQ");
        ((Field) term33154).setAccessible(true);
        Object enum69 = ((Field) term33154).get((Object) null);
        term31716 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term31716, term31716.getClass(), "coefficients", null);
        setField(term31716, term31716.getClass(), "relationship", enum69);
        setDoubleField(term31716, term31716.getClass(), "value", 0.7559240768573477);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint");
        Object[] args = new Object[1];
        args[0] = term2095;
        Object retValue = callMethod(klass, "normalize", argTypes, term2002, args);
        assertTrue(recursiveEquals(term2002, term31809));
        assertTrue(recursiveEquals(term2095, term31833));
        assertTrue(recursiveEquals(retValue, term31716));
    }

};


