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

public class Rotation_applyInverseTo_150526067737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215;
     Object term220;
     Object term3125;
     Object term3126;
     Object term3113;

    public Rotation_applyInverseTo_150526067737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term215 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term215, term215.getClass(), "q0", 0.06587158449170749);
        setDoubleField(term215, term215.getClass(), "q1", 0.0865998004187658);
        setDoubleField(term215, term215.getClass(), "q2", 0.9628647861255637);
        setDoubleField(term215, term215.getClass(), "q3", 0.623231822150205);
        term220 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term220, term220.getClass(), "x", 0.09037487793444521);
        setDoubleField(term220, term220.getClass(), "y", 0.6561919196821765);
        setDoubleField(term220, term220.getClass(), "z", 0.7330178886612495);
        term3125 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term3125, term3125.getClass(), "q0", 0.06587158449170749);
        setDoubleField(term3125, term3125.getClass(), "q1", 0.0865998004187658);
        setDoubleField(term3125, term3125.getClass(), "q2", 0.9628647861255637);
        setDoubleField(term3125, term3125.getClass(), "q3", 0.623231822150205);
        term3126 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term3126, term3126.getClass(), "x", 0.09037487793444521);
        setDoubleField(term3126, term3126.getClass(), "y", 0.6561919196821765);
        setDoubleField(term3126, term3126.getClass(), "z", 0.7330178886612495);
        term3113 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term3113, term3113.getClass(), "x", 0.13942744693252654);
        setDoubleField(term3113, term3113.getClass(), "y", 1.4601044162589045);
        setDoubleField(term3113, term3113.getClass(), "z", 0.636101340753719);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Vector3D");
        Object[] args = new Object[1];
        args[0] = term220;
        Object retValue = callMethod(klass, "applyInverseTo", argTypes, term215, args);
        assertTrue(recursiveEquals(term215, term3125));
        assertTrue(recursiveEquals(term220, term3126));
        assertTrue(recursiveEquals(retValue, term3113));
    }

};


