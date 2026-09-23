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

public class SubLine_init_179104530034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8214;

    public SubLine_init_179104530034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term8096 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine"));
        term8214 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Segment"));
        Object term8334 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        Object term8454 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(term8214, term8214.getClass(), "line", null);
        setDoubleField(term8334, term8334.getClass(), "x", -4.503599623176192E15);
        setDoubleField(term8334, term8334.getClass(), "y", 9.2201638799074263E18);
        setField(term8214, term8214.getClass(), "start", term8334);
        setDoubleField(term8454, term8454.getClass(), "x", -9.2233720368535951E18);
        setDoubleField(term8454, term8454.getClass(), "y", 7.783371920695486E15);
        setField(term8214, term8214.getClass(), "end", term8454);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Segment");
        Object[] args = new Object[1];
        args[0] = term8214;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


