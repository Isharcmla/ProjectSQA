package org.apache.commons.jxpath.ri.model.jdom;

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
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.jdom.EqualityUtils.*;
import java.lang.Object;

public class JDOMNodePointer_remove_1669433524235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46531;
     Object term46686;

    public JDOMNodePointer_remove_1669433524235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46531 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term46569 = newInstance(Class.forName("org.jdom.Comment"));
        Object term46607 = newInstance(Class.forName("org.jdom.Element"));
        Object term46653 = newInstance(Class.forName("org.jdom.ContentList"));
        setField(term46607, term46607.getClass(), "content", term46653);
        setField(term46569, term46569.getClass(), "parent", term46607);
        setField(term46531, term46531.getClass(), "node", term46569);
        term46686 = newInstance(Class.forName("org.jdom.ContentList"));
        setField(term46686, term46686.getClass(), "elementData", null);
        setIntField(term46686, term46686.getClass(), "size", 0);
        setField(term46686, term46686.getClass(), "parent", null);
        setIntField(term46686, term46686.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "remove", argTypes, term46531, args);
        assertTrue(recursiveEquals(term46531, term46686));
    }

};


