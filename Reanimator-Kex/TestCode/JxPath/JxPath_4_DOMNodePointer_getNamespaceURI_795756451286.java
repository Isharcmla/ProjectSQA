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

public class DOMNodePointer_getNamespaceURI_795756451286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86364;
     Object term86841;

    public DOMNodePointer_getNamespaceURI_795756451286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86364 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term86438 = newInstance(Class.forName("org.apache.wml.dom.WMLUElementImpl"));
        setField(term86364, term86364.getClass(), "defaultNamespace", null);
        setField(term86364, term86364.getClass(), "node", term86438);
        term86841 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term86842 = newInstance(Class.forName("org.apache.wml.dom.WMLUElementImpl"));
        setField(term86842, term86842.getClass(), "name", null);
        setField(term86842, term86842.getClass(), "attributes", null);
        setField(term86842, term86842.getClass(), "ownerDocument", null);
        setField(term86842, term86842.getClass(), "firstChild", null);
        setField(term86842, term86842.getClass(), "fNodeListCache", null);
        setField(term86842, term86842.getClass(), "previousSibling", null);
        setField(term86842, term86842.getClass(), "nextSibling", null);
        setField(term86842, term86842.getClass(), "ownerNode", null);
        setShortField(term86842, term86842.getClass(), "flags", (short) 0);
        setField(term86841, term86841.getClass(), "node", term86842);
        setField(term86841, term86841.getClass(), "namespaces", null);
        setField(term86841, term86841.getClass(), "defaultNamespace", "");
        setField(term86841, term86841.getClass(), "id", null);
        setIntField(term86841, term86841.getClass(), "index", 0);
        setBooleanField(term86841, term86841.getClass(), "attribute", false);
        setField(term86841, term86841.getClass(), "rootNode", null);
        setField(term86841, term86841.getClass(), "namespaceResolver", null);
        setField(term86841, term86841.getClass(), "parent", null);
        setField(term86841, term86841.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term86364, args);
        assertTrue(recursiveEquals(term86364, term86841));
        assertTrue(recursiveEquals(retValue, null));
    }

};


