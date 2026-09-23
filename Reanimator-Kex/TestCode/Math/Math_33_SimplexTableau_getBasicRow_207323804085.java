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

public class SimplexTableau_getBasicRow_207323804085 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63119;
     Object term63513;

    public SimplexTableau_getBasicRow_207323804085() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63119 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term63219 = newInstance(Class.forName("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(term63119, term63119.getClass(), "tableau", term63219);
        term63513 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term63514 = newInstance(Class.forName("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(term63513, term63513.getClass(), "f", null);
        setField(term63513, term63513.getClass(), "constraints", null);
        setBooleanField(term63513, term63513.getClass(), "restrictToNonNegative", false);
        setField(term63513, term63513.getClass(), "columnLabels", null);
        setField(term63514, term63514.getClass(), "blocks", null);
        setIntField(term63514, term63514.getClass(), "rows", 0);
        setIntField(term63514, term63514.getClass(), "columns", 0);
        setIntField(term63514, term63514.getClass(), "blockRows", 0);
        setIntField(term63514, term63514.getClass(), "blockColumns", 0);
        setField(term63513, term63513.getClass(), "tableau", term63514);
        setIntField(term63513, term63513.getClass(), "numDecisionVariables", 0);
        setIntField(term63513, term63513.getClass(), "numSlackVariables", 0);
        setIntField(term63513, term63513.getClass(), "numArtificialVariables", 0);
        setDoubleField(term63513, term63513.getClass(), "epsilon", 0.0);
        setIntField(term63513, term63513.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "getBasicRow", argTypes, term63119, args);
        assertTrue(recursiveEquals(term63119, term63513));
        assertTrue(recursiveEquals(retValue, null));
    }

};


