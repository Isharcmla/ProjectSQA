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

public class DOMNodePointer_getNamespaceURI_79575645155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term831;
     Object term6242;

    public DOMNodePointer_getNamespaceURI_79575645155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term832 = new HashMap();
        HashMap term869 = new HashMap();
        HashMap term874 = new HashMap();
        HashMap term880 = new HashMap();
        HashMap term885 = new HashMap();
        HashMap term891 = new HashMap();
        HashMap term896 = new HashMap();
        term831 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term863 = newInstance(Class.forName("java.lang.Object"));
        Object term864 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term865 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term866 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term867 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term831, term831.getClass(), "node", null);
        setField(term831, term831.getClass(), "namespaces", term832);
        setField(term831, term831.getClass(), "defaultNamespace", "RkybSrpybU");
        setField(term831, term831.getClass(), "id", "xOEqzGAmDU");
        setIntField(term831, term831.getClass(), "index", -2038273078);
        setBooleanField(term831, term831.getClass(), "attribute", false);
        setField(term831, term831.getClass(), "rootNode", term863);
        setField(term867, term867.getClass(), "parent", null);
        setField(term867, term867.getClass(), "namespaceMap", null);
        setField(term867, term867.getClass(), "reverseMap", null);
        setField(term867, term867.getClass(), "pointer", null);
        setField(term867, term867.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term867, term867.getClass(), "sealed", false);
        setField(term866, term866.getClass(), "parent", term867);
        setField(term866, term866.getClass(), "namespaceMap", term869);
        setField(term866, term866.getClass(), "reverseMap", term874);
        setField(term866, term866.getClass(), "pointer", null);
        setField(term866, term866.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term866, term866.getClass(), "sealed", false);
        setField(term865, term865.getClass(), "parent", term866);
        setField(term865, term865.getClass(), "namespaceMap", term880);
        setField(term865, term865.getClass(), "reverseMap", term885);
        setField(term865, term865.getClass(), "pointer", null);
        setField(term865, term865.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term865, term865.getClass(), "sealed", false);
        setField(term864, term864.getClass(), "parent", term865);
        setField(term864, term864.getClass(), "namespaceMap", term891);
        setField(term864, term864.getClass(), "reverseMap", term896);
        setField(term864, term864.getClass(), "pointer", null);
        setField(term864, term864.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term864, term864.getClass(), "sealed", false);
        setField(term831, term831.getClass(), "namespaceResolver", term864);
        setField(term831, term831.getClass(), "parent", null);
        setField(term831, term831.getClass(), "locale", null);
        HashMap term6243 = new HashMap();
        HashMap term6257 = new HashMap();
        HashMap term6258 = new HashMap();
        HashMap term6259 = new HashMap();
        HashMap term6260 = new HashMap();
        HashMap term6261 = new HashMap();
        HashMap term6262 = new HashMap();
        term6242 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term6252 = newInstance(Class.forName("java.lang.Object"));
        Object term6253 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6254 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6255 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6256 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term6242, term6242.getClass(), "node", null);
        setField(term6242, term6242.getClass(), "namespaces", term6243);
        setField(term6242, term6242.getClass(), "defaultNamespace", "RkybSrpybU");
        setField(term6242, term6242.getClass(), "id", "xOEqzGAmDU");
        setIntField(term6242, term6242.getClass(), "index", -2038273078);
        setBooleanField(term6242, term6242.getClass(), "attribute", false);
        setField(term6242, term6242.getClass(), "rootNode", term6252);
        setField(term6256, term6256.getClass(), "parent", null);
        setField(term6256, term6256.getClass(), "namespaceMap", null);
        setField(term6256, term6256.getClass(), "reverseMap", null);
        setField(term6256, term6256.getClass(), "pointer", null);
        setField(term6256, term6256.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6256, term6256.getClass(), "sealed", false);
        setField(term6255, term6255.getClass(), "parent", term6256);
        setField(term6255, term6255.getClass(), "namespaceMap", term6257);
        setField(term6255, term6255.getClass(), "reverseMap", term6258);
        setField(term6255, term6255.getClass(), "pointer", null);
        setField(term6255, term6255.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6255, term6255.getClass(), "sealed", false);
        setField(term6254, term6254.getClass(), "parent", term6255);
        setField(term6254, term6254.getClass(), "namespaceMap", term6259);
        setField(term6254, term6254.getClass(), "reverseMap", term6260);
        setField(term6254, term6254.getClass(), "pointer", null);
        setField(term6254, term6254.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6254, term6254.getClass(), "sealed", false);
        setField(term6253, term6253.getClass(), "parent", term6254);
        setField(term6253, term6253.getClass(), "namespaceMap", term6261);
        setField(term6253, term6253.getClass(), "reverseMap", term6262);
        setField(term6253, term6253.getClass(), "pointer", null);
        setField(term6253, term6253.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6253, term6253.getClass(), "sealed", false);
        setField(term6242, term6242.getClass(), "namespaceResolver", term6253);
        setField(term6242, term6242.getClass(), "parent", null);
        setField(term6242, term6242.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eZFUvlxvGV";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term831, args);
        assertTrue(recursiveEquals(term831, term6242));
        assertTrue(recursiveEquals(retValue, null));
    }

};


