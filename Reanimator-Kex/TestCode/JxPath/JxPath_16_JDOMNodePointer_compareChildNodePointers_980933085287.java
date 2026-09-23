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

public class JDOMNodePointer_compareChildNodePointers_980933085287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70543;
     Object term70692;
     Object term74998;
     Object term75000;
     Object term75002;

    public JDOMNodePointer_compareChildNodePointers_980933085287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70543 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term70564 = newInstance(Class.forName("org.jdom.Attribute"));
        setField(term70543, term70543.getClass(), "node", term70564);
        term70692 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        setField(term70692, term70692.getClass(), "container", null);
        term74998 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term74999 = newInstance(Class.forName("org.jdom.Attribute"));
        setField(term74999, term74999.getClass(), "name", null);
        setField(term74999, term74999.getClass(), "namespace", null);
        setField(term74999, term74999.getClass(), "value", null);
        setIntField(term74999, term74999.getClass(), "type", 0);
        setField(term74999, term74999.getClass(), "parent", null);
        setField(term74998, term74998.getClass(), "node", term74999);
        setField(term74998, term74998.getClass(), "id", null);
        setField(term74998, term74998.getClass(), "localNamespaceResolver", null);
        setIntField(term74998, term74998.getClass(), "index", 0);
        setBooleanField(term74998, term74998.getClass(), "attribute", false);
        setField(term74998, term74998.getClass(), "rootNode", null);
        setField(term74998, term74998.getClass(), "namespaceResolver", null);
        setField(term74998, term74998.getClass(), "parent", null);
        setField(term74998, term74998.getClass(), "locale", null);
        term75000 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term75001 = newInstance(Class.forName("org.jdom.Attribute"));
        setField(term75001, term75001.getClass(), "name", null);
        setField(term75001, term75001.getClass(), "namespace", null);
        setField(term75001, term75001.getClass(), "value", null);
        setIntField(term75001, term75001.getClass(), "type", 0);
        setField(term75001, term75001.getClass(), "parent", null);
        setField(term75000, term75000.getClass(), "node", term75001);
        setField(term75000, term75000.getClass(), "id", null);
        setField(term75000, term75000.getClass(), "localNamespaceResolver", null);
        setIntField(term75000, term75000.getClass(), "index", 0);
        setBooleanField(term75000, term75000.getClass(), "attribute", false);
        setField(term75000, term75000.getClass(), "rootNode", null);
        setField(term75000, term75000.getClass(), "namespaceResolver", null);
        setField(term75000, term75000.getClass(), "parent", null);
        setField(term75000, term75000.getClass(), "locale", null);
        term75002 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        setField(term75002, term75002.getClass(), "container", null);
        setField(term75002, term75002.getClass(), "valuePointer", null);
        setIntField(term75002, term75002.getClass(), "index", 0);
        setBooleanField(term75002, term75002.getClass(), "attribute", false);
        setField(term75002, term75002.getClass(), "rootNode", null);
        setField(term75002, term75002.getClass(), "namespaceResolver", null);
        setField(term75002, term75002.getClass(), "parent", null);
        setField(term75002, term75002.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        Object[] args = new Object[2];
        args[0] = term70543;
        args[1] = term70692;
        Object retValue = callMethod(klass, "compareChildNodePointers", argTypes, term70543, args);
        assertTrue(recursiveEquals(term70543, term74998));
        assertTrue(recursiveEquals(term70543, term75000));
        assertTrue(recursiveEquals(term70692, term75002));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


