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

public class DOMNodePointer_asPath_1752315222125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20118;
     Object term21710;

    public DOMNodePointer_asPath_1752315222125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20118 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term20118, term20118.getClass(), "id", "");
        term21710 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term21710, term21710.getClass(), "node", null);
        setField(term21710, term21710.getClass(), "namespaces", null);
        setField(term21710, term21710.getClass(), "defaultNamespace", null);
        setField(term21710, term21710.getClass(), "id", "");
        setIntField(term21710, term21710.getClass(), "index", 0);
        setBooleanField(term21710, term21710.getClass(), "attribute", false);
        setField(term21710, term21710.getClass(), "rootNode", null);
        setField(term21710, term21710.getClass(), "namespaceResolver", null);
        setField(term21710, term21710.getClass(), "parent", null);
        setField(term21710, term21710.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asPath", argTypes, term20118, args);
        assertTrue(recursiveEquals(term20118, term21710));
        assertTrue(recursiveEquals(retValue, "id(\'\')"));
    }

};
