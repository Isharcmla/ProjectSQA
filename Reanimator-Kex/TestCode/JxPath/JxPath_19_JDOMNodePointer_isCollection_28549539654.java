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

public class JDOMNodePointer_isCollection_28549539654 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1085;
     Object term5970;

    public JDOMNodePointer_isCollection_28549539654() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1104 = new HashMap();
        HashMap term1109 = new HashMap();
        HashMap term1115 = new HashMap();
        HashMap term1120 = new HashMap();
        HashMap term1126 = new HashMap();
        HashMap term1131 = new HashMap();
        HashMap term1142 = new HashMap();
        HashMap term1147 = new HashMap();
        HashMap term1153 = new HashMap();
        HashMap term1158 = new HashMap();
        HashMap term1164 = new HashMap();
        HashMap term1169 = new HashMap();
        term1085 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1086 = newInstance(Class.forName("java.lang.Object"));
        Object term1099 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1100 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1101 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1102 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1139 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1140 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1141 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1175 = newInstance(Class.forName("java.lang.Object"));
        setField(term1085, term1085.getClass(), "node", term1086);
        setField(term1085, term1085.getClass(), "id", "aJlieCFVtF");
        setField(term1102, term1102.getClass(), "parent", null);
        setField(term1102, term1102.getClass(), "namespaceMap", null);
        setField(term1102, term1102.getClass(), "reverseMap", null);
        setField(term1102, term1102.getClass(), "pointer", null);
        setBooleanField(term1102, term1102.getClass(), "sealed", false);
        setField(term1101, term1101.getClass(), "parent", term1102);
        setField(term1101, term1101.getClass(), "namespaceMap", term1104);
        setField(term1101, term1101.getClass(), "reverseMap", term1109);
        setField(term1101, term1101.getClass(), "pointer", null);
        setBooleanField(term1101, term1101.getClass(), "sealed", false);
        setField(term1100, term1100.getClass(), "parent", term1101);
        setField(term1100, term1100.getClass(), "namespaceMap", term1115);
        setField(term1100, term1100.getClass(), "reverseMap", term1120);
        setField(term1100, term1100.getClass(), "pointer", null);
        setBooleanField(term1100, term1100.getClass(), "sealed", false);
        setField(term1099, term1099.getClass(), "parent", term1100);
        setField(term1099, term1099.getClass(), "namespaceMap", term1126);
        setField(term1099, term1099.getClass(), "reverseMap", term1131);
        setField(term1099, term1099.getClass(), "pointer", null);
        setBooleanField(term1099, term1099.getClass(), "sealed", false);
        setField(term1085, term1085.getClass(), "localNamespaceResolver", term1099);
        setIntField(term1085, term1085.getClass(), "index", -1339778481);
        setBooleanField(term1085, term1085.getClass(), "attribute", false);
        setField(term1141, term1141.getClass(), "parent", null);
        setField(term1141, term1141.getClass(), "namespaceMap", term1142);
        setField(term1141, term1141.getClass(), "reverseMap", term1147);
        setField(term1141, term1141.getClass(), "pointer", null);
        setBooleanField(term1141, term1141.getClass(), "sealed", false);
        setField(term1140, term1140.getClass(), "parent", term1141);
        setField(term1140, term1140.getClass(), "namespaceMap", term1153);
        setField(term1140, term1140.getClass(), "reverseMap", term1158);
        setField(term1140, term1140.getClass(), "pointer", null);
        setBooleanField(term1140, term1140.getClass(), "sealed", false);
        setField(term1139, term1139.getClass(), "parent", term1140);
        setField(term1139, term1139.getClass(), "namespaceMap", term1164);
        setField(term1139, term1139.getClass(), "reverseMap", term1169);
        setField(term1139, term1139.getClass(), "pointer", null);
        setBooleanField(term1139, term1139.getClass(), "sealed", false);
        setField(term1085, term1085.getClass(), "namespaceResolver", term1139);
        setField(term1085, term1085.getClass(), "rootNode", term1175);
        setField(term1085, term1085.getClass(), "parent", null);
        setField(term1085, term1085.getClass(), "locale", null);
        HashMap term5978 = new HashMap();
        HashMap term5979 = new HashMap();
        HashMap term5980 = new HashMap();
        HashMap term5981 = new HashMap();
        HashMap term5982 = new HashMap();
        HashMap term5983 = new HashMap();
        HashMap term5987 = new HashMap();
        HashMap term5988 = new HashMap();
        HashMap term5989 = new HashMap();
        HashMap term5990 = new HashMap();
        HashMap term5991 = new HashMap();
        HashMap term5992 = new HashMap();
        term5970 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term5971 = newInstance(Class.forName("java.lang.Object"));
        Object term5974 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5975 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5976 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5977 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5984 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5985 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5986 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5993 = newInstance(Class.forName("java.lang.Object"));
        setField(term5970, term5970.getClass(), "node", term5971);
        setField(term5970, term5970.getClass(), "id", "aJlieCFVtF");
        setField(term5977, term5977.getClass(), "parent", null);
        setField(term5977, term5977.getClass(), "namespaceMap", null);
        setField(term5977, term5977.getClass(), "reverseMap", null);
        setField(term5977, term5977.getClass(), "pointer", null);
        setBooleanField(term5977, term5977.getClass(), "sealed", false);
        setField(term5976, term5976.getClass(), "parent", term5977);
        setField(term5976, term5976.getClass(), "namespaceMap", term5978);
        setField(term5976, term5976.getClass(), "reverseMap", term5979);
        setField(term5976, term5976.getClass(), "pointer", null);
        setBooleanField(term5976, term5976.getClass(), "sealed", false);
        setField(term5975, term5975.getClass(), "parent", term5976);
        setField(term5975, term5975.getClass(), "namespaceMap", term5980);
        setField(term5975, term5975.getClass(), "reverseMap", term5981);
        setField(term5975, term5975.getClass(), "pointer", null);
        setBooleanField(term5975, term5975.getClass(), "sealed", false);
        setField(term5974, term5974.getClass(), "parent", term5975);
        setField(term5974, term5974.getClass(), "namespaceMap", term5982);
        setField(term5974, term5974.getClass(), "reverseMap", term5983);
        setField(term5974, term5974.getClass(), "pointer", null);
        setBooleanField(term5974, term5974.getClass(), "sealed", false);
        setField(term5970, term5970.getClass(), "localNamespaceResolver", term5974);
        setIntField(term5970, term5970.getClass(), "index", -1339778481);
        setBooleanField(term5970, term5970.getClass(), "attribute", false);
        setField(term5986, term5986.getClass(), "parent", null);
        setField(term5986, term5986.getClass(), "namespaceMap", term5987);
        setField(term5986, term5986.getClass(), "reverseMap", term5988);
        setField(term5986, term5986.getClass(), "pointer", null);
        setBooleanField(term5986, term5986.getClass(), "sealed", false);
        setField(term5985, term5985.getClass(), "parent", term5986);
        setField(term5985, term5985.getClass(), "namespaceMap", term5989);
        setField(term5985, term5985.getClass(), "reverseMap", term5990);
        setField(term5985, term5985.getClass(), "pointer", null);
        setBooleanField(term5985, term5985.getClass(), "sealed", false);
        setField(term5984, term5984.getClass(), "parent", term5985);
        setField(term5984, term5984.getClass(), "namespaceMap", term5991);
        setField(term5984, term5984.getClass(), "reverseMap", term5992);
        setField(term5984, term5984.getClass(), "pointer", null);
        setBooleanField(term5984, term5984.getClass(), "sealed", false);
        setField(term5970, term5970.getClass(), "namespaceResolver", term5984);
        setField(term5970, term5970.getClass(), "rootNode", term5993);
        setField(term5970, term5970.getClass(), "parent", null);
        setField(term5970, term5970.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isCollection", argTypes, term1085, args);
        assertTrue(recursiveEquals(term1085, term5970));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


