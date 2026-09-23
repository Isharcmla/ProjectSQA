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
import org.mockito.Mockito;

public class DOMNodePointer_createChild_299276445392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150723;
     Object term150923;
     Object term150997;

    public DOMNodePointer_createChild_299276445392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150723 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term150807 = newInstance(Class.forName("org.apache.html.dom.HTMLLinkElementImpl"));
        setField(term150723, term150723.getClass(), "node", term150807);
        setField(term150723, term150723.getClass(), "id", null);
        setField(term150723, term150723.getClass(), "parent", null);
        term150923 = newInstance(Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object term149579 = Mockito.mock(Class.forName("org.apache.commons.jxpath.AbstractFactory"));
        setField(term150923, term150923.getClass(), "factory", term149579);
        term150997 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term150997, term150997.getClass(), "qualifiedName", null);
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
        args[0] = term150923;
        args[1] = term150997;
        args[2] = 2147483647;
        args[3] = null;
        callMethod(klass, "createChild", argTypes, term150723, args);
    }

};


