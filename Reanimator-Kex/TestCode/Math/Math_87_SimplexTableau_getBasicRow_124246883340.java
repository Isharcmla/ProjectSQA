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

public class SimplexTableau_getBasicRow_124246883340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4624;
     Object term4646;

    public SimplexTableau_getBasicRow_124246883340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term34923 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term34922 = ((Class) term34923).getDeclaredField((String) "LEQ");
        ((Field) term34922).setAccessible(true);
        Object enum87 = ((Field) term34922).get((Object) null);
        Object term4629 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term4629, term4629.getClass(), "coefficients", null);
        setField(term4629, term4629.getClass(), "relationship", enum87);
        setDoubleField(term4629, term4629.getClass(), "value", 0.6588948704887806);
        Class<? extends Object> term35219 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term35218 = ((Class) term35219).getDeclaredField((String) "LEQ");
        ((Field) term35218).setAccessible(true);
        Object enum88 = ((Field) term35218).get((Object) null);
        Object term4633 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term4633, term4633.getClass(), "coefficients", null);
        setField(term4633, term4633.getClass(), "relationship", enum88);
        setDoubleField(term4633, term4633.getClass(), "value", 0.6397214730945112);
        Object term4637 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term4637, term4637.getClass(), "coefficients", null);
        setField(term4637, term4637.getClass(), "relationship", enum88);
        setDoubleField(term4637, term4637.getClass(), "value", 0.25937345430928016);
        ArrayList term4627 = new ArrayList();
        ((ArrayList) term4627).add(term4629);
        ((ArrayList) term4627).add(term4633);
        ((ArrayList) term4627).add(term4637);
        term4624 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term4625 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term4625, term4625.getClass(), "coefficients", null);
        setDoubleField(term4625, term4625.getClass(), "constantTerm", 0.8878841294187743);
        setField(term4624, term4624.getClass(), "f", term4625);
        setField(term4624, term4624.getClass(), "constraints", term4627);
        setBooleanField(term4624, term4624.getClass(), "restrictToNonNegative", false);
        setField(term4624, term4624.getClass(), "tableau", null);
        setIntField(term4624, term4624.getClass(), "numDecisionVariables", 1622346318);
        setIntField(term4624, term4624.getClass(), "numSlackVariables", 1048535127);
        setIntField(term4624, term4624.getClass(), "numArtificialVariables", -655067527);
        setDoubleField(term4624, term4624.getClass(), "epsilon", 0.5873228247510078);
        term4646 = new Integer(-6029667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4646;
        try {
            callMethod(klass, "getBasicRow", argTypes, term4624, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


