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

public class JDOMNodePointer_getValue_2106274462179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28662;
     Object term28782;

    public JDOMNodePointer_getValue_2106274462179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28662 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term28700 = newInstance(Class.forName("org.jdom.Comment"));
        setField(term28700, term28700.getClass(), "text", "");
        setField(term28662, term28662.getClass(), "node", term28700);
        term28782 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term28783 = newInstance(Class.forName("org.jdom.Comment"));
        setField(term28783, term28783.getClass(), "text", "");
        setField(term28783, term28783.getClass(), "parent", null);
        setField(term28782, term28782.getClass(), "node", term28783);
        setField(term28782, term28782.getClass(), "id", null);
        setIntField(term28782, term28782.getClass(), "index", 0);
        setBooleanField(term28782, term28782.getClass(), "attribute", false);
        setField(term28782, term28782.getClass(), "rootNode", null);
        setField(term28782, term28782.getClass(), "namespaceResolver", null);
        setField(term28782, term28782.getClass(), "parent", null);
        setField(term28782, term28782.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getValue", argTypes, term28662, args);
        assertTrue(recursiveEquals(term28662, term28782));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


