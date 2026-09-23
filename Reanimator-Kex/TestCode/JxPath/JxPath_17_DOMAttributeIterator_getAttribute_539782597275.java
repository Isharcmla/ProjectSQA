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

public class DOMAttributeIterator_getAttribute_539782597275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149632;
     Object term150130;
     Object term150204;

    public DOMAttributeIterator_getAttribute_539782597275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term149904 = new HashMap();
        ((HashMap) term149904).put("", "");
        ((HashMap) term149904).put("", "");
        term149632 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term149758 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        Object term149856 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term149856, term149856.getClass(), "namespaceMap", term149904);
        setField(term149758, term149758.getClass(), "namespaceResolver", term149856);
        setField(term149632, term149632.getClass(), "parent", term149758);
        term150130 = newInstance(Class.forName("org.apache.html.dom.HTMLBodyElementImpl"));
        setShortField(term150130, term150130.getClass(), "flags", (short) -32766);
        term150204 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term150204, term150204.getClass(), "prefix", "");
        setField(term150204, term150204.getClass(), "name", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Element");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term150130;
        args[1] = term150204;
        try {
            callMethod(klass, "getAttribute", argTypes, term149632, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


