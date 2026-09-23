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

public class JDOMNodePointer_asPath_327299344207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38709;
     Object term40917;

    public JDOMNodePointer_asPath_327299344207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38709 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term38741 = newInstance(Class.forName("org.jdom.Text"));
        setField(term38709, term38709.getClass(), "id", null);
        setField(term38709, term38709.getClass(), "parent", null);
        setField(term38709, term38709.getClass(), "node", term38741);
        term40917 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term40918 = newInstance(Class.forName("org.jdom.Text"));
        setField(term40918, term40918.getClass(), "value", null);
        setField(term40918, term40918.getClass(), "parent", null);
        setField(term40917, term40917.getClass(), "node", term40918);
        setField(term40917, term40917.getClass(), "id", null);
        setField(term40917, term40917.getClass(), "localNamespaceResolver", null);
        setIntField(term40917, term40917.getClass(), "index", 0);
        setBooleanField(term40917, term40917.getClass(), "attribute", false);
        setField(term40917, term40917.getClass(), "rootNode", null);
        setField(term40917, term40917.getClass(), "namespaceResolver", null);
        setField(term40917, term40917.getClass(), "parent", null);
        setField(term40917, term40917.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asPath", argTypes, term38709, args);
        assertTrue(recursiveEquals(term38709, term40917));
        assertTrue(recursiveEquals(retValue, "/text()[1]"));
    }

};


