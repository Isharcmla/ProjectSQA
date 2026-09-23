package org.apache.commons.jxpath.ri.model.dom;

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
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.dom.EqualityUtils.*;
import java.util.HashMap;
import java.lang.Object;

public class DOMNodePointer_getDefaultNamespaceURI_180829482157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1143;
     Object term7024;

    public DOMNodePointer_getDefaultNamespaceURI_180829482157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1144 = new HashMap();
        HashMap term1178 = new HashMap();
        HashMap term1183 = new HashMap();
        HashMap term1189 = new HashMap();
        HashMap term1194 = new HashMap();
        HashMap term1200 = new HashMap();
        HashMap term1205 = new HashMap();
        HashMap term1214 = new HashMap();
        HashMap term1219 = new HashMap();
        term1143 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1173 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1174 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1175 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1176 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1213 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1225 = newInstance(Class.forName("java.lang.Object"));
        setField(term1143, term1143.getClass(), "node", null);
        setField(term1143, term1143.getClass(), "namespaces", term1144);
        setField(term1143, term1143.getClass(), "defaultNamespace", "flxyYxBRtu");
        setField(term1143, term1143.getClass(), "id", "OclPbYPkcH");
        setField(term1176, term1176.getClass(), "parent", null);
        setField(term1176, term1176.getClass(), "namespaceMap", null);
        setField(term1176, term1176.getClass(), "reverseMap", null);
        setField(term1176, term1176.getClass(), "pointer", null);
        setBooleanField(term1176, term1176.getClass(), "sealed", false);
        setField(term1175, term1175.getClass(), "parent", term1176);
        setField(term1175, term1175.getClass(), "namespaceMap", term1178);
        setField(term1175, term1175.getClass(), "reverseMap", term1183);
        setField(term1175, term1175.getClass(), "pointer", null);
        setBooleanField(term1175, term1175.getClass(), "sealed", false);
        setField(term1174, term1174.getClass(), "parent", term1175);
        setField(term1174, term1174.getClass(), "namespaceMap", term1189);
        setField(term1174, term1174.getClass(), "reverseMap", term1194);
        setField(term1174, term1174.getClass(), "pointer", null);
        setBooleanField(term1174, term1174.getClass(), "sealed", false);
        setField(term1173, term1173.getClass(), "parent", term1174);
        setField(term1173, term1173.getClass(), "namespaceMap", term1200);
        setField(term1173, term1173.getClass(), "reverseMap", term1205);
        setField(term1173, term1173.getClass(), "pointer", null);
        setBooleanField(term1173, term1173.getClass(), "sealed", false);
        setField(term1143, term1143.getClass(), "localNamespaceResolver", term1173);
        setIntField(term1143, term1143.getClass(), "index", -1339778481);
        setBooleanField(term1143, term1143.getClass(), "attribute", false);
        setField(term1213, term1213.getClass(), "parent", null);
        setField(term1213, term1213.getClass(), "namespaceMap", term1214);
        setField(term1213, term1213.getClass(), "reverseMap", term1219);
        setField(term1213, term1213.getClass(), "pointer", null);
        setBooleanField(term1213, term1213.getClass(), "sealed", false);
        setField(term1143, term1143.getClass(), "namespaceResolver", term1213);
        setField(term1143, term1143.getClass(), "rootNode", term1225);
        setField(term1143, term1143.getClass(), "parent", null);
        setField(term1143, term1143.getClass(), "locale", null);
        HashMap term7025 = new HashMap();
        HashMap term7034 = new HashMap();
        HashMap term7035 = new HashMap();
        HashMap term7036 = new HashMap();
        HashMap term7037 = new HashMap();
        HashMap term7038 = new HashMap();
        HashMap term7039 = new HashMap();
        HashMap term7041 = new HashMap();
        HashMap term7042 = new HashMap();
        term7024 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term7030 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7031 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7032 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7033 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7040 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7043 = newInstance(Class.forName("java.lang.Object"));
        setField(term7024, term7024.getClass(), "node", null);
        setField(term7024, term7024.getClass(), "namespaces", term7025);
        setField(term7024, term7024.getClass(), "defaultNamespace", "flxyYxBRtu");
        setField(term7024, term7024.getClass(), "id", "OclPbYPkcH");
        setField(term7033, term7033.getClass(), "parent", null);
        setField(term7033, term7033.getClass(), "namespaceMap", null);
        setField(term7033, term7033.getClass(), "reverseMap", null);
        setField(term7033, term7033.getClass(), "pointer", null);
        setBooleanField(term7033, term7033.getClass(), "sealed", false);
        setField(term7032, term7032.getClass(), "parent", term7033);
        setField(term7032, term7032.getClass(), "namespaceMap", term7034);
        setField(term7032, term7032.getClass(), "reverseMap", term7035);
        setField(term7032, term7032.getClass(), "pointer", null);
        setBooleanField(term7032, term7032.getClass(), "sealed", false);
        setField(term7031, term7031.getClass(), "parent", term7032);
        setField(term7031, term7031.getClass(), "namespaceMap", term7036);
        setField(term7031, term7031.getClass(), "reverseMap", term7037);
        setField(term7031, term7031.getClass(), "pointer", null);
        setBooleanField(term7031, term7031.getClass(), "sealed", false);
        setField(term7030, term7030.getClass(), "parent", term7031);
        setField(term7030, term7030.getClass(), "namespaceMap", term7038);
        setField(term7030, term7030.getClass(), "reverseMap", term7039);
        setField(term7030, term7030.getClass(), "pointer", null);
        setBooleanField(term7030, term7030.getClass(), "sealed", false);
        setField(term7024, term7024.getClass(), "localNamespaceResolver", term7030);
        setIntField(term7024, term7024.getClass(), "index", -1339778481);
        setBooleanField(term7024, term7024.getClass(), "attribute", false);
        setField(term7040, term7040.getClass(), "parent", null);
        setField(term7040, term7040.getClass(), "namespaceMap", term7041);
        setField(term7040, term7040.getClass(), "reverseMap", term7042);
        setField(term7040, term7040.getClass(), "pointer", null);
        setBooleanField(term7040, term7040.getClass(), "sealed", false);
        setField(term7024, term7024.getClass(), "namespaceResolver", term7040);
        setField(term7024, term7024.getClass(), "rootNode", term7043);
        setField(term7024, term7024.getClass(), "parent", null);
        setField(term7024, term7024.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDefaultNamespaceURI", argTypes, term1143, args);
        assertTrue(recursiveEquals(term1143, term7024));
        assertTrue(recursiveEquals(retValue, "flxyYxBRtu"));
    }

};


