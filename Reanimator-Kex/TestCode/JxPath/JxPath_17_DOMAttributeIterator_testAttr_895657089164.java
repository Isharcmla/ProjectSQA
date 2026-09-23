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

public class DOMAttributeIterator_testAttr_895657089164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86578;
     Object term86900;
     Object term87786;
     Object term87791;

    public DOMAttributeIterator_testAttr_895657089164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86578 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term86652 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        Object term86816 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(term86652, term86652.getClass(), "name", "*");
        setField(term86652, term86652.getClass(), "prefix", null);
        setField(term86578, term86578.getClass(), "name", term86652);
        setField(term86578, term86578.getClass(), "parent", term86816);
        term86900 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.AttrImpl"));
        setField(term86900, term86900.getClass(), "prefix", "");
        setField(term86900, term86900.getClass(), "localpart", null);
        setField(term86900, term86900.getClass(), "rawname", "");
        term87786 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term87787 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term87788 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term87787, term87787.getClass(), "propertyName", null);
        setBooleanField(term87787, term87787.getClass(), "byNameAttribute", false);
        setIntField(term87787, term87787.getClass(), "propertyIndex", 0);
        setField(term87787, term87787.getClass(), "bean", null);
        setField(term87787, term87787.getClass(), "value", null);
        setIntField(term87787, term87787.getClass(), "index", 0);
        setBooleanField(term87787, term87787.getClass(), "attribute", false);
        setField(term87787, term87787.getClass(), "rootNode", null);
        setField(term87787, term87787.getClass(), "namespaceResolver", null);
        setField(term87787, term87787.getClass(), "parent", null);
        setField(term87787, term87787.getClass(), "locale", null);
        setField(term87786, term87786.getClass(), "parent", term87787);
        setField(term87788, term87788.getClass(), "prefix", null);
        setField(term87788, term87788.getClass(), "name", "*");
        setField(term87788, term87788.getClass(), "qualifiedName", null);
        setField(term87786, term87786.getClass(), "name", term87788);
        setField(term87786, term87786.getClass(), "attributes", null);
        setIntField(term87786, term87786.getClass(), "position", 0);
        term87791 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.AttrImpl"));
        setField(term87791, term87791.getClass(), "element", null);
        setField(term87791, term87791.getClass(), "value", null);
        setField(term87791, term87791.getClass(), "prefix", "");
        setField(term87791, term87791.getClass(), "localpart", null);
        setField(term87791, term87791.getClass(), "rawname", "");
        setField(term87791, term87791.getClass(), "uri", null);
        setShortField(term87791, term87791.getClass(), "nodeType", (short) 0);
        setBooleanField(term87791, term87791.getClass(), "hidden", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Attr");
        Object[] args = new Object[1];
        args[0] = term86900;
        Object retValue = callMethod(klass, "testAttr", argTypes, term86578, args);
        assertTrue(recursiveEquals(term86578, term87786));
        assertTrue(recursiveEquals(term86900, term87791));
        assertTrue(recursiveEquals(retValue, true));
    }

};


