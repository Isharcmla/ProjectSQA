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

public class DOMNodePointer_hashCode_1121957397111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17319;
     Object term18639;

    public DOMNodePointer_hashCode_1121957397111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17319 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term17393 = newInstance(Class.forName("org.apache.wml.dom.WMLAElementImpl"));
        setField(term17319, term17319.getClass(), "node", term17393);
        term18639 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term18640 = newInstance(Class.forName("org.apache.wml.dom.WMLAElementImpl"));
        setField(term18640, term18640.getClass(), "name", null);
        setField(term18640, term18640.getClass(), "attributes", null);
        setField(term18640, term18640.getClass(), "ownerDocument", null);
        setField(term18640, term18640.getClass(), "firstChild", null);
        setField(term18640, term18640.getClass(), "fNodeListCache", null);
        setField(term18640, term18640.getClass(), "previousSibling", null);
        setField(term18640, term18640.getClass(), "nextSibling", null);
        setField(term18640, term18640.getClass(), "ownerNode", null);
        setShortField(term18640, term18640.getClass(), "flags", (short) 0);
        setField(term18639, term18639.getClass(), "node", term18640);
        setField(term18639, term18639.getClass(), "namespaces", null);
        setField(term18639, term18639.getClass(), "defaultNamespace", null);
        setField(term18639, term18639.getClass(), "id", null);
        setField(term18639, term18639.getClass(), "localNamespaceResolver", null);
        setIntField(term18639, term18639.getClass(), "index", 0);
        setBooleanField(term18639, term18639.getClass(), "attribute", false);
        setField(term18639, term18639.getClass(), "namespaceResolver", null);
        setField(term18639, term18639.getClass(), "exceptionHandler", null);
        setField(term18639, term18639.getClass(), "rootNode", null);
        setField(term18639, term18639.getClass(), "parent", null);
        setField(term18639, term18639.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term17319, args);
        assertTrue(recursiveEquals(term17319, term18639));
        assertTrue(recursiveEquals(retValue, 1709850823));
    }

};


