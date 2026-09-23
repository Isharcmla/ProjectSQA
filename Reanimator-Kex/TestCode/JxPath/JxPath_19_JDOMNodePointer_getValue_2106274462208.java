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

public class JDOMNodePointer_getValue_2106274462208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40352;
     Object term41132;

    public JDOMNodePointer_getValue_2106274462208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40352 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term40418 = newInstance(Class.forName("org.jdom.ProcessingInstruction"));
        setField(term40418, term40418.getClass(), "rawData", "http://www.w3.org/XML/1998/namespace");
        setField(term40418, term40418.getClass(), "parent", null);
        setField(term40352, term40352.getClass(), "node", term40418);
        term41132 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term41133 = newInstance(Class.forName("org.jdom.ProcessingInstruction"));
        setField(term41133, term41133.getClass(), "target", null);
        setField(term41133, term41133.getClass(), "rawData", "http://www.w3.org/XML/1998/namespace");
        setField(term41133, term41133.getClass(), "mapData", null);
        setField(term41133, term41133.getClass(), "parent", null);
        setField(term41132, term41132.getClass(), "node", term41133);
        setField(term41132, term41132.getClass(), "id", null);
        setField(term41132, term41132.getClass(), "localNamespaceResolver", null);
        setIntField(term41132, term41132.getClass(), "index", 0);
        setBooleanField(term41132, term41132.getClass(), "attribute", false);
        setField(term41132, term41132.getClass(), "namespaceResolver", null);
        setField(term41132, term41132.getClass(), "rootNode", null);
        setField(term41132, term41132.getClass(), "parent", null);
        setField(term41132, term41132.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getValue", argTypes, term40352, args);
        assertTrue(recursiveEquals(term40352, term41132));
        assertTrue(recursiveEquals(retValue, "http://www.w3.org/XML/1998/namespace"));
    }

};


