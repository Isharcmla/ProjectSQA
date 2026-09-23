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

public class JDOMNodePointer_getValue_2106274462163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29871;
     Object term30190;

    public JDOMNodePointer_getValue_2106274462163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29871 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term29909 = newInstance(Class.forName("org.jdom.Comment"));
        setField(term29871, term29871.getClass(), "node", term29909);
        term30190 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term30191 = newInstance(Class.forName("org.jdom.Comment"));
        setField(term30191, term30191.getClass(), "text", null);
        setField(term30191, term30191.getClass(), "parent", null);
        setField(term30190, term30190.getClass(), "node", term30191);
        setField(term30190, term30190.getClass(), "id", null);
        setField(term30190, term30190.getClass(), "localNamespaceResolver", null);
        setIntField(term30190, term30190.getClass(), "index", 0);
        setBooleanField(term30190, term30190.getClass(), "attribute", false);
        setField(term30190, term30190.getClass(), "namespaceResolver", null);
        setField(term30190, term30190.getClass(), "rootNode", null);
        setField(term30190, term30190.getClass(), "parent", null);
        setField(term30190, term30190.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getValue", argTypes, term29871, args);
        assertTrue(recursiveEquals(term29871, term30190));
        assertTrue(recursiveEquals(retValue, null));
    }

};


