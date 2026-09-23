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

public class SimplexTableau_getNumSlackVariables_41285518357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14396;
     Object term50529;

    public SimplexTableau_getNumSlackVariables_41285518357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term50545 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term50544 = ((Class) term50545).getDeclaredField((String) "GEQ");
        ((Field) term50544).setAccessible(true);
        Object enum111 = ((Field) term50544).get((Object) null);
        Object term14401 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term14401, term14401.getClass(), "coefficients", null);
        setField(term14401, term14401.getClass(), "relationship", enum111);
        setDoubleField(term14401, term14401.getClass(), "value", 0.841460835734741);
        Class<? extends Object> term50846 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term50845 = ((Class) term50846).getDeclaredField((String) "GEQ");
        ((Field) term50845).setAccessible(true);
        Object enum112 = ((Field) term50845).get((Object) null);
        Object term14405 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term14405, term14405.getClass(), "coefficients", null);
        setField(term14405, term14405.getClass(), "relationship", enum112);
        setDoubleField(term14405, term14405.getClass(), "value", 0.7859316615744082);
        Object term14409 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term14409, term14409.getClass(), "coefficients", null);
        setField(term14409, term14409.getClass(), "relationship", enum112);
        setDoubleField(term14409, term14409.getClass(), "value", 0.6428742553484879);
        Class<? extends Object> term51195 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term51194 = ((Class) term51195).getDeclaredField((String) "GEQ");
        ((Field) term51194).setAccessible(true);
        Object enum113 = ((Field) term51194).get((Object) null);
        Object term14411 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term14411, term14411.getClass(), "coefficients", null);
        setField(term14411, term14411.getClass(), "relationship", enum113);
        setDoubleField(term14411, term14411.getClass(), "value", 0.6584165706677267);
        Object term14415 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term14415, term14415.getClass(), "coefficients", null);
        setField(term14415, term14415.getClass(), "relationship", enum111);
        setDoubleField(term14415, term14415.getClass(), "value", 0.44268490778872205);
        Object term14417 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term14417, term14417.getClass(), "coefficients", null);
        setField(term14417, term14417.getClass(), "relationship", enum111);
        setDoubleField(term14417, term14417.getClass(), "value", 0.7507333108648018);
        ArrayList term14399 = new ArrayList();
        ((ArrayList) term14399).add(term14401);
        ((ArrayList) term14399).add(term14405);
        ((ArrayList) term14399).add(term14409);
        ((ArrayList) term14399).add(term14411);
        ((ArrayList) term14399).add(term14415);
        ((ArrayList) term14399).add(term14417);
        ArrayList term14422 = new ArrayList();
        term14396 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term14397 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setField(term14397, term14397.getClass(), "coefficients", null);
        setDoubleField(term14397, term14397.getClass(), "constantTerm", 0.4355627280318103);
        setField(term14396, term14396.getClass(), "f", term14397);
        setField(term14396, term14396.getClass(), "constraints", term14399);
        setBooleanField(term14396, term14396.getClass(), "restrictToNonNegative", true);
        setField(term14396, term14396.getClass(), "columnLabels", term14422);
        setField(term14396, term14396.getClass(), "tableau", null);
        setIntField(term14396, term14396.getClass(), "numDecisionVariables", 1114000454);
        setIntField(term14396, term14396.getClass(), "numSlackVariables", -556405712);
        setIntField(term14396, term14396.getClass(), "numArtificialVariables", -1772434990);
        setDoubleField(term14396, term14396.getClass(), "epsilon", 0.007493740494434409);
        setIntField(term14396, term14396.getClass(), "maxUlps", -1845499264);
        Class<? extends Object> term51496 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term51495 = ((Class) term51496).getDeclaredField((String) "GEQ");
        ((Field) term51495).setAccessible(true);
        Object enum114 = ((Field) term51495).get((Object) null);
        Object term50533 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term50533, term50533.getClass(), "coefficients", null);
        setField(term50533, term50533.getClass(), "relationship", enum114);
        setDoubleField(term50533, term50533.getClass(), "value", 0.841460835734741);
        Class<? extends Object> term51797 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term51796 = ((Class) term51797).getDeclaredField((String) "EQ");
        ((Field) term51796).setAccessible(true);
        Object enum115 = ((Field) term51796).get((Object) null);
        Object term50535 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term50535, term50535.getClass(), "coefficients", null);
        setField(term50535, term50535.getClass(), "relationship", enum115);
        setDoubleField(term50535, term50535.getClass(), "value", 0.7859316615744082);
        Object term50537 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term50537, term50537.getClass(), "coefficients", null);
        setField(term50537, term50537.getClass(), "relationship", enum115);
        setDoubleField(term50537, term50537.getClass(), "value", 0.6428742553484879);
        Class<? extends Object> term52095 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term52094 = ((Class) term52095).getDeclaredField((String) "LEQ");
        ((Field) term52094).setAccessible(true);
        Object enum116 = ((Field) term52094).get((Object) null);
        Object term50538 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term50538, term50538.getClass(), "coefficients", null);
        setField(term50538, term50538.getClass(), "relationship", enum116);
        setDoubleField(term50538, term50538.getClass(), "value", 0.6584165706677267);
        Object term50540 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term50540, term50540.getClass(), "coefficients", null);
        setField(term50540, term50540.getClass(), "relationship", enum114);
        setDoubleField(term50540, term50540.getClass(), "value", 0.44268490778872205);
        Object term50541 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term50541, term50541.getClass(), "coefficients", null);
        setField(term50541, term50541.getClass(), "relationship", enum114);
        setDoubleField(term50541, term50541.getClass(), "value", 0.7507333108648018);
        ArrayList term50531 = new ArrayList();
        ((ArrayList) term50531).add(term50533);
        ((ArrayList) term50531).add(term50535);
        ((ArrayList) term50531).add(term50537);
        ((ArrayList) term50531).add(term50538);
        ((ArrayList) term50531).add(term50540);
        ((ArrayList) term50531).add(term50541);
        ArrayList term50542 = new ArrayList();
        term50529 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term50530 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setField(term50530, term50530.getClass(), "coefficients", null);
        setDoubleField(term50530, term50530.getClass(), "constantTerm", 0.4355627280318103);
        setField(term50529, term50529.getClass(), "f", term50530);
        setField(term50529, term50529.getClass(), "constraints", term50531);
        setBooleanField(term50529, term50529.getClass(), "restrictToNonNegative", true);
        setField(term50529, term50529.getClass(), "columnLabels", term50542);
        setField(term50529, term50529.getClass(), "tableau", null);
        setIntField(term50529, term50529.getClass(), "numDecisionVariables", 1114000454);
        setIntField(term50529, term50529.getClass(), "numSlackVariables", -556405712);
        setIntField(term50529, term50529.getClass(), "numArtificialVariables", -1772434990);
        setDoubleField(term50529, term50529.getClass(), "epsilon", 0.007493740494434409);
        setIntField(term50529, term50529.getClass(), "maxUlps", -1845499264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNumSlackVariables", argTypes, term14396, args);
        assertTrue(recursiveEquals(term14396, term50529));
        assertTrue(recursiveEquals(retValue, -556405712));
    }

};


