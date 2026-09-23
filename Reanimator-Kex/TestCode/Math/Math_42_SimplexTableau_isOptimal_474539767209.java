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

public class SimplexTableau_isOptimal_474539767209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116034;
     Object term116525;

    public SimplexTableau_isOptimal_474539767209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116034 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term116142 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        Object[] term115897 = (Object[]) newArray("[D", 498);
        setIntField(term116034, term116034.getClass(), "numArtificialVariables", 1);
        setField(term116142, term116142.getClass(), "data", term115897);
        setField(term116034, term116034.getClass(), "tableau", term116142);
        term116525 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term116526 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        Object[] term116527 = (Object[]) newArray("[D", 498);
        setField(term116525, term116525.getClass(), "f", null);
        setField(term116525, term116525.getClass(), "constraints", null);
        setBooleanField(term116525, term116525.getClass(), "restrictToNonNegative", false);
        setField(term116525, term116525.getClass(), "columnLabels", null);
        setField(term116526, term116526.getClass(), "data", term116527);
        setField(term116525, term116525.getClass(), "tableau", term116526);
        setIntField(term116525, term116525.getClass(), "numDecisionVariables", 0);
        setIntField(term116525, term116525.getClass(), "numSlackVariables", 0);
        setIntField(term116525, term116525.getClass(), "numArtificialVariables", 1);
        setDoubleField(term116525, term116525.getClass(), "epsilon", 0.0);
        setIntField(term116525, term116525.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isOptimal", argTypes, term116034, args);
        assertTrue(recursiveEquals(term116034, term116525));
        assertTrue(recursiveEquals(retValue, true));
    }

};


