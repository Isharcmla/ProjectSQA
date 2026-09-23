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
import java.lang.Object;

public class UnionContext_getDocumentOrder_100057157321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2851;
     Object term3257;

    public UnionContext_getDocumentOrder_100057157321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2851 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term2737 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term2949 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.ChildContext"));
        setField(term2851, term2851.getClass(), "contexts", term2737);
        setField(term2851, term2851.getClass(), "parentContext", term2949);
        term3257 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term3258 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term3259 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.ChildContext"));
        setField(term3257, term3257.getClass(), "contexts", term3258);
        setBooleanField(term3257, term3257.getClass(), "prepared", false);
        setBooleanField(term3257, term3257.getClass(), "startedSet", false);
        setField(term3257, term3257.getClass(), "nodeSet", null);
        setField(term3259, term3259.getClass(), "nodeTest", null);
        setBooleanField(term3259, term3259.getClass(), "startFromParentLocation", false);
        setBooleanField(term3259, term3259.getClass(), "reverse", false);
        setField(term3259, term3259.getClass(), "iterator", null);
        setField(term3259, term3259.getClass(), "parentContext", null);
        setField(term3259, term3259.getClass(), "rootContext", null);
        setIntField(term3259, term3259.getClass(), "position", 0);
        setBooleanField(term3259, term3259.getClass(), "startedSetIteration", false);
        setBooleanField(term3259, term3259.getClass(), "done", false);
        setBooleanField(term3259, term3259.getClass(), "hasPerformedIteratorStep", false);
        setField(term3259, term3259.getClass(), "pointerIterator", null);
        setField(term3257, term3257.getClass(), "parentContext", term3259);
        setField(term3257, term3257.getClass(), "rootContext", null);
        setIntField(term3257, term3257.getClass(), "position", 0);
        setBooleanField(term3257, term3257.getClass(), "startedSetIteration", false);
        setBooleanField(term3257, term3257.getClass(), "done", false);
        setBooleanField(term3257, term3257.getClass(), "hasPerformedIteratorStep", false);
        setField(term3257, term3257.getClass(), "pointerIterator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDocumentOrder", argTypes, term2851, args);
        assertTrue(recursiveEquals(term2851, term3257));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


