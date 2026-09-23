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

public class DOMNodePointer_getRelativePositionByName_1797079143192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39597;

    public DOMNodePointer_getRelativePositionByName_1797079143192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39597 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term39679 = newInstance(Class.forName("org.apache.html.dom.HTMLDivElementImpl"));
        Object term39761 = newInstance(Class.forName("org.apache.html.dom.HTMLDivElementImpl"));
        setShortField(term39679, term39679.getClass(), "flags", (short) 0);
        setField(term39679, term39679.getClass(), "previousSibling", term39761);
        setField(term39597, term39597.getClass(), "node", term39679);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRelativePositionByName", argTypes, term39597, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


