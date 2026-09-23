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

public class SimplexTableau_getWidth_194935346248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8460;

    public SimplexTableau_getWidth_194935346248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term42718 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term42717 = ((Class) term42718).getDeclaredField((String) "GEQ");
        ((Field) term42717).setAccessible(true);
        Object enum92 = ((Field) term42717).get((Object) null);
        Object term8465 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term8465, term8465.getClass(), "coefficients", null);
        setField(term8465, term8465.getClass(), "relationship", enum92);
        setDoubleField(term8465, term8465.getClass(), "value", 0.5412182593116958);
        Class<? extends Object> term43019 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term43018 = ((Class) term43019).getDeclaredField((String) "GEQ");
        ((Field) term43018).setAccessible(true);
        Object enum93 = ((Field) term43018).get((Object) null);
        Object term8469 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term8469, term8469.getClass(), "coefficients", null);
        setField(term8469, term8469.getClass(), "relationship", enum93);
        setDoubleField(term8469, term8469.getClass(), "value", 0.16988691727397487);
        Class<? extends Object> term43320 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term43319 = ((Class) term43320).getDeclaredField((String) "EQ");
        ((Field) term43319).setAccessible(true);
        Object enum94 = ((Field) term43319).get((Object) null);
        Object term8473 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term8473, term8473.getClass(), "coefficients", null);
        setField(term8473, term8473.getClass(), "relationship", enum94);
        setDoubleField(term8473, term8473.getClass(), "value", 0.39286935532362843);
        Object term8477 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term8477, term8477.getClass(), "coefficients", null);
        setField(term8477, term8477.getClass(), "relationship", enum92);
        setDoubleField(term8477, term8477.getClass(), "value", 0.11577948268926874);
        Object term8479 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term8479, term8479.getClass(), "coefficients", null);
        setField(term8479, term8479.getClass(), "relationship", enum92);
        setDoubleField(term8479, term8479.getClass(), "value", 0.5617009352394552);
        Object term8481 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term8481, term8481.getClass(), "coefficients", null);
        setField(term8481, term8481.getClass(), "relationship", enum94);
        setDoubleField(term8481, term8481.getClass(), "value", 0.09067063848644474);
        Object term8483 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term8483, term8483.getClass(), "coefficients", null);
        setField(term8483, term8483.getClass(), "relationship", enum94);
        setDoubleField(term8483, term8483.getClass(), "value", 0.268304014379393);
        Object term8485 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term8485, term8485.getClass(), "coefficients", null);
        setField(term8485, term8485.getClass(), "relationship", null);
        setDoubleField(term8485, term8485.getClass(), "value", 0.0);
        Object term8487 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term8487, term8487.getClass(), "coefficients", null);
        setField(term8487, term8487.getClass(), "relationship", null);
        setDoubleField(term8487, term8487.getClass(), "value", 0.0);
        ArrayList term8463 = new ArrayList();
        ((ArrayList) term8463).add(term8465);
        ((ArrayList) term8463).add(term8469);
        ((ArrayList) term8463).add(term8473);
        ((ArrayList) term8463).add(term8477);
        ((ArrayList) term8463).add(term8479);
        ((ArrayList) term8463).add(term8481);
        ((ArrayList) term8463).add(term8483);
        ((ArrayList) term8463).add(term8485);
        ((ArrayList) term8463).add(term8487);
        ArrayList term8492 = new ArrayList();
        ((ArrayList) term8492).add("BndsHwAFMv");
        ((ArrayList) term8492).add("GzFkzHGYFt");
        ((ArrayList) term8492).add("tShwQLRGNe");
        ((ArrayList) term8492).add("LvtrsXUliU");
        term8460 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term8461 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setField(term8461, term8461.getClass(), "coefficients", null);
        setDoubleField(term8461, term8461.getClass(), "constantTerm", 0.8819646072665548);
        setField(term8460, term8460.getClass(), "f", term8461);
        setField(term8460, term8460.getClass(), "constraints", term8463);
        setBooleanField(term8460, term8460.getClass(), "restrictToNonNegative", false);
        setField(term8460, term8460.getClass(), "columnLabels", term8492);
        setField(term8460, term8460.getClass(), "tableau", null);
        setIntField(term8460, term8460.getClass(), "numDecisionVariables", 0);
        setIntField(term8460, term8460.getClass(), "numSlackVariables", 0);
        setIntField(term8460, term8460.getClass(), "numArtificialVariables", 0);
        setDoubleField(term8460, term8460.getClass(), "epsilon", 0.0);
        setIntField(term8460, term8460.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getWidth", argTypes, term8460, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


