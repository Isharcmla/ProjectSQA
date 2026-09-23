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

public class SubLine_init_179104530092 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32048;

    public SubLine_init_179104530092() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term31886 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine"));
        term32048 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet$ComparableSegment"));
        Object term32168 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        Object term32288 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(term32048, term32048.getClass(), "line", null);
        setDoubleField(term32168, term32168.getClass(), "x", -4.362487637999576E15);
        setDoubleField(term32168, term32168.getClass(), "y", -4.5351248247620895E18);
        setField(term32048, term32048.getClass(), "start", term32168);
        setDoubleField(term32288, term32288.getClass(), "x", -9.2183275101680015E18);
        setDoubleField(term32288, term32288.getClass(), "y", -4.4990925917609001E18);
        setField(term32048, term32048.getClass(), "end", term32288);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Segment");
        Object[] args = new Object[1];
        args[0] = term32048;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


