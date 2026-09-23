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

public class DOMAttributeIterator_testAttr_895657089142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53541;
     Object term53737;
     Object term56912;
     Object term56916;

    public DOMAttributeIterator_testAttr_895657089142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53541 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term53615 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term53615, term53615.getClass(), "name", "");
        setField(term53541, term53541.getClass(), "name", term53615);
        term53737 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.AttrImpl"));
        setField(term53737, term53737.getClass(), "prefix", null);
        setField(term53737, term53737.getClass(), "rawname", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        setField(term53737, term53737.getClass(), "localpart", null);
        term56912 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term56913 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term56912, term56912.getClass(), "parent", null);
        setField(term56913, term56913.getClass(), "prefix", null);
        setField(term56913, term56913.getClass(), "name", "");
        setField(term56913, term56913.getClass(), "qualifiedName", null);
        setField(term56912, term56912.getClass(), "name", term56913);
        setField(term56912, term56912.getClass(), "attributes", null);
        setIntField(term56912, term56912.getClass(), "position", 0);
        term56916 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.AttrImpl"));
        setField(term56916, term56916.getClass(), "element", null);
        setField(term56916, term56916.getClass(), "value", null);
        setField(term56916, term56916.getClass(), "prefix", null);
        setField(term56916, term56916.getClass(), "localpart", null);
        setField(term56916, term56916.getClass(), "rawname", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        setField(term56916, term56916.getClass(), "uri", null);
        setShortField(term56916, term56916.getClass(), "nodeType", (short) 0);
        setBooleanField(term56916, term56916.getClass(), "hidden", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Attr");
        Object[] args = new Object[1];
        args[0] = term53737;
        Object retValue = callMethod(klass, "testAttr", argTypes, term53541, args);
        assertTrue(recursiveEquals(term53541, term56912));
        assertTrue(recursiveEquals(term53737, term56916));
        assertTrue(recursiveEquals(retValue, false));
    }

};


