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

public class JDOMNodePointer_asPath_327299344221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45030;
     Object term45172;

    public JDOMNodePointer_asPath_327299344221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45030 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term45146 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term45030, term45030.getClass(), "id", null);
        setField(term45030, term45030.getClass(), "parent", term45146);
        term45172 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term45173 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term45172, term45172.getClass(), "node", null);
        setField(term45172, term45172.getClass(), "id", null);
        setField(term45172, term45172.getClass(), "localNamespaceResolver", null);
        setIntField(term45172, term45172.getClass(), "index", 0);
        setBooleanField(term45172, term45172.getClass(), "attribute", false);
        setField(term45172, term45172.getClass(), "rootNode", null);
        setField(term45172, term45172.getClass(), "namespaceResolver", null);
        setField(term45173, term45173.getClass(), "node", null);
        setField(term45173, term45173.getClass(), "id", null);
        setField(term45173, term45173.getClass(), "localNamespaceResolver", null);
        setIntField(term45173, term45173.getClass(), "index", 0);
        setBooleanField(term45173, term45173.getClass(), "attribute", false);
        setField(term45173, term45173.getClass(), "rootNode", null);
        setField(term45173, term45173.getClass(), "namespaceResolver", null);
        setField(term45173, term45173.getClass(), "parent", null);
        setField(term45173, term45173.getClass(), "locale", null);
        setField(term45172, term45172.getClass(), "parent", term45173);
        setField(term45172, term45172.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asPath", argTypes, term45030, args);
        assertTrue(recursiveEquals(term45030, term45172));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


