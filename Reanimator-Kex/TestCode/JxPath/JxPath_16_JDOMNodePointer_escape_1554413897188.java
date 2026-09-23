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

public class JDOMNodePointer_escape_1554413897188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34584;
     Object term34807;

    public JDOMNodePointer_escape_1554413897188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34584 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        term34807 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term34807, term34807.getClass(), "node", null);
        setField(term34807, term34807.getClass(), "id", null);
        setField(term34807, term34807.getClass(), "localNamespaceResolver", null);
        setIntField(term34807, term34807.getClass(), "index", 0);
        setBooleanField(term34807, term34807.getClass(), "attribute", false);
        setField(term34807, term34807.getClass(), "rootNode", null);
        setField(term34807, term34807.getClass(), "namespaceResolver", null);
        setField(term34807, term34807.getClass(), "parent", null);
        setField(term34807, term34807.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "escape", argTypes, term34584, args);
        assertTrue(recursiveEquals(term34584, term34807));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


