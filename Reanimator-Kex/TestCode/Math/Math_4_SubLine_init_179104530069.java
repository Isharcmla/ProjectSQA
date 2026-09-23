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
import static org.apache.commons.math3.geometry.euclidean.twod.EqualityUtils.*;
import java.lang.Object;
import java.lang.Boolean;

public class SubLine_init_179104530069 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21771;
     Object term22123;
     Object term22136;

    public SubLine_init_179104530069() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term21609 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine"));
        term21771 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet$ComparableSegment"));
        Object term21891 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(term21771, term21771.getClass(), "line", null);
        setDoubleField(term21891, term21891.getClass(), "x", 0.0);
        setField(term21771, term21771.getClass(), "start", term21891);
        setField(term21771, term21771.getClass(), "end", term21891);
        Boolean term22129 = new Boolean(false);
        Boolean term22133 = new Boolean(false);
        Boolean term22135 = new Boolean(true);
        term22123 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine"));
        Object term22124 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet"));
        Object term22125 = newInstance(Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        Object term22126 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint"));
        Object term22127 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint"));
        Object term22128 = newInstance(Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        Object term22130 = newInstance(Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        Object term22131 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint"));
        Object term22132 = newInstance(Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        Object term22134 = newInstance(Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        setField(term22123, term22123.getClass(), "hyperplane", null);
        setField(term22127, term22127.getClass(), "location", null);
        setBooleanField(term22127, term22127.getClass(), "direct", false);
        setField(term22126, term22126.getClass(), "hyperplane", term22127);
        setField(term22126, term22126.getClass(), "remainingRegion", null);
        setField(term22125, term22125.getClass(), "cut", term22126);
        setField(term22128, term22128.getClass(), "cut", null);
        setField(term22128, term22128.getClass(), "plus", null);
        setField(term22128, term22128.getClass(), "minus", null);
        setField(term22128, term22128.getClass(), "parent", term22125);
        setField(term22128, term22128.getClass(), "attribute", term22129);
        setField(term22125, term22125.getClass(), "plus", term22128);
        setField(term22131, term22131.getClass(), "hyperplane", null);
        setField(term22131, term22131.getClass(), "remainingRegion", null);
        setField(term22130, term22130.getClass(), "cut", term22131);
        setField(term22132, term22132.getClass(), "cut", null);
        setField(term22132, term22132.getClass(), "plus", null);
        setField(term22132, term22132.getClass(), "minus", null);
        setField(term22132, term22132.getClass(), "parent", term22130);
        setField(term22132, term22132.getClass(), "attribute", term22133);
        setField(term22130, term22130.getClass(), "plus", term22132);
        setField(term22134, term22134.getClass(), "cut", null);
        setField(term22134, term22134.getClass(), "plus", null);
        setField(term22134, term22134.getClass(), "minus", null);
        setField(term22134, term22134.getClass(), "parent", term22130);
        setField(term22134, term22134.getClass(), "attribute", term22135);
        setField(term22130, term22130.getClass(), "minus", term22134);
        setField(term22130, term22130.getClass(), "parent", term22125);
        setField(term22130, term22130.getClass(), "attribute", null);
        setField(term22125, term22125.getClass(), "minus", term22130);
        setField(term22125, term22125.getClass(), "parent", null);
        setField(term22125, term22125.getClass(), "attribute", null);
        setField(term22124, term22124.getClass(), "tree", term22125);
        setDoubleField(term22124, term22124.getClass(), "size", 0.0);
        setField(term22124, term22124.getClass(), "barycenter", null);
        setField(term22123, term22123.getClass(), "remainingRegion", term22124);
        term22136 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet$ComparableSegment"));
        Object term22137 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(term22136, term22136.getClass(), "sortingKey", null);
        setDoubleField(term22137, term22137.getClass(), "x", 0.0);
        setDoubleField(term22137, term22137.getClass(), "y", 0.0);
        setField(term22136, term22136.getClass(), "start", term22137);
        setField(term22136, term22136.getClass(), "end", term22137);
        setField(term22136, term22136.getClass(), "line", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Segment");
        Object[] args = new Object[1];
        args[0] = term21771;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term22123));
        assertTrue(recursiveEquals(term21771, term22136));
    }

};


