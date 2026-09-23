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

public class JDOMNodePointer_getLanguage_577383047155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24521;
     Object term25054;

    public JDOMNodePointer_getLanguage_577383047155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24521 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term24553 = newInstance(Class.forName("org.jdom.Text"));
        setField(term24521, term24521.getClass(), "node", term24553);
        term25054 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term25055 = newInstance(Class.forName("org.jdom.Text"));
        setField(term25055, term25055.getClass(), "value", null);
        setField(term25055, term25055.getClass(), "parent", null);
        setField(term25054, term25054.getClass(), "node", term25055);
        setField(term25054, term25054.getClass(), "id", null);
        setIntField(term25054, term25054.getClass(), "index", 0);
        setBooleanField(term25054, term25054.getClass(), "attribute", false);
        setField(term25054, term25054.getClass(), "rootNode", null);
        setField(term25054, term25054.getClass(), "namespaceResolver", null);
        setField(term25054, term25054.getClass(), "parent", null);
        setField(term25054, term25054.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLanguage", argTypes, term24521, args);
        assertTrue(recursiveEquals(term24521, term25054));
        assertTrue(recursiveEquals(retValue, null));
    }

};


