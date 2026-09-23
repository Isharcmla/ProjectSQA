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

public class DOMNodePointer_getNamespaceResolver_34667816357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term880;
     Object term6653;
     Object term6575;

    public DOMNodePointer_getNamespaceResolver_34667816357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term881 = new HashMap();
        HashMap term915 = new HashMap();
        HashMap term920 = new HashMap();
        HashMap term926 = new HashMap();
        HashMap term931 = new HashMap();
        HashMap term937 = new HashMap();
        HashMap term942 = new HashMap();
        HashMap term952 = new HashMap();
        term880 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term910 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term911 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term912 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term913 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term950 = newInstance(Class.forName("java.lang.Object"));
        Object term951 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term880, term880.getClass(), "node", null);
        setField(term880, term880.getClass(), "namespaces", term881);
        setField(term880, term880.getClass(), "defaultNamespace", "RkybSrpybU");
        setField(term880, term880.getClass(), "id", "xOEqzGAmDU");
        setField(term913, term913.getClass(), "parent", null);
        setField(term913, term913.getClass(), "namespaceMap", null);
        setField(term913, term913.getClass(), "reverseMap", null);
        setField(term913, term913.getClass(), "pointer", null);
        setBooleanField(term913, term913.getClass(), "sealed", false);
        setField(term912, term912.getClass(), "parent", term913);
        setField(term912, term912.getClass(), "namespaceMap", term915);
        setField(term912, term912.getClass(), "reverseMap", term920);
        setField(term912, term912.getClass(), "pointer", null);
        setBooleanField(term912, term912.getClass(), "sealed", false);
        setField(term911, term911.getClass(), "parent", term912);
        setField(term911, term911.getClass(), "namespaceMap", term926);
        setField(term911, term911.getClass(), "reverseMap", term931);
        setField(term911, term911.getClass(), "pointer", null);
        setBooleanField(term911, term911.getClass(), "sealed", false);
        setField(term910, term910.getClass(), "parent", term911);
        setField(term910, term910.getClass(), "namespaceMap", term937);
        setField(term910, term910.getClass(), "reverseMap", term942);
        setField(term910, term910.getClass(), "pointer", null);
        setBooleanField(term910, term910.getClass(), "sealed", false);
        setField(term880, term880.getClass(), "localNamespaceResolver", term910);
        setIntField(term880, term880.getClass(), "index", -2038273078);
        setBooleanField(term880, term880.getClass(), "attribute", false);
        setField(term880, term880.getClass(), "rootNode", term950);
        setField(term951, term951.getClass(), "parent", null);
        setField(term951, term951.getClass(), "namespaceMap", term952);
        setField(term951, term951.getClass(), "reverseMap", null);
        setField(term951, term951.getClass(), "pointer", null);
        setBooleanField(term951, term951.getClass(), "sealed", false);
        setField(term880, term880.getClass(), "namespaceResolver", term951);
        setField(term880, term880.getClass(), "parent", null);
        setField(term880, term880.getClass(), "locale", null);
        HashMap term6654 = new HashMap();
        HashMap term6663 = new HashMap();
        HashMap term6664 = new HashMap();
        HashMap term6665 = new HashMap();
        HashMap term6666 = new HashMap();
        HashMap term6667 = new HashMap();
        HashMap term6668 = new HashMap();
        HashMap term6671 = new HashMap();
        term6653 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term6659 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6660 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6661 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6662 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6669 = newInstance(Class.forName("java.lang.Object"));
        Object term6670 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term6653, term6653.getClass(), "node", null);
        setField(term6653, term6653.getClass(), "namespaces", term6654);
        setField(term6653, term6653.getClass(), "defaultNamespace", "RkybSrpybU");
        setField(term6653, term6653.getClass(), "id", "xOEqzGAmDU");
        setField(term6662, term6662.getClass(), "parent", null);
        setField(term6662, term6662.getClass(), "namespaceMap", null);
        setField(term6662, term6662.getClass(), "reverseMap", null);
        setField(term6662, term6662.getClass(), "pointer", null);
        setBooleanField(term6662, term6662.getClass(), "sealed", false);
        setField(term6661, term6661.getClass(), "parent", term6662);
        setField(term6661, term6661.getClass(), "namespaceMap", term6663);
        setField(term6661, term6661.getClass(), "reverseMap", term6664);
        setField(term6661, term6661.getClass(), "pointer", null);
        setBooleanField(term6661, term6661.getClass(), "sealed", false);
        setField(term6660, term6660.getClass(), "parent", term6661);
        setField(term6660, term6660.getClass(), "namespaceMap", term6665);
        setField(term6660, term6660.getClass(), "reverseMap", term6666);
        setField(term6660, term6660.getClass(), "pointer", null);
        setBooleanField(term6660, term6660.getClass(), "sealed", false);
        setField(term6659, term6659.getClass(), "parent", term6660);
        setField(term6659, term6659.getClass(), "namespaceMap", term6667);
        setField(term6659, term6659.getClass(), "reverseMap", term6668);
        setField(term6659, term6659.getClass(), "pointer", null);
        setBooleanField(term6659, term6659.getClass(), "sealed", false);
        setField(term6653, term6653.getClass(), "localNamespaceResolver", term6659);
        setIntField(term6653, term6653.getClass(), "index", -2038273078);
        setBooleanField(term6653, term6653.getClass(), "attribute", false);
        setField(term6653, term6653.getClass(), "rootNode", term6669);
        setField(term6670, term6670.getClass(), "parent", null);
        setField(term6670, term6670.getClass(), "namespaceMap", term6671);
        setField(term6670, term6670.getClass(), "reverseMap", null);
        setField(term6670, term6670.getClass(), "pointer", null);
        setBooleanField(term6670, term6670.getClass(), "sealed", false);
        setField(term6653, term6653.getClass(), "namespaceResolver", term6670);
        setField(term6653, term6653.getClass(), "parent", null);
        setField(term6653, term6653.getClass(), "locale", null);
        HashMap term6580 = new HashMap();
        HashMap term6585 = new HashMap();
        HashMap term6591 = new HashMap();
        HashMap term6596 = new HashMap();
        HashMap term6602 = new HashMap();
        HashMap term6607 = new HashMap();
        term6575 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6576 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6577 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6578 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term6578, term6578.getClass(), "parent", null);
        setField(term6578, term6578.getClass(), "namespaceMap", null);
        setField(term6578, term6578.getClass(), "reverseMap", null);
        setField(term6578, term6578.getClass(), "pointer", null);
        setBooleanField(term6578, term6578.getClass(), "sealed", false);
        setField(term6577, term6577.getClass(), "parent", term6578);
        setField(term6577, term6577.getClass(), "namespaceMap", term6580);
        setField(term6577, term6577.getClass(), "reverseMap", term6585);
        setField(term6577, term6577.getClass(), "pointer", null);
        setBooleanField(term6577, term6577.getClass(), "sealed", false);
        setField(term6576, term6576.getClass(), "parent", term6577);
        setField(term6576, term6576.getClass(), "namespaceMap", term6591);
        setField(term6576, term6576.getClass(), "reverseMap", term6596);
        setField(term6576, term6576.getClass(), "pointer", null);
        setBooleanField(term6576, term6576.getClass(), "sealed", false);
        setField(term6575, term6575.getClass(), "parent", term6576);
        setField(term6575, term6575.getClass(), "namespaceMap", term6602);
        setField(term6575, term6575.getClass(), "reverseMap", term6607);
        setField(term6575, term6575.getClass(), "pointer", null);
        setBooleanField(term6575, term6575.getClass(), "sealed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNamespaceResolver", argTypes, term880, args);
        assertTrue(recursiveEquals(term880, term6653));
        assertTrue(recursiveEquals(retValue, term6575));
    }

};


