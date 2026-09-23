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
import java.util.HashMap;
import java.lang.Object;

public class DOMNodePointer_getNamespaceURI_795756451179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37006;
     Object term37775;

    public DOMNodePointer_getNamespaceURI_795756451179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term37054 = new HashMap();
        term37006 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term37246 = newInstance(Class.forName("org.apache.html.dom.HTMLAnchorElementImpl"));
        setField(term37006, term37006.getClass(), "namespaces", term37054);
        setField(term37006, term37006.getClass(), "node", term37246);
        HashMap term37777 = new HashMap();
        term37775 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term37776 = newInstance(Class.forName("org.apache.html.dom.HTMLAnchorElementImpl"));
        setField(term37776, term37776.getClass(), "name", null);
        setField(term37776, term37776.getClass(), "attributes", null);
        setField(term37776, term37776.getClass(), "ownerDocument", null);
        setField(term37776, term37776.getClass(), "firstChild", null);
        setField(term37776, term37776.getClass(), "fNodeListCache", null);
        setField(term37776, term37776.getClass(), "previousSibling", null);
        setField(term37776, term37776.getClass(), "nextSibling", null);
        setField(term37776, term37776.getClass(), "ownerNode", null);
        setShortField(term37776, term37776.getClass(), "flags", (short) 0);
        setField(term37775, term37775.getClass(), "node", term37776);
        setField(term37775, term37775.getClass(), "namespaces", term37777);
        setField(term37775, term37775.getClass(), "defaultNamespace", null);
        setField(term37775, term37775.getClass(), "id", null);
        setIntField(term37775, term37775.getClass(), "index", 0);
        setBooleanField(term37775, term37775.getClass(), "attribute", false);
        setField(term37775, term37775.getClass(), "rootNode", null);
        setField(term37775, term37775.getClass(), "namespaceResolver", null);
        setField(term37775, term37775.getClass(), "parent", null);
        setField(term37775, term37775.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "::::::::::::::::::::::::::::::::\u0004:::::::::";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term37006, args);
        assertTrue(recursiveEquals(term37006, term37775));
        assertTrue(recursiveEquals(retValue, null));
    }

};


