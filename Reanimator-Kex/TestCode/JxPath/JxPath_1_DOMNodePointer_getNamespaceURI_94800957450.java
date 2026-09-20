package org.apache.commons.jxpath.ri.model.dom;

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
import java.lang.NullPointerException;
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class DOMNodePointer_getNamespaceURI_94800957450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285;

    public DOMNodePointer_getNamespaceURI_94800957450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term286 = new HashMap();
        HashMap term323 = new HashMap();
        HashMap term328 = new HashMap();
        HashMap term334 = new HashMap();
        HashMap term339 = new HashMap();
        HashMap term345 = new HashMap();
        HashMap term350 = new HashMap();
        term285 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term317 = newInstance(Class.forName("java.lang.Object"));
        Object term318 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term319 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term320 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term321 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term285, term285.getClass(), "node", null);
        setField(term285, term285.getClass(), "namespaces", term286);
        setField(term285, term285.getClass(), "defaultNamespace", "MjGYSRKTNF");
        setField(term285, term285.getClass(), "id", "hRNSzYYIrc");
        setIntField(term285, term285.getClass(), "index", 1484323161);
        setBooleanField(term285, term285.getClass(), "attribute", false);
        setField(term285, term285.getClass(), "rootNode", term317);
        setField(term321, term321.getClass(), "parent", null);
        setField(term321, term321.getClass(), "namespaceMap", null);
        setField(term321, term321.getClass(), "reverseMap", null);
        setField(term321, term321.getClass(), "pointer", null);
        setField(term321, term321.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term321, term321.getClass(), "sealed", false);
        setField(term320, term320.getClass(), "parent", term321);
        setField(term320, term320.getClass(), "namespaceMap", term323);
        setField(term320, term320.getClass(), "reverseMap", term328);
        setField(term320, term320.getClass(), "pointer", null);
        setField(term320, term320.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term320, term320.getClass(), "sealed", false);
        setField(term319, term319.getClass(), "parent", term320);
        setField(term319, term319.getClass(), "namespaceMap", term334);
        setField(term319, term319.getClass(), "reverseMap", term339);
        setField(term319, term319.getClass(), "pointer", null);
        setField(term319, term319.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term319, term319.getClass(), "sealed", false);
        setField(term318, term318.getClass(), "parent", term319);
        setField(term318, term318.getClass(), "namespaceMap", term345);
        setField(term318, term318.getClass(), "reverseMap", term350);
        setField(term318, term318.getClass(), "pointer", null);
        setField(term318, term318.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term318, term318.getClass(), "sealed", false);
        setField(term285, term285.getClass(), "namespaceResolver", term318);
        setField(term285, term285.getClass(), "parent", null);
        setField(term285, term285.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getNamespaceURI", argTypes, term285, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
