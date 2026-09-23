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

public class SimplexTableau_getRhsOffset_111760619118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84002;
     Object term84120;

    public SimplexTableau_getRhsOffset_111760619118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84002 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term84104 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(term84002, term84002.getClass(), "tableau", term84104);
        term84120 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term84121 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(term84120, term84120.getClass(), "f", null);
        setField(term84120, term84120.getClass(), "constraints", null);
        setBooleanField(term84120, term84120.getClass(), "restrictToNonNegative", false);
        setIntField(term84121, term84121.getClass(), "rowDimension", 0);
        setIntField(term84121, term84121.getClass(), "columnDimension", 0);
        setField(term84121, term84121.getClass(), "entries", null);
        setField(term84121, term84121.getClass(), "lu", null);
        setField(term84120, term84120.getClass(), "tableau", term84121);
        setIntField(term84120, term84120.getClass(), "numDecisionVariables", 0);
        setIntField(term84120, term84120.getClass(), "numSlackVariables", 0);
        setIntField(term84120, term84120.getClass(), "numArtificialVariables", 0);
        setDoubleField(term84120, term84120.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRhsOffset", argTypes, term84002, args);
        assertTrue(recursiveEquals(term84002, term84120));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


