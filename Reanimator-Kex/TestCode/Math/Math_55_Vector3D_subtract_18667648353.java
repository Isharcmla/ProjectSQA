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

public class Vector3D_subtract_18667648353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133;
     Object term137;
     Object term139;
     Object term1611;
     Object term1612;
     Object term1595;

    public Vector3D_subtract_18667648353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term133, term133.getClass(), "x", 0.3163771663728089);
        setDoubleField(term133, term133.getClass(), "y", 0.8819646072665548);
        setDoubleField(term133, term133.getClass(), "z", 0.5412182593116958);
        term137 = new Double(0.16988691727397487);
        term139 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term139, term139.getClass(), "x", 0.39286935532362843);
        setDoubleField(term139, term139.getClass(), "y", 0.11577948268926874);
        setDoubleField(term139, term139.getClass(), "z", 0.5617009352394552);
        term1611 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term1611, term1611.getClass(), "x", 0.3163771663728089);
        setDoubleField(term1611, term1611.getClass(), "y", 0.8819646072665548);
        setDoubleField(term1611, term1611.getClass(), "z", 0.5412182593116958);
        term1612 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term1612, term1612.getClass(), "x", 0.39286935532362843);
        setDoubleField(term1612, term1612.getClass(), "y", 0.11577948268926874);
        setDoubleField(term1612, term1612.getClass(), "z", 0.5617009352394552);
        term1595 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term1595, term1595.getClass(), "x", 0.2496338027054638);
        setDoubleField(term1595, term1595.getClass(), "y", 0.8622951878688994);
        setDoubleField(term1595, term1595.getClass(), "z", 0.4457926189939561);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Object[] args = new Object[2];
        args[0] = term137;
        args[1] = term139;
        Object retValue = callMethod(klass, "subtract", argTypes, term133, args);
        assertTrue(recursiveEquals(term133, term1611));
        assertTrue(recursiveEquals(term137, 0.16988691727397487));
        assertTrue(recursiveEquals(term139, term1612));
        assertTrue(recursiveEquals(retValue, term1595));
    }

};


