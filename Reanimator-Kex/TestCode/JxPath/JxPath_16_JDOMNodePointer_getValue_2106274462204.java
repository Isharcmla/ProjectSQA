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

public class JDOMNodePointer_getValue_2106274462204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37764;
     Object term40611;

    public JDOMNodePointer_getValue_2106274462204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37764 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term37796 = newInstance(Class.forName("org.jdom.Text"));
        setField(term37764, term37764.getClass(), "node", term37796);
        term40611 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term40612 = newInstance(Class.forName("org.jdom.Text"));
        setField(term40612, term40612.getClass(), "value", null);
        setField(term40612, term40612.getClass(), "parent", null);
        setField(term40611, term40611.getClass(), "node", term40612);
        setField(term40611, term40611.getClass(), "id", null);
        setField(term40611, term40611.getClass(), "localNamespaceResolver", null);
        setIntField(term40611, term40611.getClass(), "index", 0);
        setBooleanField(term40611, term40611.getClass(), "attribute", false);
        setField(term40611, term40611.getClass(), "rootNode", null);
        setField(term40611, term40611.getClass(), "namespaceResolver", null);
        setField(term40611, term40611.getClass(), "parent", null);
        setField(term40611, term40611.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getValue", argTypes, term37764, args);
        assertTrue(recursiveEquals(term37764, term40611));
        assertTrue(recursiveEquals(retValue, null));
    }

};


