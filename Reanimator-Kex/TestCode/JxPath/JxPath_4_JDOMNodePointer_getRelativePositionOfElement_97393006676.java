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
import java.lang.ClassCastException;
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class JDOMNodePointer_getRelativePositionOfElement_97393006676 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2177;

    public JDOMNodePointer_getRelativePositionOfElement_97393006676() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2199 = new HashMap();
        HashMap term2204 = new HashMap();
        HashMap term2210 = new HashMap();
        HashMap term2215 = new HashMap();
        HashMap term2221 = new HashMap();
        HashMap term2226 = new HashMap();
        term2177 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term2178 = newInstance(Class.forName("java.lang.Object"));
        Object term2193 = newInstance(Class.forName("java.lang.Object"));
        Object term2194 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2195 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2196 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2197 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2177, term2177.getClass(), "node", term2178);
        setField(term2177, term2177.getClass(), "id", "GzFkzHGYFt");
        setIntField(term2177, term2177.getClass(), "index", -1275173084);
        setBooleanField(term2177, term2177.getClass(), "attribute", false);
        setField(term2177, term2177.getClass(), "rootNode", term2193);
        setField(term2197, term2197.getClass(), "parent", null);
        setField(term2197, term2197.getClass(), "namespaceMap", null);
        setField(term2197, term2197.getClass(), "reverseMap", null);
        setField(term2197, term2197.getClass(), "pointer", null);
        setField(term2197, term2197.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2197, term2197.getClass(), "sealed", false);
        setField(term2196, term2196.getClass(), "parent", term2197);
        setField(term2196, term2196.getClass(), "namespaceMap", term2199);
        setField(term2196, term2196.getClass(), "reverseMap", term2204);
        setField(term2196, term2196.getClass(), "pointer", null);
        setField(term2196, term2196.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2196, term2196.getClass(), "sealed", false);
        setField(term2195, term2195.getClass(), "parent", term2196);
        setField(term2195, term2195.getClass(), "namespaceMap", term2210);
        setField(term2195, term2195.getClass(), "reverseMap", term2215);
        setField(term2195, term2195.getClass(), "pointer", null);
        setField(term2195, term2195.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2195, term2195.getClass(), "sealed", false);
        setField(term2194, term2194.getClass(), "parent", term2195);
        setField(term2194, term2194.getClass(), "namespaceMap", term2221);
        setField(term2194, term2194.getClass(), "reverseMap", term2226);
        setField(term2194, term2194.getClass(), "pointer", null);
        setField(term2194, term2194.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2194, term2194.getClass(), "sealed", false);
        setField(term2177, term2177.getClass(), "namespaceResolver", term2194);
        setField(term2177, term2177.getClass(), "parent", null);
        setField(term2177, term2177.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRelativePositionOfElement", argTypes, term2177, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


