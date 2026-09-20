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

public class DOMNodePointer_createChild_299276445317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118997;
     Object term119187;
     Object term119224;

    public DOMNodePointer_createChild_299276445317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118997 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term119224 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term119224, term119224.getClass(), "prefix", null);
        setField(term119224, term119224.getClass(), "name", null);
        setField(term118997, term118997.getClass(), "node", term119224);
        setField(term118997, term118997.getClass(), "id", null);
        setField(term118997, term118997.getClass(), "parent", null);
        term119187 = newInstance(Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object term117854 = Mockito.mock(Class.forName("org.apache.commons.jxpath.AbstractFactory"));
        setField(term119187, term119187.getClass(), "factory", term117854);
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
        args[0] = term119187;
        args[1] = term119224;
        args[2] = 2147483647;
        args[3] = null;
        callMethod(klass, "createChild", argTypes, term118997, args);
    }

};
