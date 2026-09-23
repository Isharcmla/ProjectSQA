package org.apache.commons.jxpath.ri.axes;

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
import static org.apache.commons.jxpath.ri.axes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.axes.EqualityUtils.*;

public class AttributeContext_nextNode_146958366420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2004;
     Object term2495;

    public AttributeContext_nextNode_146958366420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2004 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setIntField(term2004, term2004.getClass(), "position", 0);
        setBooleanField(term2004, term2004.getClass(), "setStarted", true);
        term2495 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(term2495, term2495.getClass(), "nodeTest", null);
        setBooleanField(term2495, term2495.getClass(), "setStarted", true);
        setField(term2495, term2495.getClass(), "iterator", null);
        setField(term2495, term2495.getClass(), "currentNodePointer", null);
        setField(term2495, term2495.getClass(), "parentContext", null);
        setField(term2495, term2495.getClass(), "rootContext", null);
        setIntField(term2495, term2495.getClass(), "position", 1);
        setBooleanField(term2495, term2495.getClass(), "startedSetIteration", false);
        setBooleanField(term2495, term2495.getClass(), "done", false);
        setBooleanField(term2495, term2495.getClass(), "hasPerformedIteratorStep", false);
        setField(term2495, term2495.getClass(), "pointerIterator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "nextNode", argTypes, term2004, args);
        assertTrue(recursiveEquals(term2004, term2495));
        assertTrue(recursiveEquals(retValue, false));
    }

};


