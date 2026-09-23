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

public class DOMNodePointer_createChild_299276445278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82762;
     Object term83028;

    public DOMNodePointer_createChild_299276445278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82762 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term82874 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term82762, term82762.getClass(), "id", null);
        setField(term82874, term82874.getClass(), "id", "");
        setField(term82762, term82762.getClass(), "parent", term82874);
        term83028 = newInstance(Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(term83028, term83028.getClass(), "factory", null);
        setField(term83028, term83028.getClass(), "parentContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.Object");
        Object[] args = new Object[4];
        args[0] = term83028;
        args[1] = null;
        args[2] = 2147483647;
        args[3] = null;
        try {
            callMethod(klass, "createChild", argTypes, term82762, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


