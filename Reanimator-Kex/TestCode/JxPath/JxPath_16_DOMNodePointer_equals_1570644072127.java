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

public class DOMNodePointer_equals_1570644072127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21524;
     Object term21530;
     Object term21531;

    public DOMNodePointer_equals_1570644072127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21524 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term21530 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term21530, term21530.getClass(), "node", null);
        setField(term21530, term21530.getClass(), "namespaces", null);
        setField(term21530, term21530.getClass(), "defaultNamespace", null);
        setField(term21530, term21530.getClass(), "id", null);
        setField(term21530, term21530.getClass(), "localNamespaceResolver", null);
        setIntField(term21530, term21530.getClass(), "index", 0);
        setBooleanField(term21530, term21530.getClass(), "attribute", false);
        setField(term21530, term21530.getClass(), "rootNode", null);
        setField(term21530, term21530.getClass(), "namespaceResolver", null);
        setField(term21530, term21530.getClass(), "parent", null);
        setField(term21530, term21530.getClass(), "locale", null);
        term21531 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term21531, term21531.getClass(), "node", null);
        setField(term21531, term21531.getClass(), "namespaces", null);
        setField(term21531, term21531.getClass(), "defaultNamespace", null);
        setField(term21531, term21531.getClass(), "id", null);
        setField(term21531, term21531.getClass(), "localNamespaceResolver", null);
        setIntField(term21531, term21531.getClass(), "index", 0);
        setBooleanField(term21531, term21531.getClass(), "attribute", false);
        setField(term21531, term21531.getClass(), "rootNode", null);
        setField(term21531, term21531.getClass(), "namespaceResolver", null);
        setField(term21531, term21531.getClass(), "parent", null);
        setField(term21531, term21531.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term21524;
        Object retValue = callMethod(klass, "equals", argTypes, term21524, args);
        assertTrue(recursiveEquals(term21524, term21530));
        assertTrue(recursiveEquals(term21524, term21531));
        assertTrue(recursiveEquals(retValue, true));
    }

};


