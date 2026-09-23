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

public class SimplexTableau_getWidth_194935346292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64137;
     Object term64740;

    public SimplexTableau_getWidth_194935346292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64137 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term64237 = newInstance(Class.forName("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(term64137, term64137.getClass(), "tableau", term64237);
        term64740 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term64741 = newInstance(Class.forName("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(term64740, term64740.getClass(), "f", null);
        setField(term64740, term64740.getClass(), "constraints", null);
        setBooleanField(term64740, term64740.getClass(), "restrictToNonNegative", false);
        setField(term64740, term64740.getClass(), "columnLabels", null);
        setField(term64741, term64741.getClass(), "blocks", null);
        setIntField(term64741, term64741.getClass(), "rows", 0);
        setIntField(term64741, term64741.getClass(), "columns", 0);
        setIntField(term64741, term64741.getClass(), "blockRows", 0);
        setIntField(term64741, term64741.getClass(), "blockColumns", 0);
        setField(term64740, term64740.getClass(), "tableau", term64741);
        setIntField(term64740, term64740.getClass(), "numDecisionVariables", 0);
        setIntField(term64740, term64740.getClass(), "numSlackVariables", 0);
        setIntField(term64740, term64740.getClass(), "numArtificialVariables", 0);
        setDoubleField(term64740, term64740.getClass(), "epsilon", 0.0);
        setIntField(term64740, term64740.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getWidth", argTypes, term64137, args);
        assertTrue(recursiveEquals(term64137, term64740));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


