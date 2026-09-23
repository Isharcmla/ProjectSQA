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

public class SimplexTableau_getNumSlackVariables_41791402455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13886;
     Object term49200;

    public SimplexTableau_getNumSlackVariables_41791402455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term49504 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term49503 = ((Class) term49504).getDeclaredField((String) "GEQ");
        ((Field) term49503).setAccessible(true);
        Object enum126 = ((Field) term49503).get((Object) null);
        Object term13891 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term13891, term13891.getClass(), "coefficients", null);
        setField(term13891, term13891.getClass(), "relationship", enum126);
        setDoubleField(term13891, term13891.getClass(), "value", 0.7507333108648018);
        Object term13895 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term13895, term13895.getClass(), "coefficients", null);
        setField(term13895, term13895.getClass(), "relationship", enum126);
        setDoubleField(term13895, term13895.getClass(), "value", 0.007493740494434409);
        Class<? extends Object> term50692 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term50691 = ((Class) term50692).getDeclaredField((String) "LEQ");
        ((Field) term50691).setAccessible(true);
        Object enum128 = ((Field) term50691).get((Object) null);
        Object term13897 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term13897, term13897.getClass(), "coefficients", null);
        setField(term13897, term13897.getClass(), "relationship", enum128);
        setDoubleField(term13897, term13897.getClass(), "value", 0.29172553321356776);
        Object term13901 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term13901, term13901.getClass(), "coefficients", null);
        setField(term13901, term13901.getClass(), "relationship", enum128);
        setDoubleField(term13901, term13901.getClass(), "value", 0.9276995636844321);
        Class<? extends Object> term50988 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term50987 = ((Class) term50988).getDeclaredField((String) "LEQ");
        ((Field) term50987).setAccessible(true);
        Object enum131 = ((Field) term50987).get((Object) null);
        Object term13903 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term13903, term13903.getClass(), "coefficients", null);
        setField(term13903, term13903.getClass(), "relationship", enum131);
        setDoubleField(term13903, term13903.getClass(), "value", 0.7636130748477434);
        Object term13907 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term13907, term13907.getClass(), "coefficients", null);
        setField(term13907, term13907.getClass(), "relationship", enum131);
        setDoubleField(term13907, term13907.getClass(), "value", 0.07901636960861558);
        ArrayList term13889 = new ArrayList();
        ((ArrayList) term13889).add(term13891);
        ((ArrayList) term13889).add(term13895);
        ((ArrayList) term13889).add(term13897);
        ((ArrayList) term13889).add(term13901);
        ((ArrayList) term13889).add(term13903);
        ((ArrayList) term13889).add(term13907);
        term13886 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term13887 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term13887, term13887.getClass(), "coefficients", null);
        setDoubleField(term13887, term13887.getClass(), "constantTerm", 0.44268490778872205);
        setField(term13886, term13886.getClass(), "f", term13887);
        setField(term13886, term13886.getClass(), "constraints", term13889);
        setBooleanField(term13886, term13886.getClass(), "restrictToNonNegative", true);
        setField(term13886, term13886.getClass(), "tableau", null);
        setIntField(term13886, term13886.getClass(), "numDecisionVariables", -1588772968);
        setIntField(term13886, term13886.getClass(), "numSlackVariables", -93135961);
        setIntField(term13886, term13886.getClass(), "numArtificialVariables", -112921587);
        setDoubleField(term13886, term13886.getClass(), "epsilon", 0.18717846301066243);
        Class<? extends Object> term51377 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term51376 = ((Class) term51377).getDeclaredField((String) "EQ");
        ((Field) term51376).setAccessible(true);
        Object enum132 = ((Field) term51376).get((Object) null);
        Object term49204 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term49204, term49204.getClass(), "coefficients", null);
        setField(term49204, term49204.getClass(), "relationship", enum132);
        setDoubleField(term49204, term49204.getClass(), "value", 0.7507333108648018);
        Object term49206 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term49206, term49206.getClass(), "coefficients", null);
        setField(term49206, term49206.getClass(), "relationship", enum132);
        setDoubleField(term49206, term49206.getClass(), "value", 0.007493740494434409);
        Class<? extends Object> term51939 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term51938 = ((Class) term51939).getDeclaredField((String) "EQ");
        ((Field) term51938).setAccessible(true);
        Object enum133 = ((Field) term51938).get((Object) null);
        Object term49207 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term49207, term49207.getClass(), "coefficients", null);
        setField(term49207, term49207.getClass(), "relationship", enum133);
        setDoubleField(term49207, term49207.getClass(), "value", 0.29172553321356776);
        Object term49209 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term49209, term49209.getClass(), "coefficients", null);
        setField(term49209, term49209.getClass(), "relationship", enum133);
        setDoubleField(term49209, term49209.getClass(), "value", 0.9276995636844321);
        Object term49210 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term49210, term49210.getClass(), "coefficients", null);
        setField(term49210, term49210.getClass(), "relationship", enum133);
        setDoubleField(term49210, term49210.getClass(), "value", 0.7636130748477434);
        Object term49215 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term49215, term49215.getClass(), "coefficients", null);
        setField(term49215, term49215.getClass(), "relationship", enum133);
        setDoubleField(term49215, term49215.getClass(), "value", 0.07901636960861558);
        ArrayList term49202 = new ArrayList();
        ((ArrayList) term49202).add(term49204);
        ((ArrayList) term49202).add(term49206);
        ((ArrayList) term49202).add(term49207);
        ((ArrayList) term49202).add(term49209);
        ((ArrayList) term49202).add(term49210);
        ((ArrayList) term49202).add(term49215);
        term49200 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term49201 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term49201, term49201.getClass(), "coefficients", null);
        setDoubleField(term49201, term49201.getClass(), "constantTerm", 0.44268490778872205);
        setField(term49200, term49200.getClass(), "f", term49201);
        setField(term49200, term49200.getClass(), "constraints", term49202);
        setBooleanField(term49200, term49200.getClass(), "restrictToNonNegative", true);
        setField(term49200, term49200.getClass(), "tableau", null);
        setIntField(term49200, term49200.getClass(), "numDecisionVariables", -1588772968);
        setIntField(term49200, term49200.getClass(), "numSlackVariables", -93135961);
        setIntField(term49200, term49200.getClass(), "numArtificialVariables", -112921587);
        setDoubleField(term49200, term49200.getClass(), "epsilon", 0.18717846301066243);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNumSlackVariables", argTypes, term13886, args);
        assertTrue(recursiveEquals(term13886, term49200));
        assertTrue(recursiveEquals(retValue, -93135961));
    }

};


