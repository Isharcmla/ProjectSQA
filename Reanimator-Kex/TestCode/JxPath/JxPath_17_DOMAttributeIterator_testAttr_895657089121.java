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

public class DOMAttributeIterator_testAttr_895657089121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35046;
     Object term35204;

    public DOMAttributeIterator_testAttr_895657089121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35046 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term35120 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term35046, term35046.getClass(), "name", term35120);
        term35204 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.AttrImpl"));
        setField(term35204, term35204.getClass(), "prefix", null);
        setField(term35204, term35204.getClass(), "rawname", "mmmmmmmmmmmmmmmm mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
        setField(term35204, term35204.getClass(), "localpart", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Attr");
        Object[] args = new Object[1];
        args[0] = term35204;
        try {
            callMethod(klass, "testAttr", argTypes, term35046, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


