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
import java.lang.String;

public class SimplexSolver_solvePhase1_151894557916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5440;
     Object term5467;

    public SimplexSolver_solvePhase1_151894557916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16522 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term16521 = ((Class) term16522).getDeclaredField((String) "LEQ");
        ((Field) term16521).setAccessible(true);
        Object enum49 = ((Field) term16521).get((Object) null);
        Object term5448 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term5448, term5448.getClass(), "coefficients", null);
        setField(term5448, term5448.getClass(), "relationship", enum49);
        setDoubleField(term5448, term5448.getClass(), "value", 0.6862221294683138);
        ArrayList term5446 = new ArrayList();
        ((ArrayList) term5446).add(term5448);
        Class<? extends Object> term16818 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term16817 = ((Class) term16818).getDeclaredField((String) "MINIMIZE");
        ((Field) term16817).setAccessible(true);
        Object enum50 = ((Field) term16817).get((Object) null);
        term5440 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        Object term5444 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setDoubleField(term5440, term5440.getClass(), "epsilon", 1.0E-6);
        setIntField(term5440, term5440.getClass(), "maxIterations", 100);
        setIntField(term5440, term5440.getClass(), "iterations", 1622346318);
        setField(term5444, term5444.getClass(), "coefficients", null);
        setDoubleField(term5444, term5444.getClass(), "constantTerm", 0.791695029600875);
        setField(term5440, term5440.getClass(), "f", term5444);
        setField(term5440, term5440.getClass(), "constraints", term5446);
        setField(term5440, term5440.getClass(), "goalType", enum50);
        setBooleanField(term5440, term5440.getClass(), "restrictToNonNegative", false);
        Class<? extends Object> term17074 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term17073 = ((Class) term17074).getDeclaredField((String) "GEQ");
        ((Field) term17073).setAccessible(true);
        Object enum51 = ((Field) term17073).get((Object) null);
        Object term5472 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term5472, term5472.getClass(), "coefficients", null);
        setField(term5472, term5472.getClass(), "relationship", enum51);
        setDoubleField(term5472, term5472.getClass(), "value", 0.9374115574082594);
        Object term5476 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term5476, term5476.getClass(), "coefficients", null);
        setField(term5476, term5476.getClass(), "relationship", enum49);
        setDoubleField(term5476, term5476.getClass(), "value", 0.8454723071922143);
        Object term5478 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term5478, term5478.getClass(), "coefficients", null);
        setField(term5478, term5478.getClass(), "relationship", enum49);
        setDoubleField(term5478, term5478.getClass(), "value", 0.8566567697571895);
        Object term5480 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term5480, term5480.getClass(), "coefficients", null);
        setField(term5480, term5480.getClass(), "relationship", enum49);
        setDoubleField(term5480, term5480.getClass(), "value", 0.9203805380592256);
        Object term5482 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term5482, term5482.getClass(), "coefficients", null);
        setField(term5482, term5482.getClass(), "relationship", enum49);
        setDoubleField(term5482, term5482.getClass(), "value", 0.5804948995371725);
        ArrayList term5470 = new ArrayList();
        ((ArrayList) term5470).add(term5472);
        ((ArrayList) term5470).add(term5476);
        ((ArrayList) term5470).add(term5478);
        ((ArrayList) term5470).add(term5480);
        ((ArrayList) term5470).add(term5482);
        term5467 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term5468 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term5468, term5468.getClass(), "coefficients", null);
        setDoubleField(term5468, term5468.getClass(), "constantTerm", 0.15917839663695388);
        setField(term5467, term5467.getClass(), "f", term5468);
        setField(term5467, term5467.getClass(), "constraints", term5470);
        setBooleanField(term5467, term5467.getClass(), "restrictToNonNegative", true);
        setField(term5467, term5467.getClass(), "tableau", null);
        setIntField(term5467, term5467.getClass(), "numDecisionVariables", 1048535127);
        setIntField(term5467, term5467.getClass(), "numSlackVariables", -655067527);
        setIntField(term5467, term5467.getClass(), "numArtificialVariables", -6029667);
        setDoubleField(term5467, term5467.getClass(), "epsilon", 0.20737514139742264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term5467;
        try {
            callMethod(klass, "solvePhase1", argTypes, term5440, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


