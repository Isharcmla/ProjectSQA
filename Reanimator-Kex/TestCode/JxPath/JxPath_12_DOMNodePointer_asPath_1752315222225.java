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

public class DOMNodePointer_asPath_1752315222225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54825;
     Object term54898;

    public DOMNodePointer_asPath_1752315222225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54825 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term54825, term54825.getClass(), "id", "");
        term54898 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term54898, term54898.getClass(), "node", null);
        setField(term54898, term54898.getClass(), "namespaces", null);
        setField(term54898, term54898.getClass(), "defaultNamespace", null);
        setField(term54898, term54898.getClass(), "id", "");
        setIntField(term54898, term54898.getClass(), "index", 0);
        setBooleanField(term54898, term54898.getClass(), "attribute", false);
        setField(term54898, term54898.getClass(), "rootNode", null);
        setField(term54898, term54898.getClass(), "namespaceResolver", null);
        setField(term54898, term54898.getClass(), "parent", null);
        setField(term54898, term54898.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asPath", argTypes, term54825, args);
        assertTrue(recursiveEquals(term54825, term54898));
        assertTrue(recursiveEquals(retValue, "id(\'\')"));
    }

};


