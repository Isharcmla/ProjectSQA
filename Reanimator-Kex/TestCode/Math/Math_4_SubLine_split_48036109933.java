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
import java.lang.ClassCastException;
import static org.apache.commons.math3.geometry.euclidean.twod.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SubLine_split_48036109933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7187;
     Object term7305;

    public SubLine_split_48036109933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7187 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine"));
        setField(term7187, term7187.getClass(), "hyperplane", null);
        term7305 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Plane"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.geometry.partitioning.Hyperplane");
        Object[] args = new Object[1];
        args[0] = term7305;
        try {
            callMethod(klass, "split", argTypes, term7187, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


