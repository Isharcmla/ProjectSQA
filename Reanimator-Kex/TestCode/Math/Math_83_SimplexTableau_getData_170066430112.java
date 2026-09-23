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

public class SimplexTableau_getData_170066430112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82488;
     Object term82608;
     Object term82596;

    public SimplexTableau_getData_170066430112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82488 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term82586 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        setField(term82488, term82488.getClass(), "tableau", term82586);
        term82608 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term82609 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        setField(term82608, term82608.getClass(), "f", null);
        setField(term82608, term82608.getClass(), "constraints", null);
        setBooleanField(term82608, term82608.getClass(), "restrictToNonNegative", false);
        setField(term82609, term82609.getClass(), "blocks", null);
        setIntField(term82609, term82609.getClass(), "rows", 0);
        setIntField(term82609, term82609.getClass(), "columns", 0);
        setIntField(term82609, term82609.getClass(), "blockRows", 0);
        setIntField(term82609, term82609.getClass(), "blockColumns", 0);
        setField(term82609, term82609.getClass(), "lu", null);
        setField(term82608, term82608.getClass(), "tableau", term82609);
        setIntField(term82608, term82608.getClass(), "numDecisionVariables", 0);
        setIntField(term82608, term82608.getClass(), "numSlackVariables", 0);
        setIntField(term82608, term82608.getClass(), "numArtificialVariables", 0);
        setDoubleField(term82608, term82608.getClass(), "epsilon", 0.0);
        term82596 = (Object[]) newArray("[D", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getData", argTypes, term82488, args);
        assertTrue(recursiveEquals(term82488, term82608));
        assertTrue(recursiveEquals(retValue, term82596));
    }

};


