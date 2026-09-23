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

public class SimplexTableau_isOptimal_474539767205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115287;
     Object term115415;

    public SimplexTableau_isOptimal_474539767205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115287 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term115395 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        Object[] term115149 = (Object[]) newArray("[D", 498);
        setIntField(term115287, term115287.getClass(), "numArtificialVariables", 0);
        setField(term115395, term115395.getClass(), "data", term115149);
        setField(term115287, term115287.getClass(), "tableau", term115395);
        term115415 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term115416 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        Object[] term115417 = (Object[]) newArray("[D", 498);
        setField(term115415, term115415.getClass(), "f", null);
        setField(term115415, term115415.getClass(), "constraints", null);
        setBooleanField(term115415, term115415.getClass(), "restrictToNonNegative", false);
        setField(term115415, term115415.getClass(), "columnLabels", null);
        setField(term115416, term115416.getClass(), "data", term115417);
        setField(term115415, term115415.getClass(), "tableau", term115416);
        setIntField(term115415, term115415.getClass(), "numDecisionVariables", 0);
        setIntField(term115415, term115415.getClass(), "numSlackVariables", 0);
        setIntField(term115415, term115415.getClass(), "numArtificialVariables", 0);
        setDoubleField(term115415, term115415.getClass(), "epsilon", 0.0);
        setIntField(term115415, term115415.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isOptimal", argTypes, term115287, args);
        assertTrue(recursiveEquals(term115287, term115415));
        assertTrue(recursiveEquals(retValue, true));
    }

};


