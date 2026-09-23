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
import java.lang.NullPointerException;
import static org.apache.commons.math3.geometry.euclidean.twod.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SubLine_intersection_1949268039123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45775;
     Object term46005;

    public SubLine_intersection_1949268039123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45775 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine"));
        Object term45887 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Line"));
        setField(term45775, term45775.getClass(), "hyperplane", term45887);
        term46005 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine"));
        setField(term46005, term46005.getClass(), "hyperplane", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term46005;
        args[1] = false;
        try {
            callMethod(klass, "intersection", argTypes, term45775, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


