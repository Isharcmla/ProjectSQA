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

public class DOMAttributeIterator_testAttr_895657089160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78277;
     Object term78473;
     Object term86178;
     Object term86182;

    public DOMAttributeIterator_testAttr_895657089160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78277 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term78351 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term78351, term78351.getClass(), "name", "                                                                 ");
        setField(term78277, term78277.getClass(), "name", term78351);
        term78473 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.AttrImpl"));
        setField(term78473, term78473.getClass(), "prefix", null);
        setField(term78473, term78473.getClass(), "rawname", "                                                                 ");
        setField(term78473, term78473.getClass(), "localpart", null);
        term86178 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term86179 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term86178, term86178.getClass(), "parent", null);
        setField(term86179, term86179.getClass(), "prefix", null);
        setField(term86179, term86179.getClass(), "name", "                                                                 ");
        setField(term86179, term86179.getClass(), "qualifiedName", null);
        setField(term86178, term86178.getClass(), "name", term86179);
        setField(term86178, term86178.getClass(), "attributes", null);
        setIntField(term86178, term86178.getClass(), "position", 0);
        term86182 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.AttrImpl"));
        setField(term86182, term86182.getClass(), "element", null);
        setField(term86182, term86182.getClass(), "value", null);
        setField(term86182, term86182.getClass(), "prefix", null);
        setField(term86182, term86182.getClass(), "localpart", null);
        setField(term86182, term86182.getClass(), "rawname", "                                                                 ");
        setField(term86182, term86182.getClass(), "uri", null);
        setShortField(term86182, term86182.getClass(), "nodeType", (short) 0);
        setBooleanField(term86182, term86182.getClass(), "hidden", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Attr");
        Object[] args = new Object[1];
        args[0] = term78473;
        Object retValue = callMethod(klass, "testAttr", argTypes, term78277, args);
        assertTrue(recursiveEquals(term78277, term86178));
        assertTrue(recursiveEquals(term78473, term86182));
        assertTrue(recursiveEquals(retValue, true));
    }

};


