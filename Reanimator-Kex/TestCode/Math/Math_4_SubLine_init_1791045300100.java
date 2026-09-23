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

public class SubLine_init_1791045300100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35570;

    public SubLine_init_1791045300100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term35452 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine"));
        term35570 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Segment"));
        Object term35690 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        Object term35810 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(term35570, term35570.getClass(), "line", null);
        setDoubleField(term35690, term35690.getClass(), "x", -3.34225765034083E15);
        setDoubleField(term35690, term35690.getClass(), "y", 6.886003826491392E18);
        setField(term35570, term35570.getClass(), "start", term35690);
        setDoubleField(term35810, term35810.getClass(), "x", 3.9309741897286144E16);
        setDoubleField(term35810, term35810.getClass(), "y", 6.9130254282821489E18);
        setField(term35570, term35570.getClass(), "end", term35810);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Segment");
        Object[] args = new Object[1];
        args[0] = term35570;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


