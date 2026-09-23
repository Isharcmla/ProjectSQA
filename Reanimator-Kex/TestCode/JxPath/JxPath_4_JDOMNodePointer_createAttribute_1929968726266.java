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

public class JDOMNodePointer_createAttribute_1929968726266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77775;

    public JDOMNodePointer_createAttribute_1929968726266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77775 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term77891 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term78007 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term78123 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term78239 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term78355 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term78471 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term78587 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term78703 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term78819 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term78935 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term79051 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term79167 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term79283 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term79399 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term79515 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term79631 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term79747 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term79863 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term79979 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term80095 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term80211 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term80327 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term80443 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term80559 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term80675 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term80791 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term77775, term77775.getClass(), "node", null);
        setField(term77775, term77775.getClass(), "id", null);
        setField(term77891, term77891.getClass(), "id", null);
        setField(term78007, term78007.getClass(), "id", null);
        setField(term78123, term78123.getClass(), "id", null);
        setField(term78239, term78239.getClass(), "id", null);
        setField(term78355, term78355.getClass(), "id", null);
        setField(term78471, term78471.getClass(), "id", null);
        setField(term78587, term78587.getClass(), "id", null);
        setField(term78703, term78703.getClass(), "id", null);
        setField(term78819, term78819.getClass(), "id", null);
        setField(term78935, term78935.getClass(), "id", null);
        setField(term79051, term79051.getClass(), "id", null);
        setField(term79167, term79167.getClass(), "id", null);
        setField(term79283, term79283.getClass(), "id", null);
        setField(term79399, term79399.getClass(), "id", null);
        setField(term79515, term79515.getClass(), "id", null);
        setField(term79631, term79631.getClass(), "id", null);
        setField(term79747, term79747.getClass(), "id", null);
        setField(term79863, term79863.getClass(), "id", null);
        setField(term79979, term79979.getClass(), "id", null);
        setField(term80095, term80095.getClass(), "id", null);
        setField(term80211, term80211.getClass(), "id", null);
        setField(term80327, term80327.getClass(), "id", null);
        setField(term80443, term80443.getClass(), "id", null);
        setField(term80559, term80559.getClass(), "id", null);
        setField(term80675, term80675.getClass(), "id", null);
        setField(term80791, term80791.getClass(), "id", null);
        setField(term80791, term80791.getClass(), "parent", null);
        setField(term80675, term80675.getClass(), "parent", term80791);
        setField(term80559, term80559.getClass(), "parent", term80675);
        setField(term80443, term80443.getClass(), "parent", term80559);
        setField(term80327, term80327.getClass(), "parent", term80443);
        setField(term80211, term80211.getClass(), "parent", term80327);
        setField(term80095, term80095.getClass(), "parent", term80211);
        setField(term79979, term79979.getClass(), "parent", term80095);
        setField(term79863, term79863.getClass(), "parent", term79979);
        setField(term79747, term79747.getClass(), "parent", term79863);
        setField(term79631, term79631.getClass(), "parent", term79747);
        setField(term79515, term79515.getClass(), "parent", term79631);
        setField(term79399, term79399.getClass(), "parent", term79515);
        setField(term79283, term79283.getClass(), "parent", term79399);
        setField(term79167, term79167.getClass(), "parent", term79283);
        setField(term79051, term79051.getClass(), "parent", term79167);
        setField(term78935, term78935.getClass(), "parent", term79051);
        setField(term78819, term78819.getClass(), "parent", term78935);
        setField(term78703, term78703.getClass(), "parent", term78819);
        setField(term78587, term78587.getClass(), "parent", term78703);
        setField(term78471, term78471.getClass(), "parent", term78587);
        setField(term78355, term78355.getClass(), "parent", term78471);
        setField(term78239, term78239.getClass(), "parent", term78355);
        setField(term78123, term78123.getClass(), "parent", term78239);
        setField(term78007, term78007.getClass(), "parent", term78123);
        setField(term77891, term77891.getClass(), "parent", term78007);
        setField(term77775, term77775.getClass(), "parent", term77891);
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
            callMethod(klass, "createAttribute", argTypes, term77775, args);
            assertTrue(false);
        }
        catch (JXPathException e) {
        }

    }

};


