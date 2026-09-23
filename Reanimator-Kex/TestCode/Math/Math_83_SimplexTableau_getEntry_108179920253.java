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

public class SimplexTableau_getEntry_108179920253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10210;
     Object term10238;
     Object term10240;

    public SimplexTableau_getEntry_108179920253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term47822 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term47821 = ((Class) term47822).getDeclaredField((String) "EQ");
        ((Field) term47821).setAccessible(true);
        Object enum117 = ((Field) term47821).get((Object) null);
        Object term10215 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term10215, term10215.getClass(), "coefficients", null);
        setField(term10215, term10215.getClass(), "relationship", enum117);
        setDoubleField(term10215, term10215.getClass(), "value", 0.09037487793444521);
        Class<? extends Object> term48115 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term48114 = ((Class) term48115).getDeclaredField((String) "EQ");
        ((Field) term48114).setAccessible(true);
        Object enum118 = ((Field) term48114).get((Object) null);
        Object term10219 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term10219, term10219.getClass(), "coefficients", null);
        setField(term10219, term10219.getClass(), "relationship", enum118);
        setDoubleField(term10219, term10219.getClass(), "value", 0.6561919196821765);
        Class<? extends Object> term48408 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term48407 = ((Class) term48408).getDeclaredField((String) "GEQ");
        ((Field) term48407).setAccessible(true);
        Object enum119 = ((Field) term48407).get((Object) null);
        Object term10223 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term10223, term10223.getClass(), "coefficients", null);
        setField(term10223, term10223.getClass(), "relationship", enum119);
        setDoubleField(term10223, term10223.getClass(), "value", 0.7330178886612495);
        Object term10227 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term10227, term10227.getClass(), "coefficients", null);
        setField(term10227, term10227.getClass(), "relationship", enum118);
        setDoubleField(term10227, term10227.getClass(), "value", 0.7618164754425794);
        Object term10229 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term10229, term10229.getClass(), "coefficients", null);
        setField(term10229, term10229.getClass(), "relationship", enum119);
        setDoubleField(term10229, term10229.getClass(), "value", 0.7385589312559342);
        ArrayList term10213 = new ArrayList();
        ((ArrayList) term10213).add(term10215);
        ((ArrayList) term10213).add(term10219);
        ((ArrayList) term10213).add(term10223);
        ((ArrayList) term10213).add(term10227);
        ((ArrayList) term10213).add(term10229);
        term10210 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term10211 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term10211, term10211.getClass(), "coefficients", null);
        setDoubleField(term10211, term10211.getClass(), "constantTerm", 0.623231822150205);
        setField(term10210, term10210.getClass(), "f", term10211);
        setField(term10210, term10210.getClass(), "constraints", term10213);
        setBooleanField(term10210, term10210.getClass(), "restrictToNonNegative", false);
        setField(term10210, term10210.getClass(), "tableau", null);
        setIntField(term10210, term10210.getClass(), "numDecisionVariables", 292681826);
        setIntField(term10210, term10210.getClass(), "numSlackVariables", 458147407);
        setIntField(term10210, term10210.getClass(), "numArtificialVariables", -184153539);
        setDoubleField(term10210, term10210.getClass(), "epsilon", 0.7080134263823477);
        term10238 = new Integer(493620644);
        term10240 = new Integer(1328271830);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term10238;
        args[1] = term10240;
        try {
            callMethod(klass, "getEntry", argTypes, term10210, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


