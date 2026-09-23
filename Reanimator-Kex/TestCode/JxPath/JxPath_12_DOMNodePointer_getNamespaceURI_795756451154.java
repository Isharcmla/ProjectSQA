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
import java.util.HashMap;
import java.lang.Object;

public class DOMNodePointer_getNamespaceURI_795756451154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25631;
     Object term26432;

    public DOMNodePointer_getNamespaceURI_795756451154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term25679 = new HashMap();
        term25631 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term25871 = newInstance(Class.forName("org.apache.html.dom.HTMLSelectElementImpl"));
        setField(term25631, term25631.getClass(), "namespaces", term25679);
        setField(term25631, term25631.getClass(), "node", term25871);
        HashMap term26434 = new HashMap();
        term26432 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term26433 = newInstance(Class.forName("org.apache.html.dom.HTMLSelectElementImpl"));
        setField(term26433, term26433.getClass(), "_options", null);
        setField(term26433, term26433.getClass(), "name", null);
        setField(term26433, term26433.getClass(), "attributes", null);
        setField(term26433, term26433.getClass(), "ownerDocument", null);
        setField(term26433, term26433.getClass(), "firstChild", null);
        setField(term26433, term26433.getClass(), "fNodeListCache", null);
        setField(term26433, term26433.getClass(), "previousSibling", null);
        setField(term26433, term26433.getClass(), "nextSibling", null);
        setField(term26433, term26433.getClass(), "ownerNode", null);
        setShortField(term26433, term26433.getClass(), "flags", (short) 0);
        setField(term26432, term26432.getClass(), "node", term26433);
        setField(term26432, term26432.getClass(), "namespaces", term26434);
        setField(term26432, term26432.getClass(), "defaultNamespace", null);
        setField(term26432, term26432.getClass(), "id", null);
        setIntField(term26432, term26432.getClass(), "index", 0);
        setBooleanField(term26432, term26432.getClass(), "attribute", false);
        setField(term26432, term26432.getClass(), "rootNode", null);
        setField(term26432, term26432.getClass(), "namespaceResolver", null);
        setField(term26432, term26432.getClass(), "parent", null);
        setField(term26432, term26432.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "::::::::::::::::::::::::::::::::\u0004:::::::::";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term25631, args);
        assertTrue(recursiveEquals(term25631, term26432));
        assertTrue(recursiveEquals(retValue, null));
    }

};


