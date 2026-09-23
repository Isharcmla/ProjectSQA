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

public class JDOMNodePointer_namespacePointer_72579419147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term326;
     Object term3539;
     Object term3469;

    public JDOMNodePointer_namespacePointer_72579419147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term348 = new HashMap();
        HashMap term353 = new HashMap();
        HashMap term359 = new HashMap();
        HashMap term364 = new HashMap();
        HashMap term370 = new HashMap();
        HashMap term375 = new HashMap();
        term326 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term327 = newInstance(Class.forName("java.lang.Object"));
        Object term342 = newInstance(Class.forName("java.lang.Object"));
        Object term343 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term344 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term345 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term346 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term326, term326.getClass(), "node", term327);
        setField(term326, term326.getClass(), "id", "MjGYSRKTNF");
        setIntField(term326, term326.getClass(), "index", 391863371);
        setBooleanField(term326, term326.getClass(), "attribute", true);
        setField(term326, term326.getClass(), "rootNode", term342);
        setField(term346, term346.getClass(), "parent", null);
        setField(term346, term346.getClass(), "namespaceMap", null);
        setField(term346, term346.getClass(), "reverseMap", null);
        setField(term346, term346.getClass(), "pointer", null);
        setField(term346, term346.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term346, term346.getClass(), "sealed", false);
        setField(term345, term345.getClass(), "parent", term346);
        setField(term345, term345.getClass(), "namespaceMap", term348);
        setField(term345, term345.getClass(), "reverseMap", term353);
        setField(term345, term345.getClass(), "pointer", null);
        setField(term345, term345.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term345, term345.getClass(), "sealed", false);
        setField(term344, term344.getClass(), "parent", term345);
        setField(term344, term344.getClass(), "namespaceMap", term359);
        setField(term344, term344.getClass(), "reverseMap", term364);
        setField(term344, term344.getClass(), "pointer", null);
        setField(term344, term344.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term344, term344.getClass(), "sealed", false);
        setField(term343, term343.getClass(), "parent", term344);
        setField(term343, term343.getClass(), "namespaceMap", term370);
        setField(term343, term343.getClass(), "reverseMap", term375);
        setField(term343, term343.getClass(), "pointer", null);
        setField(term343, term343.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term343, term343.getClass(), "sealed", false);
        setField(term326, term326.getClass(), "namespaceResolver", term343);
        setField(term326, term326.getClass(), "parent", null);
        setField(term326, term326.getClass(), "locale", null);
        HashMap term3547 = new HashMap();
        HashMap term3548 = new HashMap();
        HashMap term3549 = new HashMap();
        HashMap term3550 = new HashMap();
        term3539 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term3540 = newInstance(Class.forName("java.lang.Object"));
        Object term3543 = newInstance(Class.forName("java.lang.Object"));
        Object term3544 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3545 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3546 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3539, term3539.getClass(), "node", term3540);
        setField(term3539, term3539.getClass(), "id", "MjGYSRKTNF");
        setIntField(term3539, term3539.getClass(), "index", 391863371);
        setBooleanField(term3539, term3539.getClass(), "attribute", true);
        setField(term3539, term3539.getClass(), "rootNode", term3543);
        setField(term3546, term3546.getClass(), "parent", null);
        setField(term3546, term3546.getClass(), "namespaceMap", null);
        setField(term3546, term3546.getClass(), "reverseMap", null);
        setField(term3546, term3546.getClass(), "pointer", null);
        setField(term3546, term3546.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3546, term3546.getClass(), "sealed", false);
        setField(term3545, term3545.getClass(), "parent", term3546);
        setField(term3545, term3545.getClass(), "namespaceMap", term3547);
        setField(term3545, term3545.getClass(), "reverseMap", term3548);
        setField(term3545, term3545.getClass(), "pointer", null);
        setField(term3545, term3545.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3545, term3545.getClass(), "sealed", false);
        setField(term3544, term3544.getClass(), "parent", term3545);
        setField(term3544, term3544.getClass(), "namespaceMap", term3549);
        setField(term3544, term3544.getClass(), "reverseMap", term3550);
        setField(term3544, term3544.getClass(), "pointer", null);
        setField(term3544, term3544.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3544, term3544.getClass(), "sealed", false);
        setField(term3539, term3539.getClass(), "namespaceResolver", term3544);
        setField(term3539, term3539.getClass(), "parent", null);
        setField(term3539, term3539.getClass(), "locale", null);
        HashMap term3505 = new HashMap();
        HashMap term3510 = new HashMap();
        HashMap term3516 = new HashMap();
        HashMap term3521 = new HashMap();
        term3469 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer"));
        Object term3484 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term3485 = newInstance(Class.forName("java.lang.Object"));
        Object term3500 = newInstance(Class.forName("java.lang.Object"));
        Object term3501 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3502 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3503 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3469, term3469.getClass(), "prefix", "hRNSzYYIrc");
        setField(term3469, term3469.getClass(), "namespaceURI", null);
        setIntField(term3469, term3469.getClass(), "index", -2147483648);
        setBooleanField(term3469, term3469.getClass(), "attribute", false);
        setField(term3469, term3469.getClass(), "rootNode", null);
        setField(term3469, term3469.getClass(), "namespaceResolver", null);
        setField(term3484, term3484.getClass(), "node", term3485);
        setField(term3484, term3484.getClass(), "id", "MjGYSRKTNF");
        setIntField(term3484, term3484.getClass(), "index", 391863371);
        setBooleanField(term3484, term3484.getClass(), "attribute", true);
        setField(term3484, term3484.getClass(), "rootNode", term3500);
        setField(term3503, term3503.getClass(), "parent", null);
        setField(term3503, term3503.getClass(), "namespaceMap", null);
        setField(term3503, term3503.getClass(), "reverseMap", null);
        setField(term3503, term3503.getClass(), "pointer", null);
        setField(term3503, term3503.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3503, term3503.getClass(), "sealed", false);
        setField(term3502, term3502.getClass(), "parent", term3503);
        setField(term3502, term3502.getClass(), "namespaceMap", term3505);
        setField(term3502, term3502.getClass(), "reverseMap", term3510);
        setField(term3502, term3502.getClass(), "pointer", null);
        setField(term3502, term3502.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3502, term3502.getClass(), "sealed", false);
        setField(term3501, term3501.getClass(), "parent", term3502);
        setField(term3501, term3501.getClass(), "namespaceMap", term3516);
        setField(term3501, term3501.getClass(), "reverseMap", term3521);
        setField(term3501, term3501.getClass(), "pointer", null);
        setField(term3501, term3501.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3501, term3501.getClass(), "sealed", false);
        setField(term3484, term3484.getClass(), "namespaceResolver", term3501);
        setField(term3484, term3484.getClass(), "parent", null);
        setField(term3484, term3484.getClass(), "locale", null);
        setField(term3469, term3469.getClass(), "parent", term3484);
        setField(term3469, term3469.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hRNSzYYIrc";
        Object retValue = callMethod(klass, "namespacePointer", argTypes, term326, args);
        assertTrue(recursiveEquals(term326, term3539));
        assertTrue(recursiveEquals(retValue, term3469));
    }

};


