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

public class JDOMNodePointer_getImmediateNode_110421740457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term956;
     Object term4609;
     Object term4554;

    public JDOMNodePointer_getImmediateNode_110421740457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term978 = new HashMap();
        HashMap term983 = new HashMap();
        HashMap term989 = new HashMap();
        HashMap term994 = new HashMap();
        HashMap term1000 = new HashMap();
        HashMap term1005 = new HashMap();
        term956 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term957 = newInstance(Class.forName("java.lang.Object"));
        Object term972 = newInstance(Class.forName("java.lang.Object"));
        Object term973 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term974 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term975 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term976 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term956, term956.getClass(), "node", term957);
        setField(term956, term956.getClass(), "id", "HyxfbSQYBe");
        setIntField(term956, term956.getClass(), "index", 1134449235);
        setBooleanField(term956, term956.getClass(), "attribute", true);
        setField(term956, term956.getClass(), "rootNode", term972);
        setField(term976, term976.getClass(), "parent", null);
        setField(term976, term976.getClass(), "namespaceMap", null);
        setField(term976, term976.getClass(), "reverseMap", null);
        setField(term976, term976.getClass(), "pointer", null);
        setField(term976, term976.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term976, term976.getClass(), "sealed", false);
        setField(term975, term975.getClass(), "parent", term976);
        setField(term975, term975.getClass(), "namespaceMap", term978);
        setField(term975, term975.getClass(), "reverseMap", term983);
        setField(term975, term975.getClass(), "pointer", null);
        setField(term975, term975.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term975, term975.getClass(), "sealed", false);
        setField(term974, term974.getClass(), "parent", term975);
        setField(term974, term974.getClass(), "namespaceMap", term989);
        setField(term974, term974.getClass(), "reverseMap", term994);
        setField(term974, term974.getClass(), "pointer", null);
        setField(term974, term974.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term974, term974.getClass(), "sealed", false);
        setField(term973, term973.getClass(), "parent", term974);
        setField(term973, term973.getClass(), "namespaceMap", term1000);
        setField(term973, term973.getClass(), "reverseMap", term1005);
        setField(term973, term973.getClass(), "pointer", null);
        setField(term973, term973.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term973, term973.getClass(), "sealed", false);
        setField(term956, term956.getClass(), "namespaceResolver", term973);
        setField(term956, term956.getClass(), "parent", null);
        setField(term956, term956.getClass(), "locale", null);
        HashMap term4618 = new HashMap();
        HashMap term4619 = new HashMap();
        HashMap term4620 = new HashMap();
        HashMap term4621 = new HashMap();
        HashMap term4622 = new HashMap();
        HashMap term4623 = new HashMap();
        term4609 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term4610 = newInstance(Class.forName("java.lang.Object"));
        Object term4613 = newInstance(Class.forName("java.lang.Object"));
        Object term4614 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4615 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4616 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4617 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term4609, term4609.getClass(), "node", term4610);
        setField(term4609, term4609.getClass(), "id", "HyxfbSQYBe");
        setIntField(term4609, term4609.getClass(), "index", 1134449235);
        setBooleanField(term4609, term4609.getClass(), "attribute", true);
        setField(term4609, term4609.getClass(), "rootNode", term4613);
        setField(term4617, term4617.getClass(), "parent", null);
        setField(term4617, term4617.getClass(), "namespaceMap", null);
        setField(term4617, term4617.getClass(), "reverseMap", null);
        setField(term4617, term4617.getClass(), "pointer", null);
        setField(term4617, term4617.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4617, term4617.getClass(), "sealed", false);
        setField(term4616, term4616.getClass(), "parent", term4617);
        setField(term4616, term4616.getClass(), "namespaceMap", term4618);
        setField(term4616, term4616.getClass(), "reverseMap", term4619);
        setField(term4616, term4616.getClass(), "pointer", null);
        setField(term4616, term4616.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4616, term4616.getClass(), "sealed", false);
        setField(term4615, term4615.getClass(), "parent", term4616);
        setField(term4615, term4615.getClass(), "namespaceMap", term4620);
        setField(term4615, term4615.getClass(), "reverseMap", term4621);
        setField(term4615, term4615.getClass(), "pointer", null);
        setField(term4615, term4615.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4615, term4615.getClass(), "sealed", false);
        setField(term4614, term4614.getClass(), "parent", term4615);
        setField(term4614, term4614.getClass(), "namespaceMap", term4622);
        setField(term4614, term4614.getClass(), "reverseMap", term4623);
        setField(term4614, term4614.getClass(), "pointer", null);
        setField(term4614, term4614.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4614, term4614.getClass(), "sealed", false);
        setField(term4609, term4609.getClass(), "namespaceResolver", term4614);
        setField(term4609, term4609.getClass(), "parent", null);
        setField(term4609, term4609.getClass(), "locale", null);
        term4554 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getImmediateNode", argTypes, term956, args);
        assertTrue(recursiveEquals(term956, term4609));
        assertTrue(recursiveEquals(retValue, term4554));
    }

};


