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

public class JDOMNodePointer_asPath_327299344206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38489;
     Object term40884;

    public JDOMNodePointer_asPath_327299344206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38489 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term38489, term38489.getClass(), "id", "");
        term40884 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term40884, term40884.getClass(), "node", null);
        setField(term40884, term40884.getClass(), "id", "");
        setField(term40884, term40884.getClass(), "localNamespaceResolver", null);
        setIntField(term40884, term40884.getClass(), "index", 0);
        setBooleanField(term40884, term40884.getClass(), "attribute", false);
        setField(term40884, term40884.getClass(), "rootNode", null);
        setField(term40884, term40884.getClass(), "namespaceResolver", null);
        setField(term40884, term40884.getClass(), "parent", null);
        setField(term40884, term40884.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asPath", argTypes, term38489, args);
        assertTrue(recursiveEquals(term38489, term40884));
        assertTrue(recursiveEquals(retValue, "id(\'\')"));
    }

};


