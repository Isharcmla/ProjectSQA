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

public class SimplexTableau_getArtificialVariableOffset_212069912053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11350;
     Object term44819;

    public SimplexTableau_getArtificialVariableOffset_212069912053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term44833 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term44832 = ((Class) term44833).getDeclaredField((String) "LEQ");
        ((Field) term44832).setAccessible(true);
        Object enum103 = ((Field) term44832).get((Object) null);
        Object term11355 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term11355, term11355.getClass(), "coefficients", null);
        setField(term11355, term11355.getClass(), "relationship", enum103);
        setDoubleField(term11355, term11355.getClass(), "value", 0.7080134263823477);
        Class<? extends Object> term45129 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term45128 = ((Class) term45129).getDeclaredField((String) "EQ");
        ((Field) term45128).setAccessible(true);
        Object enum104 = ((Field) term45128).get((Object) null);
        Object term11359 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term11359, term11359.getClass(), "coefficients", null);
        setField(term11359, term11359.getClass(), "relationship", enum104);
        setDoubleField(term11359, term11359.getClass(), "value", 0.6059734092898602);
        Object term11363 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term11363, term11363.getClass(), "coefficients", null);
        setField(term11363, term11363.getClass(), "relationship", enum104);
        setDoubleField(term11363, term11363.getClass(), "value", 0.3074693824288357);
        Object term11365 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term11365, term11365.getClass(), "coefficients", null);
        setField(term11365, term11365.getClass(), "relationship", enum104);
        setDoubleField(term11365, term11365.getClass(), "value", 0.1245258965512791);
        Object term11367 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term11367, term11367.getClass(), "coefficients", null);
        setField(term11367, term11367.getClass(), "relationship", enum103);
        setDoubleField(term11367, term11367.getClass(), "value", 0.9511861072660375);
        ArrayList term11353 = new ArrayList();
        ((ArrayList) term11353).add(term11355);
        ((ArrayList) term11353).add(term11359);
        ((ArrayList) term11353).add(term11363);
        ((ArrayList) term11353).add(term11365);
        ((ArrayList) term11353).add(term11367);
        ArrayList term11372 = new ArrayList();
        term11350 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term11351 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term11351, term11351.getClass(), "coefficients", null);
        setDoubleField(term11351, term11351.getClass(), "constantTerm", 0.7385589312559342);
        setField(term11350, term11350.getClass(), "f", term11351);
        setField(term11350, term11350.getClass(), "constraints", term11353);
        setBooleanField(term11350, term11350.getClass(), "restrictToNonNegative", false);
        setField(term11350, term11350.getClass(), "columnLabels", term11372);
        setField(term11350, term11350.getClass(), "tableau", null);
        setIntField(term11350, term11350.getClass(), "numDecisionVariables", 1540719661);
        setIntField(term11350, term11350.getClass(), "numSlackVariables", 1265463001);
        setIntField(term11350, term11350.getClass(), "numArtificialVariables", 335112684);
        setDoubleField(term11350, term11350.getClass(), "epsilon", 0.05880719443135807);
        setIntField(term11350, term11350.getClass(), "maxUlps", 1551099402);
        Class<? extends Object> term45422 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term45421 = ((Class) term45422).getDeclaredField((String) "LEQ");
        ((Field) term45421).setAccessible(true);
        Object enum105 = ((Field) term45421).get((Object) null);
        Object term44823 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term44823, term44823.getClass(), "coefficients", null);
        setField(term44823, term44823.getClass(), "relationship", enum105);
        setDoubleField(term44823, term44823.getClass(), "value", 0.7080134263823477);
        Class<? extends Object> term45718 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term45717 = ((Class) term45718).getDeclaredField((String) "EQ");
        ((Field) term45717).setAccessible(true);
        Object enum106 = ((Field) term45717).get((Object) null);
        Object term44825 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term44825, term44825.getClass(), "coefficients", null);
        setField(term44825, term44825.getClass(), "relationship", enum106);
        setDoubleField(term44825, term44825.getClass(), "value", 0.6059734092898602);
        Object term44827 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term44827, term44827.getClass(), "coefficients", null);
        setField(term44827, term44827.getClass(), "relationship", enum106);
        setDoubleField(term44827, term44827.getClass(), "value", 0.3074693824288357);
        Object term44828 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term44828, term44828.getClass(), "coefficients", null);
        setField(term44828, term44828.getClass(), "relationship", enum106);
        setDoubleField(term44828, term44828.getClass(), "value", 0.1245258965512791);
        Object term44829 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term44829, term44829.getClass(), "coefficients", null);
        setField(term44829, term44829.getClass(), "relationship", enum105);
        setDoubleField(term44829, term44829.getClass(), "value", 0.9511861072660375);
        ArrayList term44821 = new ArrayList();
        ((ArrayList) term44821).add(term44823);
        ((ArrayList) term44821).add(term44825);
        ((ArrayList) term44821).add(term44827);
        ((ArrayList) term44821).add(term44828);
        ((ArrayList) term44821).add(term44829);
        ArrayList term44830 = new ArrayList();
        term44819 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term44820 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term44820, term44820.getClass(), "coefficients", null);
        setDoubleField(term44820, term44820.getClass(), "constantTerm", 0.7385589312559342);
        setField(term44819, term44819.getClass(), "f", term44820);
        setField(term44819, term44819.getClass(), "constraints", term44821);
        setBooleanField(term44819, term44819.getClass(), "restrictToNonNegative", false);
        setField(term44819, term44819.getClass(), "columnLabels", term44830);
        setField(term44819, term44819.getClass(), "tableau", null);
        setIntField(term44819, term44819.getClass(), "numDecisionVariables", 1540719661);
        setIntField(term44819, term44819.getClass(), "numSlackVariables", 1265463001);
        setIntField(term44819, term44819.getClass(), "numArtificialVariables", 335112684);
        setDoubleField(term44819, term44819.getClass(), "epsilon", 0.05880719443135807);
        setIntField(term44819, term44819.getClass(), "maxUlps", 1551099402);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getArtificialVariableOffset", argTypes, term11350, args);
        assertTrue(recursiveEquals(term11350, term44819));
        assertTrue(recursiveEquals(retValue, -1488784632));
    }

};


