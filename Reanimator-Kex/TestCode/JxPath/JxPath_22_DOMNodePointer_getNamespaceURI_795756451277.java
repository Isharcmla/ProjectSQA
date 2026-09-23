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

public class DOMNodePointer_getNamespaceURI_795756451277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68684;
     Object term68926;

    public DOMNodePointer_getNamespaceURI_795756451277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68684 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term68772 = newInstance(Class.forName("org.apache.html.dom.HTMLAppletElementImpl"));
        setField(term68684, term68684.getClass(), "defaultNamespace", null);
        setField(term68684, term68684.getClass(), "node", term68772);
        term68926 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term68927 = newInstance(Class.forName("org.apache.html.dom.HTMLAppletElementImpl"));
        setField(term68927, term68927.getClass(), "name", null);
        setField(term68927, term68927.getClass(), "attributes", null);
        setField(term68927, term68927.getClass(), "ownerDocument", null);
        setField(term68927, term68927.getClass(), "firstChild", null);
        setField(term68927, term68927.getClass(), "fNodeListCache", null);
        setField(term68927, term68927.getClass(), "previousSibling", null);
        setField(term68927, term68927.getClass(), "nextSibling", null);
        setField(term68927, term68927.getClass(), "ownerNode", null);
        setShortField(term68927, term68927.getClass(), "flags", (short) 0);
        setField(term68926, term68926.getClass(), "node", term68927);
        setField(term68926, term68926.getClass(), "namespaces", null);
        setField(term68926, term68926.getClass(), "defaultNamespace", "");
        setField(term68926, term68926.getClass(), "id", null);
        setField(term68926, term68926.getClass(), "localNamespaceResolver", null);
        setIntField(term68926, term68926.getClass(), "index", 0);
        setBooleanField(term68926, term68926.getClass(), "attribute", false);
        setField(term68926, term68926.getClass(), "namespaceResolver", null);
        setField(term68926, term68926.getClass(), "exceptionHandler", null);
        setField(term68926, term68926.getClass(), "rootNode", null);
        setField(term68926, term68926.getClass(), "parent", null);
        setField(term68926, term68926.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term68684, args);
        assertTrue(recursiveEquals(term68684, term68926));
        assertTrue(recursiveEquals(retValue, null));
    }

};


