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

public class DOMNodePointer_getNamespaceURI_795756451265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71382;
     Object term72172;

    public DOMNodePointer_getNamespaceURI_795756451265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71382 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term71466 = newInstance(Class.forName("org.apache.wml.dom.WMLStrongElementImpl"));
        setField(term71382, term71382.getClass(), "defaultNamespace", null);
        setField(term71382, term71382.getClass(), "node", term71466);
        term72172 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term72173 = newInstance(Class.forName("org.apache.wml.dom.WMLStrongElementImpl"));
        setField(term72173, term72173.getClass(), "name", null);
        setField(term72173, term72173.getClass(), "attributes", null);
        setField(term72173, term72173.getClass(), "ownerDocument", null);
        setField(term72173, term72173.getClass(), "firstChild", null);
        setField(term72173, term72173.getClass(), "fNodeListCache", null);
        setField(term72173, term72173.getClass(), "previousSibling", null);
        setField(term72173, term72173.getClass(), "nextSibling", null);
        setField(term72173, term72173.getClass(), "ownerNode", null);
        setShortField(term72173, term72173.getClass(), "flags", (short) 0);
        setField(term72172, term72172.getClass(), "node", term72173);
        setField(term72172, term72172.getClass(), "namespaces", null);
        setField(term72172, term72172.getClass(), "defaultNamespace", "");
        setField(term72172, term72172.getClass(), "id", null);
        setIntField(term72172, term72172.getClass(), "index", 0);
        setBooleanField(term72172, term72172.getClass(), "attribute", false);
        setField(term72172, term72172.getClass(), "rootNode", null);
        setField(term72172, term72172.getClass(), "namespaceResolver", null);
        setField(term72172, term72172.getClass(), "parent", null);
        setField(term72172, term72172.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term71382, args);
        assertTrue(recursiveEquals(term71382, term72172));
        assertTrue(recursiveEquals(retValue, null));
    }

};


