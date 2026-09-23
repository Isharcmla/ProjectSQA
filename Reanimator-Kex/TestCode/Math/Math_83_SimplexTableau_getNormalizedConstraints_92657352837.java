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

public class SimplexTableau_getNormalizedConstraints_92657352837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1856;
     Object term31460;
     Object term31444;

    public SimplexTableau_getNormalizedConstraints_92657352837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31480 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term31479 = ((Class) term31480).getDeclaredField((String) "EQ");
        ((Field) term31479).setAccessible(true);
        Object enum73 = ((Field) term31479).get((Object) null);
        Object term1861 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term1861, term1861.getClass(), "coefficients", null);
        setField(term1861, term1861.getClass(), "relationship", enum73);
        setDoubleField(term1861, term1861.getClass(), "value", 0.9527281779865117);
        Class<? extends Object> term31773 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term31772 = ((Class) term31773).getDeclaredField((String) "EQ");
        ((Field) term31772).setAccessible(true);
        Object enum74 = ((Field) term31772).get((Object) null);
        Object term1865 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term1865, term1865.getClass(), "coefficients", null);
        setField(term1865, term1865.getClass(), "relationship", enum74);
        setDoubleField(term1865, term1865.getClass(), "value", 0.9828442029246764);
        Object term1869 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term1869, term1869.getClass(), "coefficients", null);
        setField(term1869, term1869.getClass(), "relationship", enum73);
        setDoubleField(term1869, term1869.getClass(), "value", 0.2779719046761513);
        Object term1871 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term1871, term1871.getClass(), "coefficients", null);
        setField(term1871, term1871.getClass(), "relationship", enum74);
        setDoubleField(term1871, term1871.getClass(), "value", 0.6436713023569729);
        Object term1873 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term1873, term1873.getClass(), "coefficients", null);
        setField(term1873, term1873.getClass(), "relationship", enum73);
        setDoubleField(term1873, term1873.getClass(), "value", 0.7332741045694002);
        Class<? extends Object> term32066 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term32065 = ((Class) term32066).getDeclaredField((String) "EQ");
        ((Field) term32065).setAccessible(true);
        Object enum75 = ((Field) term32065).get((Object) null);
        Object term1875 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term1875, term1875.getClass(), "coefficients", null);
        setField(term1875, term1875.getClass(), "relationship", enum75);
        setDoubleField(term1875, term1875.getClass(), "value", 0.4569171842750229);
        ArrayList term1859 = new ArrayList();
        ((ArrayList) term1859).add(term1861);
        ((ArrayList) term1859).add(term1865);
        ((ArrayList) term1859).add(term1869);
        ((ArrayList) term1859).add(term1871);
        ((ArrayList) term1859).add(term1873);
        ((ArrayList) term1859).add(term1875);
        term1856 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term1857 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term1857, term1857.getClass(), "coefficients", null);
        setDoubleField(term1857, term1857.getClass(), "constantTerm", 0.7031006357544823);
        setField(term1856, term1856.getClass(), "f", term1857);
        setField(term1856, term1856.getClass(), "constraints", term1859);
        setBooleanField(term1856, term1856.getClass(), "restrictToNonNegative", false);
        setField(term1856, term1856.getClass(), "tableau", null);
        setIntField(term1856, term1856.getClass(), "numDecisionVariables", -1955890973);
        setIntField(term1856, term1856.getClass(), "numSlackVariables", -2038273078);
        setIntField(term1856, term1856.getClass(), "numArtificialVariables", 1227103734);
        setDoubleField(term1856, term1856.getClass(), "epsilon", 0.8598297828918529);
        Class<? extends Object> term32359 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term32358 = ((Class) term32359).getDeclaredField((String) "GEQ");
        ((Field) term32358).setAccessible(true);
        Object enum76 = ((Field) term32358).get((Object) null);
        Object term31464 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term31464, term31464.getClass(), "coefficients", null);
        setField(term31464, term31464.getClass(), "relationship", enum76);
        setDoubleField(term31464, term31464.getClass(), "value", 0.9527281779865117);
        Class<? extends Object> term32655 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term32654 = ((Class) term32655).getDeclaredField((String) "LEQ");
        ((Field) term32654).setAccessible(true);
        Object enum77 = ((Field) term32654).get((Object) null);
        Object term31468 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term31468, term31468.getClass(), "coefficients", null);
        setField(term31468, term31468.getClass(), "relationship", enum77);
        setDoubleField(term31468, term31468.getClass(), "value", 0.9828442029246764);
        Object term31472 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term31472, term31472.getClass(), "coefficients", null);
        setField(term31472, term31472.getClass(), "relationship", enum76);
        setDoubleField(term31472, term31472.getClass(), "value", 0.2779719046761513);
        Object term31473 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term31473, term31473.getClass(), "coefficients", null);
        setField(term31473, term31473.getClass(), "relationship", enum77);
        setDoubleField(term31473, term31473.getClass(), "value", 0.6436713023569729);
        Object term31474 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term31474, term31474.getClass(), "coefficients", null);
        setField(term31474, term31474.getClass(), "relationship", enum76);
        setDoubleField(term31474, term31474.getClass(), "value", 0.7332741045694002);
        Class<? extends Object> term32951 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term32950 = ((Class) term32951).getDeclaredField((String) "GEQ");
        ((Field) term32950).setAccessible(true);
        Object enum78 = ((Field) term32950).get((Object) null);
        Object term31475 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term31475, term31475.getClass(), "coefficients", null);
        setField(term31475, term31475.getClass(), "relationship", enum78);
        setDoubleField(term31475, term31475.getClass(), "value", 0.4569171842750229);
        ArrayList term31462 = new ArrayList();
        ((ArrayList) term31462).add(term31464);
        ((ArrayList) term31462).add(term31468);
        ((ArrayList) term31462).add(term31472);
        ((ArrayList) term31462).add(term31473);
        ((ArrayList) term31462).add(term31474);
        ((ArrayList) term31462).add(term31475);
        term31460 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term31461 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term31461, term31461.getClass(), "coefficients", null);
        setDoubleField(term31461, term31461.getClass(), "constantTerm", 0.7031006357544823);
        setField(term31460, term31460.getClass(), "f", term31461);
        setField(term31460, term31460.getClass(), "constraints", term31462);
        setBooleanField(term31460, term31460.getClass(), "restrictToNonNegative", false);
        setField(term31460, term31460.getClass(), "tableau", null);
        setIntField(term31460, term31460.getClass(), "numDecisionVariables", -1955890973);
        setIntField(term31460, term31460.getClass(), "numSlackVariables", -2038273078);
        setIntField(term31460, term31460.getClass(), "numArtificialVariables", 1227103734);
        setDoubleField(term31460, term31460.getClass(), "epsilon", 0.8598297828918529);
        Class<? extends Object> term33247 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term33246 = ((Class) term33247).getDeclaredField((String) "EQ");
        ((Field) term33246).setAccessible(true);
        Object enum79 = ((Field) term33246).get((Object) null);
        Object term31446 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term31446, term31446.getClass(), "coefficients", null);
        setField(term31446, term31446.getClass(), "relationship", enum79);
        setDoubleField(term31446, term31446.getClass(), "value", 0.9527281779865117);
        Class<? extends Object> term33540 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term33539 = ((Class) term33540).getDeclaredField((String) "EQ");
        ((Field) term33539).setAccessible(true);
        Object enum80 = ((Field) term33539).get((Object) null);
        Object term31448 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term31448, term31448.getClass(), "coefficients", null);
        setField(term31448, term31448.getClass(), "relationship", enum80);
        setDoubleField(term31448, term31448.getClass(), "value", 0.9828442029246764);
        Object term31450 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term31450, term31450.getClass(), "coefficients", null);
        setField(term31450, term31450.getClass(), "relationship", enum79);
        setDoubleField(term31450, term31450.getClass(), "value", 0.2779719046761513);
        Object term31452 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term31452, term31452.getClass(), "coefficients", null);
        setField(term31452, term31452.getClass(), "relationship", enum80);
        setDoubleField(term31452, term31452.getClass(), "value", 0.6436713023569729);
        Object term31454 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term31454, term31454.getClass(), "coefficients", null);
        setField(term31454, term31454.getClass(), "relationship", enum79);
        setDoubleField(term31454, term31454.getClass(), "value", 0.7332741045694002);
        Class<? extends Object> term33833 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term33832 = ((Class) term33833).getDeclaredField((String) "LEQ");
        ((Field) term33832).setAccessible(true);
        Object enum81 = ((Field) term33832).get((Object) null);
        Object term31456 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term31456, term31456.getClass(), "coefficients", null);
        setField(term31456, term31456.getClass(), "relationship", enum81);
        setDoubleField(term31456, term31456.getClass(), "value", 0.4569171842750229);
        term31444 = new ArrayList();
        ((ArrayList) term31444).add(term31446);
        ((ArrayList) term31444).add(term31448);
        ((ArrayList) term31444).add(term31450);
        ((ArrayList) term31444).add(term31452);
        ((ArrayList) term31444).add(term31454);
        ((ArrayList) term31444).add(term31456);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNormalizedConstraints", argTypes, term1856, args);
        assertTrue(recursiveEquals(term1856, term31460));
        assertTrue(recursiveEquals(retValue, term31444));
    }

};


