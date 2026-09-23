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

public class SubLine_init_17910453002 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7;

    public SubLine_init_17910453002() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Segment"));
        Object term8 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        Object term11 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        Object term14 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Line"));
        setDoubleField(term8, term8.getClass(), "x", 0.28570734989730284);
        setDoubleField(term8, term8.getClass(), "y", 0.40176586625454525);
        setField(term7, term7.getClass(), "start", term8);
        setDoubleField(term11, term11.getClass(), "x", 0.2641345529914265);
        setDoubleField(term11, term11.getClass(), "y", 0.36923381893433327);
        setField(term7, term7.getClass(), "end", term11);
        setDoubleField(term14, term14.getClass(), "angle", 0.6076495596892013);
        setDoubleField(term14, term14.getClass(), "cos", 0.37773193782763337);
        setDoubleField(term14, term14.getClass(), "sin", 0.8474802076607362);
        setDoubleField(term14, term14.getClass(), "originOffset", 0.5183269973490326);
        setField(term7, term7.getClass(), "line", term14);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Segment");
        Object[] args = new Object[1];
        args[0] = term7;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


