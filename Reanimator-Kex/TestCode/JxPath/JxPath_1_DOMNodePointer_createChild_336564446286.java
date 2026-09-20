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

public class DOMNodePointer_createChild_336564446286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89677;
     Object term89867;
     Object term89904;

    public DOMNodePointer_createChild_336564446286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89677 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term89904 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term89904, term89904.getClass(), "prefix", null);
        setField(term89904, term89904.getClass(), "name", null);
        setField(term89677, term89677.getClass(), "node", term89904);
        setField(term89677, term89677.getClass(), "id", null);
        setField(term89677, term89677.getClass(), "parent", null);
        term89867 = newInstance(Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object term88534 = Mockito.mock(Class.forName("org.apache.commons.jxpath.AbstractFactory"));
        setField(term89867, term89867.getClass(), "factory", term88534);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term89867;
        args[1] = term89904;
        args[2] = 2147483647;
        callMethod(klass, "createChild", argTypes, term89677, args);
    }

};
