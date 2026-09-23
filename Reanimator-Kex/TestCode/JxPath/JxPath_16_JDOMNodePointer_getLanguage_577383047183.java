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

public class JDOMNodePointer_getLanguage_577383047183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33671;
     Object term34291;

    public JDOMNodePointer_getLanguage_577383047183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33671 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term33703 = newInstance(Class.forName("org.jdom.Text"));
        setField(term33671, term33671.getClass(), "node", term33703);
        term34291 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term34292 = newInstance(Class.forName("org.jdom.Text"));
        setField(term34292, term34292.getClass(), "value", null);
        setField(term34292, term34292.getClass(), "parent", null);
        setField(term34291, term34291.getClass(), "node", term34292);
        setField(term34291, term34291.getClass(), "id", null);
        setField(term34291, term34291.getClass(), "localNamespaceResolver", null);
        setIntField(term34291, term34291.getClass(), "index", 0);
        setBooleanField(term34291, term34291.getClass(), "attribute", false);
        setField(term34291, term34291.getClass(), "rootNode", null);
        setField(term34291, term34291.getClass(), "namespaceResolver", null);
        setField(term34291, term34291.getClass(), "parent", null);
        setField(term34291, term34291.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLanguage", argTypes, term33671, args);
        assertTrue(recursiveEquals(term33671, term34291));
        assertTrue(recursiveEquals(retValue, null));
    }

};


