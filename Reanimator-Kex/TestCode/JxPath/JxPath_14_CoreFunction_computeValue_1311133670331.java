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
import java.lang.Double;

public class CoreFunction_computeValue_1311133670331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95883;
     Object term95989;
     Object term186464;
     Object term186465;
     Object term186462;

    public CoreFunction_computeValue_1311133670331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95883 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        setIntField(term95883, term95883.getClass(), "functionCode", 1);
        setField(term95883, term95883.getClass(), "args", null);
        term95989 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NamespaceContext"));
        term186464 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        setIntField(term186464, term186464.getClass(), "functionCode", 1);
        setField(term186464, term186464.getClass(), "args", null);
        setBooleanField(term186464, term186464.getClass(), "contextDependencyKnown", false);
        setBooleanField(term186464, term186464.getClass(), "contextDependent", false);
        term186465 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NamespaceContext"));
        setField(term186465, term186465.getClass(), "nodeTest", null);
        setBooleanField(term186465, term186465.getClass(), "setStarted", true);
        setField(term186465, term186465.getClass(), "iterator", null);
        setField(term186465, term186465.getClass(), "currentNodePointer", null);
        setField(term186465, term186465.getClass(), "parentContext", null);
        setField(term186465, term186465.getClass(), "rootContext", null);
        setIntField(term186465, term186465.getClass(), "position", 1);
        setBooleanField(term186465, term186465.getClass(), "startedSetIteration", false);
        setBooleanField(term186465, term186465.getClass(), "done", false);
        setBooleanField(term186465, term186465.getClass(), "hasPerformedIteratorStep", false);
        setField(term186465, term186465.getClass(), "pointerIterator", null);
        term186462 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.compiler.CoreFunction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.EvalContext");
        Object[] args = new Object[1];
        args[0] = term95989;
        Object retValue = callMethod(klass, "computeValue", argTypes, term95883, args);
        assertTrue(recursiveEquals(term95883, term186464));
        assertTrue(recursiveEquals(term95989, term186465));
        assertTrue(recursiveEquals(retValue, term186462));
    }

};


