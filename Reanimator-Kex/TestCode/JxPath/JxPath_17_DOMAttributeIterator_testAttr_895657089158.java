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

public class DOMAttributeIterator_testAttr_895657089158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76863;
     Object term77223;
     Object term83671;
     Object term83678;

    public DOMAttributeIterator_testAttr_895657089158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76863 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term76937 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        Object term77139 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        setField(term76937, term76937.getClass(), "name", "");
        setField(term76937, term76937.getClass(), "prefix", "\uFF80********************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************");
        setField(term76863, term76863.getClass(), "name", term76937);
        setField(term76863, term76863.getClass(), "parent", term77139);
        term77223 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.AttrImpl"));
        setField(term77223, term77223.getClass(), "prefix", " *****************");
        setField(term77223, term77223.getClass(), "localpart", null);
        setField(term77223, term77223.getClass(), "rawname", "");
        term83671 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term83672 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        Object term83673 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term83672, term83672.getClass(), "attr", null);
        setIntField(term83672, term83672.getClass(), "index", 0);
        setBooleanField(term83672, term83672.getClass(), "attribute", false);
        setField(term83672, term83672.getClass(), "rootNode", null);
        setField(term83672, term83672.getClass(), "namespaceResolver", null);
        setField(term83672, term83672.getClass(), "parent", null);
        setField(term83672, term83672.getClass(), "locale", null);
        setField(term83671, term83671.getClass(), "parent", term83672);
        setField(term83673, term83673.getClass(), "prefix", "\uFF80\uFFFF* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
        setField(term83673, term83673.getClass(), "name", "");
        setField(term83673, term83673.getClass(), "qualifiedName", null);
        setField(term83671, term83671.getClass(), "name", term83673);
        setField(term83671, term83671.getClass(), "attributes", null);
        setIntField(term83671, term83671.getClass(), "position", 0);
        term83678 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.AttrImpl"));
        setField(term83678, term83678.getClass(), "element", null);
        setField(term83678, term83678.getClass(), "value", null);
        setField(term83678, term83678.getClass(), "prefix", " *****************");
        setField(term83678, term83678.getClass(), "localpart", null);
        setField(term83678, term83678.getClass(), "rawname", "");
        setField(term83678, term83678.getClass(), "uri", null);
        setShortField(term83678, term83678.getClass(), "nodeType", (short) 0);
        setBooleanField(term83678, term83678.getClass(), "hidden", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Attr");
        Object[] args = new Object[1];
        args[0] = term77223;
        Object retValue = callMethod(klass, "testAttr", argTypes, term76863, args);
        assertTrue(recursiveEquals(term76863, term83671));
        assertTrue(recursiveEquals(term77223, term83678));
        assertTrue(recursiveEquals(retValue, true));
    }

};


