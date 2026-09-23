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

public class JDOMNodePointer_equals_50897049484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3553;
     Object term3639;
     Object term13099;
     Object term13122;

    public JDOMNodePointer_equals_50897049484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3572 = new HashMap();
        HashMap term3577 = new HashMap();
        HashMap term3583 = new HashMap();
        HashMap term3588 = new HashMap();
        HashMap term3594 = new HashMap();
        HashMap term3599 = new HashMap();
        HashMap term3611 = new HashMap();
        HashMap term3617 = new HashMap();
        HashMap term3622 = new HashMap();
        HashMap term3628 = new HashMap();
        HashMap term3633 = new HashMap();
        term3553 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term3554 = newInstance(Class.forName("java.lang.Object"));
        Object term3567 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3568 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3569 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3570 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3607 = newInstance(Class.forName("java.lang.Object"));
        Object term3608 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3609 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3610 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3553, term3553.getClass(), "node", term3554);
        setField(term3553, term3553.getClass(), "id", "onpbIeEKoi");
        setField(term3570, term3570.getClass(), "parent", null);
        setField(term3570, term3570.getClass(), "namespaceMap", null);
        setField(term3570, term3570.getClass(), "reverseMap", null);
        setField(term3570, term3570.getClass(), "pointer", null);
        setBooleanField(term3570, term3570.getClass(), "sealed", false);
        setField(term3569, term3569.getClass(), "parent", term3570);
        setField(term3569, term3569.getClass(), "namespaceMap", term3572);
        setField(term3569, term3569.getClass(), "reverseMap", term3577);
        setField(term3569, term3569.getClass(), "pointer", null);
        setBooleanField(term3569, term3569.getClass(), "sealed", false);
        setField(term3568, term3568.getClass(), "parent", term3569);
        setField(term3568, term3568.getClass(), "namespaceMap", term3583);
        setField(term3568, term3568.getClass(), "reverseMap", term3588);
        setField(term3568, term3568.getClass(), "pointer", null);
        setBooleanField(term3568, term3568.getClass(), "sealed", false);
        setField(term3567, term3567.getClass(), "parent", term3568);
        setField(term3567, term3567.getClass(), "namespaceMap", term3594);
        setField(term3567, term3567.getClass(), "reverseMap", term3599);
        setField(term3567, term3567.getClass(), "pointer", null);
        setBooleanField(term3567, term3567.getClass(), "sealed", false);
        setField(term3553, term3553.getClass(), "localNamespaceResolver", term3567);
        setIntField(term3553, term3553.getClass(), "index", -226514366);
        setBooleanField(term3553, term3553.getClass(), "attribute", true);
        setField(term3553, term3553.getClass(), "rootNode", term3607);
        setField(term3610, term3610.getClass(), "parent", null);
        setField(term3610, term3610.getClass(), "namespaceMap", term3611);
        setField(term3610, term3610.getClass(), "reverseMap", null);
        setField(term3610, term3610.getClass(), "pointer", null);
        setBooleanField(term3610, term3610.getClass(), "sealed", false);
        setField(term3609, term3609.getClass(), "parent", term3610);
        setField(term3609, term3609.getClass(), "namespaceMap", term3617);
        setField(term3609, term3609.getClass(), "reverseMap", term3622);
        setField(term3609, term3609.getClass(), "pointer", null);
        setBooleanField(term3609, term3609.getClass(), "sealed", false);
        setField(term3608, term3608.getClass(), "parent", term3609);
        setField(term3608, term3608.getClass(), "namespaceMap", term3628);
        setField(term3608, term3608.getClass(), "reverseMap", term3633);
        setField(term3608, term3608.getClass(), "pointer", null);
        setBooleanField(term3608, term3608.getClass(), "sealed", false);
        setField(term3553, term3553.getClass(), "namespaceResolver", term3608);
        setField(term3553, term3553.getClass(), "parent", null);
        setField(term3553, term3553.getClass(), "locale", null);
        term3639 = newInstance(Class.forName("java.lang.Object"));
        HashMap term13107 = new HashMap();
        HashMap term13108 = new HashMap();
        HashMap term13109 = new HashMap();
        HashMap term13110 = new HashMap();
        HashMap term13111 = new HashMap();
        HashMap term13112 = new HashMap();
        HashMap term13117 = new HashMap();
        HashMap term13118 = new HashMap();
        HashMap term13119 = new HashMap();
        HashMap term13120 = new HashMap();
        HashMap term13121 = new HashMap();
        term13099 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term13100 = newInstance(Class.forName("java.lang.Object"));
        Object term13103 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term13104 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term13105 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term13106 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term13113 = newInstance(Class.forName("java.lang.Object"));
        Object term13114 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term13115 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term13116 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term13099, term13099.getClass(), "node", term13100);
        setField(term13099, term13099.getClass(), "id", "onpbIeEKoi");
        setField(term13106, term13106.getClass(), "parent", null);
        setField(term13106, term13106.getClass(), "namespaceMap", null);
        setField(term13106, term13106.getClass(), "reverseMap", null);
        setField(term13106, term13106.getClass(), "pointer", null);
        setBooleanField(term13106, term13106.getClass(), "sealed", false);
        setField(term13105, term13105.getClass(), "parent", term13106);
        setField(term13105, term13105.getClass(), "namespaceMap", term13107);
        setField(term13105, term13105.getClass(), "reverseMap", term13108);
        setField(term13105, term13105.getClass(), "pointer", null);
        setBooleanField(term13105, term13105.getClass(), "sealed", false);
        setField(term13104, term13104.getClass(), "parent", term13105);
        setField(term13104, term13104.getClass(), "namespaceMap", term13109);
        setField(term13104, term13104.getClass(), "reverseMap", term13110);
        setField(term13104, term13104.getClass(), "pointer", null);
        setBooleanField(term13104, term13104.getClass(), "sealed", false);
        setField(term13103, term13103.getClass(), "parent", term13104);
        setField(term13103, term13103.getClass(), "namespaceMap", term13111);
        setField(term13103, term13103.getClass(), "reverseMap", term13112);
        setField(term13103, term13103.getClass(), "pointer", null);
        setBooleanField(term13103, term13103.getClass(), "sealed", false);
        setField(term13099, term13099.getClass(), "localNamespaceResolver", term13103);
        setIntField(term13099, term13099.getClass(), "index", -226514366);
        setBooleanField(term13099, term13099.getClass(), "attribute", true);
        setField(term13099, term13099.getClass(), "rootNode", term13113);
        setField(term13116, term13116.getClass(), "parent", null);
        setField(term13116, term13116.getClass(), "namespaceMap", term13117);
        setField(term13116, term13116.getClass(), "reverseMap", null);
        setField(term13116, term13116.getClass(), "pointer", null);
        setBooleanField(term13116, term13116.getClass(), "sealed", false);
        setField(term13115, term13115.getClass(), "parent", term13116);
        setField(term13115, term13115.getClass(), "namespaceMap", term13118);
        setField(term13115, term13115.getClass(), "reverseMap", term13119);
        setField(term13115, term13115.getClass(), "pointer", null);
        setBooleanField(term13115, term13115.getClass(), "sealed", false);
        setField(term13114, term13114.getClass(), "parent", term13115);
        setField(term13114, term13114.getClass(), "namespaceMap", term13120);
        setField(term13114, term13114.getClass(), "reverseMap", term13121);
        setField(term13114, term13114.getClass(), "pointer", null);
        setBooleanField(term13114, term13114.getClass(), "sealed", false);
        setField(term13099, term13099.getClass(), "namespaceResolver", term13114);
        setField(term13099, term13099.getClass(), "parent", null);
        setField(term13099, term13099.getClass(), "locale", null);
        term13122 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3639;
        Object retValue = callMethod(klass, "equals", argTypes, term3553, args);
        assertTrue(recursiveEquals(term3553, term13099));
        assertTrue(recursiveEquals(term3639, term13122));
        assertTrue(recursiveEquals(retValue, false));
    }

};


