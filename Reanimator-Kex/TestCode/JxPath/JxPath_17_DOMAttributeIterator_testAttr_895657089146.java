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

public class DOMAttributeIterator_testAttr_895657089146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58786;
     Object term59020;
     Object term69557;
     Object term69563;

    public DOMAttributeIterator_testAttr_895657089146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58786 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term58860 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term58860, term58860.getClass(), "name", "");
        setField(term58860, term58860.getClass(), "prefix", "********************************\uFF80************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************");
        setField(term58786, term58786.getClass(), "name", term58860);
        term59020 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.AttrImpl"));
        setField(term59020, term59020.getClass(), "prefix", "********************************\uFF80************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************");
        setField(term59020, term59020.getClass(), "localpart", null);
        setField(term59020, term59020.getClass(), "rawname", "");
        term69557 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term69558 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term69557, term69557.getClass(), "parent", null);
        setField(term69558, term69558.getClass(), "prefix", "* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * \uFF80\uFFFF* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
        setField(term69558, term69558.getClass(), "name", "");
        setField(term69558, term69558.getClass(), "qualifiedName", null);
        setField(term69557, term69557.getClass(), "name", term69558);
        setField(term69557, term69557.getClass(), "attributes", null);
        setIntField(term69557, term69557.getClass(), "position", 0);
        term69563 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.AttrImpl"));
        setField(term69563, term69563.getClass(), "element", null);
        setField(term69563, term69563.getClass(), "value", null);
        setField(term69563, term69563.getClass(), "prefix", "* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * \uFF80\uFFFF* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
        setField(term69563, term69563.getClass(), "localpart", null);
        setField(term69563, term69563.getClass(), "rawname", "");
        setField(term69563, term69563.getClass(), "uri", null);
        setShortField(term69563, term69563.getClass(), "nodeType", (short) 0);
        setBooleanField(term69563, term69563.getClass(), "hidden", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Attr");
        Object[] args = new Object[1];
        args[0] = term59020;
        Object retValue = callMethod(klass, "testAttr", argTypes, term58786, args);
        assertTrue(recursiveEquals(term58786, term69557));
        assertTrue(recursiveEquals(term59020, term69563));
        assertTrue(recursiveEquals(retValue, true));
    }

};


