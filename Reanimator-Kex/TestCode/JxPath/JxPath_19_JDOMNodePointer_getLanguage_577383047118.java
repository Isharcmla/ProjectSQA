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

public class JDOMNodePointer_getLanguage_577383047118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22032;
     Object term22308;

    public JDOMNodePointer_getLanguage_577383047118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22032 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term22064 = newInstance(Class.forName("org.jdom.Text"));
        setField(term22032, term22032.getClass(), "node", term22064);
        term22308 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term22309 = newInstance(Class.forName("org.jdom.Text"));
        setField(term22309, term22309.getClass(), "value", null);
        setField(term22309, term22309.getClass(), "parent", null);
        setField(term22308, term22308.getClass(), "node", term22309);
        setField(term22308, term22308.getClass(), "id", null);
        setField(term22308, term22308.getClass(), "localNamespaceResolver", null);
        setIntField(term22308, term22308.getClass(), "index", 0);
        setBooleanField(term22308, term22308.getClass(), "attribute", false);
        setField(term22308, term22308.getClass(), "namespaceResolver", null);
        setField(term22308, term22308.getClass(), "rootNode", null);
        setField(term22308, term22308.getClass(), "parent", null);
        setField(term22308, term22308.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLanguage", argTypes, term22032, args);
        assertTrue(recursiveEquals(term22032, term22308));
        assertTrue(recursiveEquals(retValue, null));
    }

};


