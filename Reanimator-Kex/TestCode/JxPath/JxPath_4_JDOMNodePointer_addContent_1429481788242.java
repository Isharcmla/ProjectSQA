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
import java.util.ArrayList;

public class JDOMNodePointer_addContent_1429481788242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51883;
     Object term51973;
     Object term52933;
     Object term52935;

    public JDOMNodePointer_addContent_1429481788242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51883 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term51921 = newInstance(Class.forName("org.jdom.Element"));
        setField(term51883, term51883.getClass(), "node", term51921);
        term51973 = new ArrayList();
        term52933 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term52934 = newInstance(Class.forName("org.jdom.Element"));
        setField(term52934, term52934.getClass(), "name", null);
        setField(term52934, term52934.getClass(), "namespace", null);
        setField(term52934, term52934.getClass(), "additionalNamespaces", null);
        setField(term52934, term52934.getClass(), "attributes", null);
        setField(term52934, term52934.getClass(), "content", null);
        setField(term52934, term52934.getClass(), "parent", null);
        setField(term52933, term52933.getClass(), "node", term52934);
        setField(term52933, term52933.getClass(), "id", null);
        setIntField(term52933, term52933.getClass(), "index", 0);
        setBooleanField(term52933, term52933.getClass(), "attribute", false);
        setField(term52933, term52933.getClass(), "rootNode", null);
        setField(term52933, term52933.getClass(), "namespaceResolver", null);
        setField(term52933, term52933.getClass(), "parent", null);
        setField(term52933, term52933.getClass(), "locale", null);
        term52935 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term51973;
        callMethod(klass, "addContent", argTypes, term51883, args);
        assertTrue(recursiveEquals(term51883, term52933));
        assertTrue(recursiveEquals(term51973, term52935));
    }

};


