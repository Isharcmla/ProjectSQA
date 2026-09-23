package org.apache.commons.jxpath.ri.model.dom;

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
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.dom.EqualityUtils.*;

public class DOMNodePointer_asPath_1752315222199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42386;
     Object term42466;

    public DOMNodePointer_asPath_1752315222199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42386 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term42386, term42386.getClass(), "id", "");
        term42466 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term42466, term42466.getClass(), "node", null);
        setField(term42466, term42466.getClass(), "namespaces", null);
        setField(term42466, term42466.getClass(), "defaultNamespace", null);
        setField(term42466, term42466.getClass(), "id", "");
        setField(term42466, term42466.getClass(), "localNamespaceResolver", null);
        setIntField(term42466, term42466.getClass(), "index", 0);
        setBooleanField(term42466, term42466.getClass(), "attribute", false);
        setField(term42466, term42466.getClass(), "rootNode", null);
        setField(term42466, term42466.getClass(), "namespaceResolver", null);
        setField(term42466, term42466.getClass(), "parent", null);
        setField(term42466, term42466.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asPath", argTypes, term42386, args);
        assertTrue(recursiveEquals(term42386, term42466));
        assertTrue(recursiveEquals(retValue, "id(\'\')"));
    }

};


