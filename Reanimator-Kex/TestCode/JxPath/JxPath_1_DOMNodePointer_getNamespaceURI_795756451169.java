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

public class DOMNodePointer_getNamespaceURI_795756451169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29592;
     Object term29867;

    public DOMNodePointer_getNamespaceURI_795756451169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term29640 = new HashMap();
        ((HashMap) term29640).put(" ", " ");
        term29592 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term29592, term29592.getClass(), "namespaces", term29640);
        HashMap term29868 = new HashMap();
        term29867 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term29867, term29867.getClass(), "node", null);
        setField(term29867, term29867.getClass(), "namespaces", term29868);
        setField(term29867, term29867.getClass(), "defaultNamespace", null);
        setField(term29867, term29867.getClass(), "id", null);
        setIntField(term29867, term29867.getClass(), "index", 0);
        setBooleanField(term29867, term29867.getClass(), "attribute", false);
        setField(term29867, term29867.getClass(), "rootNode", null);
        setField(term29867, term29867.getClass(), "namespaceResolver", null);
        setField(term29867, term29867.getClass(), "parent", null);
        setField(term29867, term29867.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = " ";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term29592, args);
        assertTrue(recursiveEquals(term29592, term29867));
        assertTrue(recursiveEquals(retValue, " "));
    }

};
