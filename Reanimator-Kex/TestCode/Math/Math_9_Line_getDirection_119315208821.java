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

public class Line_getDirection_119315208821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44;
     Object term1445;
     Object term1436;

    public Line_getDirection_119315208821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        Object term45 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        Object term49 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term45, term45.getClass(), "x", 0.37161417339133307);
        setDoubleField(term45, term45.getClass(), "y", 0.6805867182029153);
        setDoubleField(term45, term45.getClass(), "z", 0.2852810965221698);
        setField(term44, term44.getClass(), "direction", term45);
        setDoubleField(term49, term49.getClass(), "x", 0.6300849762307866);
        setDoubleField(term49, term49.getClass(), "y", 0.9737083944266686);
        setDoubleField(term49, term49.getClass(), "z", 0.0668892744806211);
        setField(term44, term44.getClass(), "zero", term49);
        term1445 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        Object term1446 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        Object term1447 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term1446, term1446.getClass(), "x", 0.37161417339133307);
        setDoubleField(term1446, term1446.getClass(), "y", 0.6805867182029153);
        setDoubleField(term1446, term1446.getClass(), "z", 0.2852810965221698);
        setField(term1445, term1445.getClass(), "direction", term1446);
        setDoubleField(term1447, term1447.getClass(), "x", 0.6300849762307866);
        setDoubleField(term1447, term1447.getClass(), "y", 0.9737083944266686);
        setDoubleField(term1447, term1447.getClass(), "z", 0.0668892744806211);
        setField(term1445, term1445.getClass(), "zero", term1447);
        term1436 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term1436, term1436.getClass(), "x", 0.37161417339133307);
        setDoubleField(term1436, term1436.getClass(), "y", 0.6805867182029153);
        setDoubleField(term1436, term1436.getClass(), "z", 0.2852810965221698);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDirection", argTypes, term44, args);
        assertTrue(recursiveEquals(term44, term1445));
        assertTrue(recursiveEquals(retValue, term1436));
    }

};


