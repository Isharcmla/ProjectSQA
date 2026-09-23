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

public class DOMNodePointer_asPath_1752315222116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17768;
     Object term18450;

    public DOMNodePointer_asPath_1752315222116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17768 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term17768, term17768.getClass(), "id", "");
        term18450 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term18450, term18450.getClass(), "node", null);
        setField(term18450, term18450.getClass(), "namespaces", null);
        setField(term18450, term18450.getClass(), "defaultNamespace", null);
        setField(term18450, term18450.getClass(), "id", "");
        setIntField(term18450, term18450.getClass(), "index", 0);
        setBooleanField(term18450, term18450.getClass(), "attribute", false);
        setField(term18450, term18450.getClass(), "rootNode", null);
        setField(term18450, term18450.getClass(), "namespaceResolver", null);
        setField(term18450, term18450.getClass(), "parent", null);
        setField(term18450, term18450.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asPath", argTypes, term17768, args);
        assertTrue(recursiveEquals(term17768, term18450));
        assertTrue(recursiveEquals(retValue, "id(\'\')"));
    }

};


