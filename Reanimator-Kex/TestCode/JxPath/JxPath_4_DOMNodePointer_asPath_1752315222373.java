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

public class DOMNodePointer_asPath_1752315222373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133302;

    public DOMNodePointer_asPath_1752315222373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133302 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term133414 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term133502 = newInstance(Class.forName("org.apache.html.dom.HTMLIFrameElementImpl"));
        Object term133590 = newInstance(Class.forName("org.apache.html.dom.HTMLButtonElementImpl"));
        setField(term133302, term133302.getClass(), "id", null);
        setField(term133414, term133414.getClass(), "id", null);
        setField(term133414, term133414.getClass(), "parent", null);
        setField(term133414, term133414.getClass(), "node", term133502);
        setField(term133302, term133302.getClass(), "parent", term133414);
        setField(term133302, term133302.getClass(), "node", term133590);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "asPath", argTypes, term133302, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


