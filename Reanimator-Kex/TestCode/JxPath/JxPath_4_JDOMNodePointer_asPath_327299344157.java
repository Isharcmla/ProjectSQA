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

public class JDOMNodePointer_asPath_327299344157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25004;
     Object term25705;

    public JDOMNodePointer_asPath_327299344157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25004 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term25042 = newInstance(Class.forName("org.jdom.Element"));
        setField(term25004, term25004.getClass(), "id", null);
        setField(term25004, term25004.getClass(), "parent", null);
        setField(term25004, term25004.getClass(), "node", term25042);
        term25705 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term25706 = newInstance(Class.forName("org.jdom.Element"));
        setField(term25706, term25706.getClass(), "name", null);
        setField(term25706, term25706.getClass(), "namespace", null);
        setField(term25706, term25706.getClass(), "additionalNamespaces", null);
        setField(term25706, term25706.getClass(), "attributes", null);
        setField(term25706, term25706.getClass(), "content", null);
        setField(term25706, term25706.getClass(), "parent", null);
        setField(term25705, term25705.getClass(), "node", term25706);
        setField(term25705, term25705.getClass(), "id", null);
        setIntField(term25705, term25705.getClass(), "index", 0);
        setBooleanField(term25705, term25705.getClass(), "attribute", false);
        setField(term25705, term25705.getClass(), "rootNode", null);
        setField(term25705, term25705.getClass(), "namespaceResolver", null);
        setField(term25705, term25705.getClass(), "parent", null);
        setField(term25705, term25705.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asPath", argTypes, term25004, args);
        assertTrue(recursiveEquals(term25004, term25705));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


