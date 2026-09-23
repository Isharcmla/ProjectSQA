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

public class DOMAttributeIterator_testAttr_895657089176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91895;
     Object term91973;

    public DOMAttributeIterator_testAttr_895657089176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91895 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        term91973 = newInstance(Class.forName("org.apache.xerces.dom.PSVIAttrNSImpl"));
        setShortField(term91973, term91973.getClass(), "flags", (short) 0);
        setField(term91973, term91973.getClass(), "name", "");
        setField(term91973, term91973.getClass(), "localName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Attr");
        Object[] args = new Object[1];
        args[0] = term91973;
        try {
            callMethod(klass, "testAttr", argTypes, term91895, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


