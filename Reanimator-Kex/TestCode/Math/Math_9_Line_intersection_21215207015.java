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
import static org.apache.commons.math3.geometry.euclidean.threed.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Line_intersection_21215207015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184;
     Object term193;

    public Line_intersection_21215207015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        Object term185 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        Object term189 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term185, term185.getClass(), "x", 0.34010089048558567);
        setDoubleField(term185, term185.getClass(), "y", 0.19625398866403143);
        setDoubleField(term185, term185.getClass(), "z", 0.45069204793711093);
        setField(term184, term184.getClass(), "direction", term185);
        setDoubleField(term189, term189.getClass(), "x", 0.9341364461850963);
        setDoubleField(term189, term189.getClass(), "y", 0.9022041121474429);
        setDoubleField(term189, term189.getClass(), "z", 0.6512870939318848);
        setField(term184, term184.getClass(), "zero", term189);
        term193 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        Object term194 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        Object term198 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term194, term194.getClass(), "x", 0.8777038609128434);
        setDoubleField(term194, term194.getClass(), "y", 0.008025683154629148);
        setDoubleField(term194, term194.getClass(), "z", 0.40598298281353484);
        setField(term193, term193.getClass(), "direction", term194);
        setDoubleField(term198, term198.getClass(), "x", 0.3710067290060264);
        setDoubleField(term198, term198.getClass(), "y", 0.7818620200430967);
        setDoubleField(term198, term198.getClass(), "z", 0.04640022995603543);
        setField(term193, term193.getClass(), "zero", term198);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line");
        Object[] args = new Object[1];
        args[0] = term193;
        callMethod(klass, "intersection", argTypes, term184, args);
    }

};


