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

public class DOMNodePointer_asPath_1752315222405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164441;

    public DOMNodePointer_asPath_1752315222405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term164441 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term164553 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term164641 = newInstance(Class.forName("org.apache.html.dom.HTMLIFrameElementImpl"));
        Object term164741 = newInstance(Class.forName("org.apache.html.dom.HTMLTableSectionElementImpl"));
        setField(term164441, term164441.getClass(), "id", null);
        setField(term164553, term164553.getClass(), "id", null);
        setField(term164553, term164553.getClass(), "parent", null);
        setField(term164553, term164553.getClass(), "node", term164641);
        setField(term164441, term164441.getClass(), "parent", term164553);
        setField(term164441, term164441.getClass(), "node", term164741);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "asPath", argTypes, term164441, args);
    }

};


