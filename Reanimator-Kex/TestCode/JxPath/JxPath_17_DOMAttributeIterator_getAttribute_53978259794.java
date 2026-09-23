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

public class DOMAttributeIterator_getAttribute_53978259794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23649;
     Object term23945;

    public DOMAttributeIterator_getAttribute_53978259794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23649 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term23765 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.NamespacePointer"));
        Object term23871 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.VariablePointer"));
        setField(term23765, term23765.getClass(), "namespaceResolver", null);
        setField(term23765, term23765.getClass(), "parent", term23871);
        setField(term23649, term23649.getClass(), "parent", term23765);
        term23945 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term23945, term23945.getClass(), "prefix", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Element");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term23945;
        try {
            callMethod(klass, "getAttribute", argTypes, term23649, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


