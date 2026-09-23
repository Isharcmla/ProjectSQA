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

public class DOMAttributeIterator_testAttr_895657089251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136436;
     Object term136506;
     Object term136603;
     Object term136604;

    public DOMAttributeIterator_testAttr_895657089251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136436 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        term136506 = newInstance(Class.forName("org.apache.xerces.dom.AttrNSImpl"));
        setShortField(term136506, term136506.getClass(), "flags", (short) -32768);
        setField(term136506, term136506.getClass(), "name", "xmlns");
        setField(term136506, term136506.getClass(), "localName", null);
        term136603 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        setField(term136603, term136603.getClass(), "parent", null);
        setField(term136603, term136603.getClass(), "name", null);
        setField(term136603, term136603.getClass(), "attributes", null);
        setIntField(term136603, term136603.getClass(), "position", 0);
        term136604 = newInstance(Class.forName("org.apache.xerces.dom.AttrNSImpl"));
        setField(term136604, term136604.getClass(), "namespaceURI", null);
        setField(term136604, term136604.getClass(), "localName", null);
        setField(term136604, term136604.getClass(), "value", null);
        setField(term136604, term136604.getClass(), "name", "xmlns");
        setField(term136604, term136604.getClass(), "type", null);
        setField(term136604, term136604.getClass(), "ownerNode", null);
        setShortField(term136604, term136604.getClass(), "flags", (short) -32768);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Attr");
        Object[] args = new Object[1];
        args[0] = term136506;
        Object retValue = callMethod(klass, "testAttr", argTypes, term136436, args);
        assertTrue(recursiveEquals(term136436, term136603));
        assertTrue(recursiveEquals(term136506, term136604));
        assertTrue(recursiveEquals(retValue, false));
    }

};


