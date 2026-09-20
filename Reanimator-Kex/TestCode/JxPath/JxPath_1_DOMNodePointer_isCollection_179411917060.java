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

public class DOMNodePointer_isCollection_179411917060 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1286;
     Object term6839;

    public DOMNodePointer_isCollection_179411917060() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1287 = new HashMap();
        HashMap term1324 = new HashMap();
        HashMap term1329 = new HashMap();
        HashMap term1335 = new HashMap();
        HashMap term1340 = new HashMap();
        HashMap term1346 = new HashMap();
        HashMap term1351 = new HashMap();
        term1286 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1318 = newInstance(Class.forName("java.lang.Object"));
        Object term1319 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1320 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1321 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1322 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1286, term1286.getClass(), "node", null);
        setField(term1286, term1286.getClass(), "namespaces", term1287);
        setField(term1286, term1286.getClass(), "defaultNamespace", "dWRymuLBtr");
        setField(term1286, term1286.getClass(), "id", "AijpHYOFuy");
        setIntField(term1286, term1286.getClass(), "index", 1134449235);
        setBooleanField(term1286, term1286.getClass(), "attribute", true);
        setField(term1286, term1286.getClass(), "rootNode", term1318);
        setField(term1322, term1322.getClass(), "parent", null);
        setField(term1322, term1322.getClass(), "namespaceMap", null);
        setField(term1322, term1322.getClass(), "reverseMap", null);
        setField(term1322, term1322.getClass(), "pointer", null);
        setField(term1322, term1322.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1322, term1322.getClass(), "sealed", false);
        setField(term1321, term1321.getClass(), "parent", term1322);
        setField(term1321, term1321.getClass(), "namespaceMap", term1324);
        setField(term1321, term1321.getClass(), "reverseMap", term1329);
        setField(term1321, term1321.getClass(), "pointer", null);
        setField(term1321, term1321.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1321, term1321.getClass(), "sealed", false);
        setField(term1320, term1320.getClass(), "parent", term1321);
        setField(term1320, term1320.getClass(), "namespaceMap", term1335);
        setField(term1320, term1320.getClass(), "reverseMap", term1340);
        setField(term1320, term1320.getClass(), "pointer", null);
        setField(term1320, term1320.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1320, term1320.getClass(), "sealed", false);
        setField(term1319, term1319.getClass(), "parent", term1320);
        setField(term1319, term1319.getClass(), "namespaceMap", term1346);
        setField(term1319, term1319.getClass(), "reverseMap", term1351);
        setField(term1319, term1319.getClass(), "pointer", null);
        setField(term1319, term1319.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1319, term1319.getClass(), "sealed", false);
        setField(term1286, term1286.getClass(), "namespaceResolver", term1319);
        setField(term1286, term1286.getClass(), "parent", null);
        setField(term1286, term1286.getClass(), "locale", null);
        HashMap term6840 = new HashMap();
        HashMap term6850 = new HashMap();
        HashMap term6851 = new HashMap();
        HashMap term6852 = new HashMap();
        HashMap term6853 = new HashMap();
        HashMap term6854 = new HashMap();
        HashMap term6855 = new HashMap();
        term6839 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term6845 = newInstance(Class.forName("java.lang.Object"));
        Object term6846 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6847 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6848 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6849 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term6839, term6839.getClass(), "node", null);
        setField(term6839, term6839.getClass(), "namespaces", term6840);
        setField(term6839, term6839.getClass(), "defaultNamespace", "dWRymuLBtr");
        setField(term6839, term6839.getClass(), "id", "AijpHYOFuy");
        setIntField(term6839, term6839.getClass(), "index", 1134449235);
        setBooleanField(term6839, term6839.getClass(), "attribute", true);
        setField(term6839, term6839.getClass(), "rootNode", term6845);
        setField(term6849, term6849.getClass(), "parent", null);
        setField(term6849, term6849.getClass(), "namespaceMap", null);
        setField(term6849, term6849.getClass(), "reverseMap", null);
        setField(term6849, term6849.getClass(), "pointer", null);
        setField(term6849, term6849.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6849, term6849.getClass(), "sealed", false);
        setField(term6848, term6848.getClass(), "parent", term6849);
        setField(term6848, term6848.getClass(), "namespaceMap", term6850);
        setField(term6848, term6848.getClass(), "reverseMap", term6851);
        setField(term6848, term6848.getClass(), "pointer", null);
        setField(term6848, term6848.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6848, term6848.getClass(), "sealed", false);
        setField(term6847, term6847.getClass(), "parent", term6848);
        setField(term6847, term6847.getClass(), "namespaceMap", term6852);
        setField(term6847, term6847.getClass(), "reverseMap", term6853);
        setField(term6847, term6847.getClass(), "pointer", null);
        setField(term6847, term6847.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6847, term6847.getClass(), "sealed", false);
        setField(term6846, term6846.getClass(), "parent", term6847);
        setField(term6846, term6846.getClass(), "namespaceMap", term6854);
        setField(term6846, term6846.getClass(), "reverseMap", term6855);
        setField(term6846, term6846.getClass(), "pointer", null);
        setField(term6846, term6846.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6846, term6846.getClass(), "sealed", false);
        setField(term6839, term6839.getClass(), "namespaceResolver", term6846);
        setField(term6839, term6839.getClass(), "parent", null);
        setField(term6839, term6839.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isCollection", argTypes, term1286, args);
        assertTrue(recursiveEquals(term1286, term6839));
        assertTrue(recursiveEquals(retValue, 0));
    }

};
