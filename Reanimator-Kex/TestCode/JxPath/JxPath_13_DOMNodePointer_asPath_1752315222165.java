package org.apache.commons.jxpath.ri.model.dom;

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
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.dom.EqualityUtils.*;

public class DOMNodePointer_asPath_1752315222165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31916;
     Object term32253;

    public DOMNodePointer_asPath_1752315222165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31916 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term31916, term31916.getClass(), "id", "");
        term32253 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term32253, term32253.getClass(), "node", null);
        setField(term32253, term32253.getClass(), "namespaces", null);
        setField(term32253, term32253.getClass(), "defaultNamespace", null);
        setField(term32253, term32253.getClass(), "id", "");
        setIntField(term32253, term32253.getClass(), "index", 0);
        setBooleanField(term32253, term32253.getClass(), "attribute", false);
        setField(term32253, term32253.getClass(), "rootNode", null);
        setField(term32253, term32253.getClass(), "namespaceResolver", null);
        setField(term32253, term32253.getClass(), "parent", null);
        setField(term32253, term32253.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asPath", argTypes, term31916, args);
        assertTrue(recursiveEquals(term31916, term32253));
        assertTrue(recursiveEquals(retValue, "id(\'\')"));
    }

};


