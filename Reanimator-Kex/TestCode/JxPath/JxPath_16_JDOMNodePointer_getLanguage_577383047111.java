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

public class JDOMNodePointer_getLanguage_577383047111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18765;
     Object term18869;

    public JDOMNodePointer_getLanguage_577383047111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18765 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term18803 = newInstance(Class.forName("org.jdom.Comment"));
        setField(term18765, term18765.getClass(), "node", term18803);
        term18869 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term18870 = newInstance(Class.forName("org.jdom.Comment"));
        setField(term18870, term18870.getClass(), "text", null);
        setField(term18870, term18870.getClass(), "parent", null);
        setField(term18869, term18869.getClass(), "node", term18870);
        setField(term18869, term18869.getClass(), "id", null);
        setField(term18869, term18869.getClass(), "localNamespaceResolver", null);
        setIntField(term18869, term18869.getClass(), "index", 0);
        setBooleanField(term18869, term18869.getClass(), "attribute", false);
        setField(term18869, term18869.getClass(), "rootNode", null);
        setField(term18869, term18869.getClass(), "namespaceResolver", null);
        setField(term18869, term18869.getClass(), "parent", null);
        setField(term18869, term18869.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLanguage", argTypes, term18765, args);
        assertTrue(recursiveEquals(term18765, term18869));
        assertTrue(recursiveEquals(retValue, null));
    }

};


