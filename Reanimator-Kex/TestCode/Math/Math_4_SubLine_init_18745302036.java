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
import static org.apache.commons.math3.geometry.euclidean.threed.EqualityUtils.*;
import java.lang.Object;
import java.lang.Boolean;

public class SubLine_init_18745302036 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term10;
     Object term111;
     Object term118;
     Object term121;

    public SubLine_init_18745302036() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        Object term2 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        Object term6 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term2, term2.getClass(), "x", 0.13238746331190498);
        setDoubleField(term2, term2.getClass(), "y", 0.3455959125047594);
        setDoubleField(term2, term2.getClass(), "z", 0.5523635872663106);
        setField(term1, term1.getClass(), "direction", term2);
        setDoubleField(term6, term6.getClass(), "x", 0.544608645520025);
        setDoubleField(term6, term6.getClass(), "y", 0.28570734989730284);
        setDoubleField(term6, term6.getClass(), "z", 0.40176586625454525);
        setField(term1, term1.getClass(), "zero", term6);
        Boolean term12 = new Boolean(true);
        term10 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet"));
        Object term11 = newInstance(Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        setField(term11, term11.getClass(), "cut", null);
        setField(term11, term11.getClass(), "plus", null);
        setField(term11, term11.getClass(), "minus", null);
        setField(term11, term11.getClass(), "parent", null);
        setField(term11, term11.getClass(), "attribute", term12);
        setField(term10, term10.getClass(), "tree", term11);
        setDoubleField(term10, term10.getClass(), "size", 0.2641345529914265);
        setField(term10, term10.getClass(), "barycenter", null);
        Boolean term117 = new Boolean(true);
        term111 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.SubLine"));
        Object term112 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        Object term113 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        Object term114 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        Object term115 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet"));
        Object term116 = newInstance(Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        setDoubleField(term113, term113.getClass(), "x", 0.13238746331190498);
        setDoubleField(term113, term113.getClass(), "y", 0.3455959125047594);
        setDoubleField(term113, term113.getClass(), "z", 0.5523635872663106);
        setField(term112, term112.getClass(), "direction", term113);
        setDoubleField(term114, term114.getClass(), "x", 0.544608645520025);
        setDoubleField(term114, term114.getClass(), "y", 0.28570734989730284);
        setDoubleField(term114, term114.getClass(), "z", 0.40176586625454525);
        setField(term112, term112.getClass(), "zero", term114);
        setField(term111, term111.getClass(), "line", term112);
        setField(term116, term116.getClass(), "cut", null);
        setField(term116, term116.getClass(), "plus", null);
        setField(term116, term116.getClass(), "minus", null);
        setField(term116, term116.getClass(), "parent", null);
        setField(term116, term116.getClass(), "attribute", term117);
        setField(term115, term115.getClass(), "tree", term116);
        setDoubleField(term115, term115.getClass(), "size", 0.2641345529914265);
        setField(term115, term115.getClass(), "barycenter", null);
        setField(term111, term111.getClass(), "remainingRegion", term115);
        term118 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        Object term119 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        Object term120 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term119, term119.getClass(), "x", 0.13238746331190498);
        setDoubleField(term119, term119.getClass(), "y", 0.3455959125047594);
        setDoubleField(term119, term119.getClass(), "z", 0.5523635872663106);
        setField(term118, term118.getClass(), "direction", term119);
        setDoubleField(term120, term120.getClass(), "x", 0.544608645520025);
        setDoubleField(term120, term120.getClass(), "y", 0.28570734989730284);
        setDoubleField(term120, term120.getClass(), "z", 0.40176586625454525);
        setField(term118, term118.getClass(), "zero", term120);
        Boolean term123 = new Boolean(true);
        term121 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet"));
        Object term122 = newInstance(Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        setField(term122, term122.getClass(), "cut", null);
        setField(term122, term122.getClass(), "plus", null);
        setField(term122, term122.getClass(), "minus", null);
        setField(term122, term122.getClass(), "parent", null);
        setField(term122, term122.getClass(), "attribute", term123);
        setField(term121, term121.getClass(), "tree", term122);
        setDoubleField(term121, term121.getClass(), "size", 0.2641345529914265);
        setField(term121, term121.getClass(), "barycenter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.SubLine");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line");
        argTypes[1] = Class.forName("org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet");
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = term10;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term111));
        assertTrue(recursiveEquals(term1, term118));
        assertTrue(recursiveEquals(term10, term121));
    }

};


