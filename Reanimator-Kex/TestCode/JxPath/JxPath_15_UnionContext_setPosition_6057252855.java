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
import java.lang.NullPointerException;
import static org.apache.commons.jxpath.ri.axes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Integer;

public class UnionContext_setPosition_6057252855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33;
     Object term64;

    public UnionContext_setPosition_6057252855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term42 = new HashMap();
        HashMap term47 = new HashMap();
        term33 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term34 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 3);
        Object term37 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.RootContext"));
        Object term38 = newInstance(Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object term39 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term40 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term33, term33.getClass(), "contexts", term34);
        setBooleanField(term33, term33.getClass(), "prepared", true);
        setBooleanField(term33, term33.getClass(), "startedSet", true);
        setField(term33, term33.getClass(), "nodeSet", null);
        setField(term33, term33.getClass(), "parentContext", null);
        setField(term38, term38.getClass(), "rootPointer", null);
        setField(term38, term38.getClass(), "contextPointer", null);
        setField(term40, term40.getClass(), "parent", null);
        setField(term40, term40.getClass(), "namespaceMap", null);
        setField(term40, term40.getClass(), "reverseMap", null);
        setField(term40, term40.getClass(), "pointer", null);
        setBooleanField(term40, term40.getClass(), "sealed", false);
        setField(term39, term39.getClass(), "parent", term40);
        setField(term39, term39.getClass(), "namespaceMap", term42);
        setField(term39, term39.getClass(), "reverseMap", term47);
        setField(term39, term39.getClass(), "pointer", null);
        setBooleanField(term39, term39.getClass(), "sealed", false);
        setField(term38, term38.getClass(), "namespaceResolver", term39);
        setField(term38, term38.getClass(), "parentContext", null);
        setField(term38, term38.getClass(), "contextBean", null);
        setField(term38, term38.getClass(), "vars", null);
        setField(term38, term38.getClass(), "functions", null);
        setField(term38, term38.getClass(), "factory", null);
        setField(term38, term38.getClass(), "locale", null);
        setBooleanField(term38, term38.getClass(), "lenientSet", false);
        setBooleanField(term38, term38.getClass(), "lenient", false);
        setField(term38, term38.getClass(), "idManager", null);
        setField(term38, term38.getClass(), "keyManager", null);
        setField(term38, term38.getClass(), "decimalFormats", null);
        setField(term37, term37.getClass(), "jxpathContext", term38);
        setField(term37, term37.getClass(), "pointer", null);
        setField(term37, term37.getClass(), "registers", null);
        setIntField(term37, term37.getClass(), "availableRegister", 0);
        setField(term37, term37.getClass(), "parentContext", null);
        setField(term37, term37.getClass(), "rootContext", null);
        setIntField(term37, term37.getClass(), "position", 0);
        setBooleanField(term37, term37.getClass(), "startedSetIteration", false);
        setBooleanField(term37, term37.getClass(), "done", false);
        setBooleanField(term37, term37.getClass(), "hasPerformedIteratorStep", false);
        setField(term37, term37.getClass(), "pointerIterator", null);
        setField(term33, term33.getClass(), "rootContext", term37);
        setIntField(term33, term33.getClass(), "position", 1484323161);
        setBooleanField(term33, term33.getClass(), "startedSetIteration", true);
        setBooleanField(term33, term33.getClass(), "done", false);
        setBooleanField(term33, term33.getClass(), "hasPerformedIteratorStep", true);
        setField(term33, term33.getClass(), "pointerIterator", null);
        term64 = new Integer(391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term64;
        try {
            callMethod(klass, "setPosition", argTypes, term33, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


