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

public class DOMNodePointer_getName_133421023895 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14961;
     Object term16623;
     Object term16616;

    public DOMNodePointer_getName_133421023895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14961 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term15043 = newInstance(Class.forName("org.apache.xerces.dom.DeferredAttrImpl"));
        setField(term14961, term14961.getClass(), "node", term15043);
        term16623 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term16624 = newInstance(Class.forName("org.apache.xerces.dom.DeferredAttrImpl"));
        setIntField(term16624, term16624.getClass(), "fNodeIndex", 0);
        setField(term16624, term16624.getClass(), "value", null);
        setField(term16624, term16624.getClass(), "name", null);
        setField(term16624, term16624.getClass(), "type", null);
        setField(term16624, term16624.getClass(), "ownerNode", null);
        setShortField(term16624, term16624.getClass(), "flags", (short) 0);
        setField(term16623, term16623.getClass(), "node", term16624);
        setField(term16623, term16623.getClass(), "namespaces", null);
        setField(term16623, term16623.getClass(), "defaultNamespace", null);
        setField(term16623, term16623.getClass(), "id", null);
        setField(term16623, term16623.getClass(), "localNamespaceResolver", null);
        setIntField(term16623, term16623.getClass(), "index", 0);
        setBooleanField(term16623, term16623.getClass(), "attribute", false);
        setField(term16623, term16623.getClass(), "namespaceResolver", null);
        setField(term16623, term16623.getClass(), "rootNode", null);
        setField(term16623, term16623.getClass(), "parent", null);
        setField(term16623, term16623.getClass(), "locale", null);
        term16616 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term16616, term16616.getClass(), "prefix", null);
        setField(term16616, term16616.getClass(), "name", null);
        setField(term16616, term16616.getClass(), "qualifiedName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getName", argTypes, term14961, args);
        assertTrue(recursiveEquals(term14961, term16623));
        assertTrue(recursiveEquals(retValue, term16616));
    }

};


