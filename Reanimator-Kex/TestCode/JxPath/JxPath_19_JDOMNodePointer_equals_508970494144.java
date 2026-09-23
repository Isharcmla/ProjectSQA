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

public class JDOMNodePointer_equals_508970494144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25962;
     Object term26078;
     Object term26379;
     Object term26380;

    public JDOMNodePointer_equals_508970494144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25962 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        term26078 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        term26379 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term26379, term26379.getClass(), "node", null);
        setField(term26379, term26379.getClass(), "id", null);
        setField(term26379, term26379.getClass(), "localNamespaceResolver", null);
        setIntField(term26379, term26379.getClass(), "index", 0);
        setBooleanField(term26379, term26379.getClass(), "attribute", false);
        setField(term26379, term26379.getClass(), "namespaceResolver", null);
        setField(term26379, term26379.getClass(), "rootNode", null);
        setField(term26379, term26379.getClass(), "parent", null);
        setField(term26379, term26379.getClass(), "locale", null);
        term26380 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term26380, term26380.getClass(), "node", null);
        setField(term26380, term26380.getClass(), "id", null);
        setField(term26380, term26380.getClass(), "localNamespaceResolver", null);
        setIntField(term26380, term26380.getClass(), "index", 0);
        setBooleanField(term26380, term26380.getClass(), "attribute", false);
        setField(term26380, term26380.getClass(), "namespaceResolver", null);
        setField(term26380, term26380.getClass(), "rootNode", null);
        setField(term26380, term26380.getClass(), "parent", null);
        setField(term26380, term26380.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term26078;
        Object retValue = callMethod(klass, "equals", argTypes, term25962, args);
        assertTrue(recursiveEquals(term25962, term26379));
        assertTrue(recursiveEquals(term26078, term26380));
        assertTrue(recursiveEquals(retValue, true));
    }

};


