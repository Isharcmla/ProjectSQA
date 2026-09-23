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
import java.lang.NullPointerException;
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class JDOMNodePointer_isLanguage_68230491566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1341;

    public JDOMNodePointer_isLanguage_68230491566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1363 = new HashMap();
        HashMap term1368 = new HashMap();
        HashMap term1374 = new HashMap();
        HashMap term1379 = new HashMap();
        HashMap term1385 = new HashMap();
        HashMap term1390 = new HashMap();
        term1341 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1342 = newInstance(Class.forName("java.lang.Object"));
        Object term1357 = newInstance(Class.forName("java.lang.Object"));
        Object term1358 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1359 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1360 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1361 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1341, term1341.getClass(), "node", term1342);
        setField(term1341, term1341.getClass(), "id", "vrQLuWIDJX");
        setIntField(term1341, term1341.getClass(), "index", -1456670397);
        setBooleanField(term1341, term1341.getClass(), "attribute", false);
        setField(term1341, term1341.getClass(), "rootNode", term1357);
        setField(term1361, term1361.getClass(), "parent", null);
        setField(term1361, term1361.getClass(), "namespaceMap", null);
        setField(term1361, term1361.getClass(), "reverseMap", null);
        setField(term1361, term1361.getClass(), "pointer", null);
        setField(term1361, term1361.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1361, term1361.getClass(), "sealed", false);
        setField(term1360, term1360.getClass(), "parent", term1361);
        setField(term1360, term1360.getClass(), "namespaceMap", term1363);
        setField(term1360, term1360.getClass(), "reverseMap", term1368);
        setField(term1360, term1360.getClass(), "pointer", null);
        setField(term1360, term1360.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1360, term1360.getClass(), "sealed", false);
        setField(term1359, term1359.getClass(), "parent", term1360);
        setField(term1359, term1359.getClass(), "namespaceMap", term1374);
        setField(term1359, term1359.getClass(), "reverseMap", term1379);
        setField(term1359, term1359.getClass(), "pointer", null);
        setField(term1359, term1359.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1359, term1359.getClass(), "sealed", false);
        setField(term1358, term1358.getClass(), "parent", term1359);
        setField(term1358, term1358.getClass(), "namespaceMap", term1385);
        setField(term1358, term1358.getClass(), "reverseMap", term1390);
        setField(term1358, term1358.getClass(), "pointer", null);
        setField(term1358, term1358.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1358, term1358.getClass(), "sealed", false);
        setField(term1341, term1341.getClass(), "namespaceResolver", term1358);
        setField(term1341, term1341.getClass(), "parent", null);
        setField(term1341, term1341.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "flxyYxBRtu";
        try {
            callMethod(klass, "isLanguage", argTypes, term1341, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


