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

public class SubLine_buildIntervalSet_167151466072 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23127;
     Object term23247;

    public SubLine_buildIntervalSet_167151466072() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23127 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setDoubleField(term23127, term23127.getClass(), "x", 4.489992016804044E15);
        setDoubleField(term23127, term23127.getClass(), "y", 9.2211202370410906E18);
        term23247 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setDoubleField(term23247, term23247.getClass(), "x", 9.2233236570066063E18);
        setDoubleField(term23247, term23247.getClass(), "y", -9.2052776614596321E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D");
        argTypes[1] = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D");
        Object[] args = new Object[2];
        args[0] = term23127;
        args[1] = term23247;
        callMethod(klass, "buildIntervalSet", argTypes, null, args);
    }

};


