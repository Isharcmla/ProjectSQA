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
import java.util.HashMap;

public class JDOMNodePointer_asPath_32729934473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1960;
     Object term8574;

    public JDOMNodePointer_asPath_32729934473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1982 = new HashMap();
        HashMap term1987 = new HashMap();
        HashMap term1993 = new HashMap();
        HashMap term1998 = new HashMap();
        HashMap term2004 = new HashMap();
        HashMap term2009 = new HashMap();
        term1960 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1961 = newInstance(Class.forName("java.lang.Object"));
        Object term1976 = newInstance(Class.forName("java.lang.Object"));
        Object term1977 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1978 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1979 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1980 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1960, term1960.getClass(), "node", term1961);
        setField(term1960, term1960.getClass(), "id", "UlajhuVLaP");
        setIntField(term1960, term1960.getClass(), "index", 1135664017);
        setBooleanField(term1960, term1960.getClass(), "attribute", true);
        setField(term1960, term1960.getClass(), "rootNode", term1976);
        setField(term1980, term1980.getClass(), "parent", null);
        setField(term1980, term1980.getClass(), "namespaceMap", null);
        setField(term1980, term1980.getClass(), "reverseMap", null);
        setField(term1980, term1980.getClass(), "pointer", null);
        setField(term1980, term1980.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1980, term1980.getClass(), "sealed", false);
        setField(term1979, term1979.getClass(), "parent", term1980);
        setField(term1979, term1979.getClass(), "namespaceMap", term1982);
        setField(term1979, term1979.getClass(), "reverseMap", term1987);
        setField(term1979, term1979.getClass(), "pointer", null);
        setField(term1979, term1979.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1979, term1979.getClass(), "sealed", false);
        setField(term1978, term1978.getClass(), "parent", term1979);
        setField(term1978, term1978.getClass(), "namespaceMap", term1993);
        setField(term1978, term1978.getClass(), "reverseMap", term1998);
        setField(term1978, term1978.getClass(), "pointer", null);
        setField(term1978, term1978.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1978, term1978.getClass(), "sealed", false);
        setField(term1977, term1977.getClass(), "parent", term1978);
        setField(term1977, term1977.getClass(), "namespaceMap", term2004);
        setField(term1977, term1977.getClass(), "reverseMap", term2009);
        setField(term1977, term1977.getClass(), "pointer", null);
        setField(term1977, term1977.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1977, term1977.getClass(), "sealed", false);
        setField(term1960, term1960.getClass(), "namespaceResolver", term1977);
        setField(term1960, term1960.getClass(), "parent", null);
        setField(term1960, term1960.getClass(), "locale", null);
        HashMap term8583 = new HashMap();
        HashMap term8584 = new HashMap();
        HashMap term8585 = new HashMap();
        HashMap term8586 = new HashMap();
        HashMap term8587 = new HashMap();
        HashMap term8588 = new HashMap();
        term8574 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term8575 = newInstance(Class.forName("java.lang.Object"));
        Object term8578 = newInstance(Class.forName("java.lang.Object"));
        Object term8579 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term8580 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term8581 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term8582 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term8574, term8574.getClass(), "node", term8575);
        setField(term8574, term8574.getClass(), "id", "UlajhuVLaP");
        setIntField(term8574, term8574.getClass(), "index", 1135664017);
        setBooleanField(term8574, term8574.getClass(), "attribute", true);
        setField(term8574, term8574.getClass(), "rootNode", term8578);
        setField(term8582, term8582.getClass(), "parent", null);
        setField(term8582, term8582.getClass(), "namespaceMap", null);
        setField(term8582, term8582.getClass(), "reverseMap", null);
        setField(term8582, term8582.getClass(), "pointer", null);
        setField(term8582, term8582.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term8582, term8582.getClass(), "sealed", false);
        setField(term8581, term8581.getClass(), "parent", term8582);
        setField(term8581, term8581.getClass(), "namespaceMap", term8583);
        setField(term8581, term8581.getClass(), "reverseMap", term8584);
        setField(term8581, term8581.getClass(), "pointer", null);
        setField(term8581, term8581.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term8581, term8581.getClass(), "sealed", false);
        setField(term8580, term8580.getClass(), "parent", term8581);
        setField(term8580, term8580.getClass(), "namespaceMap", term8585);
        setField(term8580, term8580.getClass(), "reverseMap", term8586);
        setField(term8580, term8580.getClass(), "pointer", null);
        setField(term8580, term8580.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term8580, term8580.getClass(), "sealed", false);
        setField(term8579, term8579.getClass(), "parent", term8580);
        setField(term8579, term8579.getClass(), "namespaceMap", term8587);
        setField(term8579, term8579.getClass(), "reverseMap", term8588);
        setField(term8579, term8579.getClass(), "pointer", null);
        setField(term8579, term8579.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term8579, term8579.getClass(), "sealed", false);
        setField(term8574, term8574.getClass(), "namespaceResolver", term8579);
        setField(term8574, term8574.getClass(), "parent", null);
        setField(term8574, term8574.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asPath", argTypes, term1960, args);
        assertTrue(recursiveEquals(term1960, term8574));
        assertTrue(recursiveEquals(retValue, "id(\'UlajhuVLaP\')"));
    }

};


