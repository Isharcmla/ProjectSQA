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
import java.lang.NullPointerException;
import static org.apache.commons.math3.geometry.euclidean.threed.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SubLine_intersection_29187514435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8832;
     Object term9070;

    public SubLine_intersection_29187514435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8832 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.SubLine"));
        Object term8948 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        setField(term8948, term8948.getClass(), "direction", null);
        setField(term8832, term8832.getClass(), "line", term8948);
        term9070 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.SubLine"));
        Object term9186 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        Object term9310 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setField(term9186, term9186.getClass(), "direction", term9310);
        setField(term9070, term9070.getClass(), "line", term9186);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.SubLine");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.SubLine");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term9070;
        args[1] = false;
        try {
            callMethod(klass, "intersection", argTypes, term8832, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


