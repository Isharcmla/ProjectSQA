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

public class DOMAttributeIterator_testAttr_895657089124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36825;
     Object term36985;

    public DOMAttributeIterator_testAttr_895657089124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36825 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term36899 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term36825, term36825.getClass(), "name", term36899);
        term36985 = newInstance(Class.forName("org.apache.xerces.dom.DeferredAttrNSImpl"));
        setShortField(term36985, term36985.getClass(), "flags", (short) -32768);
        setField(term36985, term36985.getClass(), "name", "mmmmmmmmmmmmmmmmmm");
        setField(term36985, term36985.getClass(), "localName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Attr");
        Object[] args = new Object[1];
        args[0] = term36985;
        try {
            callMethod(klass, "testAttr", argTypes, term36825, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


