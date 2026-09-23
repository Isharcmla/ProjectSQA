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

public class JDOMNodePointer_getLanguage_577383047112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20096;
     Object term20875;

    public JDOMNodePointer_getLanguage_577383047112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20096 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term20134 = newInstance(Class.forName("org.jdom.Comment"));
        setField(term20096, term20096.getClass(), "node", term20134);
        term20875 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term20876 = newInstance(Class.forName("org.jdom.Comment"));
        setField(term20876, term20876.getClass(), "text", null);
        setField(term20876, term20876.getClass(), "parent", null);
        setField(term20875, term20875.getClass(), "node", term20876);
        setField(term20875, term20875.getClass(), "id", null);
        setField(term20875, term20875.getClass(), "localNamespaceResolver", null);
        setIntField(term20875, term20875.getClass(), "index", 0);
        setBooleanField(term20875, term20875.getClass(), "attribute", false);
        setField(term20875, term20875.getClass(), "namespaceResolver", null);
        setField(term20875, term20875.getClass(), "rootNode", null);
        setField(term20875, term20875.getClass(), "parent", null);
        setField(term20875, term20875.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLanguage", argTypes, term20096, args);
        assertTrue(recursiveEquals(term20096, term20875));
        assertTrue(recursiveEquals(retValue, null));
    }

};


