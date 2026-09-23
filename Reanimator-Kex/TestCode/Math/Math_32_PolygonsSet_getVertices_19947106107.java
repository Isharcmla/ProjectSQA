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

public class PolygonsSet_getVertices_19947106107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term418;

    public PolygonsSet_getVertices_19947106107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term440 = new Boolean(true);
        term418 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet"));
        Object[] term419 = (Object[]) newObjectArray(Array.newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"), 0).getClass(), 1);
        Object[] term420 = (Object[]) newArray("org.apache.commons.math3.geometry.euclidean.twod.Vector2D", 6);
        Object term421 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        Object term424 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        Object term427 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        Object term430 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        Object term433 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        Object term436 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        Object term439 = newInstance(Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        setDoubleField(term421, term421.getClass(), "x", 0.6862221294683138);
        setDoubleField(term421, term421.getClass(), "y", 0.15917839663695388);
        setElement(term420, 0, term421);
        setDoubleField(term424, term424.getClass(), "x", 0.9374115574082594);
        setDoubleField(term424, term424.getClass(), "y", 0.8454723071922143);
        setElement(term420, 1, term424);
        setDoubleField(term427, term427.getClass(), "x", 0.8566567697571895);
        setDoubleField(term427, term427.getClass(), "y", 0.9203805380592256);
        setElement(term420, 2, term427);
        setDoubleField(term430, term430.getClass(), "x", 0.5804948995371725);
        setDoubleField(term430, term430.getClass(), "y", 0.20737514139742264);
        setElement(term420, 3, term430);
        setDoubleField(term433, term433.getClass(), "x", 0.7919370314903882);
        setDoubleField(term433, term433.getClass(), "y", 0.2109867221632754);
        setElement(term420, 4, term433);
        setDoubleField(term436, term436.getClass(), "x", 0.3227335400819148);
        setDoubleField(term436, term436.getClass(), "y", 0.43337207054070237);
        setElement(term420, 5, term436);
        setElement(term419, 0, term420);
        setField(term418, term418.getClass(), "vertices", term419);
        setField(term439, term439.getClass(), "cut", null);
        setField(term439, term439.getClass(), "plus", null);
        setField(term439, term439.getClass(), "minus", null);
        setField(term439, term439.getClass(), "parent", null);
        setField(term439, term439.getClass(), "attribute", term440);
        setField(term418, term418.getClass(), "tree", term439);
        setDoubleField(term418, term418.getClass(), "size", 0.13246999699526574);
        setField(term418, term418.getClass(), "barycenter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVertices", argTypes, term418, args);
    }

};


