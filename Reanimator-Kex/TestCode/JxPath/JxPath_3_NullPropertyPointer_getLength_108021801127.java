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

public class NullPropertyPointer_getLength_108021801127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139;
     Object term2028;

    public NullPropertyPointer_getLength_108021801127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term164 = new HashMap();
        HashMap term169 = new HashMap();
        HashMap term175 = new HashMap();
        HashMap term180 = new HashMap();
        HashMap term186 = new HashMap();
        HashMap term191 = new HashMap();
        term139 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term154 = newInstance(Class.forName("java.lang.Object"));
        Object term155 = newInstance(Class.forName("java.lang.Object"));
        Object term158 = newInstance(Class.forName("java.lang.Object"));
        Object term159 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term160 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term161 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term162 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term139, term139.getClass(), "propertyName", "MuLcgQHgqz");
        setBooleanField(term139, term139.getClass(), "byNameAttribute", true);
        setIntField(term139, term139.getClass(), "propertyIndex", -616727354);
        setField(term139, term139.getClass(), "bean", term154);
        setField(term139, term139.getClass(), "value", term155);
        setIntField(term139, term139.getClass(), "index", -1955890973);
        setBooleanField(term139, term139.getClass(), "attribute", true);
        setField(term139, term139.getClass(), "rootNode", term158);
        setField(term162, term162.getClass(), "parent", null);
        setField(term162, term162.getClass(), "namespaceMap", null);
        setField(term162, term162.getClass(), "reverseMap", null);
        setField(term162, term162.getClass(), "pointer", null);
        setField(term162, term162.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term162, term162.getClass(), "sealed", false);
        setField(term161, term161.getClass(), "parent", term162);
        setField(term161, term161.getClass(), "namespaceMap", term164);
        setField(term161, term161.getClass(), "reverseMap", term169);
        setField(term161, term161.getClass(), "pointer", null);
        setField(term161, term161.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term161, term161.getClass(), "sealed", false);
        setField(term160, term160.getClass(), "parent", term161);
        setField(term160, term160.getClass(), "namespaceMap", term175);
        setField(term160, term160.getClass(), "reverseMap", term180);
        setField(term160, term160.getClass(), "pointer", null);
        setField(term160, term160.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term160, term160.getClass(), "sealed", false);
        setField(term159, term159.getClass(), "parent", term160);
        setField(term159, term159.getClass(), "namespaceMap", term186);
        setField(term159, term159.getClass(), "reverseMap", term191);
        setField(term159, term159.getClass(), "pointer", null);
        setField(term159, term159.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term159, term159.getClass(), "sealed", false);
        setField(term139, term139.getClass(), "namespaceResolver", term159);
        setField(term139, term139.getClass(), "parent", null);
        setField(term139, term139.getClass(), "locale", null);
        HashMap term2038 = new HashMap();
        HashMap term2039 = new HashMap();
        HashMap term2040 = new HashMap();
        HashMap term2041 = new HashMap();
        HashMap term2042 = new HashMap();
        HashMap term2043 = new HashMap();
        term2028 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term2031 = newInstance(Class.forName("java.lang.Object"));
        Object term2032 = newInstance(Class.forName("java.lang.Object"));
        Object term2033 = newInstance(Class.forName("java.lang.Object"));
        Object term2034 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2035 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2036 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2037 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2028, term2028.getClass(), "propertyName", "MuLcgQHgqz");
        setBooleanField(term2028, term2028.getClass(), "byNameAttribute", true);
        setIntField(term2028, term2028.getClass(), "propertyIndex", -616727354);
        setField(term2028, term2028.getClass(), "bean", term2031);
        setField(term2028, term2028.getClass(), "value", term2032);
        setIntField(term2028, term2028.getClass(), "index", -1955890973);
        setBooleanField(term2028, term2028.getClass(), "attribute", true);
        setField(term2028, term2028.getClass(), "rootNode", term2033);
        setField(term2037, term2037.getClass(), "parent", null);
        setField(term2037, term2037.getClass(), "namespaceMap", null);
        setField(term2037, term2037.getClass(), "reverseMap", null);
        setField(term2037, term2037.getClass(), "pointer", null);
        setField(term2037, term2037.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2037, term2037.getClass(), "sealed", false);
        setField(term2036, term2036.getClass(), "parent", term2037);
        setField(term2036, term2036.getClass(), "namespaceMap", term2038);
        setField(term2036, term2036.getClass(), "reverseMap", term2039);
        setField(term2036, term2036.getClass(), "pointer", null);
        setField(term2036, term2036.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2036, term2036.getClass(), "sealed", false);
        setField(term2035, term2035.getClass(), "parent", term2036);
        setField(term2035, term2035.getClass(), "namespaceMap", term2040);
        setField(term2035, term2035.getClass(), "reverseMap", term2041);
        setField(term2035, term2035.getClass(), "pointer", null);
        setField(term2035, term2035.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2035, term2035.getClass(), "sealed", false);
        setField(term2034, term2034.getClass(), "parent", term2035);
        setField(term2034, term2034.getClass(), "namespaceMap", term2042);
        setField(term2034, term2034.getClass(), "reverseMap", term2043);
        setField(term2034, term2034.getClass(), "pointer", null);
        setField(term2034, term2034.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2034, term2034.getClass(), "sealed", false);
        setField(term2028, term2028.getClass(), "namespaceResolver", term2034);
        setField(term2028, term2028.getClass(), "parent", null);
        setField(term2028, term2028.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLength", argTypes, term139, args);
        assertTrue(recursiveEquals(term139, term2028));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


