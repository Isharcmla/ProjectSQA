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

public class JDOMNodePointer_getNamespaceURI_113160499248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term413;
     Object term3670;

    public JDOMNodePointer_getNamespaceURI_113160499248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term435 = new HashMap();
        HashMap term440 = new HashMap();
        HashMap term446 = new HashMap();
        HashMap term451 = new HashMap();
        HashMap term457 = new HashMap();
        HashMap term462 = new HashMap();
        term413 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term414 = newInstance(Class.forName("java.lang.Object"));
        Object term429 = newInstance(Class.forName("java.lang.Object"));
        Object term430 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term431 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term432 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term433 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term413, term413.getClass(), "node", term414);
        setField(term413, term413.getClass(), "id", "RMFIsYGgne");
        setIntField(term413, term413.getClass(), "index", -1922583790);
        setBooleanField(term413, term413.getClass(), "attribute", true);
        setField(term413, term413.getClass(), "rootNode", term429);
        setField(term433, term433.getClass(), "parent", null);
        setField(term433, term433.getClass(), "namespaceMap", null);
        setField(term433, term433.getClass(), "reverseMap", null);
        setField(term433, term433.getClass(), "pointer", null);
        setField(term433, term433.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term433, term433.getClass(), "sealed", false);
        setField(term432, term432.getClass(), "parent", term433);
        setField(term432, term432.getClass(), "namespaceMap", term435);
        setField(term432, term432.getClass(), "reverseMap", term440);
        setField(term432, term432.getClass(), "pointer", null);
        setField(term432, term432.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term432, term432.getClass(), "sealed", false);
        setField(term431, term431.getClass(), "parent", term432);
        setField(term431, term431.getClass(), "namespaceMap", term446);
        setField(term431, term431.getClass(), "reverseMap", term451);
        setField(term431, term431.getClass(), "pointer", null);
        setField(term431, term431.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term431, term431.getClass(), "sealed", false);
        setField(term430, term430.getClass(), "parent", term431);
        setField(term430, term430.getClass(), "namespaceMap", term457);
        setField(term430, term430.getClass(), "reverseMap", term462);
        setField(term430, term430.getClass(), "pointer", null);
        setField(term430, term430.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term430, term430.getClass(), "sealed", false);
        setField(term413, term413.getClass(), "namespaceResolver", term430);
        setField(term413, term413.getClass(), "parent", null);
        setField(term413, term413.getClass(), "locale", null);
        HashMap term3679 = new HashMap();
        HashMap term3680 = new HashMap();
        HashMap term3681 = new HashMap();
        HashMap term3682 = new HashMap();
        HashMap term3683 = new HashMap();
        HashMap term3684 = new HashMap();
        term3670 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term3671 = newInstance(Class.forName("java.lang.Object"));
        Object term3674 = newInstance(Class.forName("java.lang.Object"));
        Object term3675 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3676 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3677 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3678 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3670, term3670.getClass(), "node", term3671);
        setField(term3670, term3670.getClass(), "id", "RMFIsYGgne");
        setIntField(term3670, term3670.getClass(), "index", -1922583790);
        setBooleanField(term3670, term3670.getClass(), "attribute", true);
        setField(term3670, term3670.getClass(), "rootNode", term3674);
        setField(term3678, term3678.getClass(), "parent", null);
        setField(term3678, term3678.getClass(), "namespaceMap", null);
        setField(term3678, term3678.getClass(), "reverseMap", null);
        setField(term3678, term3678.getClass(), "pointer", null);
        setField(term3678, term3678.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3678, term3678.getClass(), "sealed", false);
        setField(term3677, term3677.getClass(), "parent", term3678);
        setField(term3677, term3677.getClass(), "namespaceMap", term3679);
        setField(term3677, term3677.getClass(), "reverseMap", term3680);
        setField(term3677, term3677.getClass(), "pointer", null);
        setField(term3677, term3677.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3677, term3677.getClass(), "sealed", false);
        setField(term3676, term3676.getClass(), "parent", term3677);
        setField(term3676, term3676.getClass(), "namespaceMap", term3681);
        setField(term3676, term3676.getClass(), "reverseMap", term3682);
        setField(term3676, term3676.getClass(), "pointer", null);
        setField(term3676, term3676.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3676, term3676.getClass(), "sealed", false);
        setField(term3675, term3675.getClass(), "parent", term3676);
        setField(term3675, term3675.getClass(), "namespaceMap", term3683);
        setField(term3675, term3675.getClass(), "reverseMap", term3684);
        setField(term3675, term3675.getClass(), "pointer", null);
        setField(term3675, term3675.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3675, term3675.getClass(), "sealed", false);
        setField(term3670, term3670.getClass(), "namespaceResolver", term3675);
        setField(term3670, term3670.getClass(), "parent", null);
        setField(term3670, term3670.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term413, args);
        assertTrue(recursiveEquals(term413, term3670));
        assertTrue(recursiveEquals(retValue, null));
    }

};


