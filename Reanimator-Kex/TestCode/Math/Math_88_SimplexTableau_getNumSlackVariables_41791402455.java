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
     Object term50160;

    public SimplexTableau_getNumSlackVariables_41791402455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term50173 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term50172 = ((Class) term50173).getDeclaredField((String) "GEQ");
        ((Field) term50172).setAccessible(true);
        Object enum127 = ((Field) term50172).get((Object) null);
        Object term13891 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term13891, term13891.getClass(), "coefficients", null);
        setField(term13891, term13891.getClass(), "relationship", enum127);
        setDoubleField(term13891, term13891.getClass(), "value", 0.7507333108648018);
        Object term13895 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term13895, term13895.getClass(), "coefficients", null);
        setField(term13895, term13895.getClass(), "relationship", enum127);
        setDoubleField(term13895, term13895.getClass(), "value", 0.007493740494434409);
        Class<? extends Object> term50469 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term50468 = ((Class) term50469).getDeclaredField((String) "LEQ");
        ((Field) term50468).setAccessible(true);
        Object enum128 = ((Field) term50468).get((Object) null);
        Object term13897 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term13897, term13897.getClass(), "coefficients", null);
        setField(term13897, term13897.getClass(), "relationship", enum128);
        setDoubleField(term13897, term13897.getClass(), "value", 0.29172553321356776);
        Object term13901 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term13901, term13901.getClass(), "coefficients", null);
        setField(term13901, term13901.getClass(), "relationship", enum128);
        setDoubleField(term13901, term13901.getClass(), "value", 0.9276995636844321);
        Class<? extends Object> term50765 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term50764 = ((Class) term50765).getDeclaredField((String) "EQ");
        ((Field) term50764).setAccessible(true);
        Object enum129 = ((Field) term50764).get((Object) null);
        Object term13903 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term13903, term13903.getClass(), "coefficients", null);
        setField(term13903, term13903.getClass(), "relationship", enum129);
        setDoubleField(term13903, term13903.getClass(), "value", 0.7636130748477434);
        Object term13907 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term13907, term13907.getClass(), "coefficients", null);
        setField(term13907, term13907.getClass(), "relationship", enum129);
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
        Class<? extends Object> term51058 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term51057 = ((Class) term51058).getDeclaredField((String) "LEQ");
        ((Field) term51057).setAccessible(true);
        Object enum130 = ((Field) term51057).get((Object) null);
        Object term50164 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term50164, term50164.getClass(), "coefficients", null);
        setField(term50164, term50164.getClass(), "relationship", enum130);
        setDoubleField(term50164, term50164.getClass(), "value", 0.7507333108648018);
        Object term50166 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term50166, term50166.getClass(), "coefficients", null);
        setField(term50166, term50166.getClass(), "relationship", enum130);
        setDoubleField(term50166, term50166.getClass(), "value", 0.007493740494434409);
        Class<? extends Object> term51354 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term51353 = ((Class) term51354).getDeclaredField((String) "LEQ");
        ((Field) term51353).setAccessible(true);
        Object enum131 = ((Field) term51353).get((Object) null);
        Object term50167 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term50167, term50167.getClass(), "coefficients", null);
        setField(term50167, term50167.getClass(), "relationship", enum131);
        setDoubleField(term50167, term50167.getClass(), "value", 0.29172553321356776);
        Object term50169 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term50169, term50169.getClass(), "coefficients", null);
        setField(term50169, term50169.getClass(), "relationship", enum131);
        setDoubleField(term50169, term50169.getClass(), "value", 0.9276995636844321);
        Object term50170 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term50170, term50170.getClass(), "coefficients", null);
        setField(term50170, term50170.getClass(), "relationship", enum131);
        setDoubleField(term50170, term50170.getClass(), "value", 0.7636130748477434);
        Object term50171 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term50171, term50171.getClass(), "coefficients", null);
        setField(term50171, term50171.getClass(), "relationship", enum131);
        setDoubleField(term50171, term50171.getClass(), "value", 0.07901636960861558);
        ArrayList term50162 = new ArrayList();
        ((ArrayList) term50162).add(term50164);
        ((ArrayList) term50162).add(term50166);
        ((ArrayList) term50162).add(term50167);
        ((ArrayList) term50162).add(term50169);
        ((ArrayList) term50162).add(term50170);
        ((ArrayList) term50162).add(term50171);
        term50160 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term50161 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term50161, term50161.getClass(), "coefficients", null);
        setDoubleField(term50161, term50161.getClass(), "constantTerm", 0.44268490778872205);
        setField(term50160, term50160.getClass(), "f", term50161);
        setField(term50160, term50160.getClass(), "constraints", term50162);
        setBooleanField(term50160, term50160.getClass(), "restrictToNonNegative", true);
        setField(term50160, term50160.getClass(), "tableau", null);
        setIntField(term50160, term50160.getClass(), "numDecisionVariables", -1588772968);
        setIntField(term50160, term50160.getClass(), "numSlackVariables", -93135961);
        setIntField(term50160, term50160.getClass(), "numArtificialVariables", -112921587);
        setDoubleField(term50160, term50160.getClass(), "epsilon", 0.18717846301066243);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNumSlackVariables", argTypes, term13886, args);
        assertTrue(recursiveEquals(term13886, term50160));
        assertTrue(recursiveEquals(retValue, -93135961));
    }

};


