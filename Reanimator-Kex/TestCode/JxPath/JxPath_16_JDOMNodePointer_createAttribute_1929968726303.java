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

public class JDOMNodePointer_createAttribute_1929968726303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term514269;

    public JDOMNodePointer_createAttribute_1929968726303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term514269 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term514385 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term514501 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term514617 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term514733 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term514849 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term514965 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term515081 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term515197 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term515313 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term515429 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term515545 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term515661 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term515777 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term515893 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term516009 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term516125 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term516241 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term516357 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term516473 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term516589 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term516705 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term516821 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term516937 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term517053 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term517169 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term517285 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term517401 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term517517 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term517633 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term517749 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term514269, term514269.getClass(), "node", null);
        setField(term514269, term514269.getClass(), "id", null);
        setField(term514385, term514385.getClass(), "id", null);
        setField(term514501, term514501.getClass(), "id", null);
        setField(term514617, term514617.getClass(), "id", null);
        setField(term514733, term514733.getClass(), "id", null);
        setField(term514849, term514849.getClass(), "id", null);
        setField(term514965, term514965.getClass(), "id", null);
        setField(term515081, term515081.getClass(), "id", null);
        setField(term515197, term515197.getClass(), "id", null);
        setField(term515313, term515313.getClass(), "id", null);
        setField(term515429, term515429.getClass(), "id", null);
        setField(term515545, term515545.getClass(), "id", null);
        setField(term515661, term515661.getClass(), "id", null);
        setField(term515777, term515777.getClass(), "id", null);
        setField(term515893, term515893.getClass(), "id", null);
        setField(term516009, term516009.getClass(), "id", null);
        setField(term516125, term516125.getClass(), "id", null);
        setField(term516241, term516241.getClass(), "id", null);
        setField(term516357, term516357.getClass(), "id", null);
        setField(term516473, term516473.getClass(), "id", null);
        setField(term516589, term516589.getClass(), "id", null);
        setField(term516705, term516705.getClass(), "id", null);
        setField(term516821, term516821.getClass(), "id", null);
        setField(term516937, term516937.getClass(), "id", null);
        setField(term517053, term517053.getClass(), "id", null);
        setField(term517169, term517169.getClass(), "id", null);
        setField(term517285, term517285.getClass(), "id", null);
        setField(term517401, term517401.getClass(), "id", null);
        setField(term517517, term517517.getClass(), "id", null);
        setField(term517633, term517633.getClass(), "id", null);
        setField(term517749, term517749.getClass(), "id", null);
        setField(term517749, term517749.getClass(), "parent", null);
        setField(term517633, term517633.getClass(), "parent", term517749);
        setField(term517517, term517517.getClass(), "parent", term517633);
        setField(term517401, term517401.getClass(), "parent", term517517);
        setField(term517285, term517285.getClass(), "parent", term517401);
        setField(term517169, term517169.getClass(), "parent", term517285);
        setField(term517053, term517053.getClass(), "parent", term517169);
        setField(term516937, term516937.getClass(), "parent", term517053);
        setField(term516821, term516821.getClass(), "parent", term516937);
        setField(term516705, term516705.getClass(), "parent", term516821);
        setField(term516589, term516589.getClass(), "parent", term516705);
        setField(term516473, term516473.getClass(), "parent", term516589);
        setField(term516357, term516357.getClass(), "parent", term516473);
        setField(term516241, term516241.getClass(), "parent", term516357);
        setField(term516125, term516125.getClass(), "parent", term516241);
        setField(term516009, term516009.getClass(), "parent", term516125);
        setField(term515893, term515893.getClass(), "parent", term516009);
        setField(term515777, term515777.getClass(), "parent", term515893);
        setField(term515661, term515661.getClass(), "parent", term515777);
        setField(term515545, term515545.getClass(), "parent", term515661);
        setField(term515429, term515429.getClass(), "parent", term515545);
        setField(term515313, term515313.getClass(), "parent", term515429);
        setField(term515197, term515197.getClass(), "parent", term515313);
        setField(term515081, term515081.getClass(), "parent", term515197);
        setField(term514965, term514965.getClass(), "parent", term515081);
        setField(term514849, term514849.getClass(), "parent", term514965);
        setField(term514733, term514733.getClass(), "parent", term514849);
        setField(term514617, term514617.getClass(), "parent", term514733);
        setField(term514501, term514501.getClass(), "parent", term514617);
        setField(term514385, term514385.getClass(), "parent", term514501);
        setField(term514269, term514269.getClass(), "parent", term514385);
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
            callMethod(klass, "createAttribute", argTypes, term514269, args);
            assertTrue(false);
        }
        catch (JXPathException e) {
        }

    }

};


