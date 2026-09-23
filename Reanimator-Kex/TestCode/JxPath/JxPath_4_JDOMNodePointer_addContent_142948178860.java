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
import java.lang.ClassCastException;
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.LinkedList;

public class JDOMNodePointer_addContent_142948178860 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1152;
     Object term1207;

    public JDOMNodePointer_addContent_142948178860() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1174 = new HashMap();
        HashMap term1179 = new HashMap();
        HashMap term1185 = new HashMap();
        HashMap term1190 = new HashMap();
        HashMap term1196 = new HashMap();
        HashMap term1201 = new HashMap();
        term1152 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1153 = newInstance(Class.forName("java.lang.Object"));
        Object term1168 = newInstance(Class.forName("java.lang.Object"));
        Object term1169 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1170 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1171 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1172 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1152, term1152.getClass(), "node", term1153);
        setField(term1152, term1152.getClass(), "id", "RkybSrpybU");
        setIntField(term1152, term1152.getClass(), "index", 597278769);
        setBooleanField(term1152, term1152.getClass(), "attribute", true);
        setField(term1152, term1152.getClass(), "rootNode", term1168);
        setField(term1172, term1172.getClass(), "parent", null);
        setField(term1172, term1172.getClass(), "namespaceMap", null);
        setField(term1172, term1172.getClass(), "reverseMap", null);
        setField(term1172, term1172.getClass(), "pointer", null);
        setField(term1172, term1172.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1172, term1172.getClass(), "sealed", false);
        setField(term1171, term1171.getClass(), "parent", term1172);
        setField(term1171, term1171.getClass(), "namespaceMap", term1174);
        setField(term1171, term1171.getClass(), "reverseMap", term1179);
        setField(term1171, term1171.getClass(), "pointer", null);
        setField(term1171, term1171.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1171, term1171.getClass(), "sealed", false);
        setField(term1170, term1170.getClass(), "parent", term1171);
        setField(term1170, term1170.getClass(), "namespaceMap", term1185);
        setField(term1170, term1170.getClass(), "reverseMap", term1190);
        setField(term1170, term1170.getClass(), "pointer", null);
        setField(term1170, term1170.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1170, term1170.getClass(), "sealed", false);
        setField(term1169, term1169.getClass(), "parent", term1170);
        setField(term1169, term1169.getClass(), "namespaceMap", term1196);
        setField(term1169, term1169.getClass(), "reverseMap", term1201);
        setField(term1169, term1169.getClass(), "pointer", null);
        setField(term1169, term1169.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1169, term1169.getClass(), "sealed", false);
        setField(term1152, term1152.getClass(), "namespaceResolver", term1169);
        setField(term1152, term1152.getClass(), "parent", null);
        setField(term1152, term1152.getClass(), "locale", null);
        Object term1210 = newInstance(Class.forName("java.lang.Object"));
        Object term1212 = newInstance(Class.forName("java.lang.Object"));
        Object term1214 = newInstance(Class.forName("java.lang.Object"));
        term1207 = new LinkedList();
        ((LinkedList) term1207).add(term1210);
        ((LinkedList) term1207).add(term1212);
        ((LinkedList) term1207).add(term1214);
        ((LinkedList) term1207).add((Object)null);
        ((LinkedList) term1207).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1207;
        try {
            callMethod(klass, "addContent", argTypes, term1152, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


