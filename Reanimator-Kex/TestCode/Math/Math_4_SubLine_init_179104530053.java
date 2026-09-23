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
import java.lang.NullPointerException;
import static org.apache.commons.math3.geometry.euclidean.twod.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SubLine_init_179104530053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15271;

    public SubLine_init_179104530053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term15109 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine"));
        term15271 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet$ComparableSegment"));
        Object term15383 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Line"));
        Object term15503 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(term15271, term15271.getClass(), "line", term15383);
        setField(term15271, term15271.getClass(), "start", null);
        setField(term15271, term15271.getClass(), "end", term15503);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Segment");
        Object[] args = new Object[1];
        args[0] = term15271;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


