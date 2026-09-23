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

public class SimplexTableau_getData_17006643089 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66294;
     Object term66617;
     Object term66609;

    public SimplexTableau_getData_17006643089() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66294 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term66390 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        setField(term66294, term66294.getClass(), "tableau", term66390);
        term66617 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term66618 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        setField(term66617, term66617.getClass(), "f", null);
        setField(term66617, term66617.getClass(), "constraints", null);
        setBooleanField(term66617, term66617.getClass(), "restrictToNonNegative", false);
        setField(term66618, term66618.getClass(), "data", null);
        setField(term66618, term66618.getClass(), "lu", null);
        setField(term66617, term66617.getClass(), "tableau", term66618);
        setIntField(term66617, term66617.getClass(), "numDecisionVariables", 0);
        setIntField(term66617, term66617.getClass(), "numSlackVariables", 0);
        setIntField(term66617, term66617.getClass(), "numArtificialVariables", 0);
        setDoubleField(term66617, term66617.getClass(), "epsilon", 0.0);
        term66609 = (Object[]) newArray("[D", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getData", argTypes, term66294, args);
        assertTrue(recursiveEquals(term66294, term66617));
        assertTrue(recursiveEquals(retValue, term66609));
    }

};


