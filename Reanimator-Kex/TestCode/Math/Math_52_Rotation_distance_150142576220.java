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

public class Rotation_distance_150142576220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280;
     Object term285;

    public Rotation_distance_150142576220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term280 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term280, term280.getClass(), "q0", 0.9276995636844321);
        setDoubleField(term280, term280.getClass(), "q1", 0.7636130748477434);
        setDoubleField(term280, term280.getClass(), "q2", 0.07901636960861558);
        setDoubleField(term280, term280.getClass(), "q3", 0.18717846301066243);
        term285 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term285, term285.getClass(), "q0", 0.5335953039331021);
        setDoubleField(term285, term285.getClass(), "q1", 0.5725602309856443);
        setDoubleField(term285, term285.getClass(), "q2", 0.5310967137636303);
        setDoubleField(term285, term285.getClass(), "q3", 0.6054109236809134);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Object[] args = new Object[2];
        args[0] = term280;
        args[1] = term285;
        callMethod(klass, "distance", argTypes, null, args);
    }

};


