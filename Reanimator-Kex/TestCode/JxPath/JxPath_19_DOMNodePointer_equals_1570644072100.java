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

public class DOMNodePointer_equals_1570644072100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16489;
     Object term17188;
     Object term17189;

    public DOMNodePointer_equals_1570644072100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16489 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term17188 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term17188, term17188.getClass(), "node", null);
        setField(term17188, term17188.getClass(), "namespaces", null);
        setField(term17188, term17188.getClass(), "defaultNamespace", null);
        setField(term17188, term17188.getClass(), "id", null);
        setField(term17188, term17188.getClass(), "localNamespaceResolver", null);
        setIntField(term17188, term17188.getClass(), "index", 0);
        setBooleanField(term17188, term17188.getClass(), "attribute", false);
        setField(term17188, term17188.getClass(), "namespaceResolver", null);
        setField(term17188, term17188.getClass(), "rootNode", null);
        setField(term17188, term17188.getClass(), "parent", null);
        setField(term17188, term17188.getClass(), "locale", null);
        term17189 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term17189, term17189.getClass(), "node", null);
        setField(term17189, term17189.getClass(), "namespaces", null);
        setField(term17189, term17189.getClass(), "defaultNamespace", null);
        setField(term17189, term17189.getClass(), "id", null);
        setField(term17189, term17189.getClass(), "localNamespaceResolver", null);
        setIntField(term17189, term17189.getClass(), "index", 0);
        setBooleanField(term17189, term17189.getClass(), "attribute", false);
        setField(term17189, term17189.getClass(), "namespaceResolver", null);
        setField(term17189, term17189.getClass(), "rootNode", null);
        setField(term17189, term17189.getClass(), "parent", null);
        setField(term17189, term17189.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term16489;
        Object retValue = callMethod(klass, "equals", argTypes, term16489, args);
        assertTrue(recursiveEquals(term16489, term17188));
        assertTrue(recursiveEquals(term16489, term17189));
        assertTrue(recursiveEquals(retValue, true));
    }

};


