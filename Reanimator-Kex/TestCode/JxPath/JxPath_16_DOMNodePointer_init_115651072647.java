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

public class DOMNodePointer_init_115651072647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4197;

    public DOMNodePointer_init_115651072647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4197 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term4197, term4197.getClass(), "node", null);
        setField(term4197, term4197.getClass(), "namespaces", null);
        setField(term4197, term4197.getClass(), "defaultNamespace", null);
        setField(term4197, term4197.getClass(), "id", null);
        setField(term4197, term4197.getClass(), "localNamespaceResolver", null);
        setIntField(term4197, term4197.getClass(), "index", -2147483648);
        setBooleanField(term4197, term4197.getClass(), "attribute", false);
        setField(term4197, term4197.getClass(), "rootNode", null);
        setField(term4197, term4197.getClass(), "namespaceResolver", null);
        setField(term4197, term4197.getClass(), "parent", null);
        setField(term4197, term4197.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.w3c.dom.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term4197));
    }

};


