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

public class JDOMNodePointer_attributeIterator_147983457245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129;
     Object term184;
     Object term3159;
     Object term3171;
     Object term3120;

    public JDOMNodePointer_attributeIterator_147983457245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term151 = new HashMap();
        HashMap term156 = new HashMap();
        HashMap term162 = new HashMap();
        HashMap term167 = new HashMap();
        HashMap term173 = new HashMap();
        HashMap term178 = new HashMap();
        term129 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term130 = newInstance(Class.forName("java.lang.Object"));
        Object term145 = newInstance(Class.forName("java.lang.Object"));
        Object term146 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term147 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term148 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term149 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term129, term129.getClass(), "node", term130);
        setField(term129, term129.getClass(), "id", "MuLcgQHgqz");
        setIntField(term129, term129.getClass(), "index", 1162663216);
        setBooleanField(term129, term129.getClass(), "attribute", false);
        setField(term129, term129.getClass(), "rootNode", term145);
        setField(term149, term149.getClass(), "parent", null);
        setField(term149, term149.getClass(), "namespaceMap", null);
        setField(term149, term149.getClass(), "reverseMap", null);
        setField(term149, term149.getClass(), "pointer", null);
        setField(term149, term149.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term149, term149.getClass(), "sealed", false);
        setField(term148, term148.getClass(), "parent", term149);
        setField(term148, term148.getClass(), "namespaceMap", term151);
        setField(term148, term148.getClass(), "reverseMap", term156);
        setField(term148, term148.getClass(), "pointer", null);
        setField(term148, term148.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term148, term148.getClass(), "sealed", false);
        setField(term147, term147.getClass(), "parent", term148);
        setField(term147, term147.getClass(), "namespaceMap", term162);
        setField(term147, term147.getClass(), "reverseMap", term167);
        setField(term147, term147.getClass(), "pointer", null);
        setField(term147, term147.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term147, term147.getClass(), "sealed", false);
        setField(term146, term146.getClass(), "parent", term147);
        setField(term146, term146.getClass(), "namespaceMap", term173);
        setField(term146, term146.getClass(), "reverseMap", term178);
        setField(term146, term146.getClass(), "pointer", null);
        setField(term146, term146.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term146, term146.getClass(), "sealed", false);
        setField(term129, term129.getClass(), "namespaceResolver", term146);
        setField(term129, term129.getClass(), "parent", null);
        setField(term129, term129.getClass(), "locale", null);
        term184 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term184, term184.getClass(), "prefix", "xxtlPwDYFs");
        setField(term184, term184.getClass(), "name", "jJCZpVmanW");
        setField(term184, term184.getClass(), "qualifiedName", "EGtDIRbSSb");
        HashMap term3167 = new HashMap();
        HashMap term3168 = new HashMap();
        HashMap term3169 = new HashMap();
        HashMap term3170 = new HashMap();
        term3159 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term3160 = newInstance(Class.forName("java.lang.Object"));
        Object term3163 = newInstance(Class.forName("java.lang.Object"));
        Object term3164 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3165 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3166 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3159, term3159.getClass(), "node", term3160);
        setField(term3159, term3159.getClass(), "id", "MuLcgQHgqz");
        setIntField(term3159, term3159.getClass(), "index", 1162663216);
        setBooleanField(term3159, term3159.getClass(), "attribute", false);
        setField(term3159, term3159.getClass(), "rootNode", term3163);
        setField(term3166, term3166.getClass(), "parent", null);
        setField(term3166, term3166.getClass(), "namespaceMap", null);
        setField(term3166, term3166.getClass(), "reverseMap", null);
        setField(term3166, term3166.getClass(), "pointer", null);
        setField(term3166, term3166.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3166, term3166.getClass(), "sealed", false);
        setField(term3165, term3165.getClass(), "parent", term3166);
        setField(term3165, term3165.getClass(), "namespaceMap", term3167);
        setField(term3165, term3165.getClass(), "reverseMap", term3168);
        setField(term3165, term3165.getClass(), "pointer", null);
        setField(term3165, term3165.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3165, term3165.getClass(), "sealed", false);
        setField(term3164, term3164.getClass(), "parent", term3165);
        setField(term3164, term3164.getClass(), "namespaceMap", term3169);
        setField(term3164, term3164.getClass(), "reverseMap", term3170);
        setField(term3164, term3164.getClass(), "pointer", null);
        setField(term3164, term3164.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3164, term3164.getClass(), "sealed", false);
        setField(term3159, term3159.getClass(), "namespaceResolver", term3164);
        setField(term3159, term3159.getClass(), "parent", null);
        setField(term3159, term3159.getClass(), "locale", null);
        term3171 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term3171, term3171.getClass(), "prefix", "xxtlPwDYFs");
        setField(term3171, term3171.getClass(), "name", "jJCZpVmanW");
        setField(term3171, term3171.getClass(), "qualifiedName", "EGtDIRbSSb");
        HashMap term2985 = new HashMap();
        HashMap term2990 = new HashMap();
        HashMap term2996 = new HashMap();
        HashMap term3001 = new HashMap();
        term3120 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term2964 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term2965 = newInstance(Class.forName("java.lang.Object"));
        Object term2980 = newInstance(Class.forName("java.lang.Object"));
        Object term2981 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2982 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2983 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2964, term2964.getClass(), "node", term2965);
        setField(term2964, term2964.getClass(), "id", "MuLcgQHgqz");
        setIntField(term2964, term2964.getClass(), "index", 1162663216);
        setBooleanField(term2964, term2964.getClass(), "attribute", false);
        setField(term2964, term2964.getClass(), "rootNode", term2980);
        setField(term2983, term2983.getClass(), "parent", null);
        setField(term2983, term2983.getClass(), "namespaceMap", null);
        setField(term2983, term2983.getClass(), "reverseMap", null);
        setField(term2983, term2983.getClass(), "pointer", null);
        setField(term2983, term2983.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2983, term2983.getClass(), "sealed", false);
        setField(term2982, term2982.getClass(), "parent", term2983);
        setField(term2982, term2982.getClass(), "namespaceMap", term2985);
        setField(term2982, term2982.getClass(), "reverseMap", term2990);
        setField(term2982, term2982.getClass(), "pointer", null);
        setField(term2982, term2982.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2982, term2982.getClass(), "sealed", false);
        setField(term2981, term2981.getClass(), "parent", term2982);
        setField(term2981, term2981.getClass(), "namespaceMap", term2996);
        setField(term2981, term2981.getClass(), "reverseMap", term3001);
        setField(term2981, term2981.getClass(), "pointer", null);
        setField(term2981, term2981.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2981, term2981.getClass(), "sealed", false);
        setField(term2964, term2964.getClass(), "namespaceResolver", term2981);
        setField(term2964, term2964.getClass(), "parent", null);
        setField(term2964, term2964.getClass(), "locale", null);
        setField(term3120, term3120.getClass(), "parent", term2964);
        setField(term3120, term3120.getClass(), "attributes", null);
        setIntField(term3120, term3120.getClass(), "position", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[1];
        args[0] = term184;
        Object retValue = callMethod(klass, "attributeIterator", argTypes, term129, args);
        assertTrue(recursiveEquals(term129, term3159));
        assertTrue(recursiveEquals(term184, term3171));
        assertTrue(recursiveEquals(retValue, term3120));
    }

};


