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

public class JDOMNodePointer_equals_508970494153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27202;
     Object term27210;
     Object term27211;

    public JDOMNodePointer_equals_508970494153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27202 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        term27210 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term27210, term27210.getClass(), "node", null);
        setField(term27210, term27210.getClass(), "id", null);
        setField(term27210, term27210.getClass(), "localNamespaceResolver", null);
        setIntField(term27210, term27210.getClass(), "index", 0);
        setBooleanField(term27210, term27210.getClass(), "attribute", false);
        setField(term27210, term27210.getClass(), "rootNode", null);
        setField(term27210, term27210.getClass(), "namespaceResolver", null);
        setField(term27210, term27210.getClass(), "parent", null);
        setField(term27210, term27210.getClass(), "locale", null);
        term27211 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term27211, term27211.getClass(), "node", null);
        setField(term27211, term27211.getClass(), "id", null);
        setField(term27211, term27211.getClass(), "localNamespaceResolver", null);
        setIntField(term27211, term27211.getClass(), "index", 0);
        setBooleanField(term27211, term27211.getClass(), "attribute", false);
        setField(term27211, term27211.getClass(), "rootNode", null);
        setField(term27211, term27211.getClass(), "namespaceResolver", null);
        setField(term27211, term27211.getClass(), "parent", null);
        setField(term27211, term27211.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term27202;
        Object retValue = callMethod(klass, "equals", argTypes, term27202, args);
        assertTrue(recursiveEquals(term27202, term27210));
        assertTrue(recursiveEquals(term27202, term27211));
        assertTrue(recursiveEquals(retValue, true));
    }

};


