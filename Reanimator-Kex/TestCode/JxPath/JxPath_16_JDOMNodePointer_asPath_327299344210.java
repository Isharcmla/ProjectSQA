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

public class JDOMNodePointer_asPath_327299344210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40502;
     Object term41309;

    public JDOMNodePointer_asPath_327299344210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40502 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term40540 = newInstance(Class.forName("org.jdom.Element"));
        setField(term40502, term40502.getClass(), "id", null);
        setField(term40502, term40502.getClass(), "parent", null);
        setField(term40502, term40502.getClass(), "node", term40540);
        term41309 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term41310 = newInstance(Class.forName("org.jdom.Element"));
        setField(term41310, term41310.getClass(), "name", null);
        setField(term41310, term41310.getClass(), "namespace", null);
        setField(term41310, term41310.getClass(), "additionalNamespaces", null);
        setField(term41310, term41310.getClass(), "attributes", null);
        setField(term41310, term41310.getClass(), "content", null);
        setField(term41310, term41310.getClass(), "parent", null);
        setField(term41309, term41309.getClass(), "node", term41310);
        setField(term41309, term41309.getClass(), "id", null);
        setField(term41309, term41309.getClass(), "localNamespaceResolver", null);
        setIntField(term41309, term41309.getClass(), "index", 0);
        setBooleanField(term41309, term41309.getClass(), "attribute", false);
        setField(term41309, term41309.getClass(), "rootNode", null);
        setField(term41309, term41309.getClass(), "namespaceResolver", null);
        setField(term41309, term41309.getClass(), "parent", null);
        setField(term41309, term41309.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asPath", argTypes, term40502, args);
        assertTrue(recursiveEquals(term40502, term41309));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


