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

public class SimplexTableau_getNumObjectiveFunctions_196156628438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2762;
     Object term33483;

    public SimplexTableau_getNumObjectiveFunctions_196156628438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2765 = new ArrayList();
        ArrayList term2770 = new ArrayList();
        ((ArrayList) term2770).add("tbcdzjIfER");
        term2762 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term2763 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setField(term2763, term2763.getClass(), "coefficients", null);
        setDoubleField(term2763, term2763.getClass(), "constantTerm", 0.10667076642995188);
        setField(term2762, term2762.getClass(), "f", term2763);
        setField(term2762, term2762.getClass(), "constraints", term2765);
        setBooleanField(term2762, term2762.getClass(), "restrictToNonNegative", true);
        setField(term2762, term2762.getClass(), "columnLabels", term2770);
        setField(term2762, term2762.getClass(), "tableau", null);
        setIntField(term2762, term2762.getClass(), "numDecisionVariables", -1685132342);
        setIntField(term2762, term2762.getClass(), "numSlackVariables", -1456670397);
        setIntField(term2762, term2762.getClass(), "numArtificialVariables", 1622346318);
        setDoubleField(term2762, term2762.getClass(), "epsilon", 0.11493000848982304);
        setIntField(term2762, term2762.getClass(), "maxUlps", 1048535127);
        ArrayList term33485 = new ArrayList();
        ArrayList term33487 = new ArrayList();
        ((ArrayList) term33487).add("tbcdzjIfER");
        term33483 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term33484 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setField(term33484, term33484.getClass(), "coefficients", null);
        setDoubleField(term33484, term33484.getClass(), "constantTerm", 0.10667076642995188);
        setField(term33483, term33483.getClass(), "f", term33484);
        setField(term33483, term33483.getClass(), "constraints", term33485);
        setBooleanField(term33483, term33483.getClass(), "restrictToNonNegative", true);
        setField(term33483, term33483.getClass(), "columnLabels", term33487);
        setField(term33483, term33483.getClass(), "tableau", null);
        setIntField(term33483, term33483.getClass(), "numDecisionVariables", -1685132342);
        setIntField(term33483, term33483.getClass(), "numSlackVariables", -1456670397);
        setIntField(term33483, term33483.getClass(), "numArtificialVariables", 1622346318);
        setDoubleField(term33483, term33483.getClass(), "epsilon", 0.11493000848982304);
        setIntField(term33483, term33483.getClass(), "maxUlps", 1048535127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNumObjectiveFunctions", argTypes, term2762, args);
        assertTrue(recursiveEquals(term2762, term33483));
        assertTrue(recursiveEquals(retValue, 2));
    }

};


