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

public class DOMNodePointer_getNamespaceURI_795756451284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79460;
     Object term80934;

    public DOMNodePointer_getNamespaceURI_795756451284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79460 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term79552 = newInstance(Class.forName("org.apache.xerces.dom.DeferredElementNSImpl"));
        setField(term79460, term79460.getClass(), "defaultNamespace", null);
        setField(term79460, term79460.getClass(), "node", term79552);
        term80934 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term80935 = newInstance(Class.forName("org.apache.xerces.dom.DeferredElementNSImpl"));
        setIntField(term80935, term80935.getClass(), "fNodeIndex", 0);
        setField(term80935, term80935.getClass(), "namespaceURI", null);
        setField(term80935, term80935.getClass(), "localName", null);
        setField(term80935, term80935.getClass(), "type", null);
        setField(term80935, term80935.getClass(), "name", null);
        setField(term80935, term80935.getClass(), "attributes", null);
        setField(term80935, term80935.getClass(), "ownerDocument", null);
        setField(term80935, term80935.getClass(), "firstChild", null);
        setField(term80935, term80935.getClass(), "fNodeListCache", null);
        setField(term80935, term80935.getClass(), "previousSibling", null);
        setField(term80935, term80935.getClass(), "nextSibling", null);
        setField(term80935, term80935.getClass(), "ownerNode", null);
        setShortField(term80935, term80935.getClass(), "flags", (short) 0);
        setField(term80934, term80934.getClass(), "node", term80935);
        setField(term80934, term80934.getClass(), "namespaces", null);
        setField(term80934, term80934.getClass(), "defaultNamespace", "");
        setField(term80934, term80934.getClass(), "id", null);
        setIntField(term80934, term80934.getClass(), "index", 0);
        setBooleanField(term80934, term80934.getClass(), "attribute", false);
        setField(term80934, term80934.getClass(), "rootNode", null);
        setField(term80934, term80934.getClass(), "namespaceResolver", null);
        setField(term80934, term80934.getClass(), "parent", null);
        setField(term80934, term80934.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term79460, args);
        assertTrue(recursiveEquals(term79460, term80934));
        assertTrue(recursiveEquals(retValue, null));
    }

};


