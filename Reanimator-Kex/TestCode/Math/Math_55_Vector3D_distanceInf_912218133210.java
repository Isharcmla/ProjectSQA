package org.apache.commons.math.geometry;

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
import static org.apache.commons.math.geometry.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Vector3D_distanceInf_912218133210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34910;
     Object term34998;

    public Vector3D_distanceInf_912218133210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34910 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term34910, term34910.getClass(), "x", -4.5351248247620895E18);
        setDoubleField(term34910, term34910.getClass(), "y", 2.251799886036992E15);
        setDoubleField(term34910, term34910.getClass(), "z", -9.223372036854776E18);
        term34998 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term34998, term34998.getClass(), "x", -4.5036699961146737E18);
        setDoubleField(term34998, term34998.getClass(), "y", 9.2211114403828685E18);
        setDoubleField(term34998, term34998.getClass(), "z", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Object[] args = new Object[2];
        args[0] = term34910;
        args[1] = term34998;
        callMethod(klass, "distanceInf", argTypes, null, args);
    }

};


