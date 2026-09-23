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

public class JDOMNodePointer_asPath_327299344213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42164;
     Object term42221;

    public JDOMNodePointer_asPath_327299344213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42164 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term42196 = newInstance(Class.forName("org.jdom.Text"));
        setField(term42164, term42164.getClass(), "id", null);
        setField(term42164, term42164.getClass(), "parent", null);
        setField(term42164, term42164.getClass(), "node", term42196);
        term42221 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term42222 = newInstance(Class.forName("org.jdom.Text"));
        setField(term42222, term42222.getClass(), "value", null);
        setField(term42222, term42222.getClass(), "parent", null);
        setField(term42221, term42221.getClass(), "node", term42222);
        setField(term42221, term42221.getClass(), "id", null);
        setField(term42221, term42221.getClass(), "localNamespaceResolver", null);
        setIntField(term42221, term42221.getClass(), "index", 0);
        setBooleanField(term42221, term42221.getClass(), "attribute", false);
        setField(term42221, term42221.getClass(), "namespaceResolver", null);
        setField(term42221, term42221.getClass(), "rootNode", null);
        setField(term42221, term42221.getClass(), "parent", null);
        setField(term42221, term42221.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asPath", argTypes, term42164, args);
        assertTrue(recursiveEquals(term42164, term42221));
        assertTrue(recursiveEquals(retValue, "/text()[1]"));
    }

};


