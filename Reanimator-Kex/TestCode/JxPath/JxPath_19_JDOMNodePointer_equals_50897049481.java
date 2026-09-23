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

public class JDOMNodePointer_equals_50897049481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3563;
     Object term3654;
     Object term12976;
     Object term13000;

    public JDOMNodePointer_equals_50897049481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3582 = new HashMap();
        HashMap term3587 = new HashMap();
        HashMap term3593 = new HashMap();
        HashMap term3598 = new HashMap();
        HashMap term3604 = new HashMap();
        HashMap term3609 = new HashMap();
        HashMap term3620 = new HashMap();
        HashMap term3625 = new HashMap();
        HashMap term3631 = new HashMap();
        HashMap term3636 = new HashMap();
        HashMap term3642 = new HashMap();
        HashMap term3647 = new HashMap();
        term3563 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term3564 = newInstance(Class.forName("java.lang.Object"));
        Object term3577 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3578 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3579 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3580 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3617 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3618 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3619 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3653 = newInstance(Class.forName("java.lang.Object"));
        setField(term3563, term3563.getClass(), "node", term3564);
        setField(term3563, term3563.getClass(), "id", "UiUYnPrcCi");
        setField(term3580, term3580.getClass(), "parent", null);
        setField(term3580, term3580.getClass(), "namespaceMap", null);
        setField(term3580, term3580.getClass(), "reverseMap", null);
        setField(term3580, term3580.getClass(), "pointer", null);
        setBooleanField(term3580, term3580.getClass(), "sealed", false);
        setField(term3579, term3579.getClass(), "parent", term3580);
        setField(term3579, term3579.getClass(), "namespaceMap", term3582);
        setField(term3579, term3579.getClass(), "reverseMap", term3587);
        setField(term3579, term3579.getClass(), "pointer", null);
        setBooleanField(term3579, term3579.getClass(), "sealed", false);
        setField(term3578, term3578.getClass(), "parent", term3579);
        setField(term3578, term3578.getClass(), "namespaceMap", term3593);
        setField(term3578, term3578.getClass(), "reverseMap", term3598);
        setField(term3578, term3578.getClass(), "pointer", null);
        setBooleanField(term3578, term3578.getClass(), "sealed", false);
        setField(term3577, term3577.getClass(), "parent", term3578);
        setField(term3577, term3577.getClass(), "namespaceMap", term3604);
        setField(term3577, term3577.getClass(), "reverseMap", term3609);
        setField(term3577, term3577.getClass(), "pointer", null);
        setBooleanField(term3577, term3577.getClass(), "sealed", false);
        setField(term3563, term3563.getClass(), "localNamespaceResolver", term3577);
        setIntField(term3563, term3563.getClass(), "index", -73683645);
        setBooleanField(term3563, term3563.getClass(), "attribute", true);
        setField(term3619, term3619.getClass(), "parent", null);
        setField(term3619, term3619.getClass(), "namespaceMap", term3620);
        setField(term3619, term3619.getClass(), "reverseMap", term3625);
        setField(term3619, term3619.getClass(), "pointer", null);
        setBooleanField(term3619, term3619.getClass(), "sealed", false);
        setField(term3618, term3618.getClass(), "parent", term3619);
        setField(term3618, term3618.getClass(), "namespaceMap", term3631);
        setField(term3618, term3618.getClass(), "reverseMap", term3636);
        setField(term3618, term3618.getClass(), "pointer", null);
        setBooleanField(term3618, term3618.getClass(), "sealed", false);
        setField(term3617, term3617.getClass(), "parent", term3618);
        setField(term3617, term3617.getClass(), "namespaceMap", term3642);
        setField(term3617, term3617.getClass(), "reverseMap", term3647);
        setField(term3617, term3617.getClass(), "pointer", null);
        setBooleanField(term3617, term3617.getClass(), "sealed", false);
        setField(term3563, term3563.getClass(), "namespaceResolver", term3617);
        setField(term3563, term3563.getClass(), "rootNode", term3653);
        setField(term3563, term3563.getClass(), "parent", null);
        setField(term3563, term3563.getClass(), "locale", null);
        term3654 = newInstance(Class.forName("java.lang.Object"));
        HashMap term12984 = new HashMap();
        HashMap term12985 = new HashMap();
        HashMap term12986 = new HashMap();
        HashMap term12987 = new HashMap();
        HashMap term12988 = new HashMap();
        HashMap term12989 = new HashMap();
        HashMap term12993 = new HashMap();
        HashMap term12994 = new HashMap();
        HashMap term12995 = new HashMap();
        HashMap term12996 = new HashMap();
        HashMap term12997 = new HashMap();
        HashMap term12998 = new HashMap();
        term12976 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term12977 = newInstance(Class.forName("java.lang.Object"));
        Object term12980 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term12981 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term12982 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term12983 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term12990 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term12991 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term12992 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term12999 = newInstance(Class.forName("java.lang.Object"));
        setField(term12976, term12976.getClass(), "node", term12977);
        setField(term12976, term12976.getClass(), "id", "UiUYnPrcCi");
        setField(term12983, term12983.getClass(), "parent", null);
        setField(term12983, term12983.getClass(), "namespaceMap", null);
        setField(term12983, term12983.getClass(), "reverseMap", null);
        setField(term12983, term12983.getClass(), "pointer", null);
        setBooleanField(term12983, term12983.getClass(), "sealed", false);
        setField(term12982, term12982.getClass(), "parent", term12983);
        setField(term12982, term12982.getClass(), "namespaceMap", term12984);
        setField(term12982, term12982.getClass(), "reverseMap", term12985);
        setField(term12982, term12982.getClass(), "pointer", null);
        setBooleanField(term12982, term12982.getClass(), "sealed", false);
        setField(term12981, term12981.getClass(), "parent", term12982);
        setField(term12981, term12981.getClass(), "namespaceMap", term12986);
        setField(term12981, term12981.getClass(), "reverseMap", term12987);
        setField(term12981, term12981.getClass(), "pointer", null);
        setBooleanField(term12981, term12981.getClass(), "sealed", false);
        setField(term12980, term12980.getClass(), "parent", term12981);
        setField(term12980, term12980.getClass(), "namespaceMap", term12988);
        setField(term12980, term12980.getClass(), "reverseMap", term12989);
        setField(term12980, term12980.getClass(), "pointer", null);
        setBooleanField(term12980, term12980.getClass(), "sealed", false);
        setField(term12976, term12976.getClass(), "localNamespaceResolver", term12980);
        setIntField(term12976, term12976.getClass(), "index", -73683645);
        setBooleanField(term12976, term12976.getClass(), "attribute", true);
        setField(term12992, term12992.getClass(), "parent", null);
        setField(term12992, term12992.getClass(), "namespaceMap", term12993);
        setField(term12992, term12992.getClass(), "reverseMap", term12994);
        setField(term12992, term12992.getClass(), "pointer", null);
        setBooleanField(term12992, term12992.getClass(), "sealed", false);
        setField(term12991, term12991.getClass(), "parent", term12992);
        setField(term12991, term12991.getClass(), "namespaceMap", term12995);
        setField(term12991, term12991.getClass(), "reverseMap", term12996);
        setField(term12991, term12991.getClass(), "pointer", null);
        setBooleanField(term12991, term12991.getClass(), "sealed", false);
        setField(term12990, term12990.getClass(), "parent", term12991);
        setField(term12990, term12990.getClass(), "namespaceMap", term12997);
        setField(term12990, term12990.getClass(), "reverseMap", term12998);
        setField(term12990, term12990.getClass(), "pointer", null);
        setBooleanField(term12990, term12990.getClass(), "sealed", false);
        setField(term12976, term12976.getClass(), "namespaceResolver", term12990);
        setField(term12976, term12976.getClass(), "rootNode", term12999);
        setField(term12976, term12976.getClass(), "parent", null);
        setField(term12976, term12976.getClass(), "locale", null);
        term13000 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3654;
        Object retValue = callMethod(klass, "equals", argTypes, term3563, args);
        assertTrue(recursiveEquals(term3563, term12976));
        assertTrue(recursiveEquals(term3654, term13000));
        assertTrue(recursiveEquals(retValue, false));
    }

};


