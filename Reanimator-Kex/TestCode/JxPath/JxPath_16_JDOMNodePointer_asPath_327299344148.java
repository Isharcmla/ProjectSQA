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

public class JDOMNodePointer_asPath_327299344148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25449;
     Object term25749;

    public JDOMNodePointer_asPath_327299344148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25449 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term25449, term25449.getClass(), "id", "");
        term25749 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term25749, term25749.getClass(), "node", null);
        setField(term25749, term25749.getClass(), "id", "");
        setField(term25749, term25749.getClass(), "localNamespaceResolver", null);
        setIntField(term25749, term25749.getClass(), "index", 0);
        setBooleanField(term25749, term25749.getClass(), "attribute", false);
        setField(term25749, term25749.getClass(), "rootNode", null);
        setField(term25749, term25749.getClass(), "namespaceResolver", null);
        setField(term25749, term25749.getClass(), "parent", null);
        setField(term25749, term25749.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asPath", argTypes, term25449, args);
        assertTrue(recursiveEquals(term25449, term25749));
        assertTrue(recursiveEquals(retValue, "id(\'\')"));
    }

};


