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

public class DOMNodePointer_getNamespaceURI_948009574225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49846;
     Object term50350;

    public DOMNodePointer_getNamespaceURI_948009574225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49846 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term49936 = newInstance(Class.forName("org.apache.html.dom.HTMLIsIndexElementImpl"));
        setShortField(term49936, term49936.getClass(), "flags", (short) 0);
        setField(term49936, term49936.getClass(), "name", "");
        setField(term49846, term49846.getClass(), "node", term49936);
        term50350 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term50351 = newInstance(Class.forName("org.apache.html.dom.HTMLIsIndexElementImpl"));
        setField(term50351, term50351.getClass(), "name", "");
        setField(term50351, term50351.getClass(), "attributes", null);
        setField(term50351, term50351.getClass(), "ownerDocument", null);
        setField(term50351, term50351.getClass(), "firstChild", null);
        setField(term50351, term50351.getClass(), "fNodeListCache", null);
        setField(term50351, term50351.getClass(), "previousSibling", null);
        setField(term50351, term50351.getClass(), "nextSibling", null);
        setField(term50351, term50351.getClass(), "ownerNode", null);
        setShortField(term50351, term50351.getClass(), "flags", (short) 0);
        setField(term50350, term50350.getClass(), "node", term50351);
        setField(term50350, term50350.getClass(), "namespaces", null);
        setField(term50350, term50350.getClass(), "defaultNamespace", null);
        setField(term50350, term50350.getClass(), "id", null);
        setField(term50350, term50350.getClass(), "localNamespaceResolver", null);
        setIntField(term50350, term50350.getClass(), "index", 0);
        setBooleanField(term50350, term50350.getClass(), "attribute", false);
        setField(term50350, term50350.getClass(), "namespaceResolver", null);
        setField(term50350, term50350.getClass(), "rootNode", null);
        setField(term50350, term50350.getClass(), "parent", null);
        setField(term50350, term50350.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term49846, args);
        assertTrue(recursiveEquals(term49846, term50350));
        assertTrue(recursiveEquals(retValue, null));
    }

};


