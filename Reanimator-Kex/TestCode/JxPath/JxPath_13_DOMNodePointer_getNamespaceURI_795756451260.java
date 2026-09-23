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

public class DOMNodePointer_getNamespaceURI_795756451260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71213;
     Object term73545;

    public DOMNodePointer_getNamespaceURI_795756451260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71213 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term71291 = newInstance(Class.forName("org.apache.wml.dom.WMLImgElementImpl"));
        setField(term71213, term71213.getClass(), "defaultNamespace", null);
        setField(term71213, term71213.getClass(), "node", term71291);
        term73545 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term73546 = newInstance(Class.forName("org.apache.wml.dom.WMLImgElementImpl"));
        setField(term73546, term73546.getClass(), "name", null);
        setField(term73546, term73546.getClass(), "attributes", null);
        setField(term73546, term73546.getClass(), "ownerDocument", null);
        setField(term73546, term73546.getClass(), "firstChild", null);
        setField(term73546, term73546.getClass(), "fNodeListCache", null);
        setField(term73546, term73546.getClass(), "previousSibling", null);
        setField(term73546, term73546.getClass(), "nextSibling", null);
        setField(term73546, term73546.getClass(), "ownerNode", null);
        setShortField(term73546, term73546.getClass(), "flags", (short) 0);
        setField(term73545, term73545.getClass(), "node", term73546);
        setField(term73545, term73545.getClass(), "namespaces", null);
        setField(term73545, term73545.getClass(), "defaultNamespace", "");
        setField(term73545, term73545.getClass(), "id", null);
        setIntField(term73545, term73545.getClass(), "index", 0);
        setBooleanField(term73545, term73545.getClass(), "attribute", false);
        setField(term73545, term73545.getClass(), "rootNode", null);
        setField(term73545, term73545.getClass(), "namespaceResolver", null);
        setField(term73545, term73545.getClass(), "parent", null);
        setField(term73545, term73545.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term71213, args);
        assertTrue(recursiveEquals(term71213, term73545));
        assertTrue(recursiveEquals(retValue, null));
    }

};


