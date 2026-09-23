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

public class DOMAttributeIterator_testAttr_895657089161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85385;
     Object term85581;
     Object term86356;
     Object term86360;

    public DOMAttributeIterator_testAttr_895657089161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85385 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term85459 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term85459, term85459.getClass(), "name", "*");
        setField(term85385, term85385.getClass(), "name", term85459);
        term85581 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.AttrImpl"));
        setField(term85581, term85581.getClass(), "prefix", null);
        setField(term85581, term85581.getClass(), "rawname", "");
        setField(term85581, term85581.getClass(), "localpart", null);
        term86356 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term86357 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term86356, term86356.getClass(), "parent", null);
        setField(term86357, term86357.getClass(), "prefix", null);
        setField(term86357, term86357.getClass(), "name", "*");
        setField(term86357, term86357.getClass(), "qualifiedName", null);
        setField(term86356, term86356.getClass(), "name", term86357);
        setField(term86356, term86356.getClass(), "attributes", null);
        setIntField(term86356, term86356.getClass(), "position", 0);
        term86360 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.AttrImpl"));
        setField(term86360, term86360.getClass(), "element", null);
        setField(term86360, term86360.getClass(), "value", null);
        setField(term86360, term86360.getClass(), "prefix", null);
        setField(term86360, term86360.getClass(), "localpart", null);
        setField(term86360, term86360.getClass(), "rawname", "");
        setField(term86360, term86360.getClass(), "uri", null);
        setShortField(term86360, term86360.getClass(), "nodeType", (short) 0);
        setBooleanField(term86360, term86360.getClass(), "hidden", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Attr");
        Object[] args = new Object[1];
        args[0] = term85581;
        Object retValue = callMethod(klass, "testAttr", argTypes, term85385, args);
        assertTrue(recursiveEquals(term85385, term86356));
        assertTrue(recursiveEquals(term85581, term86360));
        assertTrue(recursiveEquals(retValue, true));
    }

};


