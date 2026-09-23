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

public class DOMNodePointer_getNamespaceURI_795756451197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39962;
     Object term40408;

    public DOMNodePointer_getNamespaceURI_795756451197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39962 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term40036 = newInstance(Class.forName("org.apache.wml.dom.WMLPElementImpl"));
        setField(term39962, term39962.getClass(), "defaultNamespace", null);
        setField(term39962, term39962.getClass(), "node", term40036);
        term40408 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term40409 = newInstance(Class.forName("org.apache.wml.dom.WMLPElementImpl"));
        setField(term40409, term40409.getClass(), "name", null);
        setField(term40409, term40409.getClass(), "attributes", null);
        setField(term40409, term40409.getClass(), "ownerDocument", null);
        setField(term40409, term40409.getClass(), "firstChild", null);
        setField(term40409, term40409.getClass(), "fNodeListCache", null);
        setField(term40409, term40409.getClass(), "previousSibling", null);
        setField(term40409, term40409.getClass(), "nextSibling", null);
        setField(term40409, term40409.getClass(), "ownerNode", null);
        setShortField(term40409, term40409.getClass(), "flags", (short) 0);
        setField(term40408, term40408.getClass(), "node", term40409);
        setField(term40408, term40408.getClass(), "namespaces", null);
        setField(term40408, term40408.getClass(), "defaultNamespace", "");
        setField(term40408, term40408.getClass(), "id", null);
        setField(term40408, term40408.getClass(), "localNamespaceResolver", null);
        setIntField(term40408, term40408.getClass(), "index", 0);
        setBooleanField(term40408, term40408.getClass(), "attribute", false);
        setField(term40408, term40408.getClass(), "namespaceResolver", null);
        setField(term40408, term40408.getClass(), "rootNode", null);
        setField(term40408, term40408.getClass(), "parent", null);
        setField(term40408, term40408.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term39962, args);
        assertTrue(recursiveEquals(term39962, term40408));
        assertTrue(recursiveEquals(retValue, null));
    }

};


