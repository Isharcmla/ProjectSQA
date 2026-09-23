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

public class SimplexTableau_getHeight_1993331470170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92805;
     Object term95633;

    public SimplexTableau_getHeight_1993331470170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92805 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term92907 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(term92805, term92805.getClass(), "tableau", term92907);
        term95633 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term95634 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(term95633, term95633.getClass(), "f", null);
        setField(term95633, term95633.getClass(), "constraints", null);
        setBooleanField(term95633, term95633.getClass(), "restrictToNonNegative", false);
        setField(term95633, term95633.getClass(), "columnLabels", null);
        setIntField(term95634, term95634.getClass(), "rows", 0);
        setIntField(term95634, term95634.getClass(), "columns", 0);
        setField(term95634, term95634.getClass(), "entries", null);
        setField(term95633, term95633.getClass(), "tableau", term95634);
        setIntField(term95633, term95633.getClass(), "numDecisionVariables", 0);
        setIntField(term95633, term95633.getClass(), "numSlackVariables", 0);
        setIntField(term95633, term95633.getClass(), "numArtificialVariables", 0);
        setDoubleField(term95633, term95633.getClass(), "epsilon", 0.0);
        setIntField(term95633, term95633.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getHeight", argTypes, term92805, args);
        assertTrue(recursiveEquals(term92805, term95633));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


