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

public class SubLine_init_1791045300112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41574;

    public SubLine_init_1791045300112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term41456 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine"));
        term41574 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Segment"));
        Object term41694 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        Object term41814 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(term41574, term41574.getClass(), "line", null);
        setDoubleField(term41694, term41694.getClass(), "x", -9.223372036854776E18);
        setDoubleField(term41694, term41694.getClass(), "y", -4.503599627370496E15);
        setField(term41574, term41574.getClass(), "start", term41694);
        setDoubleField(term41814, term41814.getClass(), "x", 0.0);
        setDoubleField(term41814, term41814.getClass(), "y", -9.223372036854776E18);
        setField(term41574, term41574.getClass(), "end", term41814);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Segment");
        Object[] args = new Object[1];
        args[0] = term41574;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


