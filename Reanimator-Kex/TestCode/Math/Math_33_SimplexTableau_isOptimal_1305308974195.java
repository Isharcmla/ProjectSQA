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

public class SimplexTableau_isOptimal_1305308974195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103715;
     Object term103845;

    public SimplexTableau_isOptimal_1305308974195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103715 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term103825 = newInstance(Class.forName("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        Object[] term103576 = (Object[]) newArray("[D", 498);
        setIntField(term103715, term103715.getClass(), "numArtificialVariables", 1);
        setField(term103825, term103825.getClass(), "data", term103576);
        setField(term103715, term103715.getClass(), "tableau", term103825);
        term103845 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term103846 = newInstance(Class.forName("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        Object[] term103847 = (Object[]) newArray("[D", 498);
        setField(term103845, term103845.getClass(), "f", null);
        setField(term103845, term103845.getClass(), "constraints", null);
        setBooleanField(term103845, term103845.getClass(), "restrictToNonNegative", false);
        setField(term103845, term103845.getClass(), "columnLabels", null);
        setField(term103846, term103846.getClass(), "data", term103847);
        setField(term103845, term103845.getClass(), "tableau", term103846);
        setIntField(term103845, term103845.getClass(), "numDecisionVariables", 0);
        setIntField(term103845, term103845.getClass(), "numSlackVariables", 0);
        setIntField(term103845, term103845.getClass(), "numArtificialVariables", 1);
        setDoubleField(term103845, term103845.getClass(), "epsilon", 0.0);
        setIntField(term103845, term103845.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isOptimal", argTypes, term103715, args);
        assertTrue(recursiveEquals(term103715, term103845));
        assertTrue(recursiveEquals(retValue, true));
    }

};


