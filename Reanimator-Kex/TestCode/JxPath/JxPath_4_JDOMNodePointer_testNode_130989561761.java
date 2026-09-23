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

public class JDOMNodePointer_testNode_130989561761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1229;
     Object term5779;

    public JDOMNodePointer_testNode_130989561761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1251 = new HashMap();
        HashMap term1256 = new HashMap();
        HashMap term1262 = new HashMap();
        HashMap term1267 = new HashMap();
        HashMap term1273 = new HashMap();
        HashMap term1278 = new HashMap();
        term1229 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1230 = newInstance(Class.forName("java.lang.Object"));
        Object term1245 = newInstance(Class.forName("java.lang.Object"));
        Object term1246 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1247 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1248 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1249 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1229, term1229.getClass(), "node", term1230);
        setField(term1229, term1229.getClass(), "id", "xOEqzGAmDU");
        setIntField(term1229, term1229.getClass(), "index", -1685132342);
        setBooleanField(term1229, term1229.getClass(), "attribute", true);
        setField(term1229, term1229.getClass(), "rootNode", term1245);
        setField(term1249, term1249.getClass(), "parent", null);
        setField(term1249, term1249.getClass(), "namespaceMap", null);
        setField(term1249, term1249.getClass(), "reverseMap", null);
        setField(term1249, term1249.getClass(), "pointer", null);
        setField(term1249, term1249.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1249, term1249.getClass(), "sealed", false);
        setField(term1248, term1248.getClass(), "parent", term1249);
        setField(term1248, term1248.getClass(), "namespaceMap", term1251);
        setField(term1248, term1248.getClass(), "reverseMap", term1256);
        setField(term1248, term1248.getClass(), "pointer", null);
        setField(term1248, term1248.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1248, term1248.getClass(), "sealed", false);
        setField(term1247, term1247.getClass(), "parent", term1248);
        setField(term1247, term1247.getClass(), "namespaceMap", term1262);
        setField(term1247, term1247.getClass(), "reverseMap", term1267);
        setField(term1247, term1247.getClass(), "pointer", null);
        setField(term1247, term1247.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1247, term1247.getClass(), "sealed", false);
        setField(term1246, term1246.getClass(), "parent", term1247);
        setField(term1246, term1246.getClass(), "namespaceMap", term1273);
        setField(term1246, term1246.getClass(), "reverseMap", term1278);
        setField(term1246, term1246.getClass(), "pointer", null);
        setField(term1246, term1246.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1246, term1246.getClass(), "sealed", false);
        setField(term1229, term1229.getClass(), "namespaceResolver", term1246);
        setField(term1229, term1229.getClass(), "parent", null);
        setField(term1229, term1229.getClass(), "locale", null);
        HashMap term5788 = new HashMap();
        HashMap term5789 = new HashMap();
        HashMap term5790 = new HashMap();
        HashMap term5791 = new HashMap();
        HashMap term5792 = new HashMap();
        HashMap term5793 = new HashMap();
        term5779 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term5780 = newInstance(Class.forName("java.lang.Object"));
        Object term5783 = newInstance(Class.forName("java.lang.Object"));
        Object term5784 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5785 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5786 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5787 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term5779, term5779.getClass(), "node", term5780);
        setField(term5779, term5779.getClass(), "id", "xOEqzGAmDU");
        setIntField(term5779, term5779.getClass(), "index", -1685132342);
        setBooleanField(term5779, term5779.getClass(), "attribute", true);
        setField(term5779, term5779.getClass(), "rootNode", term5783);
        setField(term5787, term5787.getClass(), "parent", null);
        setField(term5787, term5787.getClass(), "namespaceMap", null);
        setField(term5787, term5787.getClass(), "reverseMap", null);
        setField(term5787, term5787.getClass(), "pointer", null);
        setField(term5787, term5787.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term5787, term5787.getClass(), "sealed", false);
        setField(term5786, term5786.getClass(), "parent", term5787);
        setField(term5786, term5786.getClass(), "namespaceMap", term5788);
        setField(term5786, term5786.getClass(), "reverseMap", term5789);
        setField(term5786, term5786.getClass(), "pointer", null);
        setField(term5786, term5786.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term5786, term5786.getClass(), "sealed", false);
        setField(term5785, term5785.getClass(), "parent", term5786);
        setField(term5785, term5785.getClass(), "namespaceMap", term5790);
        setField(term5785, term5785.getClass(), "reverseMap", term5791);
        setField(term5785, term5785.getClass(), "pointer", null);
        setField(term5785, term5785.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term5785, term5785.getClass(), "sealed", false);
        setField(term5784, term5784.getClass(), "parent", term5785);
        setField(term5784, term5784.getClass(), "namespaceMap", term5792);
        setField(term5784, term5784.getClass(), "reverseMap", term5793);
        setField(term5784, term5784.getClass(), "pointer", null);
        setField(term5784, term5784.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term5784, term5784.getClass(), "sealed", false);
        setField(term5779, term5779.getClass(), "namespaceResolver", term5784);
        setField(term5779, term5779.getClass(), "parent", null);
        setField(term5779, term5779.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "testNode", argTypes, term1229, args);
        assertTrue(recursiveEquals(term1229, term5779));
    }

};


