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

public class Line_isSimilarTo_36912835510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104;
     Object term113;

    public Line_isSimilarTo_36912835510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        Object term105 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        Object term109 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term105, term105.getClass(), "x", 0.7154795600170818);
        setDoubleField(term105, term105.getClass(), "y", 0.6355029654528058);
        setDoubleField(term105, term105.getClass(), "z", 0.0022646783892913414);
        setField(term104, term104.getClass(), "direction", term105);
        setDoubleField(term109, term109.getClass(), "x", 0.36226058076369927);
        setDoubleField(term109, term109.getClass(), "y", 0.03699061125289671);
        setDoubleField(term109, term109.getClass(), "z", 0.6047137830113202);
        setField(term104, term104.getClass(), "zero", term109);
        term113 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        Object term114 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        Object term118 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term114, term114.getClass(), "x", 0.6767213143579776);
        setDoubleField(term114, term114.getClass(), "y", 0.48862955528902696);
        setDoubleField(term114, term114.getClass(), "z", 0.426231085465289);
        setField(term113, term113.getClass(), "direction", term114);
        setDoubleField(term118, term118.getClass(), "x", 0.0027299293098262956);
        setDoubleField(term118, term118.getClass(), "y", 0.29874017652881824);
        setDoubleField(term118, term118.getClass(), "z", 0.32554480512985284);
        setField(term113, term113.getClass(), "zero", term118);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line");
        Object[] args = new Object[1];
        args[0] = term113;
        callMethod(klass, "isSimilarTo", argTypes, term104, args);
    }

};


