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

public class SimplexTableau_getWidth_111858425596 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68882;
     Object term68990;

    public SimplexTableau_getWidth_111858425596() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68882 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term68978 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        setField(term68882, term68882.getClass(), "tableau", term68978);
        term68990 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term68991 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        setField(term68990, term68990.getClass(), "f", null);
        setField(term68990, term68990.getClass(), "constraints", null);
        setBooleanField(term68990, term68990.getClass(), "restrictToNonNegative", false);
        setField(term68991, term68991.getClass(), "data", null);
        setField(term68991, term68991.getClass(), "lu", null);
        setField(term68990, term68990.getClass(), "tableau", term68991);
        setIntField(term68990, term68990.getClass(), "numDecisionVariables", 0);
        setIntField(term68990, term68990.getClass(), "numSlackVariables", 0);
        setIntField(term68990, term68990.getClass(), "numArtificialVariables", 0);
        setDoubleField(term68990, term68990.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getWidth", argTypes, term68882, args);
        assertTrue(recursiveEquals(term68882, term68990));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


