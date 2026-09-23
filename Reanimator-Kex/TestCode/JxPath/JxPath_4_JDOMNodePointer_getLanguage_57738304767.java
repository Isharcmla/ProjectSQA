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

public class JDOMNodePointer_getLanguage_57738304767 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1428;
     Object term6326;

    public JDOMNodePointer_getLanguage_57738304767() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1450 = new HashMap();
        HashMap term1455 = new HashMap();
        HashMap term1461 = new HashMap();
        HashMap term1466 = new HashMap();
        HashMap term1472 = new HashMap();
        HashMap term1477 = new HashMap();
        term1428 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1429 = newInstance(Class.forName("java.lang.Object"));
        Object term1444 = newInstance(Class.forName("java.lang.Object"));
        Object term1445 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1446 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1447 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1448 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1428, term1428.getClass(), "node", term1429);
        setField(term1428, term1428.getClass(), "id", "OclPbYPkcH");
        setIntField(term1428, term1428.getClass(), "index", 1622346318);
        setBooleanField(term1428, term1428.getClass(), "attribute", false);
        setField(term1428, term1428.getClass(), "rootNode", term1444);
        setField(term1448, term1448.getClass(), "parent", null);
        setField(term1448, term1448.getClass(), "namespaceMap", null);
        setField(term1448, term1448.getClass(), "reverseMap", null);
        setField(term1448, term1448.getClass(), "pointer", null);
        setField(term1448, term1448.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1448, term1448.getClass(), "sealed", false);
        setField(term1447, term1447.getClass(), "parent", term1448);
        setField(term1447, term1447.getClass(), "namespaceMap", term1450);
        setField(term1447, term1447.getClass(), "reverseMap", term1455);
        setField(term1447, term1447.getClass(), "pointer", null);
        setField(term1447, term1447.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1447, term1447.getClass(), "sealed", false);
        setField(term1446, term1446.getClass(), "parent", term1447);
        setField(term1446, term1446.getClass(), "namespaceMap", term1461);
        setField(term1446, term1446.getClass(), "reverseMap", term1466);
        setField(term1446, term1446.getClass(), "pointer", null);
        setField(term1446, term1446.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1446, term1446.getClass(), "sealed", false);
        setField(term1445, term1445.getClass(), "parent", term1446);
        setField(term1445, term1445.getClass(), "namespaceMap", term1472);
        setField(term1445, term1445.getClass(), "reverseMap", term1477);
        setField(term1445, term1445.getClass(), "pointer", null);
        setField(term1445, term1445.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1445, term1445.getClass(), "sealed", false);
        setField(term1428, term1428.getClass(), "namespaceResolver", term1445);
        setField(term1428, term1428.getClass(), "parent", null);
        setField(term1428, term1428.getClass(), "locale", null);
        HashMap term6335 = new HashMap();
        HashMap term6336 = new HashMap();
        HashMap term6337 = new HashMap();
        HashMap term6338 = new HashMap();
        HashMap term6339 = new HashMap();
        HashMap term6340 = new HashMap();
        term6326 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term6327 = newInstance(Class.forName("java.lang.Object"));
        Object term6330 = newInstance(Class.forName("java.lang.Object"));
        Object term6331 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6332 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6333 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6334 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term6326, term6326.getClass(), "node", term6327);
        setField(term6326, term6326.getClass(), "id", "OclPbYPkcH");
        setIntField(term6326, term6326.getClass(), "index", 1622346318);
        setBooleanField(term6326, term6326.getClass(), "attribute", false);
        setField(term6326, term6326.getClass(), "rootNode", term6330);
        setField(term6334, term6334.getClass(), "parent", null);
        setField(term6334, term6334.getClass(), "namespaceMap", null);
        setField(term6334, term6334.getClass(), "reverseMap", null);
        setField(term6334, term6334.getClass(), "pointer", null);
        setField(term6334, term6334.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6334, term6334.getClass(), "sealed", false);
        setField(term6333, term6333.getClass(), "parent", term6334);
        setField(term6333, term6333.getClass(), "namespaceMap", term6335);
        setField(term6333, term6333.getClass(), "reverseMap", term6336);
        setField(term6333, term6333.getClass(), "pointer", null);
        setField(term6333, term6333.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6333, term6333.getClass(), "sealed", false);
        setField(term6332, term6332.getClass(), "parent", term6333);
        setField(term6332, term6332.getClass(), "namespaceMap", term6337);
        setField(term6332, term6332.getClass(), "reverseMap", term6338);
        setField(term6332, term6332.getClass(), "pointer", null);
        setField(term6332, term6332.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6332, term6332.getClass(), "sealed", false);
        setField(term6331, term6331.getClass(), "parent", term6332);
        setField(term6331, term6331.getClass(), "namespaceMap", term6339);
        setField(term6331, term6331.getClass(), "reverseMap", term6340);
        setField(term6331, term6331.getClass(), "pointer", null);
        setField(term6331, term6331.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6331, term6331.getClass(), "sealed", false);
        setField(term6326, term6326.getClass(), "namespaceResolver", term6331);
        setField(term6326, term6326.getClass(), "parent", null);
        setField(term6326, term6326.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLanguage", argTypes, term1428, args);
        assertTrue(recursiveEquals(term1428, term6326));
        assertTrue(recursiveEquals(retValue, null));
    }

};


