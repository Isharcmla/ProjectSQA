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

public class NullPropertyPointer_getImmediateNode_74353357529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275;
     Object term2217;

    public NullPropertyPointer_getImmediateNode_74353357529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term300 = new HashMap();
        HashMap term305 = new HashMap();
        HashMap term311 = new HashMap();
        HashMap term316 = new HashMap();
        HashMap term322 = new HashMap();
        HashMap term327 = new HashMap();
        term275 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term290 = newInstance(Class.forName("java.lang.Object"));
        Object term291 = newInstance(Class.forName("java.lang.Object"));
        Object term294 = newInstance(Class.forName("java.lang.Object"));
        Object term295 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term296 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term297 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term298 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term275, term275.getClass(), "propertyName", "jJCZpVmanW");
        setBooleanField(term275, term275.getClass(), "byNameAttribute", false);
        setIntField(term275, term275.getClass(), "propertyIndex", -1339778481);
        setField(term275, term275.getClass(), "bean", term290);
        setField(term275, term275.getClass(), "value", term291);
        setIntField(term275, term275.getClass(), "index", 1725571209);
        setBooleanField(term275, term275.getClass(), "attribute", true);
        setField(term275, term275.getClass(), "rootNode", term294);
        setField(term298, term298.getClass(), "parent", null);
        setField(term298, term298.getClass(), "namespaceMap", null);
        setField(term298, term298.getClass(), "reverseMap", null);
        setField(term298, term298.getClass(), "pointer", null);
        setField(term298, term298.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term298, term298.getClass(), "sealed", false);
        setField(term297, term297.getClass(), "parent", term298);
        setField(term297, term297.getClass(), "namespaceMap", term300);
        setField(term297, term297.getClass(), "reverseMap", term305);
        setField(term297, term297.getClass(), "pointer", null);
        setField(term297, term297.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term297, term297.getClass(), "sealed", false);
        setField(term296, term296.getClass(), "parent", term297);
        setField(term296, term296.getClass(), "namespaceMap", term311);
        setField(term296, term296.getClass(), "reverseMap", term316);
        setField(term296, term296.getClass(), "pointer", null);
        setField(term296, term296.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term296, term296.getClass(), "sealed", false);
        setField(term295, term295.getClass(), "parent", term296);
        setField(term295, term295.getClass(), "namespaceMap", term322);
        setField(term295, term295.getClass(), "reverseMap", term327);
        setField(term295, term295.getClass(), "pointer", null);
        setField(term295, term295.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term295, term295.getClass(), "sealed", false);
        setField(term275, term275.getClass(), "namespaceResolver", term295);
        setField(term275, term275.getClass(), "parent", null);
        setField(term275, term275.getClass(), "locale", null);
        HashMap term2227 = new HashMap();
        HashMap term2228 = new HashMap();
        HashMap term2229 = new HashMap();
        HashMap term2230 = new HashMap();
        HashMap term2231 = new HashMap();
        HashMap term2232 = new HashMap();
        term2217 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term2220 = newInstance(Class.forName("java.lang.Object"));
        Object term2221 = newInstance(Class.forName("java.lang.Object"));
        Object term2222 = newInstance(Class.forName("java.lang.Object"));
        Object term2223 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2224 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2225 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2226 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2217, term2217.getClass(), "propertyName", "jJCZpVmanW");
        setBooleanField(term2217, term2217.getClass(), "byNameAttribute", false);
        setIntField(term2217, term2217.getClass(), "propertyIndex", -1339778481);
        setField(term2217, term2217.getClass(), "bean", term2220);
        setField(term2217, term2217.getClass(), "value", term2221);
        setIntField(term2217, term2217.getClass(), "index", 1725571209);
        setBooleanField(term2217, term2217.getClass(), "attribute", true);
        setField(term2217, term2217.getClass(), "rootNode", term2222);
        setField(term2226, term2226.getClass(), "parent", null);
        setField(term2226, term2226.getClass(), "namespaceMap", null);
        setField(term2226, term2226.getClass(), "reverseMap", null);
        setField(term2226, term2226.getClass(), "pointer", null);
        setField(term2226, term2226.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2226, term2226.getClass(), "sealed", false);
        setField(term2225, term2225.getClass(), "parent", term2226);
        setField(term2225, term2225.getClass(), "namespaceMap", term2227);
        setField(term2225, term2225.getClass(), "reverseMap", term2228);
        setField(term2225, term2225.getClass(), "pointer", null);
        setField(term2225, term2225.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2225, term2225.getClass(), "sealed", false);
        setField(term2224, term2224.getClass(), "parent", term2225);
        setField(term2224, term2224.getClass(), "namespaceMap", term2229);
        setField(term2224, term2224.getClass(), "reverseMap", term2230);
        setField(term2224, term2224.getClass(), "pointer", null);
        setField(term2224, term2224.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2224, term2224.getClass(), "sealed", false);
        setField(term2223, term2223.getClass(), "parent", term2224);
        setField(term2223, term2223.getClass(), "namespaceMap", term2231);
        setField(term2223, term2223.getClass(), "reverseMap", term2232);
        setField(term2223, term2223.getClass(), "pointer", null);
        setField(term2223, term2223.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2223, term2223.getClass(), "sealed", false);
        setField(term2217, term2217.getClass(), "namespaceResolver", term2223);
        setField(term2217, term2217.getClass(), "parent", null);
        setField(term2217, term2217.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getImmediateNode", argTypes, term275, args);
        assertTrue(recursiveEquals(term275, term2217));
        assertTrue(recursiveEquals(retValue, null));
    }

};


