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

public class SimplexTableau_isOptimal_474539767127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78999;
     Object term79121;

    public SimplexTableau_isOptimal_474539767127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78999 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term79101 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setIntField(term78999, term78999.getClass(), "numArtificialVariables", 1);
        setField(term78999, term78999.getClass(), "tableau", term79101);
        term79121 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term79122 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(term79121, term79121.getClass(), "f", null);
        setField(term79121, term79121.getClass(), "constraints", null);
        setBooleanField(term79121, term79121.getClass(), "restrictToNonNegative", false);
        setField(term79121, term79121.getClass(), "columnLabels", null);
        setIntField(term79122, term79122.getClass(), "rows", 0);
        setIntField(term79122, term79122.getClass(), "columns", 0);
        setField(term79122, term79122.getClass(), "entries", null);
        setField(term79121, term79121.getClass(), "tableau", term79122);
        setIntField(term79121, term79121.getClass(), "numDecisionVariables", 0);
        setIntField(term79121, term79121.getClass(), "numSlackVariables", 0);
        setIntField(term79121, term79121.getClass(), "numArtificialVariables", 1);
        setDoubleField(term79121, term79121.getClass(), "epsilon", 0.0);
        setIntField(term79121, term79121.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isOptimal", argTypes, term78999, args);
        assertTrue(recursiveEquals(term78999, term79121));
        assertTrue(recursiveEquals(retValue, true));
    }

};


