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

public class DOMNodePointer_createChild_299276445388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148170;
     Object term148562;

    public DOMNodePointer_createChild_299276445388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148170 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term148282 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term148368 = newInstance(Class.forName("org.apache.html.dom.HTMLOListElementImpl"));
        Object term148446 = newInstance(Class.forName("org.apache.wml.dom.WMLWmlElementImpl"));
        setField(term148170, term148170.getClass(), "id", null);
        setField(term148282, term148282.getClass(), "id", null);
        setField(term148282, term148282.getClass(), "parent", null);
        setField(term148282, term148282.getClass(), "node", term148368);
        setField(term148170, term148170.getClass(), "parent", term148282);
        setField(term148170, term148170.getClass(), "node", term148446);
        term148562 = newInstance(Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(term148562, term148562.getClass(), "factory", null);
        setField(term148562, term148562.getClass(), "parentContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.Object");
        Object[] args = new Object[4];
        args[0] = term148562;
        args[1] = null;
        args[2] = 2147483647;
        args[3] = null;
        callMethod(klass, "createChild", argTypes, term148170, args);
    }

};


