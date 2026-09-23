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

public class DOMNodePointer_getNamespaceURI_795756451141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26810;
     Object term27104;

    public DOMNodePointer_getNamespaceURI_795756451141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term26858 = new HashMap();
        ((HashMap) term26858).put(" ", " ");
        term26810 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term26810, term26810.getClass(), "namespaces", term26858);
        HashMap term27105 = new HashMap();
        term27104 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term27104, term27104.getClass(), "node", null);
        setField(term27104, term27104.getClass(), "namespaces", term27105);
        setField(term27104, term27104.getClass(), "defaultNamespace", null);
        setField(term27104, term27104.getClass(), "id", null);
        setField(term27104, term27104.getClass(), "localNamespaceResolver", null);
        setIntField(term27104, term27104.getClass(), "index", 0);
        setBooleanField(term27104, term27104.getClass(), "attribute", false);
        setField(term27104, term27104.getClass(), "rootNode", null);
        setField(term27104, term27104.getClass(), "namespaceResolver", null);
        setField(term27104, term27104.getClass(), "parent", null);
        setField(term27104, term27104.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = " ";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term26810, args);
        assertTrue(recursiveEquals(term26810, term27104));
        assertTrue(recursiveEquals(retValue, " "));
    }

};


