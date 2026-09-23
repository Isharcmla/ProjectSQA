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

public class JDOMNodePointer_isLeaf_159295491656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1287;
     Object term6246;

    public JDOMNodePointer_isLeaf_159295491656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1306 = new HashMap();
        HashMap term1311 = new HashMap();
        HashMap term1317 = new HashMap();
        HashMap term1322 = new HashMap();
        HashMap term1328 = new HashMap();
        HashMap term1333 = new HashMap();
        HashMap term1344 = new HashMap();
        HashMap term1349 = new HashMap();
        HashMap term1355 = new HashMap();
        HashMap term1360 = new HashMap();
        HashMap term1366 = new HashMap();
        HashMap term1371 = new HashMap();
        term1287 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1288 = newInstance(Class.forName("java.lang.Object"));
        Object term1301 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1302 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1303 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1304 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1341 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1342 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1343 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1377 = newInstance(Class.forName("java.lang.Object"));
        setField(term1287, term1287.getClass(), "node", term1288);
        setField(term1287, term1287.getClass(), "id", "tbcdzjIfER");
        setField(term1304, term1304.getClass(), "parent", null);
        setField(term1304, term1304.getClass(), "namespaceMap", null);
        setField(term1304, term1304.getClass(), "reverseMap", null);
        setField(term1304, term1304.getClass(), "pointer", null);
        setBooleanField(term1304, term1304.getClass(), "sealed", false);
        setField(term1303, term1303.getClass(), "parent", term1304);
        setField(term1303, term1303.getClass(), "namespaceMap", term1306);
        setField(term1303, term1303.getClass(), "reverseMap", term1311);
        setField(term1303, term1303.getClass(), "pointer", null);
        setBooleanField(term1303, term1303.getClass(), "sealed", false);
        setField(term1302, term1302.getClass(), "parent", term1303);
        setField(term1302, term1302.getClass(), "namespaceMap", term1317);
        setField(term1302, term1302.getClass(), "reverseMap", term1322);
        setField(term1302, term1302.getClass(), "pointer", null);
        setBooleanField(term1302, term1302.getClass(), "sealed", false);
        setField(term1301, term1301.getClass(), "parent", term1302);
        setField(term1301, term1301.getClass(), "namespaceMap", term1328);
        setField(term1301, term1301.getClass(), "reverseMap", term1333);
        setField(term1301, term1301.getClass(), "pointer", null);
        setBooleanField(term1301, term1301.getClass(), "sealed", false);
        setField(term1287, term1287.getClass(), "localNamespaceResolver", term1301);
        setIntField(term1287, term1287.getClass(), "index", -522618178);
        setBooleanField(term1287, term1287.getClass(), "attribute", false);
        setField(term1343, term1343.getClass(), "parent", null);
        setField(term1343, term1343.getClass(), "namespaceMap", term1344);
        setField(term1343, term1343.getClass(), "reverseMap", term1349);
        setField(term1343, term1343.getClass(), "pointer", null);
        setBooleanField(term1343, term1343.getClass(), "sealed", false);
        setField(term1342, term1342.getClass(), "parent", term1343);
        setField(term1342, term1342.getClass(), "namespaceMap", term1355);
        setField(term1342, term1342.getClass(), "reverseMap", term1360);
        setField(term1342, term1342.getClass(), "pointer", null);
        setBooleanField(term1342, term1342.getClass(), "sealed", false);
        setField(term1341, term1341.getClass(), "parent", term1342);
        setField(term1341, term1341.getClass(), "namespaceMap", term1366);
        setField(term1341, term1341.getClass(), "reverseMap", term1371);
        setField(term1341, term1341.getClass(), "pointer", null);
        setBooleanField(term1341, term1341.getClass(), "sealed", false);
        setField(term1287, term1287.getClass(), "namespaceResolver", term1341);
        setField(term1287, term1287.getClass(), "rootNode", term1377);
        setField(term1287, term1287.getClass(), "parent", null);
        setField(term1287, term1287.getClass(), "locale", null);
        HashMap term6254 = new HashMap();
        HashMap term6255 = new HashMap();
        HashMap term6256 = new HashMap();
        HashMap term6257 = new HashMap();
        HashMap term6258 = new HashMap();
        HashMap term6259 = new HashMap();
        HashMap term6263 = new HashMap();
        HashMap term6264 = new HashMap();
        HashMap term6265 = new HashMap();
        HashMap term6266 = new HashMap();
        HashMap term6267 = new HashMap();
        HashMap term6268 = new HashMap();
        term6246 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term6247 = newInstance(Class.forName("java.lang.Object"));
        Object term6250 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6251 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6252 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6253 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6260 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6261 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6262 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6269 = newInstance(Class.forName("java.lang.Object"));
        setField(term6246, term6246.getClass(), "node", term6247);
        setField(term6246, term6246.getClass(), "id", "tbcdzjIfER");
        setField(term6253, term6253.getClass(), "parent", null);
        setField(term6253, term6253.getClass(), "namespaceMap", null);
        setField(term6253, term6253.getClass(), "reverseMap", null);
        setField(term6253, term6253.getClass(), "pointer", null);
        setBooleanField(term6253, term6253.getClass(), "sealed", false);
        setField(term6252, term6252.getClass(), "parent", term6253);
        setField(term6252, term6252.getClass(), "namespaceMap", term6254);
        setField(term6252, term6252.getClass(), "reverseMap", term6255);
        setField(term6252, term6252.getClass(), "pointer", null);
        setBooleanField(term6252, term6252.getClass(), "sealed", false);
        setField(term6251, term6251.getClass(), "parent", term6252);
        setField(term6251, term6251.getClass(), "namespaceMap", term6256);
        setField(term6251, term6251.getClass(), "reverseMap", term6257);
        setField(term6251, term6251.getClass(), "pointer", null);
        setBooleanField(term6251, term6251.getClass(), "sealed", false);
        setField(term6250, term6250.getClass(), "parent", term6251);
        setField(term6250, term6250.getClass(), "namespaceMap", term6258);
        setField(term6250, term6250.getClass(), "reverseMap", term6259);
        setField(term6250, term6250.getClass(), "pointer", null);
        setBooleanField(term6250, term6250.getClass(), "sealed", false);
        setField(term6246, term6246.getClass(), "localNamespaceResolver", term6250);
        setIntField(term6246, term6246.getClass(), "index", -522618178);
        setBooleanField(term6246, term6246.getClass(), "attribute", false);
        setField(term6262, term6262.getClass(), "parent", null);
        setField(term6262, term6262.getClass(), "namespaceMap", term6263);
        setField(term6262, term6262.getClass(), "reverseMap", term6264);
        setField(term6262, term6262.getClass(), "pointer", null);
        setBooleanField(term6262, term6262.getClass(), "sealed", false);
        setField(term6261, term6261.getClass(), "parent", term6262);
        setField(term6261, term6261.getClass(), "namespaceMap", term6265);
        setField(term6261, term6261.getClass(), "reverseMap", term6266);
        setField(term6261, term6261.getClass(), "pointer", null);
        setBooleanField(term6261, term6261.getClass(), "sealed", false);
        setField(term6260, term6260.getClass(), "parent", term6261);
        setField(term6260, term6260.getClass(), "namespaceMap", term6267);
        setField(term6260, term6260.getClass(), "reverseMap", term6268);
        setField(term6260, term6260.getClass(), "pointer", null);
        setBooleanField(term6260, term6260.getClass(), "sealed", false);
        setField(term6246, term6246.getClass(), "namespaceResolver", term6260);
        setField(term6246, term6246.getClass(), "rootNode", term6269);
        setField(term6246, term6246.getClass(), "parent", null);
        setField(term6246, term6246.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isLeaf", argTypes, term1287, args);
        assertTrue(recursiveEquals(term1287, term6246));
        assertTrue(recursiveEquals(retValue, true));
    }

};


