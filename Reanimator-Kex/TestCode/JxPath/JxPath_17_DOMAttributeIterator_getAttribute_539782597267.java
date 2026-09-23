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

public class DOMAttributeIterator_getAttribute_539782597267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144814;
     Object term145314;
     Object term145388;

    public DOMAttributeIterator_getAttribute_539782597267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term145086 = new HashMap();
        ((HashMap) term145086).put("", "");
        ((HashMap) term145086).put("", "");
        term144814 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term144940 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        Object term145038 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term145038, term145038.getClass(), "namespaceMap", term145086);
        setField(term144940, term144940.getClass(), "namespaceResolver", term145038);
        setField(term144814, term144814.getClass(), "parent", term144940);
        term145314 = newInstance(Class.forName("org.apache.html.dom.HTMLLabelElementImpl"));
        setShortField(term145314, term145314.getClass(), "flags", (short) -32766);
        term145388 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term145388, term145388.getClass(), "prefix", "");
        setField(term145388, term145388.getClass(), "name", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Element");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term145314;
        args[1] = term145388;
        try {
            callMethod(klass, "getAttribute", argTypes, term144814, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


