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

public class Line_contains_121121920011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122;
     Object term131;

    public Line_contains_121121920011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        Object term123 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        Object term127 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term123, term123.getClass(), "x", 0.8924855581421237);
        setDoubleField(term123, term123.getClass(), "y", 0.32237559209193944);
        setDoubleField(term123, term123.getClass(), "z", 0.53094494792755);
        setField(term122, term122.getClass(), "direction", term123);
        setDoubleField(term127, term127.getClass(), "x", 0.146431486357265);
        setDoubleField(term127, term127.getClass(), "y", 0.24259014218848696);
        setDoubleField(term127, term127.getClass(), "z", 0.1544348383112728);
        setField(term122, term122.getClass(), "zero", term127);
        term131 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term131, term131.getClass(), "x", 0.5187846213101265);
        setDoubleField(term131, term131.getClass(), "y", 0.045893173090043815);
        setDoubleField(term131, term131.getClass(), "z", 0.3626177854778667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D");
        Object[] args = new Object[1];
        args[0] = term131;
        callMethod(klass, "contains", argTypes, term122, args);
    }

};


