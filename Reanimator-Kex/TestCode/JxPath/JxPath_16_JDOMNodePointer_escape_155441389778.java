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

public class JDOMNodePointer_escape_155441389778 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2933;
     Object term11168;

    public JDOMNodePointer_escape_155441389778() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2952 = new HashMap();
        HashMap term2957 = new HashMap();
        HashMap term2963 = new HashMap();
        HashMap term2968 = new HashMap();
        HashMap term2974 = new HashMap();
        HashMap term2979 = new HashMap();
        HashMap term2991 = new HashMap();
        HashMap term2997 = new HashMap();
        HashMap term3002 = new HashMap();
        HashMap term3008 = new HashMap();
        HashMap term3013 = new HashMap();
        term2933 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term2934 = newInstance(Class.forName("java.lang.Object"));
        Object term2947 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2948 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2949 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2950 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2987 = newInstance(Class.forName("java.lang.Object"));
        Object term2988 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2989 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2990 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2933, term2933.getClass(), "node", term2934);
        setField(term2933, term2933.getClass(), "id", "tShwQLRGNe");
        setField(term2950, term2950.getClass(), "parent", null);
        setField(term2950, term2950.getClass(), "namespaceMap", null);
        setField(term2950, term2950.getClass(), "reverseMap", null);
        setField(term2950, term2950.getClass(), "pointer", null);
        setBooleanField(term2950, term2950.getClass(), "sealed", false);
        setField(term2949, term2949.getClass(), "parent", term2950);
        setField(term2949, term2949.getClass(), "namespaceMap", term2952);
        setField(term2949, term2949.getClass(), "reverseMap", term2957);
        setField(term2949, term2949.getClass(), "pointer", null);
        setBooleanField(term2949, term2949.getClass(), "sealed", false);
        setField(term2948, term2948.getClass(), "parent", term2949);
        setField(term2948, term2948.getClass(), "namespaceMap", term2963);
        setField(term2948, term2948.getClass(), "reverseMap", term2968);
        setField(term2948, term2948.getClass(), "pointer", null);
        setBooleanField(term2948, term2948.getClass(), "sealed", false);
        setField(term2947, term2947.getClass(), "parent", term2948);
        setField(term2947, term2947.getClass(), "namespaceMap", term2974);
        setField(term2947, term2947.getClass(), "reverseMap", term2979);
        setField(term2947, term2947.getClass(), "pointer", null);
        setBooleanField(term2947, term2947.getClass(), "sealed", false);
        setField(term2933, term2933.getClass(), "localNamespaceResolver", term2947);
        setIntField(term2933, term2933.getClass(), "index", 865208305);
        setBooleanField(term2933, term2933.getClass(), "attribute", false);
        setField(term2933, term2933.getClass(), "rootNode", term2987);
        setField(term2990, term2990.getClass(), "parent", null);
        setField(term2990, term2990.getClass(), "namespaceMap", term2991);
        setField(term2990, term2990.getClass(), "reverseMap", null);
        setField(term2990, term2990.getClass(), "pointer", null);
        setBooleanField(term2990, term2990.getClass(), "sealed", false);
        setField(term2989, term2989.getClass(), "parent", term2990);
        setField(term2989, term2989.getClass(), "namespaceMap", term2997);
        setField(term2989, term2989.getClass(), "reverseMap", term3002);
        setField(term2989, term2989.getClass(), "pointer", null);
        setBooleanField(term2989, term2989.getClass(), "sealed", false);
        setField(term2988, term2988.getClass(), "parent", term2989);
        setField(term2988, term2988.getClass(), "namespaceMap", term3008);
        setField(term2988, term2988.getClass(), "reverseMap", term3013);
        setField(term2988, term2988.getClass(), "pointer", null);
        setBooleanField(term2988, term2988.getClass(), "sealed", false);
        setField(term2933, term2933.getClass(), "namespaceResolver", term2988);
        setField(term2933, term2933.getClass(), "parent", null);
        setField(term2933, term2933.getClass(), "locale", null);
        HashMap term11176 = new HashMap();
        HashMap term11177 = new HashMap();
        HashMap term11178 = new HashMap();
        HashMap term11179 = new HashMap();
        HashMap term11180 = new HashMap();
        HashMap term11181 = new HashMap();
        HashMap term11186 = new HashMap();
        HashMap term11187 = new HashMap();
        HashMap term11188 = new HashMap();
        HashMap term11189 = new HashMap();
        HashMap term11190 = new HashMap();
        term11168 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term11169 = newInstance(Class.forName("java.lang.Object"));
        Object term11172 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11173 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11174 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11175 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11182 = newInstance(Class.forName("java.lang.Object"));
        Object term11183 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11184 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11185 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term11168, term11168.getClass(), "node", term11169);
        setField(term11168, term11168.getClass(), "id", "tShwQLRGNe");
        setField(term11175, term11175.getClass(), "parent", null);
        setField(term11175, term11175.getClass(), "namespaceMap", null);
        setField(term11175, term11175.getClass(), "reverseMap", null);
        setField(term11175, term11175.getClass(), "pointer", null);
        setBooleanField(term11175, term11175.getClass(), "sealed", false);
        setField(term11174, term11174.getClass(), "parent", term11175);
        setField(term11174, term11174.getClass(), "namespaceMap", term11176);
        setField(term11174, term11174.getClass(), "reverseMap", term11177);
        setField(term11174, term11174.getClass(), "pointer", null);
        setBooleanField(term11174, term11174.getClass(), "sealed", false);
        setField(term11173, term11173.getClass(), "parent", term11174);
        setField(term11173, term11173.getClass(), "namespaceMap", term11178);
        setField(term11173, term11173.getClass(), "reverseMap", term11179);
        setField(term11173, term11173.getClass(), "pointer", null);
        setBooleanField(term11173, term11173.getClass(), "sealed", false);
        setField(term11172, term11172.getClass(), "parent", term11173);
        setField(term11172, term11172.getClass(), "namespaceMap", term11180);
        setField(term11172, term11172.getClass(), "reverseMap", term11181);
        setField(term11172, term11172.getClass(), "pointer", null);
        setBooleanField(term11172, term11172.getClass(), "sealed", false);
        setField(term11168, term11168.getClass(), "localNamespaceResolver", term11172);
        setIntField(term11168, term11168.getClass(), "index", 865208305);
        setBooleanField(term11168, term11168.getClass(), "attribute", false);
        setField(term11168, term11168.getClass(), "rootNode", term11182);
        setField(term11185, term11185.getClass(), "parent", null);
        setField(term11185, term11185.getClass(), "namespaceMap", term11186);
        setField(term11185, term11185.getClass(), "reverseMap", null);
        setField(term11185, term11185.getClass(), "pointer", null);
        setBooleanField(term11185, term11185.getClass(), "sealed", false);
        setField(term11184, term11184.getClass(), "parent", term11185);
        setField(term11184, term11184.getClass(), "namespaceMap", term11187);
        setField(term11184, term11184.getClass(), "reverseMap", term11188);
        setField(term11184, term11184.getClass(), "pointer", null);
        setBooleanField(term11184, term11184.getClass(), "sealed", false);
        setField(term11183, term11183.getClass(), "parent", term11184);
        setField(term11183, term11183.getClass(), "namespaceMap", term11189);
        setField(term11183, term11183.getClass(), "reverseMap", term11190);
        setField(term11183, term11183.getClass(), "pointer", null);
        setBooleanField(term11183, term11183.getClass(), "sealed", false);
        setField(term11168, term11168.getClass(), "namespaceResolver", term11183);
        setField(term11168, term11168.getClass(), "parent", null);
        setField(term11168, term11168.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LvtrsXUliU";
        Object retValue = callMethod(klass, "escape", argTypes, term2933, args);
        assertTrue(recursiveEquals(term2933, term11168));
        assertTrue(recursiveEquals(retValue, "LvtrsXUliU"));
    }

};


