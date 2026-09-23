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

public class UnionContext_getDocumentOrder_10005715739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term899;
     Object term912;

    public UnionContext_getDocumentOrder_10005715739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term899 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term790 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        setField(term899, term899.getClass(), "contexts", term790);
        term912 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term913 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        setField(term912, term912.getClass(), "contexts", term913);
        setBooleanField(term912, term912.getClass(), "prepared", false);
        setBooleanField(term912, term912.getClass(), "startedSet", false);
        setField(term912, term912.getClass(), "nodeSet", null);
        setField(term912, term912.getClass(), "parentContext", null);
        setField(term912, term912.getClass(), "rootContext", null);
        setIntField(term912, term912.getClass(), "position", 0);
        setBooleanField(term912, term912.getClass(), "startedSetIteration", false);
        setBooleanField(term912, term912.getClass(), "done", false);
        setBooleanField(term912, term912.getClass(), "hasPerformedIteratorStep", false);
        setField(term912, term912.getClass(), "pointerIterator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDocumentOrder", argTypes, term899, args);
        assertTrue(recursiveEquals(term899, term912));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


