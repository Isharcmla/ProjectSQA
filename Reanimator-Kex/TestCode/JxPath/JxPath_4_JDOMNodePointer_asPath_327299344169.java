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

public class JDOMNodePointer_asPath_327299344169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27250;
     Object term27649;

    public JDOMNodePointer_asPath_327299344169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27250 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term27250, term27250.getClass(), "id", "");
        term27649 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term27649, term27649.getClass(), "node", null);
        setField(term27649, term27649.getClass(), "id", "");
        setIntField(term27649, term27649.getClass(), "index", 0);
        setBooleanField(term27649, term27649.getClass(), "attribute", false);
        setField(term27649, term27649.getClass(), "rootNode", null);
        setField(term27649, term27649.getClass(), "namespaceResolver", null);
        setField(term27649, term27649.getClass(), "parent", null);
        setField(term27649, term27649.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asPath", argTypes, term27250, args);
        assertTrue(recursiveEquals(term27250, term27649));
        assertTrue(recursiveEquals(retValue, "id(\'\')"));
    }

};


