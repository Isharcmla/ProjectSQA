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

public class DOMAttributeIterator_testAttr_88516547672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15782;
     Object term15976;
     Object term17218;
     Object term17222;

    public DOMAttributeIterator_testAttr_88516547672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15782 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term15856 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term15856, term15856.getClass(), "name", "");
        setField(term15782, term15782.getClass(), "name", term15856);
        term15976 = newInstance(Class.forName("org.apache.xerces.dom.DeferredAttrImpl"));
        setShortField(term15976, term15976.getClass(), "flags", (short) -32768);
        setField(term15976, term15976.getClass(), "name", "         ");
        term17218 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term17219 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term17218, term17218.getClass(), "parent", null);
        setField(term17219, term17219.getClass(), "prefix", null);
        setField(term17219, term17219.getClass(), "name", "");
        setField(term17219, term17219.getClass(), "qualifiedName", null);
        setField(term17218, term17218.getClass(), "name", term17219);
        setField(term17218, term17218.getClass(), "attributes", null);
        setIntField(term17218, term17218.getClass(), "position", 0);
        term17222 = newInstance(Class.forName("org.apache.xerces.dom.DeferredAttrImpl"));
        setIntField(term17222, term17222.getClass(), "fNodeIndex", 0);
        setField(term17222, term17222.getClass(), "value", null);
        setField(term17222, term17222.getClass(), "name", "         ");
        setField(term17222, term17222.getClass(), "type", null);
        setField(term17222, term17222.getClass(), "ownerNode", null);
        setShortField(term17222, term17222.getClass(), "flags", (short) -32768);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Attr");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term15976;
        args[1] = null;
        Object retValue = callMethod(klass, "testAttr", argTypes, term15782, args);
        assertTrue(recursiveEquals(term15782, term17218));
        assertTrue(recursiveEquals(term15976, term17222));
        assertTrue(recursiveEquals(retValue, false));
    }

};


