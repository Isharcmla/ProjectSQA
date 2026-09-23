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

public class JDOMNodePointer_isLeaf_159295491658 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1232;
     Object term6256;

    public JDOMNodePointer_isLeaf_159295491658() {
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
        HashMap term1290 = new HashMap();
        HashMap term1296 = new HashMap();
        HashMap term1301 = new HashMap();
        HashMap term1307 = new HashMap();
        HashMap term1312 = new HashMap();
        term1232 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1233 = newInstance(Class.forName("java.lang.Object"));
        Object term1246 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1247 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1248 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1249 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1286 = newInstance(Class.forName("java.lang.Object"));
        Object term1287 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1288 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1289 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1232, term1232.getClass(), "node", term1233);
        setField(term1232, term1232.getClass(), "id", "tbcdzjIfER");
        setField(term1249, term1249.getClass(), "parent", null);
        setField(term1249, term1249.getClass(), "namespaceMap", null);
        setField(term1249, term1249.getClass(), "reverseMap", null);
        setField(term1249, term1249.getClass(), "pointer", null);
        setBooleanField(term1249, term1249.getClass(), "sealed", false);
        setField(term1248, term1248.getClass(), "parent", term1249);
        setField(term1248, term1248.getClass(), "namespaceMap", term1251);
        setField(term1248, term1248.getClass(), "reverseMap", term1256);
        setField(term1248, term1248.getClass(), "pointer", null);
        setBooleanField(term1248, term1248.getClass(), "sealed", false);
        setField(term1247, term1247.getClass(), "parent", term1248);
        setField(term1247, term1247.getClass(), "namespaceMap", term1262);
        setField(term1247, term1247.getClass(), "reverseMap", term1267);
        setField(term1247, term1247.getClass(), "pointer", null);
        setBooleanField(term1247, term1247.getClass(), "sealed", false);
        setField(term1246, term1246.getClass(), "parent", term1247);
        setField(term1246, term1246.getClass(), "namespaceMap", term1273);
        setField(term1246, term1246.getClass(), "reverseMap", term1278);
        setField(term1246, term1246.getClass(), "pointer", null);
        setBooleanField(term1246, term1246.getClass(), "sealed", false);
        setField(term1232, term1232.getClass(), "localNamespaceResolver", term1246);
        setIntField(term1232, term1232.getClass(), "index", -522618178);
        setBooleanField(term1232, term1232.getClass(), "attribute", false);
        setField(term1232, term1232.getClass(), "rootNode", term1286);
        setField(term1289, term1289.getClass(), "parent", null);
        setField(term1289, term1289.getClass(), "namespaceMap", term1290);
        setField(term1289, term1289.getClass(), "reverseMap", null);
        setField(term1289, term1289.getClass(), "pointer", null);
        setBooleanField(term1289, term1289.getClass(), "sealed", false);
        setField(term1288, term1288.getClass(), "parent", term1289);
        setField(term1288, term1288.getClass(), "namespaceMap", term1296);
        setField(term1288, term1288.getClass(), "reverseMap", term1301);
        setField(term1288, term1288.getClass(), "pointer", null);
        setBooleanField(term1288, term1288.getClass(), "sealed", false);
        setField(term1287, term1287.getClass(), "parent", term1288);
        setField(term1287, term1287.getClass(), "namespaceMap", term1307);
        setField(term1287, term1287.getClass(), "reverseMap", term1312);
        setField(term1287, term1287.getClass(), "pointer", null);
        setBooleanField(term1287, term1287.getClass(), "sealed", false);
        setField(term1232, term1232.getClass(), "namespaceResolver", term1287);
        setField(term1232, term1232.getClass(), "parent", null);
        setField(term1232, term1232.getClass(), "locale", null);
        HashMap term6264 = new HashMap();
        HashMap term6265 = new HashMap();
        HashMap term6266 = new HashMap();
        HashMap term6267 = new HashMap();
        HashMap term6268 = new HashMap();
        HashMap term6269 = new HashMap();
        HashMap term6274 = new HashMap();
        HashMap term6275 = new HashMap();
        HashMap term6276 = new HashMap();
        HashMap term6277 = new HashMap();
        HashMap term6278 = new HashMap();
        term6256 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term6257 = newInstance(Class.forName("java.lang.Object"));
        Object term6260 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6261 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6262 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6263 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6270 = newInstance(Class.forName("java.lang.Object"));
        Object term6271 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6272 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6273 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term6256, term6256.getClass(), "node", term6257);
        setField(term6256, term6256.getClass(), "id", "tbcdzjIfER");
        setField(term6263, term6263.getClass(), "parent", null);
        setField(term6263, term6263.getClass(), "namespaceMap", null);
        setField(term6263, term6263.getClass(), "reverseMap", null);
        setField(term6263, term6263.getClass(), "pointer", null);
        setBooleanField(term6263, term6263.getClass(), "sealed", false);
        setField(term6262, term6262.getClass(), "parent", term6263);
        setField(term6262, term6262.getClass(), "namespaceMap", term6264);
        setField(term6262, term6262.getClass(), "reverseMap", term6265);
        setField(term6262, term6262.getClass(), "pointer", null);
        setBooleanField(term6262, term6262.getClass(), "sealed", false);
        setField(term6261, term6261.getClass(), "parent", term6262);
        setField(term6261, term6261.getClass(), "namespaceMap", term6266);
        setField(term6261, term6261.getClass(), "reverseMap", term6267);
        setField(term6261, term6261.getClass(), "pointer", null);
        setBooleanField(term6261, term6261.getClass(), "sealed", false);
        setField(term6260, term6260.getClass(), "parent", term6261);
        setField(term6260, term6260.getClass(), "namespaceMap", term6268);
        setField(term6260, term6260.getClass(), "reverseMap", term6269);
        setField(term6260, term6260.getClass(), "pointer", null);
        setBooleanField(term6260, term6260.getClass(), "sealed", false);
        setField(term6256, term6256.getClass(), "localNamespaceResolver", term6260);
        setIntField(term6256, term6256.getClass(), "index", -522618178);
        setBooleanField(term6256, term6256.getClass(), "attribute", false);
        setField(term6256, term6256.getClass(), "rootNode", term6270);
        setField(term6273, term6273.getClass(), "parent", null);
        setField(term6273, term6273.getClass(), "namespaceMap", term6274);
        setField(term6273, term6273.getClass(), "reverseMap", null);
        setField(term6273, term6273.getClass(), "pointer", null);
        setBooleanField(term6273, term6273.getClass(), "sealed", false);
        setField(term6272, term6272.getClass(), "parent", term6273);
        setField(term6272, term6272.getClass(), "namespaceMap", term6275);
        setField(term6272, term6272.getClass(), "reverseMap", term6276);
        setField(term6272, term6272.getClass(), "pointer", null);
        setBooleanField(term6272, term6272.getClass(), "sealed", false);
        setField(term6271, term6271.getClass(), "parent", term6272);
        setField(term6271, term6271.getClass(), "namespaceMap", term6277);
        setField(term6271, term6271.getClass(), "reverseMap", term6278);
        setField(term6271, term6271.getClass(), "pointer", null);
        setBooleanField(term6271, term6271.getClass(), "sealed", false);
        setField(term6256, term6256.getClass(), "namespaceResolver", term6271);
        setField(term6256, term6256.getClass(), "parent", null);
        setField(term6256, term6256.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isLeaf", argTypes, term1232, args);
        assertTrue(recursiveEquals(term1232, term6256));
        assertTrue(recursiveEquals(retValue, true));
    }

};


