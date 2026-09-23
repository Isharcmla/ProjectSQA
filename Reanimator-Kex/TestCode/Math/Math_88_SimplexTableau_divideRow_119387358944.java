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
import java.lang.Integer;
import java.lang.Double;

public class SimplexTableau_divideRow_119387358944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6208;
     Object term6236;
     Object term6238;

    public SimplexTableau_divideRow_119387358944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term39017 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term39016 = ((Class) term39017).getDeclaredField((String) "GEQ");
        ((Field) term39016).setAccessible(true);
        Object enum97 = ((Field) term39016).get((Object) null);
        Object term6213 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term6213, term6213.getClass(), "coefficients", null);
        setField(term6213, term6213.getClass(), "relationship", enum97);
        setDoubleField(term6213, term6213.getClass(), "value", 0.7154795600170818);
        Class<? extends Object> term39313 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term39312 = ((Class) term39313).getDeclaredField((String) "GEQ");
        ((Field) term39312).setAccessible(true);
        Object enum98 = ((Field) term39312).get((Object) null);
        Object term6217 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term6217, term6217.getClass(), "coefficients", null);
        setField(term6217, term6217.getClass(), "relationship", enum98);
        setDoubleField(term6217, term6217.getClass(), "value", 0.6355029654528058);
        Object term6221 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term6221, term6221.getClass(), "coefficients", null);
        setField(term6221, term6221.getClass(), "relationship", enum97);
        setDoubleField(term6221, term6221.getClass(), "value", 0.0022646783892913414);
        Object term6223 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term6223, term6223.getClass(), "coefficients", null);
        setField(term6223, term6223.getClass(), "relationship", enum97);
        setDoubleField(term6223, term6223.getClass(), "value", 0.36226058076369927);
        Object term6225 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term6225, term6225.getClass(), "coefficients", null);
        setField(term6225, term6225.getClass(), "relationship", enum97);
        setDoubleField(term6225, term6225.getClass(), "value", 0.03699061125289671);
        Object term6227 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term6227, term6227.getClass(), "coefficients", null);
        setField(term6227, term6227.getClass(), "relationship", enum97);
        setDoubleField(term6227, term6227.getClass(), "value", 0.6047137830113202);
        ArrayList term6211 = new ArrayList();
        ((ArrayList) term6211).add(term6213);
        ((ArrayList) term6211).add(term6217);
        ((ArrayList) term6211).add(term6221);
        ((ArrayList) term6211).add(term6223);
        ((ArrayList) term6211).add(term6225);
        ((ArrayList) term6211).add(term6227);
        term6208 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term6209 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term6209, term6209.getClass(), "coefficients", null);
        setDoubleField(term6209, term6209.getClass(), "constantTerm", 0.5308350402051779);
        setField(term6208, term6208.getClass(), "f", term6209);
        setField(term6208, term6208.getClass(), "constraints", term6211);
        setBooleanField(term6208, term6208.getClass(), "restrictToNonNegative", false);
        setField(term6208, term6208.getClass(), "tableau", null);
        setIntField(term6208, term6208.getClass(), "numDecisionVariables", -73683645);
        setIntField(term6208, term6208.getClass(), "numSlackVariables", -226514366);
        setIntField(term6208, term6208.getClass(), "numArtificialVariables", 1193880199);
        setDoubleField(term6208, term6208.getClass(), "epsilon", 0.6767213143579776);
        term6236 = new Integer(-1087774327);
        term6238 = new Double(0.48862955528902696);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term6236;
        args[1] = term6238;
        try {
            callMethod(klass, "divideRow", argTypes, term6208, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


