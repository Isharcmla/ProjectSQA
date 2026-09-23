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

public class JDOMNodePointer_asPath_327299344224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43879;
     Object term44012;

    public JDOMNodePointer_asPath_327299344224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43879 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term43917 = newInstance(Class.forName("org.jdom.Element"));
        setField(term43879, term43879.getClass(), "id", null);
        setField(term43879, term43879.getClass(), "parent", null);
        setField(term43879, term43879.getClass(), "node", term43917);
        term44012 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term44013 = newInstance(Class.forName("org.jdom.Element"));
        setField(term44013, term44013.getClass(), "name", null);
        setField(term44013, term44013.getClass(), "namespace", null);
        setField(term44013, term44013.getClass(), "additionalNamespaces", null);
        setField(term44013, term44013.getClass(), "attributes", null);
        setField(term44013, term44013.getClass(), "content", null);
        setField(term44013, term44013.getClass(), "parent", null);
        setField(term44012, term44012.getClass(), "node", term44013);
        setField(term44012, term44012.getClass(), "id", null);
        setField(term44012, term44012.getClass(), "localNamespaceResolver", null);
        setIntField(term44012, term44012.getClass(), "index", 0);
        setBooleanField(term44012, term44012.getClass(), "attribute", false);
        setField(term44012, term44012.getClass(), "namespaceResolver", null);
        setField(term44012, term44012.getClass(), "rootNode", null);
        setField(term44012, term44012.getClass(), "parent", null);
        setField(term44012, term44012.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asPath", argTypes, term43879, args);
        assertTrue(recursiveEquals(term43879, term44012));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


