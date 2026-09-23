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
import java.lang.NullPointerException;
import static org.apache.commons.math.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;
import java.lang.Double;

public class SimplexTableau_setEntry_26356261854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11121;
     Object term11133;
     Object term11135;
     Object term11137;

    public SimplexTableau_setEntry_26356261854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term11124 = new ArrayList();
        term11121 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term11122 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term11122, term11122.getClass(), "coefficients", null);
        setDoubleField(term11122, term11122.getClass(), "constantTerm", 0.6059734092898602);
        setField(term11121, term11121.getClass(), "f", term11122);
        setField(term11121, term11121.getClass(), "constraints", term11124);
        setBooleanField(term11121, term11121.getClass(), "restrictToNonNegative", true);
        setField(term11121, term11121.getClass(), "tableau", null);
        setIntField(term11121, term11121.getClass(), "numDecisionVariables", 1596070772);
        setIntField(term11121, term11121.getClass(), "numSlackVariables", 97029295);
        setIntField(term11121, term11121.getClass(), "numArtificialVariables", -1371869594);
        setDoubleField(term11121, term11121.getClass(), "epsilon", 0.3074693824288357);
        term11133 = new Integer(-2095575670);
        term11135 = new Integer(1225272962);
        term11137 = new Double(0.1245258965512791);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term11133;
        args[1] = term11135;
        args[2] = term11137;
        try {
            callMethod(klass, "setEntry", argTypes, term11121, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


