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
import java.lang.NullPointerException;
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DOMNodePointer_createAttribute_149645840305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237955;

    public DOMNodePointer_createAttribute_149645840305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term237955 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term238067 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term238179 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term238291 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term238403 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term238515 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term238627 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term238739 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term238851 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term238963 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term239075 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term239187 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term239299 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term239411 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term239523 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term239635 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term239747 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term239859 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term239971 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term240083 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term240195 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term240307 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term240419 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term240531 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term240643 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term240755 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term240867 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term240979 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term241091 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term241203 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term241315 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term241427 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term237955, term237955.getClass(), "node", null);
        setField(term237955, term237955.getClass(), "id", null);
        setField(term238067, term238067.getClass(), "id", null);
        setField(term238179, term238179.getClass(), "id", null);
        setField(term238291, term238291.getClass(), "id", null);
        setField(term238403, term238403.getClass(), "id", null);
        setField(term238515, term238515.getClass(), "id", null);
        setField(term238627, term238627.getClass(), "id", null);
        setField(term238739, term238739.getClass(), "id", null);
        setField(term238851, term238851.getClass(), "id", null);
        setField(term238963, term238963.getClass(), "id", null);
        setField(term239075, term239075.getClass(), "id", null);
        setField(term239187, term239187.getClass(), "id", null);
        setField(term239299, term239299.getClass(), "id", null);
        setField(term239411, term239411.getClass(), "id", null);
        setField(term239523, term239523.getClass(), "id", null);
        setField(term239635, term239635.getClass(), "id", null);
        setField(term239747, term239747.getClass(), "id", null);
        setField(term239859, term239859.getClass(), "id", null);
        setField(term239971, term239971.getClass(), "id", null);
        setField(term240083, term240083.getClass(), "id", null);
        setField(term240195, term240195.getClass(), "id", null);
        setField(term240307, term240307.getClass(), "id", null);
        setField(term240419, term240419.getClass(), "id", null);
        setField(term240531, term240531.getClass(), "id", null);
        setField(term240643, term240643.getClass(), "id", null);
        setField(term240755, term240755.getClass(), "id", null);
        setField(term240867, term240867.getClass(), "id", null);
        setField(term240979, term240979.getClass(), "id", null);
        setField(term241091, term241091.getClass(), "id", null);
        setField(term241203, term241203.getClass(), "id", null);
        setField(term241315, term241315.getClass(), "id", null);
        setField(term241427, term241427.getClass(), "id", null);
        setField(term241427, term241427.getClass(), "parent", null);
        setField(term241315, term241315.getClass(), "parent", term241427);
        setField(term241203, term241203.getClass(), "parent", term241315);
        setField(term241091, term241091.getClass(), "parent", term241203);
        setField(term240979, term240979.getClass(), "parent", term241091);
        setField(term240867, term240867.getClass(), "parent", term240979);
        setField(term240755, term240755.getClass(), "parent", term240867);
        setField(term240643, term240643.getClass(), "parent", term240755);
        setField(term240531, term240531.getClass(), "parent", term240643);
        setField(term240419, term240419.getClass(), "parent", term240531);
        setField(term240307, term240307.getClass(), "parent", term240419);
        setField(term240195, term240195.getClass(), "parent", term240307);
        setField(term240083, term240083.getClass(), "parent", term240195);
        setField(term239971, term239971.getClass(), "parent", term240083);
        setField(term239859, term239859.getClass(), "parent", term239971);
        setField(term239747, term239747.getClass(), "parent", term239859);
        setField(term239635, term239635.getClass(), "parent", term239747);
        setField(term239523, term239523.getClass(), "parent", term239635);
        setField(term239411, term239411.getClass(), "parent", term239523);
        setField(term239299, term239299.getClass(), "parent", term239411);
        setField(term239187, term239187.getClass(), "parent", term239299);
        setField(term239075, term239075.getClass(), "parent", term239187);
        setField(term238963, term238963.getClass(), "parent", term239075);
        setField(term238851, term238851.getClass(), "parent", term238963);
        setField(term238739, term238739.getClass(), "parent", term238851);
        setField(term238627, term238627.getClass(), "parent", term238739);
        setField(term238515, term238515.getClass(), "parent", term238627);
        setField(term238403, term238403.getClass(), "parent", term238515);
        setField(term238291, term238291.getClass(), "parent", term238403);
        setField(term238179, term238179.getClass(), "parent", term238291);
        setField(term238067, term238067.getClass(), "parent", term238179);
        setField(term237955, term237955.getClass(), "parent", term238067);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "createAttribute", argTypes, term237955, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


