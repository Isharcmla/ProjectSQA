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

public class DOMNodePointer_getLanguage_163796968398 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15453;
     Object term16928;

    public DOMNodePointer_getLanguage_163796968398() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15453 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term15545 = newInstance(Class.forName("org.apache.xerces.impl.xs.dom.ElementNSImpl"));
        setField(term15453, term15453.getClass(), "node", term15545);
        term16928 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term16929 = newInstance(Class.forName("org.apache.xerces.impl.xs.dom.ElementNSImpl"));
        setIntField(term16929, term16929.getClass(), "lineNum", 0);
        setIntField(term16929, term16929.getClass(), "columnNum", 0);
        setField(term16929, term16929.getClass(), "namespaceURI", null);
        setField(term16929, term16929.getClass(), "localName", null);
        setField(term16929, term16929.getClass(), "type", null);
        setField(term16929, term16929.getClass(), "name", null);
        setField(term16929, term16929.getClass(), "attributes", null);
        setField(term16929, term16929.getClass(), "ownerDocument", null);
        setField(term16929, term16929.getClass(), "firstChild", null);
        setField(term16929, term16929.getClass(), "fNodeListCache", null);
        setField(term16929, term16929.getClass(), "previousSibling", null);
        setField(term16929, term16929.getClass(), "nextSibling", null);
        setField(term16929, term16929.getClass(), "ownerNode", null);
        setShortField(term16929, term16929.getClass(), "flags", (short) 0);
        setField(term16928, term16928.getClass(), "node", term16929);
        setField(term16928, term16928.getClass(), "namespaces", null);
        setField(term16928, term16928.getClass(), "defaultNamespace", null);
        setField(term16928, term16928.getClass(), "id", null);
        setField(term16928, term16928.getClass(), "localNamespaceResolver", null);
        setIntField(term16928, term16928.getClass(), "index", 0);
        setBooleanField(term16928, term16928.getClass(), "attribute", false);
        setField(term16928, term16928.getClass(), "namespaceResolver", null);
        setField(term16928, term16928.getClass(), "rootNode", null);
        setField(term16928, term16928.getClass(), "parent", null);
        setField(term16928, term16928.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLanguage", argTypes, term15453, args);
        assertTrue(recursiveEquals(term15453, term16928));
        assertTrue(recursiveEquals(retValue, null));
    }

};


