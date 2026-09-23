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
import java.util.ArrayList;

public class DOMAttributeIterator_init_7810902201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103692;
     Object term103852;
     Object term104245;
     Object term104254;
     Object term104257;

    public DOMAttributeIterator_init_7810902201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term103572 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        setIntField(term103572, term103572.getClass(), "position", 0);
        setField(term103572, term103572.getClass(), "parent", null);
        setField(term103572, term103572.getClass(), "name", null);
        setField(term103572, term103572.getClass(), "attributes", null);
        term103692 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term103778 = newInstance(Class.forName("org.apache.html.dom.HTMLDListElementImpl"));
        setShortField(term103778, term103778.getClass(), "flags", (short) -32768);
        setField(term103778, term103778.getClass(), "attributes", null);
        setField(term103692, term103692.getClass(), "value", term103778);
        term103852 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term103852, term103852.getClass(), "name", "*");
        ArrayList term104252 = new ArrayList();
        term104245 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term104246 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term104247 = newInstance(Class.forName("org.apache.html.dom.HTMLDListElementImpl"));
        Object term104248 = newInstance(Class.forName("org.apache.xerces.dom.AttributeMap"));
        Object term104249 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term104246, term104246.getClass(), "name", null);
        setField(term104246, term104246.getClass(), "bean", null);
        setField(term104246, term104246.getClass(), "handler", null);
        setField(term104247, term104247.getClass(), "name", null);
        setShortField(term104248, term104248.getClass(), "flags", (short) 0);
        setField(term104248, term104248.getClass(), "nodes", null);
        setField(term104248, term104248.getClass(), "ownerNode", term104247);
        setField(term104247, term104247.getClass(), "attributes", term104248);
        setField(term104247, term104247.getClass(), "ownerDocument", null);
        setField(term104247, term104247.getClass(), "firstChild", null);
        setField(term104247, term104247.getClass(), "fNodeListCache", null);
        setField(term104247, term104247.getClass(), "previousSibling", null);
        setField(term104247, term104247.getClass(), "nextSibling", null);
        setField(term104247, term104247.getClass(), "ownerNode", null);
        setShortField(term104247, term104247.getClass(), "flags", (short) -32768);
        setField(term104246, term104246.getClass(), "value", term104247);
        setIntField(term104246, term104246.getClass(), "index", 0);
        setBooleanField(term104246, term104246.getClass(), "attribute", false);
        setField(term104246, term104246.getClass(), "rootNode", null);
        setField(term104246, term104246.getClass(), "namespaceResolver", null);
        setField(term104246, term104246.getClass(), "parent", null);
        setField(term104246, term104246.getClass(), "locale", null);
        setField(term104245, term104245.getClass(), "parent", term104246);
        setField(term104249, term104249.getClass(), "prefix", null);
        setField(term104249, term104249.getClass(), "name", "*");
        setField(term104249, term104249.getClass(), "qualifiedName", null);
        setField(term104245, term104245.getClass(), "name", term104249);
        setField(term104245, term104245.getClass(), "attributes", term104252);
        setIntField(term104245, term104245.getClass(), "position", 0);
        term104254 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term104255 = newInstance(Class.forName("org.apache.html.dom.HTMLDListElementImpl"));
        Object term104256 = newInstance(Class.forName("org.apache.xerces.dom.AttributeMap"));
        setField(term104254, term104254.getClass(), "name", null);
        setField(term104254, term104254.getClass(), "bean", null);
        setField(term104254, term104254.getClass(), "handler", null);
        setField(term104255, term104255.getClass(), "name", null);
        setShortField(term104256, term104256.getClass(), "flags", (short) 0);
        setField(term104256, term104256.getClass(), "nodes", null);
        setField(term104256, term104256.getClass(), "ownerNode", term104255);
        setField(term104255, term104255.getClass(), "attributes", term104256);
        setField(term104255, term104255.getClass(), "ownerDocument", null);
        setField(term104255, term104255.getClass(), "firstChild", null);
        setField(term104255, term104255.getClass(), "fNodeListCache", null);
        setField(term104255, term104255.getClass(), "previousSibling", null);
        setField(term104255, term104255.getClass(), "nextSibling", null);
        setField(term104255, term104255.getClass(), "ownerNode", null);
        setShortField(term104255, term104255.getClass(), "flags", (short) -32768);
        setField(term104254, term104254.getClass(), "value", term104255);
        setIntField(term104254, term104254.getClass(), "index", 0);
        setBooleanField(term104254, term104254.getClass(), "attribute", false);
        setField(term104254, term104254.getClass(), "rootNode", null);
        setField(term104254, term104254.getClass(), "namespaceResolver", null);
        setField(term104254, term104254.getClass(), "parent", null);
        setField(term104254, term104254.getClass(), "locale", null);
        term104257 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term104257, term104257.getClass(), "prefix", null);
        setField(term104257, term104257.getClass(), "name", "*");
        setField(term104257, term104257.getClass(), "qualifiedName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term103692;
        args[1] = term103852;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term104245));
        assertTrue(recursiveEquals(term103692, term104254));
        assertTrue(recursiveEquals(term103852, term104257));
    }

};


