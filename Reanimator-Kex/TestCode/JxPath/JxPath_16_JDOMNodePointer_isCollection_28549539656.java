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

public class JDOMNodePointer_isCollection_28549539656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1040;
     Object term5992;

    public JDOMNodePointer_isCollection_28549539656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1059 = new HashMap();
        HashMap term1064 = new HashMap();
        HashMap term1070 = new HashMap();
        HashMap term1075 = new HashMap();
        HashMap term1081 = new HashMap();
        HashMap term1086 = new HashMap();
        HashMap term1098 = new HashMap();
        HashMap term1104 = new HashMap();
        HashMap term1109 = new HashMap();
        HashMap term1115 = new HashMap();
        HashMap term1120 = new HashMap();
        term1040 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1041 = newInstance(Class.forName("java.lang.Object"));
        Object term1054 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1055 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1056 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1057 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1094 = newInstance(Class.forName("java.lang.Object"));
        Object term1095 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1096 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1097 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1040, term1040.getClass(), "node", term1041);
        setField(term1040, term1040.getClass(), "id", "aJlieCFVtF");
        setField(term1057, term1057.getClass(), "parent", null);
        setField(term1057, term1057.getClass(), "namespaceMap", null);
        setField(term1057, term1057.getClass(), "reverseMap", null);
        setField(term1057, term1057.getClass(), "pointer", null);
        setBooleanField(term1057, term1057.getClass(), "sealed", false);
        setField(term1056, term1056.getClass(), "parent", term1057);
        setField(term1056, term1056.getClass(), "namespaceMap", term1059);
        setField(term1056, term1056.getClass(), "reverseMap", term1064);
        setField(term1056, term1056.getClass(), "pointer", null);
        setBooleanField(term1056, term1056.getClass(), "sealed", false);
        setField(term1055, term1055.getClass(), "parent", term1056);
        setField(term1055, term1055.getClass(), "namespaceMap", term1070);
        setField(term1055, term1055.getClass(), "reverseMap", term1075);
        setField(term1055, term1055.getClass(), "pointer", null);
        setBooleanField(term1055, term1055.getClass(), "sealed", false);
        setField(term1054, term1054.getClass(), "parent", term1055);
        setField(term1054, term1054.getClass(), "namespaceMap", term1081);
        setField(term1054, term1054.getClass(), "reverseMap", term1086);
        setField(term1054, term1054.getClass(), "pointer", null);
        setBooleanField(term1054, term1054.getClass(), "sealed", false);
        setField(term1040, term1040.getClass(), "localNamespaceResolver", term1054);
        setIntField(term1040, term1040.getClass(), "index", -1339778481);
        setBooleanField(term1040, term1040.getClass(), "attribute", false);
        setField(term1040, term1040.getClass(), "rootNode", term1094);
        setField(term1097, term1097.getClass(), "parent", null);
        setField(term1097, term1097.getClass(), "namespaceMap", term1098);
        setField(term1097, term1097.getClass(), "reverseMap", null);
        setField(term1097, term1097.getClass(), "pointer", null);
        setBooleanField(term1097, term1097.getClass(), "sealed", false);
        setField(term1096, term1096.getClass(), "parent", term1097);
        setField(term1096, term1096.getClass(), "namespaceMap", term1104);
        setField(term1096, term1096.getClass(), "reverseMap", term1109);
        setField(term1096, term1096.getClass(), "pointer", null);
        setBooleanField(term1096, term1096.getClass(), "sealed", false);
        setField(term1095, term1095.getClass(), "parent", term1096);
        setField(term1095, term1095.getClass(), "namespaceMap", term1115);
        setField(term1095, term1095.getClass(), "reverseMap", term1120);
        setField(term1095, term1095.getClass(), "pointer", null);
        setBooleanField(term1095, term1095.getClass(), "sealed", false);
        setField(term1040, term1040.getClass(), "namespaceResolver", term1095);
        setField(term1040, term1040.getClass(), "parent", null);
        setField(term1040, term1040.getClass(), "locale", null);
        HashMap term6000 = new HashMap();
        HashMap term6001 = new HashMap();
        HashMap term6002 = new HashMap();
        HashMap term6003 = new HashMap();
        HashMap term6004 = new HashMap();
        HashMap term6005 = new HashMap();
        HashMap term6010 = new HashMap();
        HashMap term6011 = new HashMap();
        HashMap term6012 = new HashMap();
        HashMap term6013 = new HashMap();
        HashMap term6014 = new HashMap();
        term5992 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term5993 = newInstance(Class.forName("java.lang.Object"));
        Object term5996 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5997 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5998 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5999 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6006 = newInstance(Class.forName("java.lang.Object"));
        Object term6007 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6008 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6009 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term5992, term5992.getClass(), "node", term5993);
        setField(term5992, term5992.getClass(), "id", "aJlieCFVtF");
        setField(term5999, term5999.getClass(), "parent", null);
        setField(term5999, term5999.getClass(), "namespaceMap", null);
        setField(term5999, term5999.getClass(), "reverseMap", null);
        setField(term5999, term5999.getClass(), "pointer", null);
        setBooleanField(term5999, term5999.getClass(), "sealed", false);
        setField(term5998, term5998.getClass(), "parent", term5999);
        setField(term5998, term5998.getClass(), "namespaceMap", term6000);
        setField(term5998, term5998.getClass(), "reverseMap", term6001);
        setField(term5998, term5998.getClass(), "pointer", null);
        setBooleanField(term5998, term5998.getClass(), "sealed", false);
        setField(term5997, term5997.getClass(), "parent", term5998);
        setField(term5997, term5997.getClass(), "namespaceMap", term6002);
        setField(term5997, term5997.getClass(), "reverseMap", term6003);
        setField(term5997, term5997.getClass(), "pointer", null);
        setBooleanField(term5997, term5997.getClass(), "sealed", false);
        setField(term5996, term5996.getClass(), "parent", term5997);
        setField(term5996, term5996.getClass(), "namespaceMap", term6004);
        setField(term5996, term5996.getClass(), "reverseMap", term6005);
        setField(term5996, term5996.getClass(), "pointer", null);
        setBooleanField(term5996, term5996.getClass(), "sealed", false);
        setField(term5992, term5992.getClass(), "localNamespaceResolver", term5996);
        setIntField(term5992, term5992.getClass(), "index", -1339778481);
        setBooleanField(term5992, term5992.getClass(), "attribute", false);
        setField(term5992, term5992.getClass(), "rootNode", term6006);
        setField(term6009, term6009.getClass(), "parent", null);
        setField(term6009, term6009.getClass(), "namespaceMap", term6010);
        setField(term6009, term6009.getClass(), "reverseMap", null);
        setField(term6009, term6009.getClass(), "pointer", null);
        setBooleanField(term6009, term6009.getClass(), "sealed", false);
        setField(term6008, term6008.getClass(), "parent", term6009);
        setField(term6008, term6008.getClass(), "namespaceMap", term6011);
        setField(term6008, term6008.getClass(), "reverseMap", term6012);
        setField(term6008, term6008.getClass(), "pointer", null);
        setBooleanField(term6008, term6008.getClass(), "sealed", false);
        setField(term6007, term6007.getClass(), "parent", term6008);
        setField(term6007, term6007.getClass(), "namespaceMap", term6013);
        setField(term6007, term6007.getClass(), "reverseMap", term6014);
        setField(term6007, term6007.getClass(), "pointer", null);
        setBooleanField(term6007, term6007.getClass(), "sealed", false);
        setField(term5992, term5992.getClass(), "namespaceResolver", term6007);
        setField(term5992, term5992.getClass(), "parent", null);
        setField(term5992, term5992.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isCollection", argTypes, term1040, args);
        assertTrue(recursiveEquals(term1040, term5992));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


