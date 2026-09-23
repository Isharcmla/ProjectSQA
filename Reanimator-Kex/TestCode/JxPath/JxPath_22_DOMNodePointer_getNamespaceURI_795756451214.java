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

public class DOMNodePointer_getNamespaceURI_795756451214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50203;
     Object term50527;

    public DOMNodePointer_getNamespaceURI_795756451214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50203 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term50291 = newInstance(Class.forName("org.apache.html.dom.HTMLSelectElementImpl"));
        setField(term50203, term50203.getClass(), "defaultNamespace", null);
        setField(term50203, term50203.getClass(), "node", term50291);
        term50527 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term50528 = newInstance(Class.forName("org.apache.html.dom.HTMLSelectElementImpl"));
        setField(term50528, term50528.getClass(), "_options", null);
        setField(term50528, term50528.getClass(), "name", null);
        setField(term50528, term50528.getClass(), "attributes", null);
        setField(term50528, term50528.getClass(), "ownerDocument", null);
        setField(term50528, term50528.getClass(), "firstChild", null);
        setField(term50528, term50528.getClass(), "fNodeListCache", null);
        setField(term50528, term50528.getClass(), "previousSibling", null);
        setField(term50528, term50528.getClass(), "nextSibling", null);
        setField(term50528, term50528.getClass(), "ownerNode", null);
        setShortField(term50528, term50528.getClass(), "flags", (short) 0);
        setField(term50527, term50527.getClass(), "node", term50528);
        setField(term50527, term50527.getClass(), "namespaces", null);
        setField(term50527, term50527.getClass(), "defaultNamespace", "");
        setField(term50527, term50527.getClass(), "id", null);
        setField(term50527, term50527.getClass(), "localNamespaceResolver", null);
        setIntField(term50527, term50527.getClass(), "index", 0);
        setBooleanField(term50527, term50527.getClass(), "attribute", false);
        setField(term50527, term50527.getClass(), "namespaceResolver", null);
        setField(term50527, term50527.getClass(), "exceptionHandler", null);
        setField(term50527, term50527.getClass(), "rootNode", null);
        setField(term50527, term50527.getClass(), "parent", null);
        setField(term50527, term50527.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term50203, args);
        assertTrue(recursiveEquals(term50203, term50527));
        assertTrue(recursiveEquals(retValue, null));
    }

};


