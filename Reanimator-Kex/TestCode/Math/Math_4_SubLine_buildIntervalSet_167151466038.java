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

public class SubLine_buildIntervalSet_167151466038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9768;
     Object term9888;

    public SubLine_buildIntervalSet_167151466038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9768 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setDoubleField(term9768, term9768.getClass(), "x", 8.6242853946885407E18);
        setDoubleField(term9768, term9768.getClass(), "y", -4.5576433125255076E18);
        term9888 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setDoubleField(term9888, term9888.getClass(), "x", 8.6843741249963704E18);
        setDoubleField(term9888, term9888.getClass(), "y", 4.6817732215932375E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D");
        argTypes[1] = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D");
        Object[] args = new Object[2];
        args[0] = term9768;
        args[1] = term9888;
        callMethod(klass, "buildIntervalSet", argTypes, null, args);
    }

};


