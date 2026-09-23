package org.apache.commons.math3.geometry.euclidean.threed;

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
import static org.apache.commons.math3.geometry.euclidean.threed.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Line_getAbscissa_1624675376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62;
     Object term71;

    public Line_getAbscissa_1624675376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        Object term63 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        Object term67 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term63, term63.getClass(), "x", 0.6588948704887806);
        setDoubleField(term63, term63.getClass(), "y", 0.6397214730945112);
        setDoubleField(term63, term63.getClass(), "z", 0.25937345430928016);
        setField(term62, term62.getClass(), "direction", term63);
        setDoubleField(term67, term67.getClass(), "x", 0.5873228247510078);
        setDoubleField(term67, term67.getClass(), "y", 0.8823181080774973);
        setDoubleField(term67, term67.getClass(), "z", 0.2192450926212024);
        setField(term62, term62.getClass(), "zero", term67);
        term71 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term71, term71.getClass(), "x", 0.7591353014991907);
        setDoubleField(term71, term71.getClass(), "y", 0.791695029600875);
        setDoubleField(term71, term71.getClass(), "z", 0.6862221294683138);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D");
        Object[] args = new Object[1];
        args[0] = term71;
        callMethod(klass, "getAbscissa", argTypes, term62, args);
    }

};


