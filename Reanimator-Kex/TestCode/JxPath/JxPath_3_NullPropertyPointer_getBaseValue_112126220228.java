package org.apache.commons.jxpath.ri.model.beans;

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
import static org.apache.commons.jxpath.ri.model.beans.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.beans.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;

public class NullPropertyPointer_getBaseValue_112126220228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207;
     Object term2123;

    public NullPropertyPointer_getBaseValue_112126220228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term232 = new HashMap();
        HashMap term237 = new HashMap();
        HashMap term243 = new HashMap();
        HashMap term248 = new HashMap();
        HashMap term254 = new HashMap();
        HashMap term259 = new HashMap();
        term207 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term222 = newInstance(Class.forName("java.lang.Object"));
        Object term223 = newInstance(Class.forName("java.lang.Object"));
        Object term226 = newInstance(Class.forName("java.lang.Object"));
        Object term227 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term228 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term229 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term230 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term207, term207.getClass(), "propertyName", "xxtlPwDYFs");
        setBooleanField(term207, term207.getClass(), "byNameAttribute", true);
        setIntField(term207, term207.getClass(), "propertyIndex", -2038273078);
        setField(term207, term207.getClass(), "bean", term222);
        setField(term207, term207.getClass(), "value", term223);
        setIntField(term207, term207.getClass(), "index", 1227103734);
        setBooleanField(term207, term207.getClass(), "attribute", true);
        setField(term207, term207.getClass(), "rootNode", term226);
        setField(term230, term230.getClass(), "parent", null);
        setField(term230, term230.getClass(), "namespaceMap", null);
        setField(term230, term230.getClass(), "reverseMap", null);
        setField(term230, term230.getClass(), "pointer", null);
        setField(term230, term230.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term230, term230.getClass(), "sealed", false);
        setField(term229, term229.getClass(), "parent", term230);
        setField(term229, term229.getClass(), "namespaceMap", term232);
        setField(term229, term229.getClass(), "reverseMap", term237);
        setField(term229, term229.getClass(), "pointer", null);
        setField(term229, term229.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term229, term229.getClass(), "sealed", false);
        setField(term228, term228.getClass(), "parent", term229);
        setField(term228, term228.getClass(), "namespaceMap", term243);
        setField(term228, term228.getClass(), "reverseMap", term248);
        setField(term228, term228.getClass(), "pointer", null);
        setField(term228, term228.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term228, term228.getClass(), "sealed", false);
        setField(term227, term227.getClass(), "parent", term228);
        setField(term227, term227.getClass(), "namespaceMap", term254);
        setField(term227, term227.getClass(), "reverseMap", term259);
        setField(term227, term227.getClass(), "pointer", null);
        setField(term227, term227.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term227, term227.getClass(), "sealed", false);
        setField(term207, term207.getClass(), "namespaceResolver", term227);
        setField(term207, term207.getClass(), "parent", null);
        setField(term207, term207.getClass(), "locale", null);
        HashMap term2133 = new HashMap();
        HashMap term2134 = new HashMap();
        HashMap term2135 = new HashMap();
        HashMap term2136 = new HashMap();
        HashMap term2137 = new HashMap();
        HashMap term2138 = new HashMap();
        term2123 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term2126 = newInstance(Class.forName("java.lang.Object"));
        Object term2127 = newInstance(Class.forName("java.lang.Object"));
        Object term2128 = newInstance(Class.forName("java.lang.Object"));
        Object term2129 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2130 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2131 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2132 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2123, term2123.getClass(), "propertyName", "xxtlPwDYFs");
        setBooleanField(term2123, term2123.getClass(), "byNameAttribute", true);
        setIntField(term2123, term2123.getClass(), "propertyIndex", -2038273078);
        setField(term2123, term2123.getClass(), "bean", term2126);
        setField(term2123, term2123.getClass(), "value", term2127);
        setIntField(term2123, term2123.getClass(), "index", 1227103734);
        setBooleanField(term2123, term2123.getClass(), "attribute", true);
        setField(term2123, term2123.getClass(), "rootNode", term2128);
        setField(term2132, term2132.getClass(), "parent", null);
        setField(term2132, term2132.getClass(), "namespaceMap", null);
        setField(term2132, term2132.getClass(), "reverseMap", null);
        setField(term2132, term2132.getClass(), "pointer", null);
        setField(term2132, term2132.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2132, term2132.getClass(), "sealed", false);
        setField(term2131, term2131.getClass(), "parent", term2132);
        setField(term2131, term2131.getClass(), "namespaceMap", term2133);
        setField(term2131, term2131.getClass(), "reverseMap", term2134);
        setField(term2131, term2131.getClass(), "pointer", null);
        setField(term2131, term2131.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2131, term2131.getClass(), "sealed", false);
        setField(term2130, term2130.getClass(), "parent", term2131);
        setField(term2130, term2130.getClass(), "namespaceMap", term2135);
        setField(term2130, term2130.getClass(), "reverseMap", term2136);
        setField(term2130, term2130.getClass(), "pointer", null);
        setField(term2130, term2130.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2130, term2130.getClass(), "sealed", false);
        setField(term2129, term2129.getClass(), "parent", term2130);
        setField(term2129, term2129.getClass(), "namespaceMap", term2137);
        setField(term2129, term2129.getClass(), "reverseMap", term2138);
        setField(term2129, term2129.getClass(), "pointer", null);
        setField(term2129, term2129.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2129, term2129.getClass(), "sealed", false);
        setField(term2123, term2123.getClass(), "namespaceResolver", term2129);
        setField(term2123, term2123.getClass(), "parent", null);
        setField(term2123, term2123.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getBaseValue", argTypes, term207, args);
        assertTrue(recursiveEquals(term207, term2123));
        assertTrue(recursiveEquals(retValue, null));
    }

};


