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

public class SimplexTableau_getData_1000835637113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69794;
     Object term69917;
     Object term69904;

    public SimplexTableau_getData_1000835637113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69794 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term69894 = newInstance(Class.forName("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(term69794, term69794.getClass(), "tableau", term69894);
        term69917 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term69918 = newInstance(Class.forName("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(term69917, term69917.getClass(), "f", null);
        setField(term69917, term69917.getClass(), "constraints", null);
        setBooleanField(term69917, term69917.getClass(), "restrictToNonNegative", false);
        setField(term69917, term69917.getClass(), "columnLabels", null);
        setField(term69918, term69918.getClass(), "blocks", null);
        setIntField(term69918, term69918.getClass(), "rows", 0);
        setIntField(term69918, term69918.getClass(), "columns", 0);
        setIntField(term69918, term69918.getClass(), "blockRows", 0);
        setIntField(term69918, term69918.getClass(), "blockColumns", 0);
        setField(term69917, term69917.getClass(), "tableau", term69918);
        setIntField(term69917, term69917.getClass(), "numDecisionVariables", 0);
        setIntField(term69917, term69917.getClass(), "numSlackVariables", 0);
        setIntField(term69917, term69917.getClass(), "numArtificialVariables", 0);
        setDoubleField(term69917, term69917.getClass(), "epsilon", 0.0);
        setIntField(term69917, term69917.getClass(), "maxUlps", 0);
        term69904 = (Object[]) newArray("[D", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getData", argTypes, term69794, args);
        assertTrue(recursiveEquals(term69794, term69917));
        assertTrue(recursiveEquals(retValue, term69904));
    }

};


