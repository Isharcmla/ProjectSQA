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

public class JDOMNodePointer_getNamespaceURI_1283858115266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66137;
     Object term66733;

    public JDOMNodePointer_getNamespaceURI_1283858115266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66137 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        term66733 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term66733, term66733.getClass(), "node", null);
        setField(term66733, term66733.getClass(), "id", null);
        setField(term66733, term66733.getClass(), "localNamespaceResolver", null);
        setIntField(term66733, term66733.getClass(), "index", 0);
        setBooleanField(term66733, term66733.getClass(), "attribute", false);
        setField(term66733, term66733.getClass(), "rootNode", null);
        setField(term66733, term66733.getClass(), "namespaceResolver", null);
        setField(term66733, term66733.getClass(), "parent", null);
        setField(term66733, term66733.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xml";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term66137, args);
        assertTrue(recursiveEquals(term66137, term66733));
        assertTrue(recursiveEquals(retValue, "http://www.w3.org/XML/1998/namespace"));
    }

};


