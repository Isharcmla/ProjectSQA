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

public class DOMNodePointer_matchesQName_842482563222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51661;

    public DOMNodePointer_matchesQName_842482563222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51661 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term51735 = newInstance(Class.forName("org.apache.wml.dom.WMLDocumentImpl"));
        Object term51807 = newInstance(Class.forName("org.apache.xerces.dom.ElementImpl"));
        setShortField(term51735, term51735.getClass(), "flags", (short) 0);
        setField(term51735, term51735.getClass(), "docElement", term51807);
        setField(term51661, term51661.getClass(), "node", term51735);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "matchesQName", argTypes, term51661, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


