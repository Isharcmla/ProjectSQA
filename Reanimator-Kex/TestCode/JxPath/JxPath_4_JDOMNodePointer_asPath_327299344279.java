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

public class JDOMNodePointer_asPath_327299344279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term492261;
     Object term492483;

    public JDOMNodePointer_asPath_327299344279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term492261 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term492327 = newInstance(Class.forName("org.jdom.ProcessingInstruction"));
        Object term492365 = newInstance(Class.forName("org.jdom.Element"));
        Object term492411 = newInstance(Class.forName("org.jdom.ContentList"));
        setField(term492261, term492261.getClass(), "id", null);
        setField(term492261, term492261.getClass(), "parent", null);
        setField(term492327, term492327.getClass(), "target", null);
        setField(term492365, term492365.getClass(), "content", term492411);
        setField(term492327, term492327.getClass(), "parent", term492365);
        setField(term492261, term492261.getClass(), "node", term492327);
        term492483 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term492484 = newInstance(Class.forName("org.jdom.ProcessingInstruction"));
        Object term492485 = newInstance(Class.forName("org.jdom.Element"));
        Object term492486 = newInstance(Class.forName("org.jdom.ContentList"));
        setField(term492484, term492484.getClass(), "target", null);
        setField(term492484, term492484.getClass(), "rawData", null);
        setField(term492484, term492484.getClass(), "mapData", null);
        setField(term492485, term492485.getClass(), "name", null);
        setField(term492485, term492485.getClass(), "namespace", null);
        setField(term492485, term492485.getClass(), "additionalNamespaces", null);
        setField(term492485, term492485.getClass(), "attributes", null);
        setField(term492486, term492486.getClass(), "elementData", null);
        setIntField(term492486, term492486.getClass(), "size", 0);
        setField(term492486, term492486.getClass(), "parent", null);
        setIntField(term492486, term492486.getClass(), "modCount", 0);
        setField(term492485, term492485.getClass(), "content", term492486);
        setField(term492485, term492485.getClass(), "parent", null);
        setField(term492484, term492484.getClass(), "parent", term492485);
        setField(term492483, term492483.getClass(), "node", term492484);
        setField(term492483, term492483.getClass(), "id", null);
        setIntField(term492483, term492483.getClass(), "index", 0);
        setBooleanField(term492483, term492483.getClass(), "attribute", false);
        setField(term492483, term492483.getClass(), "rootNode", null);
        setField(term492483, term492483.getClass(), "namespaceResolver", null);
        setField(term492483, term492483.getClass(), "parent", null);
        setField(term492483, term492483.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asPath", argTypes, term492261, args);
        assertTrue(recursiveEquals(term492261, term492483));
        assertTrue(recursiveEquals(retValue, "/processing-instruction(\'null\')[0]"));
    }

};


