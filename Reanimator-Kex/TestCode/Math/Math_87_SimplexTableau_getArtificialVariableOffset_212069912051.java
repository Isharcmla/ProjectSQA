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
import java.util.ArrayList;

public class SimplexTableau_getArtificialVariableOffset_212069912051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11131;
     Object term45410;

    public SimplexTableau_getArtificialVariableOffset_212069912051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term11134 = new ArrayList();
        term11131 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term11132 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term11132, term11132.getClass(), "coefficients", null);
        setDoubleField(term11132, term11132.getClass(), "constantTerm", 0.9511861072660375);
        setField(term11131, term11131.getClass(), "f", term11132);
        setField(term11131, term11131.getClass(), "constraints", term11134);
        setBooleanField(term11131, term11131.getClass(), "restrictToNonNegative", false);
        setField(term11131, term11131.getClass(), "tableau", null);
        setIntField(term11131, term11131.getClass(), "numDecisionVariables", 1596070772);
        setIntField(term11131, term11131.getClass(), "numSlackVariables", 97029295);
        setIntField(term11131, term11131.getClass(), "numArtificialVariables", -1371869594);
        setDoubleField(term11131, term11131.getClass(), "epsilon", 0.05880719443135807);
        ArrayList term45412 = new ArrayList();
        term45410 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term45411 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term45411, term45411.getClass(), "coefficients", null);
        setDoubleField(term45411, term45411.getClass(), "constantTerm", 0.9511861072660375);
        setField(term45410, term45410.getClass(), "f", term45411);
        setField(term45410, term45410.getClass(), "constraints", term45412);
        setBooleanField(term45410, term45410.getClass(), "restrictToNonNegative", false);
        setField(term45410, term45410.getClass(), "tableau", null);
        setIntField(term45410, term45410.getClass(), "numDecisionVariables", 1596070772);
        setIntField(term45410, term45410.getClass(), "numSlackVariables", 97029295);
        setIntField(term45410, term45410.getClass(), "numArtificialVariables", -1371869594);
        setDoubleField(term45410, term45410.getClass(), "epsilon", 0.05880719443135807);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getArtificialVariableOffset", argTypes, term11131, args);
        assertTrue(recursiveEquals(term11131, term45410));
        assertTrue(recursiveEquals(retValue, 1693100068));
    }

};


