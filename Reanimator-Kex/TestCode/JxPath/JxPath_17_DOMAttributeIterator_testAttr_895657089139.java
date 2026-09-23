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
import java.lang.NullPointerException;
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DOMAttributeIterator_testAttr_895657089139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52247;
     Object term52475;

    public DOMAttributeIterator_testAttr_895657089139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52247 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term52321 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term52321, term52321.getClass(), "name", "*");
        setField(term52321, term52321.getClass(), "prefix", "");
        setField(term52247, term52247.getClass(), "name", term52321);
        term52475 = newInstance(Class.forName("org.apache.xerces.dom.PSVIAttrNSImpl"));
        setShortField(term52475, term52475.getClass(), "flags", (short) -32768);
        setField(term52475, term52475.getClass(), "name", "*");
        setField(term52475, term52475.getClass(), "localName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Attr");
        Object[] args = new Object[1];
        args[0] = term52475;
        try {
            callMethod(klass, "testAttr", argTypes, term52247, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


