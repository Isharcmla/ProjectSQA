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
import org.apache.commons.jxpath.JXPathException;
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JDOMNodePointer_createAttribute_1929968726315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1596653;

    public JDOMNodePointer_createAttribute_1929968726315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1596653 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1596769 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1596885 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1597001 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1597117 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1597233 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1597349 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1597465 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1597581 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1597697 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1597813 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1597929 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1598045 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1598161 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1598277 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1598393 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1598509 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1598625 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1598741 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1598857 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1598973 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1599089 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term1596653, term1596653.getClass(), "node", null);
        setField(term1596653, term1596653.getClass(), "id", null);
        setField(term1596769, term1596769.getClass(), "id", null);
        setField(term1596885, term1596885.getClass(), "id", null);
        setField(term1597001, term1597001.getClass(), "id", null);
        setField(term1597117, term1597117.getClass(), "id", null);
        setField(term1597233, term1597233.getClass(), "id", null);
        setField(term1597349, term1597349.getClass(), "id", null);
        setField(term1597465, term1597465.getClass(), "id", null);
        setField(term1597581, term1597581.getClass(), "id", null);
        setField(term1597697, term1597697.getClass(), "id", null);
        setField(term1597813, term1597813.getClass(), "id", null);
        setField(term1597929, term1597929.getClass(), "id", null);
        setField(term1598045, term1598045.getClass(), "id", null);
        setField(term1598161, term1598161.getClass(), "id", null);
        setField(term1598277, term1598277.getClass(), "id", null);
        setField(term1598393, term1598393.getClass(), "id", null);
        setField(term1598509, term1598509.getClass(), "id", null);
        setField(term1598625, term1598625.getClass(), "id", null);
        setField(term1598741, term1598741.getClass(), "id", null);
        setField(term1598857, term1598857.getClass(), "id", null);
        setField(term1598973, term1598973.getClass(), "id", null);
        setField(term1599089, term1599089.getClass(), "id", null);
        setField(term1599089, term1599089.getClass(), "parent", null);
        setField(term1598973, term1598973.getClass(), "parent", term1599089);
        setField(term1598857, term1598857.getClass(), "parent", term1598973);
        setField(term1598741, term1598741.getClass(), "parent", term1598857);
        setField(term1598625, term1598625.getClass(), "parent", term1598741);
        setField(term1598509, term1598509.getClass(), "parent", term1598625);
        setField(term1598393, term1598393.getClass(), "parent", term1598509);
        setField(term1598277, term1598277.getClass(), "parent", term1598393);
        setField(term1598161, term1598161.getClass(), "parent", term1598277);
        setField(term1598045, term1598045.getClass(), "parent", term1598161);
        setField(term1597929, term1597929.getClass(), "parent", term1598045);
        setField(term1597813, term1597813.getClass(), "parent", term1597929);
        setField(term1597697, term1597697.getClass(), "parent", term1597813);
        setField(term1597581, term1597581.getClass(), "parent", term1597697);
        setField(term1597465, term1597465.getClass(), "parent", term1597581);
        setField(term1597349, term1597349.getClass(), "parent", term1597465);
        setField(term1597233, term1597233.getClass(), "parent", term1597349);
        setField(term1597117, term1597117.getClass(), "parent", term1597233);
        setField(term1597001, term1597001.getClass(), "parent", term1597117);
        setField(term1596885, term1596885.getClass(), "parent", term1597001);
        setField(term1596769, term1596769.getClass(), "parent", term1596885);
        setField(term1596653, term1596653.getClass(), "parent", term1596769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "createAttribute", argTypes, term1596653, args);
            assertTrue(false);
        }
        catch (JXPathException e) {
        }

    }

};


