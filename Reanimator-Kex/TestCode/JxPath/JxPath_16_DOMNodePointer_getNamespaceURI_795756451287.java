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

public class DOMNodePointer_getNamespaceURI_795756451287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72270;
     Object term74467;

    public DOMNodePointer_getNamespaceURI_795756451287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72270 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term72360 = newInstance(Class.forName("org.apache.html.dom.HTMLIsIndexElementImpl"));
        setField(term72270, term72270.getClass(), "defaultNamespace", null);
        setField(term72270, term72270.getClass(), "node", term72360);
        term74467 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term74468 = newInstance(Class.forName("org.apache.html.dom.HTMLIsIndexElementImpl"));
        setField(term74468, term74468.getClass(), "name", null);
        setField(term74468, term74468.getClass(), "attributes", null);
        setField(term74468, term74468.getClass(), "ownerDocument", null);
        setField(term74468, term74468.getClass(), "firstChild", null);
        setField(term74468, term74468.getClass(), "fNodeListCache", null);
        setField(term74468, term74468.getClass(), "previousSibling", null);
        setField(term74468, term74468.getClass(), "nextSibling", null);
        setField(term74468, term74468.getClass(), "ownerNode", null);
        setShortField(term74468, term74468.getClass(), "flags", (short) 0);
        setField(term74467, term74467.getClass(), "node", term74468);
        setField(term74467, term74467.getClass(), "namespaces", null);
        setField(term74467, term74467.getClass(), "defaultNamespace", "");
        setField(term74467, term74467.getClass(), "id", null);
        setField(term74467, term74467.getClass(), "localNamespaceResolver", null);
        setIntField(term74467, term74467.getClass(), "index", 0);
        setBooleanField(term74467, term74467.getClass(), "attribute", false);
        setField(term74467, term74467.getClass(), "rootNode", null);
        setField(term74467, term74467.getClass(), "namespaceResolver", null);
        setField(term74467, term74467.getClass(), "parent", null);
        setField(term74467, term74467.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term72270, args);
        assertTrue(recursiveEquals(term72270, term74467));
        assertTrue(recursiveEquals(retValue, null));
    }

};


