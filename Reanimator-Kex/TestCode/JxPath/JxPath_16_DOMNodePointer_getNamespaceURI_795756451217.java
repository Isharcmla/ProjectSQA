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

public class DOMNodePointer_getNamespaceURI_795756451217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44802;
     Object term47314;

    public DOMNodePointer_getNamespaceURI_795756451217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44802 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term44894 = newInstance(Class.forName("org.apache.html.dom.HTMLTableRowElementImpl"));
        setField(term44802, term44802.getClass(), "defaultNamespace", null);
        setField(term44802, term44802.getClass(), "node", term44894);
        term47314 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term47315 = newInstance(Class.forName("org.apache.html.dom.HTMLTableRowElementImpl"));
        setField(term47315, term47315.getClass(), "_cells", null);
        setField(term47315, term47315.getClass(), "name", null);
        setField(term47315, term47315.getClass(), "attributes", null);
        setField(term47315, term47315.getClass(), "ownerDocument", null);
        setField(term47315, term47315.getClass(), "firstChild", null);
        setField(term47315, term47315.getClass(), "fNodeListCache", null);
        setField(term47315, term47315.getClass(), "previousSibling", null);
        setField(term47315, term47315.getClass(), "nextSibling", null);
        setField(term47315, term47315.getClass(), "ownerNode", null);
        setShortField(term47315, term47315.getClass(), "flags", (short) 0);
        setField(term47314, term47314.getClass(), "node", term47315);
        setField(term47314, term47314.getClass(), "namespaces", null);
        setField(term47314, term47314.getClass(), "defaultNamespace", "");
        setField(term47314, term47314.getClass(), "id", null);
        setField(term47314, term47314.getClass(), "localNamespaceResolver", null);
        setIntField(term47314, term47314.getClass(), "index", 0);
        setBooleanField(term47314, term47314.getClass(), "attribute", false);
        setField(term47314, term47314.getClass(), "rootNode", null);
        setField(term47314, term47314.getClass(), "namespaceResolver", null);
        setField(term47314, term47314.getClass(), "parent", null);
        setField(term47314, term47314.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term44802, args);
        assertTrue(recursiveEquals(term44802, term47314));
        assertTrue(recursiveEquals(retValue, null));
    }

};


