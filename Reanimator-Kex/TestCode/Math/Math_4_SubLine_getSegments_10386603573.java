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
import java.lang.Boolean;

public class SubLine_getSegments_10386603573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41;

    public SubLine_getSegments_10386603573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term53 = new Boolean(true);
        term41 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.SubLine"));
        Object term42 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        Object term43 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        Object term47 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        Object term51 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet"));
        Object term52 = newInstance(Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        setDoubleField(term43, term43.getClass(), "x", 0.3800088629986428);
        setDoubleField(term43, term43.getClass(), "y", 0.5840714198152577);
        setDoubleField(term43, term43.getClass(), "z", 0.7559240768573477);
        setField(term42, term42.getClass(), "direction", term43);
        setDoubleField(term47, term47.getClass(), "x", 0.10667076642995188);
        setDoubleField(term47, term47.getClass(), "y", 0.11493000848982304);
        setDoubleField(term47, term47.getClass(), "z", 0.37161417339133307);
        setField(term42, term42.getClass(), "zero", term47);
        setField(term41, term41.getClass(), "line", term42);
        setField(term52, term52.getClass(), "cut", null);
        setField(term52, term52.getClass(), "plus", null);
        setField(term52, term52.getClass(), "minus", null);
        setField(term52, term52.getClass(), "parent", null);
        setField(term52, term52.getClass(), "attribute", term53);
        setField(term51, term51.getClass(), "tree", term52);
        setDoubleField(term51, term51.getClass(), "size", 0.6805867182029153);
        setField(term51, term51.getClass(), "barycenter", null);
        setField(term41, term41.getClass(), "remainingRegion", term51);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.SubLine");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSegments", argTypes, term41, args);
    }

};


