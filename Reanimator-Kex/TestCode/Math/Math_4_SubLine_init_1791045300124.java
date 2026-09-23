package org.apache.commons.math3.geometry.euclidean.twod;

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
import static org.apache.commons.math3.geometry.euclidean.twod.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SubLine_init_1791045300124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46598;

    public SubLine_init_1791045300124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term46436 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine"));
        term46598 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet$ComparableSegment"));
        Object term46718 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        Object term46838 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(term46598, term46598.getClass(), "line", null);
        setDoubleField(term46718, term46718.getClass(), "x", 4.6116949175997604E18);
        setDoubleField(term46718, term46718.getClass(), "y", 9.2188684372274053E18);
        setField(term46598, term46598.getClass(), "start", term46718);
        setDoubleField(term46838, term46838.getClass(), "x", 4.6161918170947922E18);
        setDoubleField(term46838, term46838.getClass(), "y", -2.3094994345829335E18);
        setField(term46598, term46598.getClass(), "end", term46838);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Segment");
        Object[] args = new Object[1];
        args[0] = term46598;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


