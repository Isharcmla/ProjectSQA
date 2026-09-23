package org.apache.commons.math.geometry.euclidean.threed;

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
import static org.apache.commons.math.geometry.euclidean.threed.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.geometry.euclidean.threed.EqualityUtils.*;

public class Rotation_applyTo_45815340138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224;
     Object term229;
     Object term3148;
     Object term3149;
     Object term3128;

    public Rotation_applyTo_45815340138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term224 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term224, term224.getClass(), "q0", 0.7618164754425794);
        setDoubleField(term224, term224.getClass(), "q1", 0.7385589312559342);
        setDoubleField(term224, term224.getClass(), "q2", 0.7080134263823477);
        setDoubleField(term224, term224.getClass(), "q3", 0.6059734092898602);
        term229 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term229, term229.getClass(), "q0", 0.3074693824288357);
        setDoubleField(term229, term229.getClass(), "q1", 0.1245258965512791);
        setDoubleField(term229, term229.getClass(), "q2", 0.9511861072660375);
        setDoubleField(term229, term229.getClass(), "q3", 0.05880719443135807);
        term3148 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term3148, term3148.getClass(), "q0", 0.7618164754425794);
        setDoubleField(term3148, term3148.getClass(), "q1", 0.7385589312559342);
        setDoubleField(term3148, term3148.getClass(), "q2", 0.7080134263823477);
        setDoubleField(term3148, term3148.getClass(), "q3", 0.6059734092898602);
        term3149 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term3149, term3149.getClass(), "q0", 0.3074693824288357);
        setDoubleField(term3149, term3149.getClass(), "q1", 0.1245258965512791);
        setDoubleField(term3149, term3149.getClass(), "q2", 0.9511861072660375);
        setDoubleField(term3149, term3149.getClass(), "q3", 0.05880719443135807);
        term3128 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term3128, term3128.getClass(), "q0", -0.5668226028752138);
        setDoubleField(term3128, term3128.getClass(), "q1", 0.8567073431564582);
        setDoubleField(term3128, term3128.getClass(), "q2", 0.910294895279793);
        setDoubleField(term3128, term3128.getClass(), "q3", -0.383222428602279);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Object[] args = new Object[1];
        args[0] = term229;
        Object retValue = callMethod(klass, "applyTo", argTypes, term224, args);
        assertTrue(recursiveEquals(term224, term3148));
        assertTrue(recursiveEquals(term229, term3149));
        assertTrue(recursiveEquals(retValue, term3128));
    }

};


