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

public class DOMAttributeIterator_testAttr_88516547697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48017;
     Object term48211;
     Object term48286;
     Object term50880;
     Object term50884;
     Object term50887;

    public DOMAttributeIterator_testAttr_88516547697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48017 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        term48286 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term48286, term48286.getClass(), "name", "*");
        setField(term48017, term48017.getClass(), "name", term48286);
        term48211 = newInstance(Class.forName("org.apache.xerces.dom.DeferredAttrImpl"));
        setShortField(term48211, term48211.getClass(), "flags", (short) 0);
        setField(term48211, term48211.getClass(), "name", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        term50880 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term50881 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term50880, term50880.getClass(), "parent", null);
        setField(term50881, term50881.getClass(), "prefix", null);
        setField(term50881, term50881.getClass(), "name", "*");
        setField(term50881, term50881.getClass(), "qualifiedName", null);
        setField(term50880, term50880.getClass(), "name", term50881);
        setField(term50880, term50880.getClass(), "attributes", null);
        setIntField(term50880, term50880.getClass(), "position", 0);
        term50884 = newInstance(Class.forName("org.apache.xerces.dom.DeferredAttrImpl"));
        setIntField(term50884, term50884.getClass(), "fNodeIndex", 0);
        setField(term50884, term50884.getClass(), "value", null);
        setField(term50884, term50884.getClass(), "name", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        setField(term50884, term50884.getClass(), "type", null);
        setField(term50884, term50884.getClass(), "ownerNode", null);
        setShortField(term50884, term50884.getClass(), "flags", (short) 0);
        term50887 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term50887, term50887.getClass(), "prefix", null);
        setField(term50887, term50887.getClass(), "name", "*");
        setField(term50887, term50887.getClass(), "qualifiedName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Attr");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term48211;
        args[1] = term48286;
        Object retValue = callMethod(klass, "testAttr", argTypes, term48017, args);
        assertTrue(recursiveEquals(term48017, term50880));
        assertTrue(recursiveEquals(term48211, term50884));
        assertTrue(recursiveEquals(term48286, term50887));
        assertTrue(recursiveEquals(retValue, true));
    }

};


