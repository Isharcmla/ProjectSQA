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

public class JDOMNodePointer_getValue_2106274462191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35468;
     Object term35561;

    public JDOMNodePointer_getValue_2106274462191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35468 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term35506 = newInstance(Class.forName("org.jdom.Comment"));
        setField(term35506, term35506.getClass(), "text", "");
        setField(term35468, term35468.getClass(), "node", term35506);
        term35561 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term35562 = newInstance(Class.forName("org.jdom.Comment"));
        setField(term35562, term35562.getClass(), "text", "");
        setField(term35562, term35562.getClass(), "parent", null);
        setField(term35561, term35561.getClass(), "node", term35562);
        setField(term35561, term35561.getClass(), "id", null);
        setField(term35561, term35561.getClass(), "localNamespaceResolver", null);
        setIntField(term35561, term35561.getClass(), "index", 0);
        setBooleanField(term35561, term35561.getClass(), "attribute", false);
        setField(term35561, term35561.getClass(), "rootNode", null);
        setField(term35561, term35561.getClass(), "namespaceResolver", null);
        setField(term35561, term35561.getClass(), "parent", null);
        setField(term35561, term35561.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getValue", argTypes, term35468, args);
        assertTrue(recursiveEquals(term35468, term35561));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


