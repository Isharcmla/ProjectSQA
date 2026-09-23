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
import static org.apache.commons.math.geometry.EqualityUtils.*;

public class Vector3D_negate_207149657757 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159;
     Object term2079;
     Object term2068;

    public Vector3D_negate_207149657757() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term159, term159.getClass(), "x", 0.0865998004187658);
        setDoubleField(term159, term159.getClass(), "y", 0.9628647861255637);
        setDoubleField(term159, term159.getClass(), "z", 0.623231822150205);
        term2079 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term2079, term2079.getClass(), "x", 0.0865998004187658);
        setDoubleField(term2079, term2079.getClass(), "y", 0.9628647861255637);
        setDoubleField(term2079, term2079.getClass(), "z", 0.623231822150205);
        term2068 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term2068, term2068.getClass(), "x", -0.0865998004187658);
        setDoubleField(term2068, term2068.getClass(), "y", -0.9628647861255637);
        setDoubleField(term2068, term2068.getClass(), "z", -0.623231822150205);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "negate", argTypes, term159, args);
        assertTrue(recursiveEquals(term159, term2079));
        assertTrue(recursiveEquals(retValue, term2068));
    }

};


