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

public class Rotation_getQ3_203696444331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146;
     Object term2576;

    public Rotation_getQ3_203696444331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term146, term146.getClass(), "q0", 0.36226058076369927);
        setDoubleField(term146, term146.getClass(), "q1", 0.03699061125289671);
        setDoubleField(term146, term146.getClass(), "q2", 0.6047137830113202);
        setDoubleField(term146, term146.getClass(), "q3", 0.6767213143579776);
        term2576 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term2576, term2576.getClass(), "q0", 0.36226058076369927);
        setDoubleField(term2576, term2576.getClass(), "q1", 0.03699061125289671);
        setDoubleField(term2576, term2576.getClass(), "q2", 0.6047137830113202);
        setDoubleField(term2576, term2576.getClass(), "q3", 0.6767213143579776);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getQ3", argTypes, term146, args);
        assertTrue(recursiveEquals(term146, term2576));
        assertTrue(recursiveEquals(retValue, 0.6767213143579776));
    }

};


