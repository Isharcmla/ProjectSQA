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

public class DOMNodePointer_getDefaultNamespaceURI_180829482158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1134;
     Object term7071;

    public DOMNodePointer_getDefaultNamespaceURI_180829482158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1135 = new HashMap();
        HashMap term1169 = new HashMap();
        HashMap term1174 = new HashMap();
        HashMap term1180 = new HashMap();
        HashMap term1185 = new HashMap();
        HashMap term1191 = new HashMap();
        HashMap term1196 = new HashMap();
        HashMap term1205 = new HashMap();
        HashMap term1210 = new HashMap();
        term1134 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1164 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1165 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1166 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1167 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1204 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1134, term1134.getClass(), "node", null);
        setField(term1134, term1134.getClass(), "namespaces", term1135);
        setField(term1134, term1134.getClass(), "defaultNamespace", "flxyYxBRtu");
        setField(term1134, term1134.getClass(), "id", "OclPbYPkcH");
        setField(term1167, term1167.getClass(), "parent", null);
        setField(term1167, term1167.getClass(), "namespaceMap", null);
        setField(term1167, term1167.getClass(), "reverseMap", null);
        setField(term1167, term1167.getClass(), "pointer", null);
        setBooleanField(term1167, term1167.getClass(), "sealed", false);
        setField(term1166, term1166.getClass(), "parent", term1167);
        setField(term1166, term1166.getClass(), "namespaceMap", term1169);
        setField(term1166, term1166.getClass(), "reverseMap", term1174);
        setField(term1166, term1166.getClass(), "pointer", null);
        setBooleanField(term1166, term1166.getClass(), "sealed", false);
        setField(term1165, term1165.getClass(), "parent", term1166);
        setField(term1165, term1165.getClass(), "namespaceMap", term1180);
        setField(term1165, term1165.getClass(), "reverseMap", term1185);
        setField(term1165, term1165.getClass(), "pointer", null);
        setBooleanField(term1165, term1165.getClass(), "sealed", false);
        setField(term1164, term1164.getClass(), "parent", term1165);
        setField(term1164, term1164.getClass(), "namespaceMap", term1191);
        setField(term1164, term1164.getClass(), "reverseMap", term1196);
        setField(term1164, term1164.getClass(), "pointer", null);
        setBooleanField(term1164, term1164.getClass(), "sealed", false);
        setField(term1134, term1134.getClass(), "localNamespaceResolver", term1164);
        setIntField(term1134, term1134.getClass(), "index", -1339778481);
        setBooleanField(term1134, term1134.getClass(), "attribute", false);
        setField(term1204, term1204.getClass(), "parent", null);
        setField(term1204, term1204.getClass(), "namespaceMap", term1205);
        setField(term1204, term1204.getClass(), "reverseMap", term1210);
        setField(term1204, term1204.getClass(), "pointer", null);
        setBooleanField(term1204, term1204.getClass(), "sealed", false);
        setField(term1134, term1134.getClass(), "namespaceResolver", term1204);
        setField(term1134, term1134.getClass(), "exceptionHandler", null);
        setField(term1134, term1134.getClass(), "rootNode", null);
        setField(term1134, term1134.getClass(), "parent", null);
        setField(term1134, term1134.getClass(), "locale", null);
        HashMap term7072 = new HashMap();
        HashMap term7081 = new HashMap();
        HashMap term7082 = new HashMap();
        HashMap term7083 = new HashMap();
        HashMap term7084 = new HashMap();
        HashMap term7085 = new HashMap();
        HashMap term7086 = new HashMap();
        HashMap term7088 = new HashMap();
        HashMap term7089 = new HashMap();
        term7071 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term7077 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7078 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7079 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7080 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7087 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term7071, term7071.getClass(), "node", null);
        setField(term7071, term7071.getClass(), "namespaces", term7072);
        setField(term7071, term7071.getClass(), "defaultNamespace", "flxyYxBRtu");
        setField(term7071, term7071.getClass(), "id", "OclPbYPkcH");
        setField(term7080, term7080.getClass(), "parent", null);
        setField(term7080, term7080.getClass(), "namespaceMap", null);
        setField(term7080, term7080.getClass(), "reverseMap", null);
        setField(term7080, term7080.getClass(), "pointer", null);
        setBooleanField(term7080, term7080.getClass(), "sealed", false);
        setField(term7079, term7079.getClass(), "parent", term7080);
        setField(term7079, term7079.getClass(), "namespaceMap", term7081);
        setField(term7079, term7079.getClass(), "reverseMap", term7082);
        setField(term7079, term7079.getClass(), "pointer", null);
        setBooleanField(term7079, term7079.getClass(), "sealed", false);
        setField(term7078, term7078.getClass(), "parent", term7079);
        setField(term7078, term7078.getClass(), "namespaceMap", term7083);
        setField(term7078, term7078.getClass(), "reverseMap", term7084);
        setField(term7078, term7078.getClass(), "pointer", null);
        setBooleanField(term7078, term7078.getClass(), "sealed", false);
        setField(term7077, term7077.getClass(), "parent", term7078);
        setField(term7077, term7077.getClass(), "namespaceMap", term7085);
        setField(term7077, term7077.getClass(), "reverseMap", term7086);
        setField(term7077, term7077.getClass(), "pointer", null);
        setBooleanField(term7077, term7077.getClass(), "sealed", false);
        setField(term7071, term7071.getClass(), "localNamespaceResolver", term7077);
        setIntField(term7071, term7071.getClass(), "index", -1339778481);
        setBooleanField(term7071, term7071.getClass(), "attribute", false);
        setField(term7087, term7087.getClass(), "parent", null);
        setField(term7087, term7087.getClass(), "namespaceMap", term7088);
        setField(term7087, term7087.getClass(), "reverseMap", term7089);
        setField(term7087, term7087.getClass(), "pointer", null);
        setBooleanField(term7087, term7087.getClass(), "sealed", false);
        setField(term7071, term7071.getClass(), "namespaceResolver", term7087);
        setField(term7071, term7071.getClass(), "exceptionHandler", null);
        setField(term7071, term7071.getClass(), "rootNode", null);
        setField(term7071, term7071.getClass(), "parent", null);
        setField(term7071, term7071.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDefaultNamespaceURI", argTypes, term1134, args);
        assertTrue(recursiveEquals(term1134, term7071));
        assertTrue(recursiveEquals(retValue, "flxyYxBRtu"));
    }

};


