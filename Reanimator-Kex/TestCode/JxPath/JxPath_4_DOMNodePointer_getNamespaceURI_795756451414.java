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
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DOMNodePointer_getNamespaceURI_795756451414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175187;

    public DOMNodePointer_getNamespaceURI_795756451414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175187 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term175277 = newInstance(Class.forName("org.apache.xerces.dom.DeferredDocumentImpl"));
        Object term175369 = newInstance(Class.forName("org.apache.html.dom.HTMLTableColElementImpl"));
        setField(term175187, term175187.getClass(), "defaultNamespace", null);
        setShortField(term175277, term175277.getClass(), "flags", (short) -32768);
        setField(term175277, term175277.getClass(), "docElement", term175369);
        setField(term175187, term175187.getClass(), "node", term175277);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        callMethod(klass, "getNamespaceURI", argTypes, term175187, args);
    }

};


