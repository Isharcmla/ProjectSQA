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

public class JDOMNodePointer_createAttribute_1929968726313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1579947;

    public JDOMNodePointer_createAttribute_1929968726313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1579947 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1580063 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1580179 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1580295 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1580411 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1580527 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1580643 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1580759 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1580875 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1580991 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1581107 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1581223 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1581339 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1581455 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1581571 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1581687 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1581803 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1581919 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1582035 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1582151 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1582267 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1582383 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1582499 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1582615 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1582731 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1582847 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1582963 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1583079 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1583195 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1583311 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1583427 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1583543 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term1579947, term1579947.getClass(), "node", null);
        setField(term1579947, term1579947.getClass(), "id", null);
        setField(term1580063, term1580063.getClass(), "id", null);
        setField(term1580179, term1580179.getClass(), "id", null);
        setField(term1580295, term1580295.getClass(), "id", null);
        setField(term1580411, term1580411.getClass(), "id", null);
        setField(term1580527, term1580527.getClass(), "id", null);
        setField(term1580643, term1580643.getClass(), "id", null);
        setField(term1580759, term1580759.getClass(), "id", null);
        setField(term1580875, term1580875.getClass(), "id", null);
        setField(term1580991, term1580991.getClass(), "id", null);
        setField(term1581107, term1581107.getClass(), "id", null);
        setField(term1581223, term1581223.getClass(), "id", null);
        setField(term1581339, term1581339.getClass(), "id", null);
        setField(term1581455, term1581455.getClass(), "id", null);
        setField(term1581571, term1581571.getClass(), "id", null);
        setField(term1581687, term1581687.getClass(), "id", null);
        setField(term1581803, term1581803.getClass(), "id", null);
        setField(term1581919, term1581919.getClass(), "id", null);
        setField(term1582035, term1582035.getClass(), "id", null);
        setField(term1582151, term1582151.getClass(), "id", null);
        setField(term1582267, term1582267.getClass(), "id", null);
        setField(term1582383, term1582383.getClass(), "id", null);
        setField(term1582499, term1582499.getClass(), "id", null);
        setField(term1582615, term1582615.getClass(), "id", null);
        setField(term1582731, term1582731.getClass(), "id", null);
        setField(term1582847, term1582847.getClass(), "id", null);
        setField(term1582963, term1582963.getClass(), "id", null);
        setField(term1583079, term1583079.getClass(), "id", null);
        setField(term1583195, term1583195.getClass(), "id", null);
        setField(term1583311, term1583311.getClass(), "id", null);
        setField(term1583427, term1583427.getClass(), "id", null);
        setField(term1583543, term1583543.getClass(), "id", null);
        setField(term1583543, term1583543.getClass(), "parent", null);
        setField(term1583427, term1583427.getClass(), "parent", term1583543);
        setField(term1583311, term1583311.getClass(), "parent", term1583427);
        setField(term1583195, term1583195.getClass(), "parent", term1583311);
        setField(term1583079, term1583079.getClass(), "parent", term1583195);
        setField(term1582963, term1582963.getClass(), "parent", term1583079);
        setField(term1582847, term1582847.getClass(), "parent", term1582963);
        setField(term1582731, term1582731.getClass(), "parent", term1582847);
        setField(term1582615, term1582615.getClass(), "parent", term1582731);
        setField(term1582499, term1582499.getClass(), "parent", term1582615);
        setField(term1582383, term1582383.getClass(), "parent", term1582499);
        setField(term1582267, term1582267.getClass(), "parent", term1582383);
        setField(term1582151, term1582151.getClass(), "parent", term1582267);
        setField(term1582035, term1582035.getClass(), "parent", term1582151);
        setField(term1581919, term1581919.getClass(), "parent", term1582035);
        setField(term1581803, term1581803.getClass(), "parent", term1581919);
        setField(term1581687, term1581687.getClass(), "parent", term1581803);
        setField(term1581571, term1581571.getClass(), "parent", term1581687);
        setField(term1581455, term1581455.getClass(), "parent", term1581571);
        setField(term1581339, term1581339.getClass(), "parent", term1581455);
        setField(term1581223, term1581223.getClass(), "parent", term1581339);
        setField(term1581107, term1581107.getClass(), "parent", term1581223);
        setField(term1580991, term1580991.getClass(), "parent", term1581107);
        setField(term1580875, term1580875.getClass(), "parent", term1580991);
        setField(term1580759, term1580759.getClass(), "parent", term1580875);
        setField(term1580643, term1580643.getClass(), "parent", term1580759);
        setField(term1580527, term1580527.getClass(), "parent", term1580643);
        setField(term1580411, term1580411.getClass(), "parent", term1580527);
        setField(term1580295, term1580295.getClass(), "parent", term1580411);
        setField(term1580179, term1580179.getClass(), "parent", term1580295);
        setField(term1580063, term1580063.getClass(), "parent", term1580179);
        setField(term1579947, term1579947.getClass(), "parent", term1580063);
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
            callMethod(klass, "createAttribute", argTypes, term1579947, args);
            assertTrue(false);
        }
        catch (JXPathException e) {
        }

    }

};


