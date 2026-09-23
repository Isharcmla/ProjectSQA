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

public class SimplexTableau_getNumDecisionVariables_64207405355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13124;
     Object term49103;

    public SimplexTableau_getNumDecisionVariables_64207405355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term13127 = new ArrayList();
        ArrayList term13132 = new ArrayList();
        ((ArrayList) term13132).add("bLPjGVBhlX");
        ((ArrayList) term13132).add("whBvTVIIlC");
        ((ArrayList) term13132).add("IgRJUzaCwW");
        ((ArrayList) term13132).add("JUmudUmaaV");
        ((ArrayList) term13132).add("KoyGrUJeJW");
        ((ArrayList) term13132).add("HqBOwkVqjD");
        ((ArrayList) term13132).add("MAcUBcBckh");
        term13124 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term13125 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setField(term13125, term13125.getClass(), "coefficients", null);
        setDoubleField(term13125, term13125.getClass(), "constantTerm", 0.3710067290060264);
        setField(term13124, term13124.getClass(), "f", term13125);
        setField(term13124, term13124.getClass(), "constraints", term13127);
        setBooleanField(term13124, term13124.getClass(), "restrictToNonNegative", true);
        setField(term13124, term13124.getClass(), "columnLabels", term13132);
        setField(term13124, term13124.getClass(), "tableau", null);
        setIntField(term13124, term13124.getClass(), "numDecisionVariables", 972867650);
        setIntField(term13124, term13124.getClass(), "numSlackVariables", 1655935355);
        setIntField(term13124, term13124.getClass(), "numArtificialVariables", -481533957);
        setDoubleField(term13124, term13124.getClass(), "epsilon", 0.7818620200430967);
        setIntField(term13124, term13124.getClass(), "maxUlps", 1240914516);
        ArrayList term49105 = new ArrayList();
        ArrayList term49107 = new ArrayList();
        ((ArrayList) term49107).add("bLPjGVBhlX");
        ((ArrayList) term49107).add("whBvTVIIlC");
        ((ArrayList) term49107).add("IgRJUzaCwW");
        ((ArrayList) term49107).add("JUmudUmaaV");
        ((ArrayList) term49107).add("KoyGrUJeJW");
        ((ArrayList) term49107).add("HqBOwkVqjD");
        ((ArrayList) term49107).add("MAcUBcBckh");
        term49103 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term49104 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setField(term49104, term49104.getClass(), "coefficients", null);
        setDoubleField(term49104, term49104.getClass(), "constantTerm", 0.3710067290060264);
        setField(term49103, term49103.getClass(), "f", term49104);
        setField(term49103, term49103.getClass(), "constraints", term49105);
        setBooleanField(term49103, term49103.getClass(), "restrictToNonNegative", true);
        setField(term49103, term49103.getClass(), "columnLabels", term49107);
        setField(term49103, term49103.getClass(), "tableau", null);
        setIntField(term49103, term49103.getClass(), "numDecisionVariables", 972867650);
        setIntField(term49103, term49103.getClass(), "numSlackVariables", 1655935355);
        setIntField(term49103, term49103.getClass(), "numArtificialVariables", -481533957);
        setDoubleField(term49103, term49103.getClass(), "epsilon", 0.7818620200430967);
        setIntField(term49103, term49103.getClass(), "maxUlps", 1240914516);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNumDecisionVariables", argTypes, term13124, args);
        assertTrue(recursiveEquals(term13124, term49103));
        assertTrue(recursiveEquals(retValue, 972867650));
    }

};


