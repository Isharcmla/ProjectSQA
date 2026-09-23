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

public class DOMNodePointer_getNamespaceURI_795756451171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33517;
     Object term33893;

    public DOMNodePointer_getNamespaceURI_795756451171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term33565 = new HashMap();
        term33517 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term33735 = newInstance(Class.forName("org.apache.xerces.dom.TextImpl"));
        setField(term33517, term33517.getClass(), "namespaces", term33565);
        setField(term33517, term33517.getClass(), "node", term33735);
        HashMap term33895 = new HashMap();
        term33893 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term33894 = newInstance(Class.forName("org.apache.xerces.dom.TextImpl"));
        setField(term33894, term33894.getClass(), "data", null);
        setField(term33894, term33894.getClass(), "previousSibling", null);
        setField(term33894, term33894.getClass(), "nextSibling", null);
        setField(term33894, term33894.getClass(), "ownerNode", null);
        setShortField(term33894, term33894.getClass(), "flags", (short) 0);
        setField(term33893, term33893.getClass(), "node", term33894);
        setField(term33893, term33893.getClass(), "namespaces", term33895);
        setField(term33893, term33893.getClass(), "defaultNamespace", null);
        setField(term33893, term33893.getClass(), "id", null);
        setField(term33893, term33893.getClass(), "localNamespaceResolver", null);
        setIntField(term33893, term33893.getClass(), "index", 0);
        setBooleanField(term33893, term33893.getClass(), "attribute", false);
        setField(term33893, term33893.getClass(), "namespaceResolver", null);
        setField(term33893, term33893.getClass(), "rootNode", null);
        setField(term33893, term33893.getClass(), "parent", null);
        setField(term33893, term33893.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "::::::::::::::::::::::::::::::::\u0004:::::::::";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term33517, args);
        assertTrue(recursiveEquals(term33517, term33893));
        assertTrue(recursiveEquals(retValue, null));
    }

};


