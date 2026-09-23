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

public class JDOMNodePointer_getValue_2106274462141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25773;
     Object term25835;

    public JDOMNodePointer_getValue_2106274462141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25773 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term25773, term25773.getClass(), "node", null);
        term25835 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term25835, term25835.getClass(), "node", null);
        setField(term25835, term25835.getClass(), "id", null);
        setField(term25835, term25835.getClass(), "localNamespaceResolver", null);
        setIntField(term25835, term25835.getClass(), "index", 0);
        setBooleanField(term25835, term25835.getClass(), "attribute", false);
        setField(term25835, term25835.getClass(), "namespaceResolver", null);
        setField(term25835, term25835.getClass(), "rootNode", null);
        setField(term25835, term25835.getClass(), "parent", null);
        setField(term25835, term25835.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getValue", argTypes, term25773, args);
        assertTrue(recursiveEquals(term25773, term25835));
        assertTrue(recursiveEquals(retValue, null));
    }

};


