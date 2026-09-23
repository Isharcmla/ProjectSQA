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

public class SimplexTableau_hashCode_100137460459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16331;

    public SimplexTableau_hashCode_100137460459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term16334 = new ArrayList();
        term16331 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term16332 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term16332, term16332.getClass(), "coefficients", null);
        setDoubleField(term16332, term16332.getClass(), "constantTerm", 0.5407563152320285);
        setField(term16331, term16331.getClass(), "f", term16332);
        setField(term16331, term16331.getClass(), "constraints", term16334);
        setBooleanField(term16331, term16331.getClass(), "restrictToNonNegative", false);
        setField(term16331, term16331.getClass(), "tableau", null);
        setIntField(term16331, term16331.getClass(), "numDecisionVariables", 1375330971);
        setIntField(term16331, term16331.getClass(), "numSlackVariables", -478195677);
        setIntField(term16331, term16331.getClass(), "numArtificialVariables", 972867650);
        setDoubleField(term16331, term16331.getClass(), "epsilon", 0.9485929668765458);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "hashCode", argTypes, term16331, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


