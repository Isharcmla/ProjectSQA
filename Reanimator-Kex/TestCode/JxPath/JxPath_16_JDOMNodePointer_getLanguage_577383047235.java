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

public class JDOMNodePointer_getLanguage_577383047235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50704;
     Object term50849;

    public JDOMNodePointer_getLanguage_577383047235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50704 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term50770 = newInstance(Class.forName("org.jdom.ProcessingInstruction"));
        setField(term50704, term50704.getClass(), "node", term50770);
        term50849 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term50850 = newInstance(Class.forName("org.jdom.ProcessingInstruction"));
        setField(term50850, term50850.getClass(), "target", null);
        setField(term50850, term50850.getClass(), "rawData", null);
        setField(term50850, term50850.getClass(), "mapData", null);
        setField(term50850, term50850.getClass(), "parent", null);
        setField(term50849, term50849.getClass(), "node", term50850);
        setField(term50849, term50849.getClass(), "id", null);
        setField(term50849, term50849.getClass(), "localNamespaceResolver", null);
        setIntField(term50849, term50849.getClass(), "index", 0);
        setBooleanField(term50849, term50849.getClass(), "attribute", false);
        setField(term50849, term50849.getClass(), "rootNode", null);
        setField(term50849, term50849.getClass(), "namespaceResolver", null);
        setField(term50849, term50849.getClass(), "parent", null);
        setField(term50849, term50849.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLanguage", argTypes, term50704, args);
        assertTrue(recursiveEquals(term50704, term50849));
        assertTrue(recursiveEquals(retValue, null));
    }

};


