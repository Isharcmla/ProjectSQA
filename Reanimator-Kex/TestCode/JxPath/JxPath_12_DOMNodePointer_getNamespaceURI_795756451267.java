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

public class DOMNodePointer_getNamespaceURI_795756451267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72332;
     Object term72485;

    public DOMNodePointer_getNamespaceURI_795756451267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72332 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term72408 = newInstance(Class.forName("org.apache.wml.dom.WMLBrElementImpl"));
        setField(term72332, term72332.getClass(), "defaultNamespace", null);
        setField(term72332, term72332.getClass(), "node", term72408);
        term72485 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term72486 = newInstance(Class.forName("org.apache.wml.dom.WMLBrElementImpl"));
        setField(term72486, term72486.getClass(), "name", null);
        setField(term72486, term72486.getClass(), "attributes", null);
        setField(term72486, term72486.getClass(), "ownerDocument", null);
        setField(term72486, term72486.getClass(), "firstChild", null);
        setField(term72486, term72486.getClass(), "fNodeListCache", null);
        setField(term72486, term72486.getClass(), "previousSibling", null);
        setField(term72486, term72486.getClass(), "nextSibling", null);
        setField(term72486, term72486.getClass(), "ownerNode", null);
        setShortField(term72486, term72486.getClass(), "flags", (short) 0);
        setField(term72485, term72485.getClass(), "node", term72486);
        setField(term72485, term72485.getClass(), "namespaces", null);
        setField(term72485, term72485.getClass(), "defaultNamespace", "");
        setField(term72485, term72485.getClass(), "id", null);
        setIntField(term72485, term72485.getClass(), "index", 0);
        setBooleanField(term72485, term72485.getClass(), "attribute", false);
        setField(term72485, term72485.getClass(), "rootNode", null);
        setField(term72485, term72485.getClass(), "namespaceResolver", null);
        setField(term72485, term72485.getClass(), "parent", null);
        setField(term72485, term72485.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term72332, args);
        assertTrue(recursiveEquals(term72332, term72485));
        assertTrue(recursiveEquals(retValue, null));
    }

};


