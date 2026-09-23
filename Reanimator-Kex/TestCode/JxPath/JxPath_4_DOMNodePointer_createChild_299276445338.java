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

public class DOMNodePointer_createChild_299276445338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109904;
     Object term110218;

    public DOMNodePointer_createChild_299276445338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109904 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term110016 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term110102 = newInstance(Class.forName("org.apache.html.dom.HTMLOListElementImpl"));
        setField(term109904, term109904.getClass(), "id", null);
        setField(term110016, term110016.getClass(), "id", null);
        setField(term110016, term110016.getClass(), "parent", null);
        setField(term110016, term110016.getClass(), "node", term110102);
        setField(term109904, term109904.getClass(), "parent", term110016);
        term110218 = newInstance(Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(term110218, term110218.getClass(), "factory", null);
        setField(term110218, term110218.getClass(), "parentContext", null);
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
        args[0] = term110218;
        args[1] = null;
        args[2] = 2147483647;
        args[3] = null;
        try {
            callMethod(klass, "createChild", argTypes, term109904, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


