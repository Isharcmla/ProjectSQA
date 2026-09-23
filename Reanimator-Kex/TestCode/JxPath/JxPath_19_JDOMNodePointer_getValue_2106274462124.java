package org.apache.commons.jxpath.ri.model.jdom;

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
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.jdom.EqualityUtils.*;
import java.lang.Object;

public class JDOMNodePointer_getValue_2106274462124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22655;
     Object term23406;

    public JDOMNodePointer_getValue_2106274462124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22655 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term22687 = newInstance(Class.forName("org.jdom.Text"));
        setField(term22655, term22655.getClass(), "node", term22687);
        term23406 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term23407 = newInstance(Class.forName("org.jdom.Text"));
        setField(term23407, term23407.getClass(), "value", null);
        setField(term23407, term23407.getClass(), "parent", null);
        setField(term23406, term23406.getClass(), "node", term23407);
        setField(term23406, term23406.getClass(), "id", null);
        setField(term23406, term23406.getClass(), "localNamespaceResolver", null);
        setIntField(term23406, term23406.getClass(), "index", 0);
        setBooleanField(term23406, term23406.getClass(), "attribute", false);
        setField(term23406, term23406.getClass(), "namespaceResolver", null);
        setField(term23406, term23406.getClass(), "rootNode", null);
        setField(term23406, term23406.getClass(), "parent", null);
        setField(term23406, term23406.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getValue", argTypes, term22655, args);
        assertTrue(recursiveEquals(term22655, term23406));
        assertTrue(recursiveEquals(retValue, null));
    }

};


