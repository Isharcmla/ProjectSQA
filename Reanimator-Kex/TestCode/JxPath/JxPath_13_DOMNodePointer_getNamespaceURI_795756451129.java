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

public class DOMNodePointer_getNamespaceURI_795756451129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21566;
     Object term21712;

    public DOMNodePointer_getNamespaceURI_795756451129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21566 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term21566, term21566.getClass(), "namespaces", null);
        HashMap term21713 = new HashMap();
        term21712 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term21712, term21712.getClass(), "node", null);
        setField(term21712, term21712.getClass(), "namespaces", term21713);
        setField(term21712, term21712.getClass(), "defaultNamespace", null);
        setField(term21712, term21712.getClass(), "id", null);
        setIntField(term21712, term21712.getClass(), "index", 0);
        setBooleanField(term21712, term21712.getClass(), "attribute", false);
        setField(term21712, term21712.getClass(), "rootNode", null);
        setField(term21712, term21712.getClass(), "namespaceResolver", null);
        setField(term21712, term21712.getClass(), "parent", null);
        setField(term21712, term21712.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = " mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term21566, args);
        assertTrue(recursiveEquals(term21566, term21712));
        assertTrue(recursiveEquals(retValue, null));
    }

};


