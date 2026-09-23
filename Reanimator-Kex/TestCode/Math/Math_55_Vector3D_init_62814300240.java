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
import java.lang.Double;

public class Vector3D_init_62814300240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47;
     Object term49;
     Object term53;
     Object term55;
     Object term59;
     Object term61;
     Object term65;
     Object term67;
     Object term688;
     Object term689;
     Object term690;
     Object term691;
     Object term692;

    public Vector3D_init_62814300240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47 = new Double(0.11493000848982304);
        term49 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term49, term49.getClass(), "x", 0.37161417339133307);
        setDoubleField(term49, term49.getClass(), "y", 0.6805867182029153);
        setDoubleField(term49, term49.getClass(), "z", 0.2852810965221698);
        term53 = new Double(0.6300849762307866);
        term55 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term55, term55.getClass(), "x", 0.9737083944266686);
        setDoubleField(term55, term55.getClass(), "y", 0.0668892744806211);
        setDoubleField(term55, term55.getClass(), "z", 0.3587267442738795);
        term59 = new Double(0.07802449704920456);
        term61 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term61, term61.getClass(), "x", 0.5279279537140873);
        setDoubleField(term61, term61.getClass(), "y", 0.3202192021706908);
        setDoubleField(term61, term61.getClass(), "z", 0.22651340641904605);
        term65 = new Double(0.8878841294187743);
        term67 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term67, term67.getClass(), "x", 0.6588948704887806);
        setDoubleField(term67, term67.getClass(), "y", 0.6397214730945112);
        setDoubleField(term67, term67.getClass(), "z", 0.25937345430928016);
        term688 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term688, term688.getClass(), "x", 1.2824422621900338);
        setDoubleField(term688, term688.getClass(), "y", 0.7133492496262201);
        setDoubleField(term688, term688.getClass(), "z", 0.5067828592689174);
        term689 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term689, term689.getClass(), "x", 0.37161417339133307);
        setDoubleField(term689, term689.getClass(), "y", 0.6805867182029153);
        setDoubleField(term689, term689.getClass(), "z", 0.2852810965221698);
        term690 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term690, term690.getClass(), "x", 0.9737083944266686);
        setDoubleField(term690, term690.getClass(), "y", 0.0668892744806211);
        setDoubleField(term690, term690.getClass(), "z", 0.3587267442738795);
        term691 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term691, term691.getClass(), "x", 0.5279279537140873);
        setDoubleField(term691, term691.getClass(), "y", 0.3202192021706908);
        setDoubleField(term691, term691.getClass(), "z", 0.22651340641904605);
        term692 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term692, term692.getClass(), "x", 0.6588948704887806);
        setDoubleField(term692, term692.getClass(), "y", 0.6397214730945112);
        setDoubleField(term692, term692.getClass(), "z", 0.25937345430928016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = double.class;
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        argTypes[2] = double.class;
        argTypes[3] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        argTypes[4] = double.class;
        argTypes[5] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        argTypes[6] = double.class;
        argTypes[7] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Object[] args = new Object[8];
        args[0] = term47;
        args[1] = term49;
        args[2] = term53;
        args[3] = term55;
        args[4] = term59;
        args[5] = term61;
        args[6] = term65;
        args[7] = term67;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term688));
        assertTrue(recursiveEquals(term47, 0.11493000848982304));
        assertTrue(recursiveEquals(term49, term689));
        assertTrue(recursiveEquals(term53, 0.6300849762307866));
        assertTrue(recursiveEquals(term55, term690));
        assertTrue(recursiveEquals(term59, 0.07802449704920456));
        assertTrue(recursiveEquals(term61, term691));
        assertTrue(recursiveEquals(term65, 0.8878841294187743));
        assertTrue(recursiveEquals(term67, term692));
    }

};


