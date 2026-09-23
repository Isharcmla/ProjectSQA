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

public class SubLine_init_201485254997 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34111;
     Object term34231;

    public SubLine_init_201485254997() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term33991 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine"));
        term34111 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setDoubleField(term34111, term34111.getClass(), "x", 2.814749783916736E15);
        setDoubleField(term34111, term34111.getClass(), "y", 0.0);
        term34231 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setDoubleField(term34231, term34231.getClass(), "x", 1.688712135866558E15);
        setDoubleField(term34231, term34231.getClass(), "y", -9.223372036854776E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D");
        argTypes[1] = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D");
        Object[] args = new Object[2];
        args[0] = term34111;
        args[1] = term34231;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


