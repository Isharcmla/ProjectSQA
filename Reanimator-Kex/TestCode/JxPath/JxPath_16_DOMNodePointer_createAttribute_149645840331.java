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

public class DOMNodePointer_createAttribute_149645840331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94215;
     Object term94373;

    public DOMNodePointer_createAttribute_149645840331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94215 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term94299 = newInstance(Class.forName("org.apache.html.dom.HTMLMetaElementImpl"));
        setField(term94215, term94215.getClass(), "node", term94299);
        setField(term94215, term94215.getClass(), "localNamespaceResolver", null);
        setField(term94215, term94215.getClass(), "namespaceResolver", null);
        setField(term94215, term94215.getClass(), "parent", null);
        setField(term94215, term94215.getClass(), "defaultNamespace", null);
        term94373 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term94373, term94373.getClass(), "prefix", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term94373;
        try {
            callMethod(klass, "createAttribute", argTypes, term94215, args);
            assertTrue(false);
        }
        catch (JXPathException e) {
        }

    }

};


