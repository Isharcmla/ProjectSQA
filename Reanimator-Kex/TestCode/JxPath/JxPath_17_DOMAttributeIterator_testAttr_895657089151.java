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

public class DOMAttributeIterator_testAttr_895657089151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73364;
     Object term73562;
     Object term73994;
     Object term73998;

    public DOMAttributeIterator_testAttr_895657089151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73364 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term73438 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term73438, term73438.getClass(), "name", "");
        setField(term73364, term73364.getClass(), "name", term73438);
        term73562 = newInstance(Class.forName("org.apache.xerces.dom.DeferredAttrNSImpl"));
        setShortField(term73562, term73562.getClass(), "flags", (short) 0);
        setField(term73562, term73562.getClass(), "name", " ");
        setField(term73562, term73562.getClass(), "localName", null);
        term73994 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term73995 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term73994, term73994.getClass(), "parent", null);
        setField(term73995, term73995.getClass(), "prefix", null);
        setField(term73995, term73995.getClass(), "name", "");
        setField(term73995, term73995.getClass(), "qualifiedName", null);
        setField(term73994, term73994.getClass(), "name", term73995);
        setField(term73994, term73994.getClass(), "attributes", null);
        setIntField(term73994, term73994.getClass(), "position", 0);
        term73998 = newInstance(Class.forName("org.apache.xerces.dom.DeferredAttrNSImpl"));
        setIntField(term73998, term73998.getClass(), "fNodeIndex", 0);
        setField(term73998, term73998.getClass(), "namespaceURI", null);
        setField(term73998, term73998.getClass(), "localName", null);
        setField(term73998, term73998.getClass(), "value", null);
        setField(term73998, term73998.getClass(), "name", " ");
        setField(term73998, term73998.getClass(), "type", null);
        setField(term73998, term73998.getClass(), "ownerNode", null);
        setShortField(term73998, term73998.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Attr");
        Object[] args = new Object[1];
        args[0] = term73562;
        Object retValue = callMethod(klass, "testAttr", argTypes, term73364, args);
        assertTrue(recursiveEquals(term73364, term73994));
        assertTrue(recursiveEquals(term73562, term73998));
        assertTrue(recursiveEquals(retValue, false));
    }

};


