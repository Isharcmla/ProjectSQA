package org.apache.commons.math3.geometry.euclidean.threed;

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
import static org.apache.commons.math3.geometry.euclidean.threed.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.geometry.euclidean.threed.EqualityUtils.*;
import java.lang.Object;

public class Line_getOrigin_24092729122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53;
     Object term1457;
     Object term1448;

    public Line_getOrigin_24092729122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        Object term54 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        Object term58 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term54, term54.getClass(), "x", 0.3587267442738795);
        setDoubleField(term54, term54.getClass(), "y", 0.07802449704920456);
        setDoubleField(term54, term54.getClass(), "z", 0.5279279537140873);
        setField(term53, term53.getClass(), "direction", term54);
        setDoubleField(term58, term58.getClass(), "x", 0.3202192021706908);
        setDoubleField(term58, term58.getClass(), "y", 0.22651340641904605);
        setDoubleField(term58, term58.getClass(), "z", 0.8878841294187743);
        setField(term53, term53.getClass(), "zero", term58);
        term1457 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        Object term1458 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        Object term1459 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term1458, term1458.getClass(), "x", 0.3587267442738795);
        setDoubleField(term1458, term1458.getClass(), "y", 0.07802449704920456);
        setDoubleField(term1458, term1458.getClass(), "z", 0.5279279537140873);
        setField(term1457, term1457.getClass(), "direction", term1458);
        setDoubleField(term1459, term1459.getClass(), "x", 0.3202192021706908);
        setDoubleField(term1459, term1459.getClass(), "y", 0.22651340641904605);
        setDoubleField(term1459, term1459.getClass(), "z", 0.8878841294187743);
        setField(term1457, term1457.getClass(), "zero", term1459);
        term1448 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term1448, term1448.getClass(), "x", 0.3202192021706908);
        setDoubleField(term1448, term1448.getClass(), "y", 0.22651340641904605);
        setDoubleField(term1448, term1448.getClass(), "z", 0.8878841294187743);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getOrigin", argTypes, term53, args);
        assertTrue(recursiveEquals(term53, term1457));
        assertTrue(recursiveEquals(retValue, term1448));
    }

};


