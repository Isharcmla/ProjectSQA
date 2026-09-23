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

public class JDOMNodePointer_getBaseValue_148194603153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term984;
     Object term5834;
     Object term5743;

    public JDOMNodePointer_getBaseValue_148194603153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1003 = new HashMap();
        HashMap term1008 = new HashMap();
        HashMap term1014 = new HashMap();
        HashMap term1019 = new HashMap();
        HashMap term1025 = new HashMap();
        HashMap term1030 = new HashMap();
        HashMap term1041 = new HashMap();
        HashMap term1046 = new HashMap();
        HashMap term1052 = new HashMap();
        HashMap term1057 = new HashMap();
        HashMap term1063 = new HashMap();
        HashMap term1068 = new HashMap();
        term984 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term985 = newInstance(Class.forName("java.lang.Object"));
        Object term998 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term999 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1000 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1001 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1038 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1039 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1040 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1074 = newInstance(Class.forName("java.lang.Object"));
        setField(term984, term984.getClass(), "node", term985);
        setField(term984, term984.getClass(), "id", "oVcInYnLWB");
        setField(term1001, term1001.getClass(), "parent", null);
        setField(term1001, term1001.getClass(), "namespaceMap", null);
        setField(term1001, term1001.getClass(), "reverseMap", null);
        setField(term1001, term1001.getClass(), "pointer", null);
        setBooleanField(term1001, term1001.getClass(), "sealed", false);
        setField(term1000, term1000.getClass(), "parent", term1001);
        setField(term1000, term1000.getClass(), "namespaceMap", term1003);
        setField(term1000, term1000.getClass(), "reverseMap", term1008);
        setField(term1000, term1000.getClass(), "pointer", null);
        setBooleanField(term1000, term1000.getClass(), "sealed", false);
        setField(term999, term999.getClass(), "parent", term1000);
        setField(term999, term999.getClass(), "namespaceMap", term1014);
        setField(term999, term999.getClass(), "reverseMap", term1019);
        setField(term999, term999.getClass(), "pointer", null);
        setBooleanField(term999, term999.getClass(), "sealed", false);
        setField(term998, term998.getClass(), "parent", term999);
        setField(term998, term998.getClass(), "namespaceMap", term1025);
        setField(term998, term998.getClass(), "reverseMap", term1030);
        setField(term998, term998.getClass(), "pointer", null);
        setBooleanField(term998, term998.getClass(), "sealed", false);
        setField(term984, term984.getClass(), "localNamespaceResolver", term998);
        setIntField(term984, term984.getClass(), "index", 1227103734);
        setBooleanField(term984, term984.getClass(), "attribute", true);
        setField(term1040, term1040.getClass(), "parent", null);
        setField(term1040, term1040.getClass(), "namespaceMap", term1041);
        setField(term1040, term1040.getClass(), "reverseMap", term1046);
        setField(term1040, term1040.getClass(), "pointer", null);
        setBooleanField(term1040, term1040.getClass(), "sealed", false);
        setField(term1039, term1039.getClass(), "parent", term1040);
        setField(term1039, term1039.getClass(), "namespaceMap", term1052);
        setField(term1039, term1039.getClass(), "reverseMap", term1057);
        setField(term1039, term1039.getClass(), "pointer", null);
        setBooleanField(term1039, term1039.getClass(), "sealed", false);
        setField(term1038, term1038.getClass(), "parent", term1039);
        setField(term1038, term1038.getClass(), "namespaceMap", term1063);
        setField(term1038, term1038.getClass(), "reverseMap", term1068);
        setField(term1038, term1038.getClass(), "pointer", null);
        setBooleanField(term1038, term1038.getClass(), "sealed", false);
        setField(term984, term984.getClass(), "namespaceResolver", term1038);
        setField(term984, term984.getClass(), "rootNode", term1074);
        setField(term984, term984.getClass(), "parent", null);
        setField(term984, term984.getClass(), "locale", null);
        HashMap term5842 = new HashMap();
        HashMap term5843 = new HashMap();
        HashMap term5844 = new HashMap();
        HashMap term5845 = new HashMap();
        HashMap term5846 = new HashMap();
        HashMap term5847 = new HashMap();
        HashMap term5851 = new HashMap();
        HashMap term5852 = new HashMap();
        HashMap term5853 = new HashMap();
        HashMap term5854 = new HashMap();
        HashMap term5855 = new HashMap();
        HashMap term5856 = new HashMap();
        term5834 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term5835 = newInstance(Class.forName("java.lang.Object"));
        Object term5838 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5839 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5840 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5841 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5848 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5849 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5850 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5857 = newInstance(Class.forName("java.lang.Object"));
        setField(term5834, term5834.getClass(), "node", term5835);
        setField(term5834, term5834.getClass(), "id", "oVcInYnLWB");
        setField(term5841, term5841.getClass(), "parent", null);
        setField(term5841, term5841.getClass(), "namespaceMap", null);
        setField(term5841, term5841.getClass(), "reverseMap", null);
        setField(term5841, term5841.getClass(), "pointer", null);
        setBooleanField(term5841, term5841.getClass(), "sealed", false);
        setField(term5840, term5840.getClass(), "parent", term5841);
        setField(term5840, term5840.getClass(), "namespaceMap", term5842);
        setField(term5840, term5840.getClass(), "reverseMap", term5843);
        setField(term5840, term5840.getClass(), "pointer", null);
        setBooleanField(term5840, term5840.getClass(), "sealed", false);
        setField(term5839, term5839.getClass(), "parent", term5840);
        setField(term5839, term5839.getClass(), "namespaceMap", term5844);
        setField(term5839, term5839.getClass(), "reverseMap", term5845);
        setField(term5839, term5839.getClass(), "pointer", null);
        setBooleanField(term5839, term5839.getClass(), "sealed", false);
        setField(term5838, term5838.getClass(), "parent", term5839);
        setField(term5838, term5838.getClass(), "namespaceMap", term5846);
        setField(term5838, term5838.getClass(), "reverseMap", term5847);
        setField(term5838, term5838.getClass(), "pointer", null);
        setBooleanField(term5838, term5838.getClass(), "sealed", false);
        setField(term5834, term5834.getClass(), "localNamespaceResolver", term5838);
        setIntField(term5834, term5834.getClass(), "index", 1227103734);
        setBooleanField(term5834, term5834.getClass(), "attribute", true);
        setField(term5850, term5850.getClass(), "parent", null);
        setField(term5850, term5850.getClass(), "namespaceMap", term5851);
        setField(term5850, term5850.getClass(), "reverseMap", term5852);
        setField(term5850, term5850.getClass(), "pointer", null);
        setBooleanField(term5850, term5850.getClass(), "sealed", false);
        setField(term5849, term5849.getClass(), "parent", term5850);
        setField(term5849, term5849.getClass(), "namespaceMap", term5853);
        setField(term5849, term5849.getClass(), "reverseMap", term5854);
        setField(term5849, term5849.getClass(), "pointer", null);
        setBooleanField(term5849, term5849.getClass(), "sealed", false);
        setField(term5848, term5848.getClass(), "parent", term5849);
        setField(term5848, term5848.getClass(), "namespaceMap", term5855);
        setField(term5848, term5848.getClass(), "reverseMap", term5856);
        setField(term5848, term5848.getClass(), "pointer", null);
        setBooleanField(term5848, term5848.getClass(), "sealed", false);
        setField(term5834, term5834.getClass(), "namespaceResolver", term5848);
        setField(term5834, term5834.getClass(), "rootNode", term5857);
        setField(term5834, term5834.getClass(), "parent", null);
        setField(term5834, term5834.getClass(), "locale", null);
        term5743 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getBaseValue", argTypes, term984, args);
        assertTrue(recursiveEquals(term984, term5834));
        assertTrue(recursiveEquals(retValue, term5743));
    }

};


