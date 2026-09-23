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

public class DOMAttributeIterator_testAttr_885165476101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52550;
     Object term52744;
     Object term52856;
     Object term52898;
     Object term52902;
     Object term52905;

    public DOMAttributeIterator_testAttr_885165476101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52550 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term52624 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term52624, term52624.getClass(), "name", "");
        setField(term52550, term52550.getClass(), "name", term52624);
        term52744 = newInstance(Class.forName("org.apache.xerces.dom.DeferredAttrImpl"));
        setShortField(term52744, term52744.getClass(), "flags", (short) 0);
        setField(term52744, term52744.getClass(), "name", "");
        term52856 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        term52898 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term52899 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term52898, term52898.getClass(), "parent", null);
        setField(term52899, term52899.getClass(), "prefix", null);
        setField(term52899, term52899.getClass(), "name", "");
        setField(term52899, term52899.getClass(), "qualifiedName", null);
        setField(term52898, term52898.getClass(), "name", term52899);
        setField(term52898, term52898.getClass(), "attributes", null);
        setIntField(term52898, term52898.getClass(), "position", 0);
        term52902 = newInstance(Class.forName("org.apache.xerces.dom.DeferredAttrImpl"));
        setIntField(term52902, term52902.getClass(), "fNodeIndex", 0);
        setField(term52902, term52902.getClass(), "value", null);
        setField(term52902, term52902.getClass(), "name", "");
        setField(term52902, term52902.getClass(), "type", null);
        setField(term52902, term52902.getClass(), "ownerNode", null);
        setShortField(term52902, term52902.getClass(), "flags", (short) 0);
        term52905 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term52905, term52905.getClass(), "prefix", null);
        setField(term52905, term52905.getClass(), "name", null);
        setField(term52905, term52905.getClass(), "qualifiedName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Attr");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term52744;
        args[1] = term52856;
        Object retValue = callMethod(klass, "testAttr", argTypes, term52550, args);
        assertTrue(recursiveEquals(term52550, term52898));
        assertTrue(recursiveEquals(term52744, term52902));
        assertTrue(recursiveEquals(term52856, term52905));
        assertTrue(recursiveEquals(retValue, true));
    }

};


