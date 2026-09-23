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

public class JDOMNodePointer_hashCode_95765716983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3457;
     Object term12966;

    public JDOMNodePointer_hashCode_95765716983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3476 = new HashMap();
        HashMap term3481 = new HashMap();
        HashMap term3487 = new HashMap();
        HashMap term3492 = new HashMap();
        HashMap term3498 = new HashMap();
        HashMap term3503 = new HashMap();
        HashMap term3515 = new HashMap();
        HashMap term3521 = new HashMap();
        HashMap term3526 = new HashMap();
        HashMap term3532 = new HashMap();
        HashMap term3537 = new HashMap();
        term3457 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term3458 = newInstance(Class.forName("java.lang.Object"));
        Object term3471 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3472 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3473 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3474 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3511 = newInstance(Class.forName("java.lang.Object"));
        Object term3512 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3513 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3514 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3457, term3457.getClass(), "node", term3458);
        setField(term3457, term3457.getClass(), "id", "JDswTTCZHV");
        setField(term3474, term3474.getClass(), "parent", null);
        setField(term3474, term3474.getClass(), "namespaceMap", null);
        setField(term3474, term3474.getClass(), "reverseMap", null);
        setField(term3474, term3474.getClass(), "pointer", null);
        setBooleanField(term3474, term3474.getClass(), "sealed", false);
        setField(term3473, term3473.getClass(), "parent", term3474);
        setField(term3473, term3473.getClass(), "namespaceMap", term3476);
        setField(term3473, term3473.getClass(), "reverseMap", term3481);
        setField(term3473, term3473.getClass(), "pointer", null);
        setBooleanField(term3473, term3473.getClass(), "sealed", false);
        setField(term3472, term3472.getClass(), "parent", term3473);
        setField(term3472, term3472.getClass(), "namespaceMap", term3487);
        setField(term3472, term3472.getClass(), "reverseMap", term3492);
        setField(term3472, term3472.getClass(), "pointer", null);
        setBooleanField(term3472, term3472.getClass(), "sealed", false);
        setField(term3471, term3471.getClass(), "parent", term3472);
        setField(term3471, term3471.getClass(), "namespaceMap", term3498);
        setField(term3471, term3471.getClass(), "reverseMap", term3503);
        setField(term3471, term3471.getClass(), "pointer", null);
        setBooleanField(term3471, term3471.getClass(), "sealed", false);
        setField(term3457, term3457.getClass(), "localNamespaceResolver", term3471);
        setIntField(term3457, term3457.getClass(), "index", -73683645);
        setBooleanField(term3457, term3457.getClass(), "attribute", true);
        setField(term3457, term3457.getClass(), "rootNode", term3511);
        setField(term3514, term3514.getClass(), "parent", null);
        setField(term3514, term3514.getClass(), "namespaceMap", term3515);
        setField(term3514, term3514.getClass(), "reverseMap", null);
        setField(term3514, term3514.getClass(), "pointer", null);
        setBooleanField(term3514, term3514.getClass(), "sealed", false);
        setField(term3513, term3513.getClass(), "parent", term3514);
        setField(term3513, term3513.getClass(), "namespaceMap", term3521);
        setField(term3513, term3513.getClass(), "reverseMap", term3526);
        setField(term3513, term3513.getClass(), "pointer", null);
        setBooleanField(term3513, term3513.getClass(), "sealed", false);
        setField(term3512, term3512.getClass(), "parent", term3513);
        setField(term3512, term3512.getClass(), "namespaceMap", term3532);
        setField(term3512, term3512.getClass(), "reverseMap", term3537);
        setField(term3512, term3512.getClass(), "pointer", null);
        setBooleanField(term3512, term3512.getClass(), "sealed", false);
        setField(term3457, term3457.getClass(), "namespaceResolver", term3512);
        setField(term3457, term3457.getClass(), "parent", null);
        setField(term3457, term3457.getClass(), "locale", null);
        HashMap term12974 = new HashMap();
        HashMap term12975 = new HashMap();
        HashMap term12976 = new HashMap();
        HashMap term12977 = new HashMap();
        HashMap term12978 = new HashMap();
        HashMap term12979 = new HashMap();
        HashMap term12984 = new HashMap();
        HashMap term12985 = new HashMap();
        HashMap term12986 = new HashMap();
        HashMap term12987 = new HashMap();
        HashMap term12988 = new HashMap();
        term12966 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term12967 = newInstance(Class.forName("java.lang.Object"));
        Object term12970 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term12971 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term12972 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term12973 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term12980 = newInstance(Class.forName("java.lang.Object"));
        Object term12981 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term12982 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term12983 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term12966, term12966.getClass(), "node", term12967);
        setField(term12966, term12966.getClass(), "id", "JDswTTCZHV");
        setField(term12973, term12973.getClass(), "parent", null);
        setField(term12973, term12973.getClass(), "namespaceMap", null);
        setField(term12973, term12973.getClass(), "reverseMap", null);
        setField(term12973, term12973.getClass(), "pointer", null);
        setBooleanField(term12973, term12973.getClass(), "sealed", false);
        setField(term12972, term12972.getClass(), "parent", term12973);
        setField(term12972, term12972.getClass(), "namespaceMap", term12974);
        setField(term12972, term12972.getClass(), "reverseMap", term12975);
        setField(term12972, term12972.getClass(), "pointer", null);
        setBooleanField(term12972, term12972.getClass(), "sealed", false);
        setField(term12971, term12971.getClass(), "parent", term12972);
        setField(term12971, term12971.getClass(), "namespaceMap", term12976);
        setField(term12971, term12971.getClass(), "reverseMap", term12977);
        setField(term12971, term12971.getClass(), "pointer", null);
        setBooleanField(term12971, term12971.getClass(), "sealed", false);
        setField(term12970, term12970.getClass(), "parent", term12971);
        setField(term12970, term12970.getClass(), "namespaceMap", term12978);
        setField(term12970, term12970.getClass(), "reverseMap", term12979);
        setField(term12970, term12970.getClass(), "pointer", null);
        setBooleanField(term12970, term12970.getClass(), "sealed", false);
        setField(term12966, term12966.getClass(), "localNamespaceResolver", term12970);
        setIntField(term12966, term12966.getClass(), "index", -73683645);
        setBooleanField(term12966, term12966.getClass(), "attribute", true);
        setField(term12966, term12966.getClass(), "rootNode", term12980);
        setField(term12983, term12983.getClass(), "parent", null);
        setField(term12983, term12983.getClass(), "namespaceMap", term12984);
        setField(term12983, term12983.getClass(), "reverseMap", null);
        setField(term12983, term12983.getClass(), "pointer", null);
        setBooleanField(term12983, term12983.getClass(), "sealed", false);
        setField(term12982, term12982.getClass(), "parent", term12983);
        setField(term12982, term12982.getClass(), "namespaceMap", term12985);
        setField(term12982, term12982.getClass(), "reverseMap", term12986);
        setField(term12982, term12982.getClass(), "pointer", null);
        setBooleanField(term12982, term12982.getClass(), "sealed", false);
        setField(term12981, term12981.getClass(), "parent", term12982);
        setField(term12981, term12981.getClass(), "namespaceMap", term12987);
        setField(term12981, term12981.getClass(), "reverseMap", term12988);
        setField(term12981, term12981.getClass(), "pointer", null);
        setBooleanField(term12981, term12981.getClass(), "sealed", false);
        setField(term12966, term12966.getClass(), "namespaceResolver", term12981);
        setField(term12966, term12966.getClass(), "parent", null);
        setField(term12966, term12966.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term3457, args);
        assertTrue(recursiveEquals(term3457, term12966));
        assertTrue(recursiveEquals(retValue, 1780785167));
    }

};


