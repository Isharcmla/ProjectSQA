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

public class DOMNodePointer_stringValue_212917030382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3223;

    public DOMNodePointer_stringValue_212917030382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3224 = new HashMap();
        HashMap term3261 = new HashMap();
        HashMap term3266 = new HashMap();
        HashMap term3272 = new HashMap();
        HashMap term3277 = new HashMap();
        HashMap term3283 = new HashMap();
        HashMap term3288 = new HashMap();
        term3223 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3255 = newInstance(Class.forName("java.lang.Object"));
        Object term3256 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3257 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3258 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3259 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3223, term3223.getClass(), "node", null);
        setField(term3223, term3223.getClass(), "namespaces", term3224);
        setField(term3223, term3223.getClass(), "defaultNamespace", "OWKQODBLzb");
        setField(term3223, term3223.getClass(), "id", "wGmYcqUkgE");
        setIntField(term3223, term3223.getClass(), "index", -226514366);
        setBooleanField(term3223, term3223.getClass(), "attribute", true);
        setField(term3223, term3223.getClass(), "rootNode", term3255);
        setField(term3259, term3259.getClass(), "parent", null);
        setField(term3259, term3259.getClass(), "namespaceMap", null);
        setField(term3259, term3259.getClass(), "reverseMap", null);
        setField(term3259, term3259.getClass(), "pointer", null);
        setField(term3259, term3259.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3259, term3259.getClass(), "sealed", false);
        setField(term3258, term3258.getClass(), "parent", term3259);
        setField(term3258, term3258.getClass(), "namespaceMap", term3261);
        setField(term3258, term3258.getClass(), "reverseMap", term3266);
        setField(term3258, term3258.getClass(), "pointer", null);
        setField(term3258, term3258.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3258, term3258.getClass(), "sealed", false);
        setField(term3257, term3257.getClass(), "parent", term3258);
        setField(term3257, term3257.getClass(), "namespaceMap", term3272);
        setField(term3257, term3257.getClass(), "reverseMap", term3277);
        setField(term3257, term3257.getClass(), "pointer", null);
        setField(term3257, term3257.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3257, term3257.getClass(), "sealed", false);
        setField(term3256, term3256.getClass(), "parent", term3257);
        setField(term3256, term3256.getClass(), "namespaceMap", term3283);
        setField(term3256, term3256.getClass(), "reverseMap", term3288);
        setField(term3256, term3256.getClass(), "pointer", null);
        setField(term3256, term3256.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3256, term3256.getClass(), "sealed", false);
        setField(term3223, term3223.getClass(), "namespaceResolver", term3256);
        setField(term3223, term3223.getClass(), "parent", null);
        setField(term3223, term3223.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "stringValue", argTypes, term3223, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
