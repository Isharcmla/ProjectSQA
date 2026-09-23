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

public class DOMNodePointer_getDefaultNamespaceURI_1808294821151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27817;
     Object term27842;

    public DOMNodePointer_getDefaultNamespaceURI_1808294821151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27817 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term27817, term27817.getClass(), "defaultNamespace", null);
        term27842 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term27842, term27842.getClass(), "node", null);
        setField(term27842, term27842.getClass(), "namespaces", null);
        setField(term27842, term27842.getClass(), "defaultNamespace", "");
        setField(term27842, term27842.getClass(), "id", null);
        setIntField(term27842, term27842.getClass(), "index", 0);
        setBooleanField(term27842, term27842.getClass(), "attribute", false);
        setField(term27842, term27842.getClass(), "rootNode", null);
        setField(term27842, term27842.getClass(), "namespaceResolver", null);
        setField(term27842, term27842.getClass(), "parent", null);
        setField(term27842, term27842.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDefaultNamespaceURI", argTypes, term27817, args);
        assertTrue(recursiveEquals(term27817, term27842));
        assertTrue(recursiveEquals(retValue, null));
    }

};


