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

public class SimplexTableau_getNumSlackVariables_41791402457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14196;
     Object term48976;

    public SimplexTableau_getNumSlackVariables_41791402457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term49055 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term49054 = ((Class) term49055).getDeclaredField((String) "GEQ");
        ((Field) term49054).setAccessible(true);
        Object enum113 = ((Field) term49054).get((Object) null);
        Object term14201 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term14201, term14201.getClass(), "coefficients", null);
        setField(term14201, term14201.getClass(), "relationship", enum113);
        setDoubleField(term14201, term14201.getClass(), "value", 0.841460835734741);
        Class<? extends Object> term49351 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term49350 = ((Class) term49351).getDeclaredField((String) "GEQ");
        ((Field) term49350).setAccessible(true);
        Object enum114 = ((Field) term49350).get((Object) null);
        Object term14205 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term14205, term14205.getClass(), "coefficients", null);
        setField(term14205, term14205.getClass(), "relationship", enum114);
        setDoubleField(term14205, term14205.getClass(), "value", 0.7859316615744082);
        Object term14209 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term14209, term14209.getClass(), "coefficients", null);
        setField(term14209, term14209.getClass(), "relationship", enum114);
        setDoubleField(term14209, term14209.getClass(), "value", 0.6428742553484879);
        Class<? extends Object> term50325 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term50324 = ((Class) term50325).getDeclaredField((String) "LEQ");
        ((Field) term50324).setAccessible(true);
        Object enum118 = ((Field) term50324).get((Object) null);
        Object term14211 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term14211, term14211.getClass(), "coefficients", null);
        setField(term14211, term14211.getClass(), "relationship", enum118);
        setDoubleField(term14211, term14211.getClass(), "value", 0.6584165706677267);
        Object term14215 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term14215, term14215.getClass(), "coefficients", null);
        setField(term14215, term14215.getClass(), "relationship", enum113);
        setDoubleField(term14215, term14215.getClass(), "value", 0.44268490778872205);
        Object term14217 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term14217, term14217.getClass(), "coefficients", null);
        setField(term14217, term14217.getClass(), "relationship", enum113);
        setDoubleField(term14217, term14217.getClass(), "value", 0.7507333108648018);
        ArrayList term14199 = new ArrayList();
        ((ArrayList) term14199).add(term14201);
        ((ArrayList) term14199).add(term14205);
        ((ArrayList) term14199).add(term14209);
        ((ArrayList) term14199).add(term14211);
        ((ArrayList) term14199).add(term14215);
        ((ArrayList) term14199).add(term14217);
        ArrayList term14222 = new ArrayList();
        term14196 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term14197 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term14197, term14197.getClass(), "coefficients", null);
        setDoubleField(term14197, term14197.getClass(), "constantTerm", 0.4355627280318103);
        setField(term14196, term14196.getClass(), "f", term14197);
        setField(term14196, term14196.getClass(), "constraints", term14199);
        setBooleanField(term14196, term14196.getClass(), "restrictToNonNegative", true);
        setField(term14196, term14196.getClass(), "columnLabels", term14222);
        setField(term14196, term14196.getClass(), "tableau", null);
        setIntField(term14196, term14196.getClass(), "numDecisionVariables", 1114000454);
        setIntField(term14196, term14196.getClass(), "numSlackVariables", -556405712);
        setIntField(term14196, term14196.getClass(), "numArtificialVariables", -1772434990);
        setDoubleField(term14196, term14196.getClass(), "epsilon", 0.007493740494434409);
        setIntField(term14196, term14196.getClass(), "maxUlps", -1845499264);
        Class<? extends Object> term51233 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term51232 = ((Class) term51233).getDeclaredField((String) "EQ");
        ((Field) term51232).setAccessible(true);
        Object enum121 = ((Field) term51232).get((Object) null);
        Object term48994 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term48994, term48994.getClass(), "coefficients", null);
        setField(term48994, term48994.getClass(), "relationship", enum121);
        setDoubleField(term48994, term48994.getClass(), "value", 0.841460835734741);
        Class<? extends Object> term51730 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term51729 = ((Class) term51730).getDeclaredField((String) "GEQ");
        ((Field) term51729).setAccessible(true);
        Object enum122 = ((Field) term51729).get((Object) null);
        Object term49006 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term49006, term49006.getClass(), "coefficients", null);
        setField(term49006, term49006.getClass(), "relationship", enum122);
        setDoubleField(term49006, term49006.getClass(), "value", 0.7859316615744082);
        Object term49008 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term49008, term49008.getClass(), "coefficients", null);
        setField(term49008, term49008.getClass(), "relationship", enum122);
        setDoubleField(term49008, term49008.getClass(), "value", 0.6428742553484879);
        Class<? extends Object> term52026 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term52025 = ((Class) term52026).getDeclaredField((String) "LEQ");
        ((Field) term52025).setAccessible(true);
        Object enum123 = ((Field) term52025).get((Object) null);
        Object term49015 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term49015, term49015.getClass(), "coefficients", null);
        setField(term49015, term49015.getClass(), "relationship", enum123);
        setDoubleField(term49015, term49015.getClass(), "value", 0.6584165706677267);
        Object term49021 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term49021, term49021.getClass(), "coefficients", null);
        setField(term49021, term49021.getClass(), "relationship", enum121);
        setDoubleField(term49021, term49021.getClass(), "value", 0.44268490778872205);
        Object term49031 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term49031, term49031.getClass(), "coefficients", null);
        setField(term49031, term49031.getClass(), "relationship", enum121);
        setDoubleField(term49031, term49031.getClass(), "value", 0.7507333108648018);
        ArrayList term48987 = new ArrayList();
        ((ArrayList) term48987).add(term48994);
        ((ArrayList) term48987).add(term49006);
        ((ArrayList) term48987).add(term49008);
        ((ArrayList) term48987).add(term49015);
        ((ArrayList) term48987).add(term49021);
        ((ArrayList) term48987).add(term49031);
        ArrayList term49034 = new ArrayList();
        term48976 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term48982 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term48982, term48982.getClass(), "coefficients", null);
        setDoubleField(term48982, term48982.getClass(), "constantTerm", 0.4355627280318103);
        setField(term48976, term48976.getClass(), "f", term48982);
        setField(term48976, term48976.getClass(), "constraints", term48987);
        setBooleanField(term48976, term48976.getClass(), "restrictToNonNegative", true);
        setField(term48976, term48976.getClass(), "columnLabels", term49034);
        setField(term48976, term48976.getClass(), "tableau", null);
        setIntField(term48976, term48976.getClass(), "numDecisionVariables", 1114000454);
        setIntField(term48976, term48976.getClass(), "numSlackVariables", -556405712);
        setIntField(term48976, term48976.getClass(), "numArtificialVariables", -1772434990);
        setDoubleField(term48976, term48976.getClass(), "epsilon", 0.007493740494434409);
        setIntField(term48976, term48976.getClass(), "maxUlps", -1845499264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNumSlackVariables", argTypes, term14196, args);
        assertTrue(recursiveEquals(term14196, term48976));
        assertTrue(recursiveEquals(retValue, -556405712));
    }

};


