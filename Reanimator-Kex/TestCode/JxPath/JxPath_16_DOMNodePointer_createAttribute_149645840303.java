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

public class DOMNodePointer_createAttribute_149645840303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79167;
     Object term79241;

    public DOMNodePointer_createAttribute_149645840303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79167 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term79167, term79167.getClass(), "node", null);
        setField(term79167, term79167.getClass(), "localNamespaceResolver", null);
        setField(term79167, term79167.getClass(), "namespaceResolver", null);
        setField(term79167, term79167.getClass(), "parent", null);
        setField(term79167, term79167.getClass(), "defaultNamespace", null);
        term79241 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term79241, term79241.getClass(), "prefix", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term79241;
        try {
            callMethod(klass, "createAttribute", argTypes, term79167, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


