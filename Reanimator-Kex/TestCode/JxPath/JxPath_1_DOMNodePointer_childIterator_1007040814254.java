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
import java.lang.Object;

public class DOMNodePointer_childIterator_1007040814254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69818;
     Object term71877;
     Object term71873;

    public DOMNodePointer_childIterator_1007040814254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69818 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term69818, term69818.getClass(), "node", null);
        term71877 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term71877, term71877.getClass(), "node", null);
        setField(term71877, term71877.getClass(), "namespaces", null);
        setField(term71877, term71877.getClass(), "defaultNamespace", null);
        setField(term71877, term71877.getClass(), "id", null);
        setIntField(term71877, term71877.getClass(), "index", 0);
        setBooleanField(term71877, term71877.getClass(), "attribute", false);
        setField(term71877, term71877.getClass(), "rootNode", null);
        setField(term71877, term71877.getClass(), "namespaceResolver", null);
        setField(term71877, term71877.getClass(), "parent", null);
        setField(term71877, term71877.getClass(), "locale", null);
        term71873 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator"));
        Object term71862 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term71862, term71862.getClass(), "node", null);
        setField(term71862, term71862.getClass(), "namespaces", null);
        setField(term71862, term71862.getClass(), "defaultNamespace", null);
        setField(term71862, term71862.getClass(), "id", null);
        setIntField(term71862, term71862.getClass(), "index", 0);
        setBooleanField(term71862, term71862.getClass(), "attribute", false);
        setField(term71862, term71862.getClass(), "rootNode", null);
        setField(term71862, term71862.getClass(), "namespaceResolver", null);
        setField(term71862, term71862.getClass(), "parent", null);
        setField(term71862, term71862.getClass(), "locale", null);
        setField(term71873, term71873.getClass(), "parent", term71862);
        setField(term71873, term71873.getClass(), "nodeTest", null);
        setField(term71873, term71873.getClass(), "node", null);
        setField(term71873, term71873.getClass(), "child", null);
        setBooleanField(term71873, term71873.getClass(), "reverse", false);
        setIntField(term71873, term71873.getClass(), "position", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = false;
        args[2] = null;
        Object retValue = callMethod(klass, "childIterator", argTypes, term69818, args);
        assertTrue(recursiveEquals(term69818, term71877));
        assertTrue(recursiveEquals(retValue, term71873));
    }

};
