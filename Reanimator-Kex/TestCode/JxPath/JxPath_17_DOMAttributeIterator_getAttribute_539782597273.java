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

public class DOMAttributeIterator_getAttribute_539782597273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148194;
     Object term148880;
     Object term148954;

    public DOMAttributeIterator_getAttribute_539782597273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term148572 = new HashMap();
        ((HashMap) term148572).put((Object)null, (Object)null);
        ((HashMap) term148572).put((Object)null, (Object)null);
        ((HashMap) term148572).put("", "");
        ((HashMap) term148572).put((Object)null, (Object)null);
        ((HashMap) term148572).put("", "");
        ((HashMap) term148572).put((Object)null, (Object)null);
        ((HashMap) term148572).put((Object)null, (Object)null);
        ((HashMap) term148572).put((Object)null, (Object)null);
        term148194 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term148310 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.NamespacePointer"));
        Object term148426 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.NamespacePointer"));
        Object term148524 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term148310, term148310.getClass(), "namespaceResolver", null);
        setField(term148524, term148524.getClass(), "namespaceMap", term148572);
        setField(term148426, term148426.getClass(), "namespaceResolver", term148524);
        setField(term148310, term148310.getClass(), "parent", term148426);
        setField(term148194, term148194.getClass(), "parent", term148310);
        term148880 = newInstance(Class.forName("org.apache.html.dom.HTMLHeadingElementImpl"));
        setShortField(term148880, term148880.getClass(), "flags", (short) 2);
        term148954 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term148954, term148954.getClass(), "prefix", "");
        setField(term148954, term148954.getClass(), "name", "en");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Element");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term148880;
        args[1] = term148954;
        try {
            callMethod(klass, "getAttribute", argTypes, term148194, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


