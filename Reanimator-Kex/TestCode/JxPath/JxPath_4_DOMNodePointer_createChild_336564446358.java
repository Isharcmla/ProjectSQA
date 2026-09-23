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

public class DOMNodePointer_createChild_336564446358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122659;
     Object term122851;
     Object term122925;

    public DOMNodePointer_createChild_336564446358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122659 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term122735 = newInstance(Class.forName("org.apache.wml.dom.WMLDoElementImpl"));
        setField(term122659, term122659.getClass(), "node", term122735);
        setField(term122659, term122659.getClass(), "id", null);
        setField(term122659, term122659.getClass(), "parent", null);
        term122851 = newInstance(Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object term121515 = Mockito.mock(Class.forName("org.apache.commons.jxpath.AbstractFactory"));
        setField(term122851, term122851.getClass(), "factory", term121515);
        term122925 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term122925, term122925.getClass(), "qualifiedName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term122851;
        args[1] = term122925;
        args[2] = 2147483647;
        callMethod(klass, "createChild", argTypes, term122659, args);
    }

};


