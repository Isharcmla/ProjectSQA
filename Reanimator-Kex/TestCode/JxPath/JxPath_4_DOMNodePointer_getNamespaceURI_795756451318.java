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

public class DOMNodePointer_getNamespaceURI_795756451318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97298;
     Object term99043;

    public DOMNodePointer_getNamespaceURI_795756451318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97298 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term97386 = newInstance(Class.forName("org.apache.html.dom.HTMLLegendElementImpl"));
        setField(term97298, term97298.getClass(), "defaultNamespace", null);
        setField(term97298, term97298.getClass(), "node", term97386);
        term99043 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term99044 = newInstance(Class.forName("org.apache.html.dom.HTMLLegendElementImpl"));
        setField(term99044, term99044.getClass(), "name", null);
        setField(term99044, term99044.getClass(), "attributes", null);
        setField(term99044, term99044.getClass(), "ownerDocument", null);
        setField(term99044, term99044.getClass(), "firstChild", null);
        setField(term99044, term99044.getClass(), "fNodeListCache", null);
        setField(term99044, term99044.getClass(), "previousSibling", null);
        setField(term99044, term99044.getClass(), "nextSibling", null);
        setField(term99044, term99044.getClass(), "ownerNode", null);
        setShortField(term99044, term99044.getClass(), "flags", (short) 0);
        setField(term99043, term99043.getClass(), "node", term99044);
        setField(term99043, term99043.getClass(), "namespaces", null);
        setField(term99043, term99043.getClass(), "defaultNamespace", "");
        setField(term99043, term99043.getClass(), "id", null);
        setIntField(term99043, term99043.getClass(), "index", 0);
        setBooleanField(term99043, term99043.getClass(), "attribute", false);
        setField(term99043, term99043.getClass(), "rootNode", null);
        setField(term99043, term99043.getClass(), "namespaceResolver", null);
        setField(term99043, term99043.getClass(), "parent", null);
        setField(term99043, term99043.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term97298, args);
        assertTrue(recursiveEquals(term97298, term99043));
        assertTrue(recursiveEquals(retValue, null));
    }

};


