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

public class SimplexTableau_getData_170066430108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72880;
     Object term73000;
     Object term72990;

    public SimplexTableau_getData_170066430108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72880 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term72982 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(term72880, term72880.getClass(), "tableau", term72982);
        term73000 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term73001 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(term73000, term73000.getClass(), "f", null);
        setField(term73000, term73000.getClass(), "constraints", null);
        setBooleanField(term73000, term73000.getClass(), "restrictToNonNegative", false);
        setIntField(term73001, term73001.getClass(), "rowDimension", 0);
        setIntField(term73001, term73001.getClass(), "columnDimension", 0);
        setField(term73001, term73001.getClass(), "entries", null);
        setField(term73001, term73001.getClass(), "lu", null);
        setField(term73000, term73000.getClass(), "tableau", term73001);
        setIntField(term73000, term73000.getClass(), "numDecisionVariables", 0);
        setIntField(term73000, term73000.getClass(), "numSlackVariables", 0);
        setIntField(term73000, term73000.getClass(), "numArtificialVariables", 0);
        setDoubleField(term73000, term73000.getClass(), "epsilon", 0.0);
        term72990 = (Object[]) newArray("[D", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getData", argTypes, term72880, args);
        assertTrue(recursiveEquals(term72880, term73000));
        assertTrue(recursiveEquals(retValue, term72990));
    }

};


