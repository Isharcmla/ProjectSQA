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

public class JDOMNodePointer_getNamespaceURI_113160499250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term537;
     Object term5175;

    public JDOMNodePointer_getNamespaceURI_113160499250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term556 = new HashMap();
        HashMap term561 = new HashMap();
        HashMap term567 = new HashMap();
        HashMap term572 = new HashMap();
        HashMap term578 = new HashMap();
        HashMap term583 = new HashMap();
        HashMap term595 = new HashMap();
        HashMap term601 = new HashMap();
        HashMap term606 = new HashMap();
        HashMap term612 = new HashMap();
        HashMap term617 = new HashMap();
        term537 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term538 = newInstance(Class.forName("java.lang.Object"));
        Object term551 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term552 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term553 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term554 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term591 = newInstance(Class.forName("java.lang.Object"));
        Object term592 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term593 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term594 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term537, term537.getClass(), "node", term538);
        setField(term537, term537.getClass(), "id", "RMFIsYGgne");
        setField(term554, term554.getClass(), "parent", null);
        setField(term554, term554.getClass(), "namespaceMap", null);
        setField(term554, term554.getClass(), "reverseMap", null);
        setField(term554, term554.getClass(), "pointer", null);
        setBooleanField(term554, term554.getClass(), "sealed", false);
        setField(term553, term553.getClass(), "parent", term554);
        setField(term553, term553.getClass(), "namespaceMap", term556);
        setField(term553, term553.getClass(), "reverseMap", term561);
        setField(term553, term553.getClass(), "pointer", null);
        setBooleanField(term553, term553.getClass(), "sealed", false);
        setField(term552, term552.getClass(), "parent", term553);
        setField(term552, term552.getClass(), "namespaceMap", term567);
        setField(term552, term552.getClass(), "reverseMap", term572);
        setField(term552, term552.getClass(), "pointer", null);
        setBooleanField(term552, term552.getClass(), "sealed", false);
        setField(term551, term551.getClass(), "parent", term552);
        setField(term551, term551.getClass(), "namespaceMap", term578);
        setField(term551, term551.getClass(), "reverseMap", term583);
        setField(term551, term551.getClass(), "pointer", null);
        setBooleanField(term551, term551.getClass(), "sealed", false);
        setField(term537, term537.getClass(), "localNamespaceResolver", term551);
        setIntField(term537, term537.getClass(), "index", -1922583790);
        setBooleanField(term537, term537.getClass(), "attribute", true);
        setField(term537, term537.getClass(), "rootNode", term591);
        setField(term594, term594.getClass(), "parent", null);
        setField(term594, term594.getClass(), "namespaceMap", term595);
        setField(term594, term594.getClass(), "reverseMap", null);
        setField(term594, term594.getClass(), "pointer", null);
        setBooleanField(term594, term594.getClass(), "sealed", false);
        setField(term593, term593.getClass(), "parent", term594);
        setField(term593, term593.getClass(), "namespaceMap", term601);
        setField(term593, term593.getClass(), "reverseMap", term606);
        setField(term593, term593.getClass(), "pointer", null);
        setBooleanField(term593, term593.getClass(), "sealed", false);
        setField(term592, term592.getClass(), "parent", term593);
        setField(term592, term592.getClass(), "namespaceMap", term612);
        setField(term592, term592.getClass(), "reverseMap", term617);
        setField(term592, term592.getClass(), "pointer", null);
        setBooleanField(term592, term592.getClass(), "sealed", false);
        setField(term537, term537.getClass(), "namespaceResolver", term592);
        setField(term537, term537.getClass(), "parent", null);
        setField(term537, term537.getClass(), "locale", null);
        HashMap term5183 = new HashMap();
        HashMap term5184 = new HashMap();
        HashMap term5185 = new HashMap();
        HashMap term5186 = new HashMap();
        HashMap term5187 = new HashMap();
        HashMap term5188 = new HashMap();
        HashMap term5193 = new HashMap();
        HashMap term5194 = new HashMap();
        HashMap term5195 = new HashMap();
        HashMap term5196 = new HashMap();
        HashMap term5197 = new HashMap();
        term5175 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term5176 = newInstance(Class.forName("java.lang.Object"));
        Object term5179 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5180 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5181 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5182 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5189 = newInstance(Class.forName("java.lang.Object"));
        Object term5190 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5191 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5192 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term5175, term5175.getClass(), "node", term5176);
        setField(term5175, term5175.getClass(), "id", "RMFIsYGgne");
        setField(term5182, term5182.getClass(), "parent", null);
        setField(term5182, term5182.getClass(), "namespaceMap", null);
        setField(term5182, term5182.getClass(), "reverseMap", null);
        setField(term5182, term5182.getClass(), "pointer", null);
        setBooleanField(term5182, term5182.getClass(), "sealed", false);
        setField(term5181, term5181.getClass(), "parent", term5182);
        setField(term5181, term5181.getClass(), "namespaceMap", term5183);
        setField(term5181, term5181.getClass(), "reverseMap", term5184);
        setField(term5181, term5181.getClass(), "pointer", null);
        setBooleanField(term5181, term5181.getClass(), "sealed", false);
        setField(term5180, term5180.getClass(), "parent", term5181);
        setField(term5180, term5180.getClass(), "namespaceMap", term5185);
        setField(term5180, term5180.getClass(), "reverseMap", term5186);
        setField(term5180, term5180.getClass(), "pointer", null);
        setBooleanField(term5180, term5180.getClass(), "sealed", false);
        setField(term5179, term5179.getClass(), "parent", term5180);
        setField(term5179, term5179.getClass(), "namespaceMap", term5187);
        setField(term5179, term5179.getClass(), "reverseMap", term5188);
        setField(term5179, term5179.getClass(), "pointer", null);
        setBooleanField(term5179, term5179.getClass(), "sealed", false);
        setField(term5175, term5175.getClass(), "localNamespaceResolver", term5179);
        setIntField(term5175, term5175.getClass(), "index", -1922583790);
        setBooleanField(term5175, term5175.getClass(), "attribute", true);
        setField(term5175, term5175.getClass(), "rootNode", term5189);
        setField(term5192, term5192.getClass(), "parent", null);
        setField(term5192, term5192.getClass(), "namespaceMap", term5193);
        setField(term5192, term5192.getClass(), "reverseMap", null);
        setField(term5192, term5192.getClass(), "pointer", null);
        setBooleanField(term5192, term5192.getClass(), "sealed", false);
        setField(term5191, term5191.getClass(), "parent", term5192);
        setField(term5191, term5191.getClass(), "namespaceMap", term5194);
        setField(term5191, term5191.getClass(), "reverseMap", term5195);
        setField(term5191, term5191.getClass(), "pointer", null);
        setBooleanField(term5191, term5191.getClass(), "sealed", false);
        setField(term5190, term5190.getClass(), "parent", term5191);
        setField(term5190, term5190.getClass(), "namespaceMap", term5196);
        setField(term5190, term5190.getClass(), "reverseMap", term5197);
        setField(term5190, term5190.getClass(), "pointer", null);
        setBooleanField(term5190, term5190.getClass(), "sealed", false);
        setField(term5175, term5175.getClass(), "namespaceResolver", term5190);
        setField(term5175, term5175.getClass(), "parent", null);
        setField(term5175, term5175.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term537, args);
        assertTrue(recursiveEquals(term537, term5175));
        assertTrue(recursiveEquals(retValue, null));
    }

};


