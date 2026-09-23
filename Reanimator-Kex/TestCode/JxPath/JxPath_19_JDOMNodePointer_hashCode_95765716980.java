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

public class JDOMNodePointer_hashCode_95765716980 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3462;
     Object term12837;

    public JDOMNodePointer_hashCode_95765716980() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3481 = new HashMap();
        HashMap term3486 = new HashMap();
        HashMap term3492 = new HashMap();
        HashMap term3497 = new HashMap();
        HashMap term3503 = new HashMap();
        HashMap term3508 = new HashMap();
        HashMap term3519 = new HashMap();
        HashMap term3524 = new HashMap();
        HashMap term3530 = new HashMap();
        HashMap term3535 = new HashMap();
        HashMap term3541 = new HashMap();
        HashMap term3546 = new HashMap();
        term3462 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term3463 = newInstance(Class.forName("java.lang.Object"));
        Object term3476 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3477 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3478 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3479 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3516 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3517 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3518 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3552 = newInstance(Class.forName("java.lang.Object"));
        setField(term3462, term3462.getClass(), "node", term3463);
        setField(term3462, term3462.getClass(), "id", "nGKItKLYNC");
        setField(term3479, term3479.getClass(), "parent", null);
        setField(term3479, term3479.getClass(), "namespaceMap", null);
        setField(term3479, term3479.getClass(), "reverseMap", null);
        setField(term3479, term3479.getClass(), "pointer", null);
        setBooleanField(term3479, term3479.getClass(), "sealed", false);
        setField(term3478, term3478.getClass(), "parent", term3479);
        setField(term3478, term3478.getClass(), "namespaceMap", term3481);
        setField(term3478, term3478.getClass(), "reverseMap", term3486);
        setField(term3478, term3478.getClass(), "pointer", null);
        setBooleanField(term3478, term3478.getClass(), "sealed", false);
        setField(term3477, term3477.getClass(), "parent", term3478);
        setField(term3477, term3477.getClass(), "namespaceMap", term3492);
        setField(term3477, term3477.getClass(), "reverseMap", term3497);
        setField(term3477, term3477.getClass(), "pointer", null);
        setBooleanField(term3477, term3477.getClass(), "sealed", false);
        setField(term3476, term3476.getClass(), "parent", term3477);
        setField(term3476, term3476.getClass(), "namespaceMap", term3503);
        setField(term3476, term3476.getClass(), "reverseMap", term3508);
        setField(term3476, term3476.getClass(), "pointer", null);
        setBooleanField(term3476, term3476.getClass(), "sealed", false);
        setField(term3462, term3462.getClass(), "localNamespaceResolver", term3476);
        setIntField(term3462, term3462.getClass(), "index", -1179120542);
        setBooleanField(term3462, term3462.getClass(), "attribute", true);
        setField(term3518, term3518.getClass(), "parent", null);
        setField(term3518, term3518.getClass(), "namespaceMap", term3519);
        setField(term3518, term3518.getClass(), "reverseMap", term3524);
        setField(term3518, term3518.getClass(), "pointer", null);
        setBooleanField(term3518, term3518.getClass(), "sealed", false);
        setField(term3517, term3517.getClass(), "parent", term3518);
        setField(term3517, term3517.getClass(), "namespaceMap", term3530);
        setField(term3517, term3517.getClass(), "reverseMap", term3535);
        setField(term3517, term3517.getClass(), "pointer", null);
        setBooleanField(term3517, term3517.getClass(), "sealed", false);
        setField(term3516, term3516.getClass(), "parent", term3517);
        setField(term3516, term3516.getClass(), "namespaceMap", term3541);
        setField(term3516, term3516.getClass(), "reverseMap", term3546);
        setField(term3516, term3516.getClass(), "pointer", null);
        setBooleanField(term3516, term3516.getClass(), "sealed", false);
        setField(term3462, term3462.getClass(), "namespaceResolver", term3516);
        setField(term3462, term3462.getClass(), "rootNode", term3552);
        setField(term3462, term3462.getClass(), "parent", null);
        setField(term3462, term3462.getClass(), "locale", null);
        HashMap term12845 = new HashMap();
        HashMap term12846 = new HashMap();
        HashMap term12847 = new HashMap();
        HashMap term12848 = new HashMap();
        HashMap term12849 = new HashMap();
        HashMap term12850 = new HashMap();
        HashMap term12854 = new HashMap();
        HashMap term12855 = new HashMap();
        HashMap term12856 = new HashMap();
        HashMap term12857 = new HashMap();
        HashMap term12858 = new HashMap();
        HashMap term12859 = new HashMap();
        term12837 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term12838 = newInstance(Class.forName("java.lang.Object"));
        Object term12841 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term12842 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term12843 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term12844 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term12851 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term12852 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term12853 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term12860 = newInstance(Class.forName("java.lang.Object"));
        setField(term12837, term12837.getClass(), "node", term12838);
        setField(term12837, term12837.getClass(), "id", "nGKItKLYNC");
        setField(term12844, term12844.getClass(), "parent", null);
        setField(term12844, term12844.getClass(), "namespaceMap", null);
        setField(term12844, term12844.getClass(), "reverseMap", null);
        setField(term12844, term12844.getClass(), "pointer", null);
        setBooleanField(term12844, term12844.getClass(), "sealed", false);
        setField(term12843, term12843.getClass(), "parent", term12844);
        setField(term12843, term12843.getClass(), "namespaceMap", term12845);
        setField(term12843, term12843.getClass(), "reverseMap", term12846);
        setField(term12843, term12843.getClass(), "pointer", null);
        setBooleanField(term12843, term12843.getClass(), "sealed", false);
        setField(term12842, term12842.getClass(), "parent", term12843);
        setField(term12842, term12842.getClass(), "namespaceMap", term12847);
        setField(term12842, term12842.getClass(), "reverseMap", term12848);
        setField(term12842, term12842.getClass(), "pointer", null);
        setBooleanField(term12842, term12842.getClass(), "sealed", false);
        setField(term12841, term12841.getClass(), "parent", term12842);
        setField(term12841, term12841.getClass(), "namespaceMap", term12849);
        setField(term12841, term12841.getClass(), "reverseMap", term12850);
        setField(term12841, term12841.getClass(), "pointer", null);
        setBooleanField(term12841, term12841.getClass(), "sealed", false);
        setField(term12837, term12837.getClass(), "localNamespaceResolver", term12841);
        setIntField(term12837, term12837.getClass(), "index", -1179120542);
        setBooleanField(term12837, term12837.getClass(), "attribute", true);
        setField(term12853, term12853.getClass(), "parent", null);
        setField(term12853, term12853.getClass(), "namespaceMap", term12854);
        setField(term12853, term12853.getClass(), "reverseMap", term12855);
        setField(term12853, term12853.getClass(), "pointer", null);
        setBooleanField(term12853, term12853.getClass(), "sealed", false);
        setField(term12852, term12852.getClass(), "parent", term12853);
        setField(term12852, term12852.getClass(), "namespaceMap", term12856);
        setField(term12852, term12852.getClass(), "reverseMap", term12857);
        setField(term12852, term12852.getClass(), "pointer", null);
        setBooleanField(term12852, term12852.getClass(), "sealed", false);
        setField(term12851, term12851.getClass(), "parent", term12852);
        setField(term12851, term12851.getClass(), "namespaceMap", term12858);
        setField(term12851, term12851.getClass(), "reverseMap", term12859);
        setField(term12851, term12851.getClass(), "pointer", null);
        setBooleanField(term12851, term12851.getClass(), "sealed", false);
        setField(term12837, term12837.getClass(), "namespaceResolver", term12851);
        setField(term12837, term12837.getClass(), "rootNode", term12860);
        setField(term12837, term12837.getClass(), "parent", null);
        setField(term12837, term12837.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term3462, args);
        assertTrue(recursiveEquals(term3462, term12837));
        assertTrue(recursiveEquals(retValue, 1684148145));
    }

};


