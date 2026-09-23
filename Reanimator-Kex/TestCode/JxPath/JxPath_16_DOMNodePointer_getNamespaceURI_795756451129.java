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

public class DOMNodePointer_getNamespaceURI_795756451129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22479;
     Object term22982;

    public DOMNodePointer_getNamespaceURI_795756451129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term22527 = new HashMap();
        term22479 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term22717 = newInstance(Class.forName("org.apache.html.dom.HTMLParamElementImpl"));
        setField(term22479, term22479.getClass(), "namespaces", term22527);
        setField(term22479, term22479.getClass(), "node", term22717);
        HashMap term22984 = new HashMap();
        term22982 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term22983 = newInstance(Class.forName("org.apache.html.dom.HTMLParamElementImpl"));
        setField(term22983, term22983.getClass(), "name", null);
        setField(term22983, term22983.getClass(), "attributes", null);
        setField(term22983, term22983.getClass(), "ownerDocument", null);
        setField(term22983, term22983.getClass(), "firstChild", null);
        setField(term22983, term22983.getClass(), "fNodeListCache", null);
        setField(term22983, term22983.getClass(), "previousSibling", null);
        setField(term22983, term22983.getClass(), "nextSibling", null);
        setField(term22983, term22983.getClass(), "ownerNode", null);
        setShortField(term22983, term22983.getClass(), "flags", (short) 0);
        setField(term22982, term22982.getClass(), "node", term22983);
        setField(term22982, term22982.getClass(), "namespaces", term22984);
        setField(term22982, term22982.getClass(), "defaultNamespace", null);
        setField(term22982, term22982.getClass(), "id", null);
        setField(term22982, term22982.getClass(), "localNamespaceResolver", null);
        setIntField(term22982, term22982.getClass(), "index", 0);
        setBooleanField(term22982, term22982.getClass(), "attribute", false);
        setField(term22982, term22982.getClass(), "rootNode", null);
        setField(term22982, term22982.getClass(), "namespaceResolver", null);
        setField(term22982, term22982.getClass(), "parent", null);
        setField(term22982, term22982.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "::::::::::::::::::::::::::::::::\u0004:::::::::";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term22479, args);
        assertTrue(recursiveEquals(term22479, term22982));
        assertTrue(recursiveEquals(retValue, null));
    }

};


