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

public class DOMNodePointer_getNamespaceURI_795756451183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38453;
     Object term38465;

    public DOMNodePointer_getNamespaceURI_795756451183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38453 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term38465 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term38465, term38465.getClass(), "node", null);
        setField(term38465, term38465.getClass(), "namespaces", null);
        setField(term38465, term38465.getClass(), "defaultNamespace", "");
        setField(term38465, term38465.getClass(), "id", null);
        setIntField(term38465, term38465.getClass(), "index", 0);
        setBooleanField(term38465, term38465.getClass(), "attribute", false);
        setField(term38465, term38465.getClass(), "rootNode", null);
        setField(term38465, term38465.getClass(), "namespaceResolver", null);
        setField(term38465, term38465.getClass(), "parent", null);
        setField(term38465, term38465.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term38453, args);
        assertTrue(recursiveEquals(term38453, term38465));
        assertTrue(recursiveEquals(retValue, null));
    }

};


