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

public class DOMNodePointer_getRelativePositionOfPI_202037106385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142039;

    public DOMNodePointer_getRelativePositionOfPI_202037106385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142039 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term142129 = newInstance(Class.forName("org.apache.html.dom.HTMLIsIndexElementImpl"));
        Object term142219 = newInstance(Class.forName("org.apache.html.dom.HTMLIsIndexElementImpl"));
        Object term142311 = newInstance(Class.forName("org.apache.html.dom.HTMLOptGroupElementImpl"));
        setShortField(term142129, term142129.getClass(), "flags", (short) 0);
        setShortField(term142219, term142219.getClass(), "flags", (short) 0);
        setField(term142219, term142219.getClass(), "previousSibling", term142311);
        setField(term142129, term142129.getClass(), "previousSibling", term142219);
        setField(term142039, term142039.getClass(), "node", term142129);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getRelativePositionOfPI", argTypes, term142039, args);
    }

};


