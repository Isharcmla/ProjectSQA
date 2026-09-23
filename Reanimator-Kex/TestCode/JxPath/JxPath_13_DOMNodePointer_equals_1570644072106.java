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

public class DOMNodePointer_equals_1570644072106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15155;
     Object term15267;
     Object term16871;
     Object term16872;

    public DOMNodePointer_equals_1570644072106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15155 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term15267 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term16871 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term16871, term16871.getClass(), "node", null);
        setField(term16871, term16871.getClass(), "namespaces", null);
        setField(term16871, term16871.getClass(), "defaultNamespace", null);
        setField(term16871, term16871.getClass(), "id", null);
        setIntField(term16871, term16871.getClass(), "index", 0);
        setBooleanField(term16871, term16871.getClass(), "attribute", false);
        setField(term16871, term16871.getClass(), "rootNode", null);
        setField(term16871, term16871.getClass(), "namespaceResolver", null);
        setField(term16871, term16871.getClass(), "parent", null);
        setField(term16871, term16871.getClass(), "locale", null);
        term16872 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term16872, term16872.getClass(), "node", null);
        setField(term16872, term16872.getClass(), "namespaces", null);
        setField(term16872, term16872.getClass(), "defaultNamespace", null);
        setField(term16872, term16872.getClass(), "id", null);
        setIntField(term16872, term16872.getClass(), "index", 0);
        setBooleanField(term16872, term16872.getClass(), "attribute", false);
        setField(term16872, term16872.getClass(), "rootNode", null);
        setField(term16872, term16872.getClass(), "namespaceResolver", null);
        setField(term16872, term16872.getClass(), "parent", null);
        setField(term16872, term16872.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term15267;
        Object retValue = callMethod(klass, "equals", argTypes, term15155, args);
        assertTrue(recursiveEquals(term15155, term16871));
        assertTrue(recursiveEquals(term15267, term16872));
        assertTrue(recursiveEquals(retValue, true));
    }

};


