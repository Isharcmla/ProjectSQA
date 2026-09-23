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
import org.apache.commons.jxpath.JXPathException;
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DOMNodePointer_createAttribute_149645840298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76381;
     Object term76555;

    public DOMNodePointer_createAttribute_149645840298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76381 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term76481 = newInstance(Class.forName("org.apache.html.dom.HTMLTableCaptionElementImpl"));
        setField(term76381, term76381.getClass(), "node", term76481);
        setField(term76381, term76381.getClass(), "localNamespaceResolver", null);
        setField(term76381, term76381.getClass(), "namespaceResolver", null);
        setField(term76381, term76381.getClass(), "parent", null);
        term76555 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term76555, term76555.getClass(), "prefix", " ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term76555;
        try {
            callMethod(klass, "createAttribute", argTypes, term76381, args);
            assertTrue(false);
        }
        catch (JXPathException e) {
        }

    }

};


