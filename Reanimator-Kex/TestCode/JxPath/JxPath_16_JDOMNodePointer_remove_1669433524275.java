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

public class JDOMNodePointer_remove_1669433524275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69150;
     Object term69559;

    public JDOMNodePointer_remove_1669433524275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69150 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term69188 = newInstance(Class.forName("org.jdom.Comment"));
        Object term69226 = newInstance(Class.forName("org.jdom.Element"));
        Object term69272 = newInstance(Class.forName("org.jdom.ContentList"));
        setField(term69226, term69226.getClass(), "content", term69272);
        setField(term69188, term69188.getClass(), "parent", term69226);
        setField(term69150, term69150.getClass(), "node", term69188);
        term69559 = newInstance(Class.forName("org.jdom.ContentList"));
        setField(term69559, term69559.getClass(), "elementData", null);
        setIntField(term69559, term69559.getClass(), "size", 0);
        setField(term69559, term69559.getClass(), "parent", null);
        setIntField(term69559, term69559.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "remove", argTypes, term69150, args);
        assertTrue(recursiveEquals(term69150, term69559));
    }

};


