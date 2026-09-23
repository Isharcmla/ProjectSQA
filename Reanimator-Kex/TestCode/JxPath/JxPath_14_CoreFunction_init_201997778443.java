package org.apache.commons.jxpath.ri.compiler;

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
import static org.apache.commons.jxpath.ri.compiler.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.compiler.EqualityUtils.*;
import java.lang.Integer;
import java.lang.Object;

public class CoreFunction_init_201997778443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term3;
     Object term227;
     Object term229;

    public CoreFunction_init_201997778443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Integer(568599855);
        term3 = (Object[]) newArray("org.apache.commons.jxpath.ri.compiler.Expression", 5);
        term227 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        Object[] term228 = (Object[]) newArray("org.apache.commons.jxpath.ri.compiler.Expression", 5);
        setIntField(term227, term227.getClass(), "functionCode", 568599855);
        setField(term227, term227.getClass(), "args", term228);
        setBooleanField(term227, term227.getClass(), "contextDependencyKnown", false);
        setBooleanField(term227, term227.getClass(), "contextDependent", false);
        term229 = (Object[]) newArray("org.apache.commons.jxpath.ri.compiler.Expression", 5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.Expression"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = term3;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term227));
        assertTrue(recursiveEquals(term1, term229));
        assertTrue(recursiveEquals(term3, 568599855));
    }

};


