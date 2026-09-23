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

public class DOMNodePointer_getNamespaceURI_948009574369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131453;
     Object term131638;

    public DOMNodePointer_getNamespaceURI_948009574369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131453 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term131543 = newInstance(Class.forName("org.apache.wml.dom.WMLPostfieldElementImpl"));
        setShortField(term131543, term131543.getClass(), "flags", (short) 0);
        setField(term131543, term131543.getClass(), "name", "");
        setField(term131453, term131453.getClass(), "node", term131543);
        term131638 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term131639 = newInstance(Class.forName("org.apache.wml.dom.WMLPostfieldElementImpl"));
        setField(term131639, term131639.getClass(), "name", "");
        setField(term131639, term131639.getClass(), "attributes", null);
        setField(term131639, term131639.getClass(), "ownerDocument", null);
        setField(term131639, term131639.getClass(), "firstChild", null);
        setField(term131639, term131639.getClass(), "fNodeListCache", null);
        setField(term131639, term131639.getClass(), "previousSibling", null);
        setField(term131639, term131639.getClass(), "nextSibling", null);
        setField(term131639, term131639.getClass(), "ownerNode", null);
        setShortField(term131639, term131639.getClass(), "flags", (short) 0);
        setField(term131638, term131638.getClass(), "node", term131639);
        setField(term131638, term131638.getClass(), "namespaces", null);
        setField(term131638, term131638.getClass(), "defaultNamespace", null);
        setField(term131638, term131638.getClass(), "id", null);
        setIntField(term131638, term131638.getClass(), "index", 0);
        setBooleanField(term131638, term131638.getClass(), "attribute", false);
        setField(term131638, term131638.getClass(), "rootNode", null);
        setField(term131638, term131638.getClass(), "namespaceResolver", null);
        setField(term131638, term131638.getClass(), "parent", null);
        setField(term131638, term131638.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term131453, args);
        assertTrue(recursiveEquals(term131453, term131638));
        assertTrue(recursiveEquals(retValue, null));
    }

};


