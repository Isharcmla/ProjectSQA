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

public class DOMNodePointer_getNamespaceURI_948009574380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138614;

    public DOMNodePointer_getNamespaceURI_948009574380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138614 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term138688 = newInstance(Class.forName("org.apache.wml.dom.WMLDocumentImpl"));
        Object term138760 = newInstance(Class.forName("org.apache.xerces.dom.ElementImpl"));
        setShortField(term138688, term138688.getClass(), "flags", (short) 0);
        setShortField(term138760, term138760.getClass(), "flags", (short) 0);
        setField(term138760, term138760.getClass(), "name", "");
        setField(term138688, term138688.getClass(), "docElement", term138760);
        setField(term138614, term138614.getClass(), "node", term138688);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNamespaceURI", argTypes, term138614, args);
    }

};


