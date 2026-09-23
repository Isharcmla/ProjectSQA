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

public class DOMNodePointer_asPath_1752315222367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129767;

    public DOMNodePointer_asPath_1752315222367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129767 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term129879 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term129967 = newInstance(Class.forName("org.apache.html.dom.HTMLIFrameElementImpl"));
        Object term130067 = newInstance(Class.forName("org.apache.html.dom.HTMLTableSectionElementImpl"));
        setField(term129767, term129767.getClass(), "id", null);
        setField(term129879, term129879.getClass(), "id", null);
        setField(term129879, term129879.getClass(), "parent", null);
        setField(term129879, term129879.getClass(), "node", term129967);
        setField(term129767, term129767.getClass(), "parent", term129879);
        setField(term129767, term129767.getClass(), "node", term130067);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "asPath", argTypes, term129767, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


