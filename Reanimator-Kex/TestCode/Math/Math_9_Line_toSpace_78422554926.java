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
import java.lang.NullPointerException;
import static org.apache.commons.math3.geometry.euclidean.threed.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Line_toSpace_78422554926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95;

    public Line_toSpace_78422554926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        Object term96 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        Object term100 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term96, term96.getClass(), "x", 0.11179067076100713);
        setDoubleField(term96, term96.getClass(), "y", 0.5306473989087822);
        setDoubleField(term96, term96.getClass(), "z", 0.022483645678509023);
        setField(term95, term95.getClass(), "direction", term96);
        setDoubleField(term100, term100.getClass(), "x", 0.025133051616627267);
        setDoubleField(term100, term100.getClass(), "y", 0.016575281023182953);
        setDoubleField(term100, term100.getClass(), "z", 0.5308350402051779);
        setField(term95, term95.getClass(), "zero", term100);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.geometry.Vector");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "toSpace", argTypes, term95, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


