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

public class DOMNodePointer_getRelativePositionOfPI_202037106378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137885;

    public DOMNodePointer_getRelativePositionOfPI_202037106378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137885 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term137975 = newInstance(Class.forName("org.apache.html.dom.HTMLIsIndexElementImpl"));
        Object term138065 = newInstance(Class.forName("org.apache.html.dom.HTMLIsIndexElementImpl"));
        Object term138151 = newInstance(Class.forName("org.apache.wml.dom.WMLOneventElementImpl"));
        setShortField(term137975, term137975.getClass(), "flags", (short) 0);
        setShortField(term138065, term138065.getClass(), "flags", (short) 0);
        setField(term138065, term138065.getClass(), "previousSibling", term138151);
        setField(term137975, term137975.getClass(), "previousSibling", term138065);
        setField(term137885, term137885.getClass(), "node", term137975);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getRelativePositionOfPI", argTypes, term137885, args);
    }

};


