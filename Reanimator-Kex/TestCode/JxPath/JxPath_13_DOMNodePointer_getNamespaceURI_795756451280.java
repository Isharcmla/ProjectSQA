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

public class DOMNodePointer_getNamespaceURI_795756451280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80725;
     Object term82196;

    public DOMNodePointer_getNamespaceURI_795756451280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80725 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term80801 = newInstance(Class.forName("org.apache.wml.dom.WMLEmElementImpl"));
        setField(term80725, term80725.getClass(), "defaultNamespace", null);
        setField(term80725, term80725.getClass(), "node", term80801);
        term82196 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term82197 = newInstance(Class.forName("org.apache.wml.dom.WMLEmElementImpl"));
        setField(term82197, term82197.getClass(), "name", null);
        setField(term82197, term82197.getClass(), "attributes", null);
        setField(term82197, term82197.getClass(), "ownerDocument", null);
        setField(term82197, term82197.getClass(), "firstChild", null);
        setField(term82197, term82197.getClass(), "fNodeListCache", null);
        setField(term82197, term82197.getClass(), "previousSibling", null);
        setField(term82197, term82197.getClass(), "nextSibling", null);
        setField(term82197, term82197.getClass(), "ownerNode", null);
        setShortField(term82197, term82197.getClass(), "flags", (short) 0);
        setField(term82196, term82196.getClass(), "node", term82197);
        setField(term82196, term82196.getClass(), "namespaces", null);
        setField(term82196, term82196.getClass(), "defaultNamespace", "");
        setField(term82196, term82196.getClass(), "id", null);
        setIntField(term82196, term82196.getClass(), "index", 0);
        setBooleanField(term82196, term82196.getClass(), "attribute", false);
        setField(term82196, term82196.getClass(), "rootNode", null);
        setField(term82196, term82196.getClass(), "namespaceResolver", null);
        setField(term82196, term82196.getClass(), "parent", null);
        setField(term82196, term82196.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term80725, args);
        assertTrue(recursiveEquals(term80725, term82196));
        assertTrue(recursiveEquals(retValue, null));
    }

};


