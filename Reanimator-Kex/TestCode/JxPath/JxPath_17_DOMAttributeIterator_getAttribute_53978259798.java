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

public class DOMAttributeIterator_getAttribute_53978259798 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25797;
     Object term26097;

    public DOMAttributeIterator_getAttribute_53978259798() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25797 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term25913 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.NamespacePointer"));
        Object term26023 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        setField(term25913, term25913.getClass(), "namespaceResolver", null);
        setField(term25913, term25913.getClass(), "parent", term26023);
        setField(term25797, term25797.getClass(), "parent", term25913);
        term26097 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term26097, term26097.getClass(), "prefix", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Element");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term26097;
        try {
            callMethod(klass, "getAttribute", argTypes, term25797, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


