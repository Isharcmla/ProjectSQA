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

public class SubLine_intersection_2918751444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56;
     Object term71;
     Object term86;

    public SubLine_intersection_2918751444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term68 = new Boolean(true);
        term56 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.SubLine"));
        Object term57 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        Object term58 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        Object term62 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        Object term66 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet"));
        Object term67 = newInstance(Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        setDoubleField(term58, term58.getClass(), "x", 0.2852810965221698);
        setDoubleField(term58, term58.getClass(), "y", 0.6300849762307866);
        setDoubleField(term58, term58.getClass(), "z", 0.9737083944266686);
        setField(term57, term57.getClass(), "direction", term58);
        setDoubleField(term62, term62.getClass(), "x", 0.0668892744806211);
        setDoubleField(term62, term62.getClass(), "y", 0.3587267442738795);
        setDoubleField(term62, term62.getClass(), "z", 0.07802449704920456);
        setField(term57, term57.getClass(), "zero", term62);
        setField(term56, term56.getClass(), "line", term57);
        setField(term67, term67.getClass(), "cut", null);
        setField(term67, term67.getClass(), "plus", null);
        setField(term67, term67.getClass(), "minus", null);
        setField(term67, term67.getClass(), "parent", null);
        setField(term67, term67.getClass(), "attribute", term68);
        setField(term66, term66.getClass(), "tree", term67);
        setDoubleField(term66, term66.getClass(), "size", 0.5279279537140873);
        setField(term66, term66.getClass(), "barycenter", null);
        setField(term56, term56.getClass(), "remainingRegion", term66);
        Boolean term83 = new Boolean(true);
        term71 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.SubLine"));
        Object term72 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        Object term73 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        Object term77 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        Object term81 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet"));
        Object term82 = newInstance(Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        setDoubleField(term73, term73.getClass(), "x", 0.3202192021706908);
        setDoubleField(term73, term73.getClass(), "y", 0.22651340641904605);
        setDoubleField(term73, term73.getClass(), "z", 0.8878841294187743);
        setField(term72, term72.getClass(), "direction", term73);
        setDoubleField(term77, term77.getClass(), "x", 0.6588948704887806);
        setDoubleField(term77, term77.getClass(), "y", 0.6397214730945112);
        setDoubleField(term77, term77.getClass(), "z", 0.25937345430928016);
        setField(term72, term72.getClass(), "zero", term77);
        setField(term71, term71.getClass(), "line", term72);
        setField(term82, term82.getClass(), "cut", null);
        setField(term82, term82.getClass(), "plus", null);
        setField(term82, term82.getClass(), "minus", null);
        setField(term82, term82.getClass(), "parent", null);
        setField(term82, term82.getClass(), "attribute", term83);
        setField(term81, term81.getClass(), "tree", term82);
        setDoubleField(term81, term81.getClass(), "size", 0.5873228247510078);
        setField(term81, term81.getClass(), "barycenter", null);
        setField(term71, term71.getClass(), "remainingRegion", term81);
        term86 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.SubLine");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.SubLine");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term71;
        args[1] = term86;
        callMethod(klass, "intersection", argTypes, term56, args);
    }

};


