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
import java.lang.Object;

public class Line_closestPoint_211370146414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166;
     Object term175;

    public Line_closestPoint_211370146414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        Object term167 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        Object term171 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term167, term167.getClass(), "x", 0.623231822150205);
        setDoubleField(term167, term167.getClass(), "y", 0.09037487793444521);
        setDoubleField(term167, term167.getClass(), "z", 0.6561919196821765);
        setField(term166, term166.getClass(), "direction", term167);
        setDoubleField(term171, term171.getClass(), "x", 0.7330178886612495);
        setDoubleField(term171, term171.getClass(), "y", 0.7618164754425794);
        setDoubleField(term171, term171.getClass(), "z", 0.7385589312559342);
        setField(term166, term166.getClass(), "zero", term171);
        term175 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        Object term176 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        Object term180 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term176, term176.getClass(), "x", 0.7080134263823477);
        setDoubleField(term176, term176.getClass(), "y", 0.6059734092898602);
        setDoubleField(term176, term176.getClass(), "z", 0.3074693824288357);
        setField(term175, term175.getClass(), "direction", term176);
        setDoubleField(term180, term180.getClass(), "x", 0.1245258965512791);
        setDoubleField(term180, term180.getClass(), "y", 0.9511861072660375);
        setDoubleField(term180, term180.getClass(), "z", 0.05880719443135807);
        setField(term175, term175.getClass(), "zero", term180);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line");
        Object[] args = new Object[1];
        args[0] = term175;
        callMethod(klass, "closestPoint", argTypes, term166, args);
    }

};


