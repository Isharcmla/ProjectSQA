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
     Object term1308;
     Object term6936;

    public DOMNodePointer_isCollection_179411917060() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1309 = new HashMap();
        HashMap term1346 = new HashMap();
        HashMap term1351 = new HashMap();
        HashMap term1357 = new HashMap();
        HashMap term1362 = new HashMap();
        HashMap term1368 = new HashMap();
        HashMap term1373 = new HashMap();
        term1308 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1340 = newInstance(Class.forName("java.lang.Object"));
        Object term1341 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1342 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1343 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1344 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1308, term1308.getClass(), "node", null);
        setField(term1308, term1308.getClass(), "namespaces", term1309);
        setField(term1308, term1308.getClass(), "defaultNamespace", "AijpHYOFuy");
        setField(term1308, term1308.getClass(), "id", "SbAoxhfrkn");
        setIntField(term1308, term1308.getClass(), "index", 1134449235);
        setBooleanField(term1308, term1308.getClass(), "attribute", true);
        setField(term1308, term1308.getClass(), "rootNode", term1340);
        setField(term1344, term1344.getClass(), "parent", null);
        setField(term1344, term1344.getClass(), "namespaceMap", null);
        setField(term1344, term1344.getClass(), "reverseMap", null);
        setField(term1344, term1344.getClass(), "pointer", null);
        setField(term1344, term1344.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1344, term1344.getClass(), "sealed", false);
        setField(term1343, term1343.getClass(), "parent", term1344);
        setField(term1343, term1343.getClass(), "namespaceMap", term1346);
        setField(term1343, term1343.getClass(), "reverseMap", term1351);
        setField(term1343, term1343.getClass(), "pointer", null);
        setField(term1343, term1343.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1343, term1343.getClass(), "sealed", false);
        setField(term1342, term1342.getClass(), "parent", term1343);
        setField(term1342, term1342.getClass(), "namespaceMap", term1357);
        setField(term1342, term1342.getClass(), "reverseMap", term1362);
        setField(term1342, term1342.getClass(), "pointer", null);
        setField(term1342, term1342.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1342, term1342.getClass(), "sealed", false);
        setField(term1341, term1341.getClass(), "parent", term1342);
        setField(term1341, term1341.getClass(), "namespaceMap", term1368);
        setField(term1341, term1341.getClass(), "reverseMap", term1373);
        setField(term1341, term1341.getClass(), "pointer", null);
        setField(term1341, term1341.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1341, term1341.getClass(), "sealed", false);
        setField(term1308, term1308.getClass(), "namespaceResolver", term1341);
        setField(term1308, term1308.getClass(), "parent", null);
        setField(term1308, term1308.getClass(), "locale", null);
        HashMap term6937 = new HashMap();
        HashMap term6947 = new HashMap();
        HashMap term6948 = new HashMap();
        HashMap term6949 = new HashMap();
        HashMap term6950 = new HashMap();
        HashMap term6951 = new HashMap();
        HashMap term6952 = new HashMap();
        term6936 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term6942 = newInstance(Class.forName("java.lang.Object"));
        Object term6943 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6944 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6945 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6946 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term6936, term6936.getClass(), "node", null);
        setField(term6936, term6936.getClass(), "namespaces", term6937);
        setField(term6936, term6936.getClass(), "defaultNamespace", "AijpHYOFuy");
        setField(term6936, term6936.getClass(), "id", "SbAoxhfrkn");
        setIntField(term6936, term6936.getClass(), "index", 1134449235);
        setBooleanField(term6936, term6936.getClass(), "attribute", true);
        setField(term6936, term6936.getClass(), "rootNode", term6942);
        setField(term6946, term6946.getClass(), "parent", null);
        setField(term6946, term6946.getClass(), "namespaceMap", null);
        setField(term6946, term6946.getClass(), "reverseMap", null);
        setField(term6946, term6946.getClass(), "pointer", null);
        setField(term6946, term6946.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6946, term6946.getClass(), "sealed", false);
        setField(term6945, term6945.getClass(), "parent", term6946);
        setField(term6945, term6945.getClass(), "namespaceMap", term6947);
        setField(term6945, term6945.getClass(), "reverseMap", term6948);
        setField(term6945, term6945.getClass(), "pointer", null);
        setField(term6945, term6945.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6945, term6945.getClass(), "sealed", false);
        setField(term6944, term6944.getClass(), "parent", term6945);
        setField(term6944, term6944.getClass(), "namespaceMap", term6949);
        setField(term6944, term6944.getClass(), "reverseMap", term6950);
        setField(term6944, term6944.getClass(), "pointer", null);
        setField(term6944, term6944.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6944, term6944.getClass(), "sealed", false);
        setField(term6943, term6943.getClass(), "parent", term6944);
        setField(term6943, term6943.getClass(), "namespaceMap", term6951);
        setField(term6943, term6943.getClass(), "reverseMap", term6952);
        setField(term6943, term6943.getClass(), "pointer", null);
        setField(term6943, term6943.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6943, term6943.getClass(), "sealed", false);
        setField(term6936, term6936.getClass(), "namespaceResolver", term6943);
        setField(term6936, term6936.getClass(), "parent", null);
        setField(term6936, term6936.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isCollection", argTypes, term1308, args);
        assertTrue(recursiveEquals(term1308, term6936));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


