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
import org.mockito.Mockito;
import java.lang.Object;

public class DOMNodePointer_createChild_336564446407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165677;
     Object term165831;
     Object term165905;

    public DOMNodePointer_createChild_336564446407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165677 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term165677, term165677.getClass(), "node", null);
        setField(term165677, term165677.getClass(), "id", "");
        term165831 = newInstance(Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object term165030 = Mockito.mock(Class.forName("org.apache.commons.jxpath.AbstractFactory"));
        setField(term165831, term165831.getClass(), "factory", term165030);
        term165905 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term165905, term165905.getClass(), "qualifiedName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term165831;
        args[1] = term165905;
        args[2] = -2147483648;
        callMethod(klass, "createChild", argTypes, term165677, args);
    }

};


