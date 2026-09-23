package org.apache.commons.jxpath.ri.model.jdom;

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
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.jdom.EqualityUtils.*;
import java.lang.Object;

public class JDOMNodePointer_getNamespaceURI_1283858115103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13895;
     Object term13943;

    public JDOMNodePointer_getNamespaceURI_1283858115103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13895 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term13933 = newInstance(Class.forName("org.jdom.Element"));
        setField(term13895, term13895.getClass(), "node", term13933);
        term13943 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term13944 = newInstance(Class.forName("org.jdom.Element"));
        setField(term13944, term13944.getClass(), "name", null);
        setField(term13944, term13944.getClass(), "namespace", null);
        setField(term13944, term13944.getClass(), "additionalNamespaces", null);
        setField(term13944, term13944.getClass(), "attributes", null);
        setField(term13944, term13944.getClass(), "content", null);
        setField(term13944, term13944.getClass(), "parent", null);
        setField(term13943, term13943.getClass(), "node", term13944);
        setField(term13943, term13943.getClass(), "id", null);
        setIntField(term13943, term13943.getClass(), "index", 0);
        setBooleanField(term13943, term13943.getClass(), "attribute", false);
        setField(term13943, term13943.getClass(), "rootNode", null);
        setField(term13943, term13943.getClass(), "namespaceResolver", null);
        setField(term13943, term13943.getClass(), "parent", null);
        setField(term13943, term13943.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term13895, args);
        assertTrue(recursiveEquals(term13895, term13943));
        assertTrue(recursiveEquals(retValue, null));
    }

};


