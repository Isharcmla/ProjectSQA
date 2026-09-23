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
import java.util.HashMap;

public class DOMAttributeIterator_getAttribute_539782597269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146072;
     Object term146562;
     Object term146636;

    public DOMAttributeIterator_getAttribute_539782597269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term146334 = new HashMap();
        ((HashMap) term146334).put("", "");
        ((HashMap) term146334).put("", "");
        term146072 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term146188 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.NamespacePointer"));
        Object term146286 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term146286, term146286.getClass(), "namespaceMap", term146334);
        setField(term146188, term146188.getClass(), "namespaceResolver", term146286);
        setField(term146072, term146072.getClass(), "parent", term146188);
        term146562 = newInstance(Class.forName("org.apache.html.dom.HTMLTitleElementImpl"));
        setShortField(term146562, term146562.getClass(), "flags", (short) -32766);
        term146636 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term146636, term146636.getClass(), "prefix", "");
        setField(term146636, term146636.getClass(), "name", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Element");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term146562;
        args[1] = term146636;
        try {
            callMethod(klass, "getAttribute", argTypes, term146072, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


