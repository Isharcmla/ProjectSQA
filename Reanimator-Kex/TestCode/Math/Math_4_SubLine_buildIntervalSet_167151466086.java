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

public class SubLine_buildIntervalSet_167151466086 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29037;
     Object term29157;

    public SubLine_buildIntervalSet_167151466086() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29037 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setDoubleField(term29037, term29037.getClass(), "x", -1.552854015803392E15);
        setDoubleField(term29037, term29037.getClass(), "y", 4.5531392232715715E18);
        term29157 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setDoubleField(term29157, term29157.getClass(), "x", -2.090927518646272E15);
        setDoubleField(term29157, term29157.getClass(), "y", -4.6161885185431306E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D");
        argTypes[1] = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D");
        Object[] args = new Object[2];
        args[0] = term29037;
        args[1] = term29157;
        callMethod(klass, "buildIntervalSet", argTypes, null, args);
    }

};


