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

public class DOMNodePointer_getNamespaceURI_795756451225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55967;
     Object term61776;

    public DOMNodePointer_getNamespaceURI_795756451225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55967 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term56039 = newInstance(Class.forName("org.apache.wml.dom.WMLElementImpl"));
        setField(term55967, term55967.getClass(), "defaultNamespace", null);
        setField(term55967, term55967.getClass(), "node", term56039);
        term61776 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term61777 = newInstance(Class.forName("org.apache.wml.dom.WMLElementImpl"));
        setField(term61777, term61777.getClass(), "name", null);
        setField(term61777, term61777.getClass(), "attributes", null);
        setField(term61777, term61777.getClass(), "ownerDocument", null);
        setField(term61777, term61777.getClass(), "firstChild", null);
        setField(term61777, term61777.getClass(), "fNodeListCache", null);
        setField(term61777, term61777.getClass(), "previousSibling", null);
        setField(term61777, term61777.getClass(), "nextSibling", null);
        setField(term61777, term61777.getClass(), "ownerNode", null);
        setShortField(term61777, term61777.getClass(), "flags", (short) 0);
        setField(term61776, term61776.getClass(), "node", term61777);
        setField(term61776, term61776.getClass(), "namespaces", null);
        setField(term61776, term61776.getClass(), "defaultNamespace", "");
        setField(term61776, term61776.getClass(), "id", null);
        setIntField(term61776, term61776.getClass(), "index", 0);
        setBooleanField(term61776, term61776.getClass(), "attribute", false);
        setField(term61776, term61776.getClass(), "rootNode", null);
        setField(term61776, term61776.getClass(), "namespaceResolver", null);
        setField(term61776, term61776.getClass(), "parent", null);
        setField(term61776, term61776.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term55967, args);
        assertTrue(recursiveEquals(term55967, term61776));
        assertTrue(recursiveEquals(retValue, null));
    }

};


