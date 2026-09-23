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

public class DOMNodePointer_getRelativePositionOfPI_202037106377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137372;

    public DOMNodePointer_getRelativePositionOfPI_202037106377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137372 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term137462 = newInstance(Class.forName("org.apache.html.dom.HTMLIsIndexElementImpl"));
        Object term137552 = newInstance(Class.forName("org.apache.html.dom.HTMLIsIndexElementImpl"));
        Object term137642 = newInstance(Class.forName("org.apache.html.dom.HTMLIsIndexElementImpl"));
        Object term137732 = newInstance(Class.forName("org.apache.html.dom.HTMLIsIndexElementImpl"));
        setShortField(term137462, term137462.getClass(), "flags", (short) 0);
        setShortField(term137552, term137552.getClass(), "flags", (short) 0);
        setShortField(term137642, term137642.getClass(), "flags", (short) 0);
        setField(term137642, term137642.getClass(), "previousSibling", term137732);
        setField(term137552, term137552.getClass(), "previousSibling", term137642);
        setField(term137462, term137462.getClass(), "previousSibling", term137552);
        setField(term137372, term137372.getClass(), "node", term137462);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getRelativePositionOfPI", argTypes, term137372, args);
    }

};


