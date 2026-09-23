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

public class JDOMNodePointer_getValue_2106274462177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33586;
     Object term34347;

    public JDOMNodePointer_getValue_2106274462177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33586 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term33618 = newInstance(Class.forName("org.jdom.Text"));
        setField(term33618, term33618.getClass(), "value", "http://www.w3.org/XML/1998/namespace");
        setField(term33618, term33618.getClass(), "parent", null);
        setField(term33586, term33586.getClass(), "node", term33618);
        term34347 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term34348 = newInstance(Class.forName("org.jdom.Text"));
        setField(term34348, term34348.getClass(), "value", "http://www.w3.org/XML/1998/namespace");
        setField(term34348, term34348.getClass(), "parent", null);
        setField(term34347, term34347.getClass(), "node", term34348);
        setField(term34347, term34347.getClass(), "id", null);
        setField(term34347, term34347.getClass(), "localNamespaceResolver", null);
        setIntField(term34347, term34347.getClass(), "index", 0);
        setBooleanField(term34347, term34347.getClass(), "attribute", false);
        setField(term34347, term34347.getClass(), "namespaceResolver", null);
        setField(term34347, term34347.getClass(), "rootNode", null);
        setField(term34347, term34347.getClass(), "parent", null);
        setField(term34347, term34347.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getValue", argTypes, term33586, args);
        assertTrue(recursiveEquals(term33586, term34347));
        assertTrue(recursiveEquals(retValue, "http://www.w3.org/XML/1998/namespace"));
    }

};


