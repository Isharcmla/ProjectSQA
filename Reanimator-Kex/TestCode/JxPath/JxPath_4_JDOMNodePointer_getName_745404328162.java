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

public class JDOMNodePointer_getName_745404328162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25898;
     Object term26148;
     Object term26143;

    public JDOMNodePointer_getName_745404328162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25898 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term25964 = newInstance(Class.forName("org.jdom.ProcessingInstruction"));
        setField(term25898, term25898.getClass(), "node", term25964);
        term26148 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term26149 = newInstance(Class.forName("org.jdom.ProcessingInstruction"));
        setField(term26149, term26149.getClass(), "target", null);
        setField(term26149, term26149.getClass(), "rawData", null);
        setField(term26149, term26149.getClass(), "mapData", null);
        setField(term26149, term26149.getClass(), "parent", null);
        setField(term26148, term26148.getClass(), "node", term26149);
        setField(term26148, term26148.getClass(), "id", null);
        setIntField(term26148, term26148.getClass(), "index", 0);
        setBooleanField(term26148, term26148.getClass(), "attribute", false);
        setField(term26148, term26148.getClass(), "rootNode", null);
        setField(term26148, term26148.getClass(), "namespaceResolver", null);
        setField(term26148, term26148.getClass(), "parent", null);
        setField(term26148, term26148.getClass(), "locale", null);
        term26143 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term26143, term26143.getClass(), "prefix", null);
        setField(term26143, term26143.getClass(), "name", null);
        setField(term26143, term26143.getClass(), "qualifiedName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getName", argTypes, term25898, args);
        assertTrue(recursiveEquals(term25898, term26148));
        assertTrue(recursiveEquals(retValue, term26143));
    }

};


