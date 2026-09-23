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

public class SimplexTableau_getRhsOffset_11176061957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12974;

    public SimplexTableau_getRhsOffset_11176061957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term52544 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term52543 = ((Class) term52544).getDeclaredField((String) "EQ");
        ((Field) term52543).setAccessible(true);
        Object enum131 = ((Field) term52543).get((Object) null);
        Object term12979 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term12979, term12979.getClass(), "coefficients", null);
        setField(term12979, term12979.getClass(), "relationship", enum131);
        setDoubleField(term12979, term12979.getClass(), "value", 0.2446504549754045);
        Class<? extends Object> term52837 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term52836 = ((Class) term52837).getDeclaredField((String) "EQ");
        ((Field) term52836).setAccessible(true);
        Object enum132 = ((Field) term52836).get((Object) null);
        Object term12983 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term12983, term12983.getClass(), "coefficients", null);
        setField(term12983, term12983.getClass(), "relationship", enum132);
        setDoubleField(term12983, term12983.getClass(), "value", 0.6142723998707854);
        Object term12987 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term12987, term12987.getClass(), "coefficients", null);
        setField(term12987, term12987.getClass(), "relationship", enum132);
        setDoubleField(term12987, term12987.getClass(), "value", 0.4355627280318103);
        Class<? extends Object> term53130 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term53129 = ((Class) term53130).getDeclaredField((String) "EQ");
        ((Field) term53129).setAccessible(true);
        Object enum133 = ((Field) term53129).get((Object) null);
        Object term12989 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term12989, term12989.getClass(), "coefficients", null);
        setField(term12989, term12989.getClass(), "relationship", enum133);
        setDoubleField(term12989, term12989.getClass(), "value", 0.841460835734741);
        ArrayList term12977 = new ArrayList();
        ((ArrayList) term12977).add(term12979);
        ((ArrayList) term12977).add(term12983);
        ((ArrayList) term12977).add(term12987);
        ((ArrayList) term12977).add(term12989);
        term12974 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term12975 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term12975, term12975.getClass(), "coefficients", null);
        setDoubleField(term12975, term12975.getClass(), "constantTerm", 0.4772043271031934);
        setField(term12974, term12974.getClass(), "f", term12975);
        setField(term12974, term12974.getClass(), "constraints", term12977);
        setBooleanField(term12974, term12974.getClass(), "restrictToNonNegative", true);
        setField(term12974, term12974.getClass(), "tableau", null);
        setIntField(term12974, term12974.getClass(), "numDecisionVariables", 1324040357);
        setIntField(term12974, term12974.getClass(), "numSlackVariables", -1588772968);
        setIntField(term12974, term12974.getClass(), "numArtificialVariables", -93135961);
        setDoubleField(term12974, term12974.getClass(), "epsilon", 0.7859316615744082);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRhsOffset", argTypes, term12974, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


