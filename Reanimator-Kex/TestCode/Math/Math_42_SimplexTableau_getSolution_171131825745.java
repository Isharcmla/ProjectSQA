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

public class SimplexTableau_getSolution_171131825745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6272;

    public SimplexTableau_getSolution_171131825745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term38350 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term38349 = ((Class) term38350).getDeclaredField((String) "LEQ");
        ((Field) term38349).setAccessible(true);
        Object enum88 = ((Field) term38349).get((Object) null);
        Object term6277 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term6277, term6277.getClass(), "coefficients", null);
        setField(term6277, term6277.getClass(), "relationship", enum88);
        setDoubleField(term6277, term6277.getClass(), "value", 0.36226058076369927);
        Class<? extends Object> term38646 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term38645 = ((Class) term38646).getDeclaredField((String) "LEQ");
        ((Field) term38645).setAccessible(true);
        Object enum89 = ((Field) term38645).get((Object) null);
        Object term6281 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term6281, term6281.getClass(), "coefficients", null);
        setField(term6281, term6281.getClass(), "relationship", enum89);
        setDoubleField(term6281, term6281.getClass(), "value", 0.03699061125289671);
        Object term6285 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term6285, term6285.getClass(), "coefficients", null);
        setField(term6285, term6285.getClass(), "relationship", enum89);
        setDoubleField(term6285, term6285.getClass(), "value", 0.6047137830113202);
        Object term6287 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term6287, term6287.getClass(), "coefficients", null);
        setField(term6287, term6287.getClass(), "relationship", enum89);
        setDoubleField(term6287, term6287.getClass(), "value", 0.6767213143579776);
        Object term6289 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term6289, term6289.getClass(), "coefficients", null);
        setField(term6289, term6289.getClass(), "relationship", enum88);
        setDoubleField(term6289, term6289.getClass(), "value", 0.48862955528902696);
        Object term6291 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term6291, term6291.getClass(), "coefficients", null);
        setField(term6291, term6291.getClass(), "relationship", enum89);
        setDoubleField(term6291, term6291.getClass(), "value", 0.426231085465289);
        ArrayList term6275 = new ArrayList();
        ((ArrayList) term6275).add(term6277);
        ((ArrayList) term6275).add(term6281);
        ((ArrayList) term6275).add(term6285);
        ((ArrayList) term6275).add(term6287);
        ((ArrayList) term6275).add(term6289);
        ((ArrayList) term6275).add(term6291);
        ArrayList term6296 = new ArrayList();
        ((ArrayList) term6296).add("Ghbwtircqb");
        ((ArrayList) term6296).add("xrwlQZdwCp");
        ((ArrayList) term6296).add("IDCWpPLRkE");
        ((ArrayList) term6296).add("nyiiPDVjAc");
        ((ArrayList) term6296).add("aKnKipADSo");
        ((ArrayList) term6296).add("wSQxaModmm");
        term6272 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term6273 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term6273, term6273.getClass(), "coefficients", null);
        setDoubleField(term6273, term6273.getClass(), "constantTerm", 0.0022646783892913414);
        setField(term6272, term6272.getClass(), "f", term6273);
        setField(term6272, term6272.getClass(), "constraints", term6275);
        setBooleanField(term6272, term6272.getClass(), "restrictToNonNegative", true);
        setField(term6272, term6272.getClass(), "columnLabels", term6296);
        setField(term6272, term6272.getClass(), "tableau", null);
        setIntField(term6272, term6272.getClass(), "numDecisionVariables", -469968304);
        setIntField(term6272, term6272.getClass(), "numSlackVariables", -1145578966);
        setIntField(term6272, term6272.getClass(), "numArtificialVariables", 679763016);
        setDoubleField(term6272, term6272.getClass(), "epsilon", 0.0027299293098262956);
        setIntField(term6272, term6272.getClass(), "maxUlps", 1962444399);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getSolution", argTypes, term6272, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


