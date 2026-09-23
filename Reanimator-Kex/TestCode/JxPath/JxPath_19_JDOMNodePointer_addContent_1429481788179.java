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

public class JDOMNodePointer_addContent_1429481788179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34588;
     Object term34678;
     Object term34688;
     Object term34690;

    public JDOMNodePointer_addContent_1429481788179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34588 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term34626 = newInstance(Class.forName("org.jdom.Element"));
        setField(term34588, term34588.getClass(), "node", term34626);
        term34678 = new ArrayList();
        term34688 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term34689 = newInstance(Class.forName("org.jdom.Element"));
        setField(term34689, term34689.getClass(), "name", null);
        setField(term34689, term34689.getClass(), "namespace", null);
        setField(term34689, term34689.getClass(), "additionalNamespaces", null);
        setField(term34689, term34689.getClass(), "attributes", null);
        setField(term34689, term34689.getClass(), "content", null);
        setField(term34689, term34689.getClass(), "parent", null);
        setField(term34688, term34688.getClass(), "node", term34689);
        setField(term34688, term34688.getClass(), "id", null);
        setField(term34688, term34688.getClass(), "localNamespaceResolver", null);
        setIntField(term34688, term34688.getClass(), "index", 0);
        setBooleanField(term34688, term34688.getClass(), "attribute", false);
        setField(term34688, term34688.getClass(), "namespaceResolver", null);
        setField(term34688, term34688.getClass(), "rootNode", null);
        setField(term34688, term34688.getClass(), "parent", null);
        setField(term34688, term34688.getClass(), "locale", null);
        term34690 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term34678;
        callMethod(klass, "addContent", argTypes, term34588, args);
        assertTrue(recursiveEquals(term34588, term34688));
        assertTrue(recursiveEquals(term34678, term34690));
    }

};


