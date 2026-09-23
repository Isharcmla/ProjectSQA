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

public class JDOMNodePointer_compareChildNodePointers_980933085258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49731;
     Object term49847;
     Object term50001;
     Object term56337;
     Object term56338;
     Object term56340;

    public JDOMNodePointer_compareChildNodePointers_980933085258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49731 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        term49847 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term49885 = newInstance(Class.forName("java.lang.Object"));
        setField(term49847, term49847.getClass(), "node", term49885);
        term50001 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term50043 = newInstance(Class.forName("org.jdom.Attribute"));
        setField(term50001, term50001.getClass(), "node", term50043);
        term56337 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term56337, term56337.getClass(), "node", null);
        setField(term56337, term56337.getClass(), "id", null);
        setField(term56337, term56337.getClass(), "localNamespaceResolver", null);
        setIntField(term56337, term56337.getClass(), "index", 0);
        setBooleanField(term56337, term56337.getClass(), "attribute", false);
        setField(term56337, term56337.getClass(), "namespaceResolver", null);
        setField(term56337, term56337.getClass(), "rootNode", null);
        setField(term56337, term56337.getClass(), "parent", null);
        setField(term56337, term56337.getClass(), "locale", null);
        term56338 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term56339 = newInstance(Class.forName("java.lang.Object"));
        setField(term56338, term56338.getClass(), "node", term56339);
        setField(term56338, term56338.getClass(), "id", null);
        setField(term56338, term56338.getClass(), "localNamespaceResolver", null);
        setIntField(term56338, term56338.getClass(), "index", 0);
        setBooleanField(term56338, term56338.getClass(), "attribute", false);
        setField(term56338, term56338.getClass(), "namespaceResolver", null);
        setField(term56338, term56338.getClass(), "rootNode", null);
        setField(term56338, term56338.getClass(), "parent", null);
        setField(term56338, term56338.getClass(), "locale", null);
        term56340 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term56341 = newInstance(Class.forName("org.jdom.Attribute"));
        setField(term56341, term56341.getClass(), "name", null);
        setField(term56341, term56341.getClass(), "namespace", null);
        setField(term56341, term56341.getClass(), "value", null);
        setIntField(term56341, term56341.getClass(), "type", 0);
        setField(term56341, term56341.getClass(), "parent", null);
        setField(term56340, term56340.getClass(), "node", term56341);
        setField(term56340, term56340.getClass(), "id", null);
        setField(term56340, term56340.getClass(), "localNamespaceResolver", null);
        setIntField(term56340, term56340.getClass(), "index", 0);
        setBooleanField(term56340, term56340.getClass(), "attribute", false);
        setField(term56340, term56340.getClass(), "namespaceResolver", null);
        setField(term56340, term56340.getClass(), "rootNode", null);
        setField(term56340, term56340.getClass(), "parent", null);
        setField(term56340, term56340.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        Object[] args = new Object[2];
        args[0] = term49847;
        args[1] = term50001;
        Object retValue = callMethod(klass, "compareChildNodePointers", argTypes, term49731, args);
        assertTrue(recursiveEquals(term49731, term56337));
        assertTrue(recursiveEquals(term49847, term56338));
        assertTrue(recursiveEquals(term50001, term56340));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


