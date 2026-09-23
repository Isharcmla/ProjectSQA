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

public class SimplexTableau_getNumObjectiveFunctions_150263180538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2722;
     Object term30247;

    public SimplexTableau_getNumObjectiveFunctions_150263180538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2725 = new ArrayList();
        ArrayList term2730 = new ArrayList();
        ((ArrayList) term2730).add("tbcdzjIfER");
        term2722 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term2723 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term2723, term2723.getClass(), "coefficients", null);
        setDoubleField(term2723, term2723.getClass(), "constantTerm", 0.10667076642995188);
        setField(term2722, term2722.getClass(), "f", term2723);
        setField(term2722, term2722.getClass(), "constraints", term2725);
        setBooleanField(term2722, term2722.getClass(), "restrictToNonNegative", true);
        setField(term2722, term2722.getClass(), "columnLabels", term2730);
        setField(term2722, term2722.getClass(), "tableau", null);
        setIntField(term2722, term2722.getClass(), "numDecisionVariables", -1685132342);
        setIntField(term2722, term2722.getClass(), "numSlackVariables", -1456670397);
        setIntField(term2722, term2722.getClass(), "numArtificialVariables", 1622346318);
        setDoubleField(term2722, term2722.getClass(), "epsilon", 0.11493000848982304);
        setIntField(term2722, term2722.getClass(), "maxUlps", 1048535127);
        ArrayList term30249 = new ArrayList();
        ArrayList term30251 = new ArrayList();
        ((ArrayList) term30251).add("tbcdzjIfER");
        term30247 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term30248 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term30248, term30248.getClass(), "coefficients", null);
        setDoubleField(term30248, term30248.getClass(), "constantTerm", 0.10667076642995188);
        setField(term30247, term30247.getClass(), "f", term30248);
        setField(term30247, term30247.getClass(), "constraints", term30249);
        setBooleanField(term30247, term30247.getClass(), "restrictToNonNegative", true);
        setField(term30247, term30247.getClass(), "columnLabels", term30251);
        setField(term30247, term30247.getClass(), "tableau", null);
        setIntField(term30247, term30247.getClass(), "numDecisionVariables", -1685132342);
        setIntField(term30247, term30247.getClass(), "numSlackVariables", -1456670397);
        setIntField(term30247, term30247.getClass(), "numArtificialVariables", 1622346318);
        setDoubleField(term30247, term30247.getClass(), "epsilon", 0.11493000848982304);
        setIntField(term30247, term30247.getClass(), "maxUlps", 1048535127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNumObjectiveFunctions", argTypes, term2722, args);
        assertTrue(recursiveEquals(term2722, term30247));
        assertTrue(recursiveEquals(retValue, 2));
    }

};


