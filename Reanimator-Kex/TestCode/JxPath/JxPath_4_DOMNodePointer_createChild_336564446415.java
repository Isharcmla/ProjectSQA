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

public class DOMNodePointer_createChild_336564446415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175583;
     Object term175783;
     Object term175857;

    public DOMNodePointer_createChild_336564446415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175583 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term175667 = newInstance(Class.forName("org.apache.wml.dom.WMLAccessElementImpl"));
        setField(term175583, term175583.getClass(), "node", term175667);
        term175783 = newInstance(Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object term175442 = Mockito.mock(Class.forName("org.apache.commons.jxpath.AbstractFactory"));
        setField(term175783, term175783.getClass(), "factory", term175442);
        term175857 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term175857, term175857.getClass(), "qualifiedName", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term175783;
        args[1] = term175857;
        args[2] = -2147483648;
        callMethod(klass, "createChild", argTypes, term175583, args);
    }

};


