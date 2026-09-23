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

public class JDOMNodePointer_namespaceIterator_40971694846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261;
     Object term3427;
     Object term3425;

    public JDOMNodePointer_namespaceIterator_40971694846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term283 = new HashMap();
        HashMap term288 = new HashMap();
        HashMap term294 = new HashMap();
        HashMap term299 = new HashMap();
        HashMap term305 = new HashMap();
        HashMap term310 = new HashMap();
        term261 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term262 = newInstance(Class.forName("java.lang.Object"));
        Object term277 = newInstance(Class.forName("java.lang.Object"));
        Object term278 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term279 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term280 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term281 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term261, term261.getClass(), "node", term262);
        setField(term261, term261.getClass(), "id", "SzjVpOQTyS");
        setIntField(term261, term261.getClass(), "index", 1484323161);
        setBooleanField(term261, term261.getClass(), "attribute", false);
        setField(term261, term261.getClass(), "rootNode", term277);
        setField(term281, term281.getClass(), "parent", null);
        setField(term281, term281.getClass(), "namespaceMap", null);
        setField(term281, term281.getClass(), "reverseMap", null);
        setField(term281, term281.getClass(), "pointer", null);
        setField(term281, term281.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term281, term281.getClass(), "sealed", false);
        setField(term280, term280.getClass(), "parent", term281);
        setField(term280, term280.getClass(), "namespaceMap", term283);
        setField(term280, term280.getClass(), "reverseMap", term288);
        setField(term280, term280.getClass(), "pointer", null);
        setField(term280, term280.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term280, term280.getClass(), "sealed", false);
        setField(term279, term279.getClass(), "parent", term280);
        setField(term279, term279.getClass(), "namespaceMap", term294);
        setField(term279, term279.getClass(), "reverseMap", term299);
        setField(term279, term279.getClass(), "pointer", null);
        setField(term279, term279.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term279, term279.getClass(), "sealed", false);
        setField(term278, term278.getClass(), "parent", term279);
        setField(term278, term278.getClass(), "namespaceMap", term305);
        setField(term278, term278.getClass(), "reverseMap", term310);
        setField(term278, term278.getClass(), "pointer", null);
        setField(term278, term278.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term278, term278.getClass(), "sealed", false);
        setField(term261, term261.getClass(), "namespaceResolver", term278);
        setField(term261, term261.getClass(), "parent", null);
        setField(term261, term261.getClass(), "locale", null);
        HashMap term3435 = new HashMap();
        HashMap term3436 = new HashMap();
        HashMap term3437 = new HashMap();
        HashMap term3438 = new HashMap();
        term3427 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term3428 = newInstance(Class.forName("java.lang.Object"));
        Object term3431 = newInstance(Class.forName("java.lang.Object"));
        Object term3432 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3433 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3434 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3427, term3427.getClass(), "node", term3428);
        setField(term3427, term3427.getClass(), "id", "SzjVpOQTyS");
        setIntField(term3427, term3427.getClass(), "index", 1484323161);
        setBooleanField(term3427, term3427.getClass(), "attribute", false);
        setField(term3427, term3427.getClass(), "rootNode", term3431);
        setField(term3434, term3434.getClass(), "parent", null);
        setField(term3434, term3434.getClass(), "namespaceMap", null);
        setField(term3434, term3434.getClass(), "reverseMap", null);
        setField(term3434, term3434.getClass(), "pointer", null);
        setField(term3434, term3434.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3434, term3434.getClass(), "sealed", false);
        setField(term3433, term3433.getClass(), "parent", term3434);
        setField(term3433, term3433.getClass(), "namespaceMap", term3435);
        setField(term3433, term3433.getClass(), "reverseMap", term3436);
        setField(term3433, term3433.getClass(), "pointer", null);
        setField(term3433, term3433.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3433, term3433.getClass(), "sealed", false);
        setField(term3432, term3432.getClass(), "parent", term3433);
        setField(term3432, term3432.getClass(), "namespaceMap", term3437);
        setField(term3432, term3432.getClass(), "reverseMap", term3438);
        setField(term3432, term3432.getClass(), "pointer", null);
        setField(term3432, term3432.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3432, term3432.getClass(), "sealed", false);
        setField(term3427, term3427.getClass(), "namespaceResolver", term3432);
        setField(term3427, term3427.getClass(), "parent", null);
        setField(term3427, term3427.getClass(), "locale", null);
        HashMap term3289 = new HashMap();
        HashMap term3294 = new HashMap();
        HashMap term3300 = new HashMap();
        HashMap term3305 = new HashMap();
        term3425 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator"));
        Object term3268 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term3269 = newInstance(Class.forName("java.lang.Object"));
        Object term3284 = newInstance(Class.forName("java.lang.Object"));
        Object term3285 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3286 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3287 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3268, term3268.getClass(), "node", term3269);
        setField(term3268, term3268.getClass(), "id", "SzjVpOQTyS");
        setIntField(term3268, term3268.getClass(), "index", 1484323161);
        setBooleanField(term3268, term3268.getClass(), "attribute", false);
        setField(term3268, term3268.getClass(), "rootNode", term3284);
        setField(term3287, term3287.getClass(), "parent", null);
        setField(term3287, term3287.getClass(), "namespaceMap", null);
        setField(term3287, term3287.getClass(), "reverseMap", null);
        setField(term3287, term3287.getClass(), "pointer", null);
        setField(term3287, term3287.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3287, term3287.getClass(), "sealed", false);
        setField(term3286, term3286.getClass(), "parent", term3287);
        setField(term3286, term3286.getClass(), "namespaceMap", term3289);
        setField(term3286, term3286.getClass(), "reverseMap", term3294);
        setField(term3286, term3286.getClass(), "pointer", null);
        setField(term3286, term3286.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3286, term3286.getClass(), "sealed", false);
        setField(term3285, term3285.getClass(), "parent", term3286);
        setField(term3285, term3285.getClass(), "namespaceMap", term3300);
        setField(term3285, term3285.getClass(), "reverseMap", term3305);
        setField(term3285, term3285.getClass(), "pointer", null);
        setField(term3285, term3285.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3285, term3285.getClass(), "sealed", false);
        setField(term3268, term3268.getClass(), "namespaceResolver", term3285);
        setField(term3268, term3268.getClass(), "parent", null);
        setField(term3268, term3268.getClass(), "locale", null);
        setField(term3425, term3425.getClass(), "parent", term3268);
        setField(term3425, term3425.getClass(), "namespaces", null);
        setField(term3425, term3425.getClass(), "prefixes", null);
        setIntField(term3425, term3425.getClass(), "position", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "namespaceIterator", argTypes, term261, args);
        assertTrue(recursiveEquals(term261, term3427));
        assertTrue(recursiveEquals(retValue, term3425));
    }

};


