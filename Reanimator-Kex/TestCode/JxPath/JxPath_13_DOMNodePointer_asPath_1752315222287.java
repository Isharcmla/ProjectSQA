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

public class DOMNodePointer_asPath_1752315222287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86202;

    public DOMNodePointer_asPath_1752315222287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86202 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term86314 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term86398 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.NodeImpl"));
        Object term86484 = newInstance(Class.forName("org.apache.html.dom.HTMLFrameElementImpl"));
        setField(term86202, term86202.getClass(), "id", null);
        setField(term86314, term86314.getClass(), "id", null);
        setField(term86314, term86314.getClass(), "parent", null);
        setShortField(term86398, term86398.getClass(), "nodeType", (short) 0);
        setField(term86314, term86314.getClass(), "node", term86398);
        setField(term86202, term86202.getClass(), "parent", term86314);
        setField(term86202, term86202.getClass(), "node", term86484);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "asPath", argTypes, term86202, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


