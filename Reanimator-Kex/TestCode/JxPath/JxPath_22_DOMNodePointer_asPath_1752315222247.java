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
import java.lang.Object;

public class DOMNodePointer_asPath_1752315222247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61516;
     Object term61632;

    public DOMNodePointer_asPath_1752315222247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61516 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term61606 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.ElementImpl"));
        setField(term61516, term61516.getClass(), "id", null);
        setField(term61516, term61516.getClass(), "parent", null);
        setShortField(term61606, term61606.getClass(), "nodeType", (short) 1);
        setField(term61516, term61516.getClass(), "node", term61606);
        term61632 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term61633 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.ElementImpl"));
        setField(term61633, term61633.getClass(), "schemaDOM", null);
        setField(term61633, term61633.getClass(), "attrs", null);
        setIntField(term61633, term61633.getClass(), "row", 0);
        setIntField(term61633, term61633.getClass(), "col", 0);
        setIntField(term61633, term61633.getClass(), "parentRow", 0);
        setIntField(term61633, term61633.getClass(), "line", 0);
        setIntField(term61633, term61633.getClass(), "column", 0);
        setField(term61633, term61633.getClass(), "prefix", null);
        setField(term61633, term61633.getClass(), "localpart", null);
        setField(term61633, term61633.getClass(), "rawname", null);
        setField(term61633, term61633.getClass(), "uri", null);
        setShortField(term61633, term61633.getClass(), "nodeType", (short) 1);
        setBooleanField(term61633, term61633.getClass(), "hidden", false);
        setField(term61632, term61632.getClass(), "node", term61633);
        setField(term61632, term61632.getClass(), "namespaces", null);
        setField(term61632, term61632.getClass(), "defaultNamespace", null);
        setField(term61632, term61632.getClass(), "id", null);
        setField(term61632, term61632.getClass(), "localNamespaceResolver", null);
        setIntField(term61632, term61632.getClass(), "index", 0);
        setBooleanField(term61632, term61632.getClass(), "attribute", false);
        setField(term61632, term61632.getClass(), "namespaceResolver", null);
        setField(term61632, term61632.getClass(), "exceptionHandler", null);
        setField(term61632, term61632.getClass(), "rootNode", null);
        setField(term61632, term61632.getClass(), "parent", null);
        setField(term61632, term61632.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asPath", argTypes, term61516, args);
        assertTrue(recursiveEquals(term61516, term61632));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


