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

public class SubLine_side_98715573362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19606;
     Object term19830;

    public SubLine_side_98715573362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19606 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine"));
        Object term19718 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Line"));
        setField(term19606, term19606.getClass(), "hyperplane", term19718);
        term19830 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Line"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.geometry.partitioning.Hyperplane");
        Object[] args = new Object[1];
        args[0] = term19830;
        callMethod(klass, "side", argTypes, term19606, args);
    }

};


