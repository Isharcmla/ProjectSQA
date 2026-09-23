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

public class DOMNodePointer_createChild_299276445381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140510;
     Object term140910;

    public DOMNodePointer_createChild_299276445381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140510 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term140622 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term140708 = newInstance(Class.forName("org.apache.html.dom.HTMLUListElementImpl"));
        Object term140794 = newInstance(Class.forName("org.apache.wml.dom.WMLOneventElementImpl"));
        setField(term140510, term140510.getClass(), "id", null);
        setField(term140622, term140622.getClass(), "id", null);
        setField(term140622, term140622.getClass(), "parent", null);
        setField(term140622, term140622.getClass(), "node", term140708);
        setField(term140510, term140510.getClass(), "parent", term140622);
        setField(term140510, term140510.getClass(), "node", term140794);
        term140910 = newInstance(Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(term140910, term140910.getClass(), "factory", null);
        setField(term140910, term140910.getClass(), "parentContext", null);
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
        args[0] = term140910;
        args[1] = null;
        args[2] = 2147483647;
        args[3] = null;
        callMethod(klass, "createChild", argTypes, term140510, args);
    }

};


