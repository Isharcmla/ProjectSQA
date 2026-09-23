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
import java.lang.Boolean;

public class PolygonsSet_computeGeometricalProperties_13695306846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term380;

    public PolygonsSet_computeGeometricalProperties_13695306846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term415 = new Boolean(true);
        term380 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet"));
        Object[] term381 = (Object[]) newObjectArray(Array.newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"), 0).getClass(), 2);
        Object[] term382 = (Object[]) newArray("org.apache.commons.math3.geometry.euclidean.twod.Vector2D", 6);
        Object term383 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        Object term386 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        Object term389 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        Object term392 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        Object term395 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        Object term398 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        Object[] term401 = (Object[]) newArray("org.apache.commons.math3.geometry.euclidean.twod.Vector2D", 7);
        Object term402 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        Object term405 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        Object term408 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        Object term411 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        Object term414 = newInstance(Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        setDoubleField(term383, term383.getClass(), "x", 0.11493000848982304);
        setDoubleField(term383, term383.getClass(), "y", 0.37161417339133307);
        setElement(term382, 0, term383);
        setDoubleField(term386, term386.getClass(), "x", 0.6805867182029153);
        setDoubleField(term386, term386.getClass(), "y", 0.2852810965221698);
        setElement(term382, 1, term386);
        setDoubleField(term389, term389.getClass(), "x", 0.6300849762307866);
        setDoubleField(term389, term389.getClass(), "y", 0.9737083944266686);
        setElement(term382, 2, term389);
        setDoubleField(term392, term392.getClass(), "x", 0.0668892744806211);
        setDoubleField(term392, term392.getClass(), "y", 0.3587267442738795);
        setElement(term382, 3, term392);
        setDoubleField(term395, term395.getClass(), "x", 0.07802449704920456);
        setDoubleField(term395, term395.getClass(), "y", 0.5279279537140873);
        setElement(term382, 4, term395);
        setDoubleField(term398, term398.getClass(), "x", 0.3202192021706908);
        setDoubleField(term398, term398.getClass(), "y", 0.22651340641904605);
        setElement(term382, 5, term398);
        setElement(term381, 0, term382);
        setDoubleField(term402, term402.getClass(), "x", 0.8878841294187743);
        setDoubleField(term402, term402.getClass(), "y", 0.6588948704887806);
        setElement(term401, 0, term402);
        setDoubleField(term405, term405.getClass(), "x", 0.6397214730945112);
        setDoubleField(term405, term405.getClass(), "y", 0.25937345430928016);
        setElement(term401, 1, term405);
        setDoubleField(term408, term408.getClass(), "x", 0.5873228247510078);
        setDoubleField(term408, term408.getClass(), "y", 0.8823181080774973);
        setElement(term401, 2, term408);
        setDoubleField(term411, term411.getClass(), "x", 0.2192450926212024);
        setDoubleField(term411, term411.getClass(), "y", 0.7591353014991907);
        setElement(term401, 3, term411);
        setElement(term401, 4, term405);
        setElement(term401, 5, term408);
        setElement(term401, 6, term383);
        setElement(term381, 1, term401);
        setField(term380, term380.getClass(), "vertices", term381);
        setField(term414, term414.getClass(), "cut", null);
        setField(term414, term414.getClass(), "plus", null);
        setField(term414, term414.getClass(), "minus", null);
        setField(term414, term414.getClass(), "parent", null);
        setField(term414, term414.getClass(), "attribute", term415);
        setField(term380, term380.getClass(), "tree", term414);
        setDoubleField(term380, term380.getClass(), "size", 0.791695029600875);
        setField(term380, term380.getClass(), "barycenter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "computeGeometricalProperties", argTypes, term380, args);
    }

};


