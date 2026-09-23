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

public class SubLine_init_179104530090 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30923;

    public SubLine_init_179104530090() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term30761 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine"));
        term30923 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet$ComparableSegment"));
        Object term31043 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        Object term31163 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(term30923, term30923.getClass(), "line", null);
        setDoubleField(term31043, term31043.getClass(), "x", 2.26981421219472998E18);
        setDoubleField(term31043, term31043.getClass(), "y", 2.22661641764896E14);
        setField(term30923, term30923.getClass(), "start", term31043);
        setDoubleField(term31163, term31163.getClass(), "x", 2.319995030609068E18);
        setDoubleField(term31163, term31163.getClass(), "y", 2.112139088101408E15);
        setField(term30923, term30923.getClass(), "end", term31163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Segment");
        Object[] args = new Object[1];
        args[0] = term30923;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


