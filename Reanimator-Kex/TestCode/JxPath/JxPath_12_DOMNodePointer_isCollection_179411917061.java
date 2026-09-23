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

public class DOMNodePointer_isCollection_179411917061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1308;
     Object term6958;

    public DOMNodePointer_isCollection_179411917061() {
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
        setBooleanField(term1344, term1344.getClass(), "sealed", false);
        setField(term1343, term1343.getClass(), "parent", term1344);
        setField(term1343, term1343.getClass(), "namespaceMap", term1346);
        setField(term1343, term1343.getClass(), "reverseMap", term1351);
        setField(term1343, term1343.getClass(), "pointer", null);
        setBooleanField(term1343, term1343.getClass(), "sealed", false);
        setField(term1342, term1342.getClass(), "parent", term1343);
        setField(term1342, term1342.getClass(), "namespaceMap", term1357);
        setField(term1342, term1342.getClass(), "reverseMap", term1362);
        setField(term1342, term1342.getClass(), "pointer", null);
        setBooleanField(term1342, term1342.getClass(), "sealed", false);
        setField(term1341, term1341.getClass(), "parent", term1342);
        setField(term1341, term1341.getClass(), "namespaceMap", term1368);
        setField(term1341, term1341.getClass(), "reverseMap", term1373);
        setField(term1341, term1341.getClass(), "pointer", null);
        setBooleanField(term1341, term1341.getClass(), "sealed", false);
        setField(term1308, term1308.getClass(), "namespaceResolver", term1341);
        setField(term1308, term1308.getClass(), "parent", null);
        setField(term1308, term1308.getClass(), "locale", null);
        HashMap term6959 = new HashMap();
        HashMap term6969 = new HashMap();
        HashMap term6970 = new HashMap();
        HashMap term6971 = new HashMap();
        HashMap term6972 = new HashMap();
        HashMap term6973 = new HashMap();
        HashMap term6974 = new HashMap();
        term6958 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term6964 = newInstance(Class.forName("java.lang.Object"));
        Object term6965 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6966 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6967 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6968 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term6958, term6958.getClass(), "node", null);
        setField(term6958, term6958.getClass(), "namespaces", term6959);
        setField(term6958, term6958.getClass(), "defaultNamespace", "AijpHYOFuy");
        setField(term6958, term6958.getClass(), "id", "SbAoxhfrkn");
        setIntField(term6958, term6958.getClass(), "index", 1134449235);
        setBooleanField(term6958, term6958.getClass(), "attribute", true);
        setField(term6958, term6958.getClass(), "rootNode", term6964);
        setField(term6968, term6968.getClass(), "parent", null);
        setField(term6968, term6968.getClass(), "namespaceMap", null);
        setField(term6968, term6968.getClass(), "reverseMap", null);
        setField(term6968, term6968.getClass(), "pointer", null);
        setBooleanField(term6968, term6968.getClass(), "sealed", false);
        setField(term6967, term6967.getClass(), "parent", term6968);
        setField(term6967, term6967.getClass(), "namespaceMap", term6969);
        setField(term6967, term6967.getClass(), "reverseMap", term6970);
        setField(term6967, term6967.getClass(), "pointer", null);
        setBooleanField(term6967, term6967.getClass(), "sealed", false);
        setField(term6966, term6966.getClass(), "parent", term6967);
        setField(term6966, term6966.getClass(), "namespaceMap", term6971);
        setField(term6966, term6966.getClass(), "reverseMap", term6972);
        setField(term6966, term6966.getClass(), "pointer", null);
        setBooleanField(term6966, term6966.getClass(), "sealed", false);
        setField(term6965, term6965.getClass(), "parent", term6966);
        setField(term6965, term6965.getClass(), "namespaceMap", term6973);
        setField(term6965, term6965.getClass(), "reverseMap", term6974);
        setField(term6965, term6965.getClass(), "pointer", null);
        setBooleanField(term6965, term6965.getClass(), "sealed", false);
        setField(term6958, term6958.getClass(), "namespaceResolver", term6965);
        setField(term6958, term6958.getClass(), "parent", null);
        setField(term6958, term6958.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isCollection", argTypes, term1308, args);
        assertTrue(recursiveEquals(term1308, term6958));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


