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

public class SimplexTableau_divideRow_1193873589195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104285;
     Object term108121;

    public SimplexTableau_divideRow_1193873589195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104285 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term104393 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        Object[] term104150 = (Object[]) newArray("[D", 498);
        setField(term104393, term104393.getClass(), "data", term104150);
        setField(term104285, term104285.getClass(), "tableau", term104393);
        term108121 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term108122 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        Object[] term108123 = (Object[]) newArray("[D", 498);
        setField(term108121, term108121.getClass(), "f", null);
        setField(term108121, term108121.getClass(), "constraints", null);
        setBooleanField(term108121, term108121.getClass(), "restrictToNonNegative", false);
        setField(term108121, term108121.getClass(), "columnLabels", null);
        setField(term108122, term108122.getClass(), "data", term108123);
        setField(term108121, term108121.getClass(), "tableau", term108122);
        setIntField(term108121, term108121.getClass(), "numDecisionVariables", 0);
        setIntField(term108121, term108121.getClass(), "numSlackVariables", 0);
        setIntField(term108121, term108121.getClass(), "numArtificialVariables", 0);
        setDoubleField(term108121, term108121.getClass(), "epsilon", 0.0);
        setIntField(term108121, term108121.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = 0.0;
        callMethod(klass, "divideRow", argTypes, term104285, args);
        assertTrue(recursiveEquals(term104285, term108121));
    }

};


