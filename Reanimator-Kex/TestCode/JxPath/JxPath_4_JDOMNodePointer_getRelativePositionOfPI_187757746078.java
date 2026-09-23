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
import java.lang.ClassCastException;
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class JDOMNodePointer_getRelativePositionOfPI_187757746078 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2307;

    public JDOMNodePointer_getRelativePositionOfPI_187757746078() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2329 = new HashMap();
        HashMap term2334 = new HashMap();
        HashMap term2340 = new HashMap();
        HashMap term2345 = new HashMap();
        HashMap term2351 = new HashMap();
        HashMap term2356 = new HashMap();
        term2307 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term2308 = newInstance(Class.forName("java.lang.Object"));
        Object term2323 = newInstance(Class.forName("java.lang.Object"));
        Object term2324 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2325 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2326 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2327 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2307, term2307.getClass(), "node", term2308);
        setField(term2307, term2307.getClass(), "id", "LvtrsXUliU");
        setIntField(term2307, term2307.getClass(), "index", -203030934);
        setBooleanField(term2307, term2307.getClass(), "attribute", true);
        setField(term2307, term2307.getClass(), "rootNode", term2323);
        setField(term2327, term2327.getClass(), "parent", null);
        setField(term2327, term2327.getClass(), "namespaceMap", null);
        setField(term2327, term2327.getClass(), "reverseMap", null);
        setField(term2327, term2327.getClass(), "pointer", null);
        setField(term2327, term2327.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2327, term2327.getClass(), "sealed", false);
        setField(term2326, term2326.getClass(), "parent", term2327);
        setField(term2326, term2326.getClass(), "namespaceMap", term2329);
        setField(term2326, term2326.getClass(), "reverseMap", term2334);
        setField(term2326, term2326.getClass(), "pointer", null);
        setField(term2326, term2326.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2326, term2326.getClass(), "sealed", false);
        setField(term2325, term2325.getClass(), "parent", term2326);
        setField(term2325, term2325.getClass(), "namespaceMap", term2340);
        setField(term2325, term2325.getClass(), "reverseMap", term2345);
        setField(term2325, term2325.getClass(), "pointer", null);
        setField(term2325, term2325.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2325, term2325.getClass(), "sealed", false);
        setField(term2324, term2324.getClass(), "parent", term2325);
        setField(term2324, term2324.getClass(), "namespaceMap", term2351);
        setField(term2324, term2324.getClass(), "reverseMap", term2356);
        setField(term2324, term2324.getClass(), "pointer", null);
        setField(term2324, term2324.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2324, term2324.getClass(), "sealed", false);
        setField(term2307, term2307.getClass(), "namespaceResolver", term2324);
        setField(term2307, term2307.getClass(), "parent", null);
        setField(term2307, term2307.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xLbjWUgOIL";
        try {
            callMethod(klass, "getRelativePositionOfPI", argTypes, term2307, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


