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

public class DOMNodePointer_asPath_1752315222411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170578;

    public DOMNodePointer_asPath_1752315222411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term170578 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term170690 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term170778 = newInstance(Class.forName("org.apache.html.dom.HTMLIFrameElementImpl"));
        Object term170858 = newInstance(Class.forName("org.apache.wml.dom.WMLCardElementImpl"));
        setField(term170578, term170578.getClass(), "id", null);
        setField(term170690, term170690.getClass(), "id", null);
        setField(term170690, term170690.getClass(), "parent", null);
        setField(term170690, term170690.getClass(), "node", term170778);
        setField(term170578, term170578.getClass(), "parent", term170690);
        setField(term170578, term170578.getClass(), "node", term170858);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "asPath", argTypes, term170578, args);
    }

};


