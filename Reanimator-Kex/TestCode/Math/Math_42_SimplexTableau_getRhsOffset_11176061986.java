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

public class SimplexTableau_getRhsOffset_11176061986 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65017;
     Object term67585;

    public SimplexTableau_getRhsOffset_11176061986() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65017 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term65119 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(term65017, term65017.getClass(), "tableau", term65119);
        term67585 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term67586 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(term67585, term67585.getClass(), "f", null);
        setField(term67585, term67585.getClass(), "constraints", null);
        setBooleanField(term67585, term67585.getClass(), "restrictToNonNegative", false);
        setField(term67585, term67585.getClass(), "columnLabels", null);
        setIntField(term67586, term67586.getClass(), "rows", 0);
        setIntField(term67586, term67586.getClass(), "columns", 0);
        setField(term67586, term67586.getClass(), "entries", null);
        setField(term67585, term67585.getClass(), "tableau", term67586);
        setIntField(term67585, term67585.getClass(), "numDecisionVariables", 0);
        setIntField(term67585, term67585.getClass(), "numSlackVariables", 0);
        setIntField(term67585, term67585.getClass(), "numArtificialVariables", 0);
        setDoubleField(term67585, term67585.getClass(), "epsilon", 0.0);
        setIntField(term67585, term67585.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRhsOffset", argTypes, term65017, args);
        assertTrue(recursiveEquals(term65017, term67585));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


