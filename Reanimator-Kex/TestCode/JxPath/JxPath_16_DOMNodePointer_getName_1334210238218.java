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

public class DOMNodePointer_getName_1334210238218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45071;
     Object term47393;
     Object term47379;

    public DOMNodePointer_getName_1334210238218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45071 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term45149 = newInstance(Class.forName("org.apache.wml.dom.WMLImgElementImpl"));
        setShortField(term45149, term45149.getClass(), "flags", (short) 0);
        setField(term45149, term45149.getClass(), "name", "");
        setField(term45071, term45071.getClass(), "node", term45149);
        term47393 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term47394 = newInstance(Class.forName("org.apache.wml.dom.WMLImgElementImpl"));
        setField(term47394, term47394.getClass(), "name", "");
        setField(term47394, term47394.getClass(), "attributes", null);
        setField(term47394, term47394.getClass(), "ownerDocument", null);
        setField(term47394, term47394.getClass(), "firstChild", null);
        setField(term47394, term47394.getClass(), "fNodeListCache", null);
        setField(term47394, term47394.getClass(), "previousSibling", null);
        setField(term47394, term47394.getClass(), "nextSibling", null);
        setField(term47394, term47394.getClass(), "ownerNode", null);
        setShortField(term47394, term47394.getClass(), "flags", (short) 0);
        setField(term47393, term47393.getClass(), "node", term47394);
        setField(term47393, term47393.getClass(), "namespaces", null);
        setField(term47393, term47393.getClass(), "defaultNamespace", null);
        setField(term47393, term47393.getClass(), "id", null);
        setField(term47393, term47393.getClass(), "localNamespaceResolver", null);
        setIntField(term47393, term47393.getClass(), "index", 0);
        setBooleanField(term47393, term47393.getClass(), "attribute", false);
        setField(term47393, term47393.getClass(), "rootNode", null);
        setField(term47393, term47393.getClass(), "namespaceResolver", null);
        setField(term47393, term47393.getClass(), "parent", null);
        setField(term47393, term47393.getClass(), "locale", null);
        term47379 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term47379, term47379.getClass(), "prefix", null);
        setField(term47379, term47379.getClass(), "name", "");
        setField(term47379, term47379.getClass(), "qualifiedName", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getName", argTypes, term45071, args);
        assertTrue(recursiveEquals(term45071, term47393));
        assertTrue(recursiveEquals(retValue, term47379));
    }

};


