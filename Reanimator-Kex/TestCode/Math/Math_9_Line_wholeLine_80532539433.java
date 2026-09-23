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

public class Line_wholeLine_80532539433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202;
     Object term5005;
     Object term4990;

    public Line_wholeLine_80532539433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term202 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        Object term203 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        Object term207 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term203, term203.getClass(), "x", 0.9123572866833729);
        setDoubleField(term203, term203.getClass(), "y", 0.40635376375558196);
        setDoubleField(term203, term203.getClass(), "z", 0.4772043271031934);
        setField(term202, term202.getClass(), "direction", term203);
        setDoubleField(term207, term207.getClass(), "x", 0.2446504549754045);
        setDoubleField(term207, term207.getClass(), "y", 0.6142723998707854);
        setDoubleField(term207, term207.getClass(), "z", 0.4355627280318103);
        setField(term202, term202.getClass(), "zero", term207);
        term5005 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        Object term5006 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        Object term5007 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term5006, term5006.getClass(), "x", 0.9123572866833729);
        setDoubleField(term5006, term5006.getClass(), "y", 0.40635376375558196);
        setDoubleField(term5006, term5006.getClass(), "z", 0.4772043271031934);
        setField(term5005, term5005.getClass(), "direction", term5006);
        setDoubleField(term5007, term5007.getClass(), "x", 0.2446504549754045);
        setDoubleField(term5007, term5007.getClass(), "y", 0.6142723998707854);
        setDoubleField(term5007, term5007.getClass(), "z", 0.4355627280318103);
        setField(term5005, term5005.getClass(), "zero", term5007);
        Boolean term5002 = new Boolean(true);
        term4990 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.SubLine"));
        Object term4991 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        Object term4992 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        Object term4996 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        Object term5000 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet"));
        Object term5001 = newInstance(Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        setDoubleField(term4992, term4992.getClass(), "x", 0.9123572866833729);
        setDoubleField(term4992, term4992.getClass(), "y", 0.40635376375558196);
        setDoubleField(term4992, term4992.getClass(), "z", 0.4772043271031934);
        setField(term4991, term4991.getClass(), "direction", term4992);
        setDoubleField(term4996, term4996.getClass(), "x", 0.2446504549754045);
        setDoubleField(term4996, term4996.getClass(), "y", 0.6142723998707854);
        setDoubleField(term4996, term4996.getClass(), "z", 0.4355627280318103);
        setField(term4991, term4991.getClass(), "zero", term4996);
        setField(term4990, term4990.getClass(), "line", term4991);
        setField(term5001, term5001.getClass(), "cut", null);
        setField(term5001, term5001.getClass(), "plus", null);
        setField(term5001, term5001.getClass(), "minus", null);
        setField(term5001, term5001.getClass(), "parent", null);
        setField(term5001, term5001.getClass(), "attribute", term5002);
        setField(term5000, term5000.getClass(), "tree", term5001);
        setDoubleField(term5000, term5000.getClass(), "size", 0.0);
        setField(term5000, term5000.getClass(), "barycenter", null);
        setField(term4990, term4990.getClass(), "remainingRegion", term5000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "wholeLine", argTypes, term202, args);
        assertTrue(recursiveEquals(term202, term5005));
        assertTrue(recursiveEquals(retValue, term4990));
    }

};


