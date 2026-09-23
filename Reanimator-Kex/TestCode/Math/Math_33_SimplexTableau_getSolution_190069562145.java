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
import java.lang.NullPointerException;
import static org.apache.commons.math3.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class SimplexTableau_getSolution_190069562145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6362;

    public SimplexTableau_getSolution_190069562145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term40078 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term40077 = ((Class) term40078).getDeclaredField((String) "LEQ");
        ((Field) term40077).setAccessible(true);
        Object enum86 = ((Field) term40077).get((Object) null);
        Object term6367 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term6367, term6367.getClass(), "coefficients", null);
        setField(term6367, term6367.getClass(), "relationship", enum86);
        setDoubleField(term6367, term6367.getClass(), "value", 0.36226058076369927);
        Class<? extends Object> term40379 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term40378 = ((Class) term40379).getDeclaredField((String) "LEQ");
        ((Field) term40378).setAccessible(true);
        Object enum87 = ((Field) term40378).get((Object) null);
        Object term6371 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term6371, term6371.getClass(), "coefficients", null);
        setField(term6371, term6371.getClass(), "relationship", enum87);
        setDoubleField(term6371, term6371.getClass(), "value", 0.03699061125289671);
        Object term6375 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term6375, term6375.getClass(), "coefficients", null);
        setField(term6375, term6375.getClass(), "relationship", enum87);
        setDoubleField(term6375, term6375.getClass(), "value", 0.6047137830113202);
        Object term6377 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term6377, term6377.getClass(), "coefficients", null);
        setField(term6377, term6377.getClass(), "relationship", enum87);
        setDoubleField(term6377, term6377.getClass(), "value", 0.6767213143579776);
        Object term6379 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term6379, term6379.getClass(), "coefficients", null);
        setField(term6379, term6379.getClass(), "relationship", enum86);
        setDoubleField(term6379, term6379.getClass(), "value", 0.48862955528902696);
        Object term6381 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term6381, term6381.getClass(), "coefficients", null);
        setField(term6381, term6381.getClass(), "relationship", enum87);
        setDoubleField(term6381, term6381.getClass(), "value", 0.426231085465289);
        ArrayList term6365 = new ArrayList();
        ((ArrayList) term6365).add(term6367);
        ((ArrayList) term6365).add(term6371);
        ((ArrayList) term6365).add(term6375);
        ((ArrayList) term6365).add(term6377);
        ((ArrayList) term6365).add(term6379);
        ((ArrayList) term6365).add(term6381);
        ArrayList term6386 = new ArrayList();
        ((ArrayList) term6386).add("Ghbwtircqb");
        ((ArrayList) term6386).add("xrwlQZdwCp");
        ((ArrayList) term6386).add("IDCWpPLRkE");
        ((ArrayList) term6386).add("nyiiPDVjAc");
        ((ArrayList) term6386).add("aKnKipADSo");
        ((ArrayList) term6386).add("wSQxaModmm");
        term6362 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term6363 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setField(term6363, term6363.getClass(), "coefficients", null);
        setDoubleField(term6363, term6363.getClass(), "constantTerm", 0.0022646783892913414);
        setField(term6362, term6362.getClass(), "f", term6363);
        setField(term6362, term6362.getClass(), "constraints", term6365);
        setBooleanField(term6362, term6362.getClass(), "restrictToNonNegative", true);
        setField(term6362, term6362.getClass(), "columnLabels", term6386);
        setField(term6362, term6362.getClass(), "tableau", null);
        setIntField(term6362, term6362.getClass(), "numDecisionVariables", -469968304);
        setIntField(term6362, term6362.getClass(), "numSlackVariables", -1145578966);
        setIntField(term6362, term6362.getClass(), "numArtificialVariables", 679763016);
        setDoubleField(term6362, term6362.getClass(), "epsilon", 0.0027299293098262956);
        setIntField(term6362, term6362.getClass(), "maxUlps", 1962444399);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getSolution", argTypes, term6362, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


