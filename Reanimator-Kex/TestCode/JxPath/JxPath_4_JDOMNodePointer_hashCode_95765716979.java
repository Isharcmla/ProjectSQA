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

public class JDOMNodePointer_hashCode_95765716979 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2394;
     Object term10426;

    public JDOMNodePointer_hashCode_95765716979() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2416 = new HashMap();
        HashMap term2421 = new HashMap();
        HashMap term2427 = new HashMap();
        HashMap term2432 = new HashMap();
        HashMap term2438 = new HashMap();
        HashMap term2443 = new HashMap();
        term2394 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term2395 = newInstance(Class.forName("java.lang.Object"));
        Object term2410 = newInstance(Class.forName("java.lang.Object"));
        Object term2411 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2412 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2413 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2414 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2394, term2394.getClass(), "node", term2395);
        setField(term2394, term2394.getClass(), "id", "jDtqGUpnZN");
        setIntField(term2394, term2394.getClass(), "index", -1179120542);
        setBooleanField(term2394, term2394.getClass(), "attribute", true);
        setField(term2394, term2394.getClass(), "rootNode", term2410);
        setField(term2414, term2414.getClass(), "parent", null);
        setField(term2414, term2414.getClass(), "namespaceMap", null);
        setField(term2414, term2414.getClass(), "reverseMap", null);
        setField(term2414, term2414.getClass(), "pointer", null);
        setField(term2414, term2414.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2414, term2414.getClass(), "sealed", false);
        setField(term2413, term2413.getClass(), "parent", term2414);
        setField(term2413, term2413.getClass(), "namespaceMap", term2416);
        setField(term2413, term2413.getClass(), "reverseMap", term2421);
        setField(term2413, term2413.getClass(), "pointer", null);
        setField(term2413, term2413.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2413, term2413.getClass(), "sealed", false);
        setField(term2412, term2412.getClass(), "parent", term2413);
        setField(term2412, term2412.getClass(), "namespaceMap", term2427);
        setField(term2412, term2412.getClass(), "reverseMap", term2432);
        setField(term2412, term2412.getClass(), "pointer", null);
        setField(term2412, term2412.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2412, term2412.getClass(), "sealed", false);
        setField(term2411, term2411.getClass(), "parent", term2412);
        setField(term2411, term2411.getClass(), "namespaceMap", term2438);
        setField(term2411, term2411.getClass(), "reverseMap", term2443);
        setField(term2411, term2411.getClass(), "pointer", null);
        setField(term2411, term2411.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2411, term2411.getClass(), "sealed", false);
        setField(term2394, term2394.getClass(), "namespaceResolver", term2411);
        setField(term2394, term2394.getClass(), "parent", null);
        setField(term2394, term2394.getClass(), "locale", null);
        HashMap term10435 = new HashMap();
        HashMap term10436 = new HashMap();
        HashMap term10437 = new HashMap();
        HashMap term10438 = new HashMap();
        HashMap term10439 = new HashMap();
        HashMap term10440 = new HashMap();
        term10426 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term10427 = newInstance(Class.forName("java.lang.Object"));
        Object term10430 = newInstance(Class.forName("java.lang.Object"));
        Object term10431 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term10432 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term10433 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term10434 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term10426, term10426.getClass(), "node", term10427);
        setField(term10426, term10426.getClass(), "id", "jDtqGUpnZN");
        setIntField(term10426, term10426.getClass(), "index", -1179120542);
        setBooleanField(term10426, term10426.getClass(), "attribute", true);
        setField(term10426, term10426.getClass(), "rootNode", term10430);
        setField(term10434, term10434.getClass(), "parent", null);
        setField(term10434, term10434.getClass(), "namespaceMap", null);
        setField(term10434, term10434.getClass(), "reverseMap", null);
        setField(term10434, term10434.getClass(), "pointer", null);
        setField(term10434, term10434.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term10434, term10434.getClass(), "sealed", false);
        setField(term10433, term10433.getClass(), "parent", term10434);
        setField(term10433, term10433.getClass(), "namespaceMap", term10435);
        setField(term10433, term10433.getClass(), "reverseMap", term10436);
        setField(term10433, term10433.getClass(), "pointer", null);
        setField(term10433, term10433.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term10433, term10433.getClass(), "sealed", false);
        setField(term10432, term10432.getClass(), "parent", term10433);
        setField(term10432, term10432.getClass(), "namespaceMap", term10437);
        setField(term10432, term10432.getClass(), "reverseMap", term10438);
        setField(term10432, term10432.getClass(), "pointer", null);
        setField(term10432, term10432.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term10432, term10432.getClass(), "sealed", false);
        setField(term10431, term10431.getClass(), "parent", term10432);
        setField(term10431, term10431.getClass(), "namespaceMap", term10439);
        setField(term10431, term10431.getClass(), "reverseMap", term10440);
        setField(term10431, term10431.getClass(), "pointer", null);
        setField(term10431, term10431.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term10431, term10431.getClass(), "sealed", false);
        setField(term10426, term10426.getClass(), "namespaceResolver", term10431);
        setField(term10426, term10426.getClass(), "parent", null);
        setField(term10426, term10426.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term2394, args);
        assertTrue(recursiveEquals(term2394, term10426));
        assertTrue(recursiveEquals(retValue, 1220156271));
    }

};


