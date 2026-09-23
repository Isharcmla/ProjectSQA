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

public class SimplexTableau_getRhsOffset_111760619152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93874;
     Object term93992;

    public SimplexTableau_getRhsOffset_111760619152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93874 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term93976 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(term93874, term93874.getClass(), "tableau", term93976);
        term93992 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term93993 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(term93992, term93992.getClass(), "f", null);
        setField(term93992, term93992.getClass(), "constraints", null);
        setBooleanField(term93992, term93992.getClass(), "restrictToNonNegative", false);
        setIntField(term93993, term93993.getClass(), "rowDimension", 0);
        setIntField(term93993, term93993.getClass(), "columnDimension", 0);
        setField(term93993, term93993.getClass(), "entries", null);
        setField(term93993, term93993.getClass(), "lu", null);
        setField(term93992, term93992.getClass(), "tableau", term93993);
        setIntField(term93992, term93992.getClass(), "numDecisionVariables", 0);
        setIntField(term93992, term93992.getClass(), "numSlackVariables", 0);
        setIntField(term93992, term93992.getClass(), "numArtificialVariables", 0);
        setDoubleField(term93992, term93992.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRhsOffset", argTypes, term93874, args);
        assertTrue(recursiveEquals(term93874, term93992));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


