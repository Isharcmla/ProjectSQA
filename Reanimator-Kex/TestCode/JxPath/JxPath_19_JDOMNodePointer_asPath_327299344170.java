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

public class JDOMNodePointer_asPath_327299344170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31200;
     Object term31375;

    public JDOMNodePointer_asPath_327299344170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31200 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term31200, term31200.getClass(), "id", null);
        term31375 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term31375, term31375.getClass(), "node", null);
        setField(term31375, term31375.getClass(), "id", null);
        setField(term31375, term31375.getClass(), "localNamespaceResolver", null);
        setIntField(term31375, term31375.getClass(), "index", 0);
        setBooleanField(term31375, term31375.getClass(), "attribute", false);
        setField(term31375, term31375.getClass(), "namespaceResolver", null);
        setField(term31375, term31375.getClass(), "rootNode", null);
        setField(term31375, term31375.getClass(), "parent", null);
        setField(term31375, term31375.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asPath", argTypes, term31200, args);
        assertTrue(recursiveEquals(term31200, term31375));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


