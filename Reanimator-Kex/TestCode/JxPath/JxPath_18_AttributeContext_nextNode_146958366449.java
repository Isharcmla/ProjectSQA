package org.apache.commons.jxpath.ri.axes;

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
import static org.apache.commons.jxpath.ri.axes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AttributeContext_nextNode_146958366449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18641;

    public AttributeContext_nextNode_146958366449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18641 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        Object term18747 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        Object term18853 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NamespaceContext"));
        Object term18981 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        setIntField(term18641, term18641.getClass(), "position", 0);
        setBooleanField(term18641, term18641.getClass(), "setStarted", false);
        setField(term18747, term18747.getClass(), "qname", null);
        setField(term18641, term18641.getClass(), "nodeTest", term18747);
        setField(term18981, term18981.getClass(), "valuePointer", null);
        setField(term18981, term18981.getClass(), "container", null);
        setIntField(term18981, term18981.getClass(), "index", 0);
        setField(term18853, term18853.getClass(), "currentNodePointer", term18981);
        setField(term18641, term18641.getClass(), "parentContext", term18853);
        Object[] term18515 = (Object[]) newArray("org.apache.commons.jxpath.ri.model.NodePointerFactory", 119);
        Object term19117 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory"));
        Object term19235 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory"));
        Object term19357 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory"));
        Object term19497 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory"));
        Object term19637 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory"));
        Object term19777 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory"));
        Object term19917 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory"));
        Object term20057 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory"));
        Object term20197 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory"));
        Object term20337 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory"));
        Object term20477 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory"));
        Object term20617 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory"));
        Object term20757 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory"));
        Object term20897 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory"));
        Object term21037 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory"));
        Object term21177 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory"));
        Object term21317 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory"));
        Object term21457 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory"));
        Object term21597 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory"));
        Object term21717 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.VariablePointerFactory"));
        setElement(term18515, 0, term19117);
        setElement(term18515, 1, term19235);
        setElement(term18515, 2, term19357);
        setElement(term18515, 3, term19497);
        setElement(term18515, 4, term19637);
        setElement(term18515, 5, term19777);
        setElement(term18515, 6, term19917);
        setElement(term18515, 7, term20057);
        setElement(term18515, 8, term20197);
        setElement(term18515, 9, term20337);
        setElement(term18515, 10, term20477);
        setElement(term18515, 11, term20617);
        setElement(term18515, 12, term19777);
        setElement(term18515, 13, term20757);
        setElement(term18515, 14, term20897);
        setElement(term18515, 15, term20897);
        setElement(term18515, 16, term21037);
        setElement(term18515, 17, term21177);
        setElement(term18515, 18, term20757);
        setElement(term18515, 19, term21037);
        setElement(term18515, 20, term19777);
        setElement(term18515, 21, term21317);
        setElement(term18515, 22, term19777);
        setElement(term18515, 23, term21457);
        setElement(term18515, 24, term19777);
        setElement(term18515, 25, term19777);
        setElement(term18515, 26, term19777);
        setElement(term18515, 27, term19777);
        setElement(term18515, 28, term19777);
        setElement(term18515, 29, term19777);
        setElement(term18515, 30, term19777);
        setElement(term18515, 31, term19777);
        setElement(term18515, 32, term19777);
        setElement(term18515, 33, term19777);
        setElement(term18515, 34, term19777);
        setElement(term18515, 35, term19777);
        setElement(term18515, 36, term19777);
        setElement(term18515, 37, term19777);
        setElement(term18515, 38, term19777);
        setElement(term18515, 39, term19777);
        setElement(term18515, 40, term19777);
        setElement(term18515, 41, term19777);
        setElement(term18515, 42, term19777);
        setElement(term18515, 43, term19777);
        setElement(term18515, 44, term19777);
        setElement(term18515, 45, term19777);
        setElement(term18515, 46, term19777);
        setElement(term18515, 47, term19777);
        setElement(term18515, 48, term19777);
        setElement(term18515, 49, term19777);
        setElement(term18515, 50, term19777);
        setElement(term18515, 51, term19777);
        setElement(term18515, 52, term19777);
        setElement(term18515, 53, term19777);
        setElement(term18515, 54, term19777);
        setElement(term18515, 55, term19777);
        setElement(term18515, 56, term19777);
        setElement(term18515, 57, term21597);
        setElement(term18515, 58, term19777);
        setElement(term18515, 59, term19777);
        setElement(term18515, 60, term19777);
        setElement(term18515, 61, term19777);
        setElement(term18515, 62, term21717);
        setElement(term18515, 63, term21717);
        setElement(term18515, 64, term21717);
        setElement(term18515, 65, term21717);
        setElement(term18515, 66, term21717);
        setElement(term18515, 67, term21717);
        setElement(term18515, 68, term21717);
        setElement(term18515, 69, term21717);
        setElement(term18515, 70, term21717);
        setElement(term18515, 71, term21717);
        setElement(term18515, 72, term21717);
        setElement(term18515, 73, term21717);
        setElement(term18515, 74, term21717);
        setElement(term18515, 75, term21717);
        setElement(term18515, 76, term21717);
        setElement(term18515, 77, term21717);
        setElement(term18515, 78, term21717);
        setElement(term18515, 79, term21717);
        setElement(term18515, 80, term21717);
        setElement(term18515, 81, term21717);
        setElement(term18515, 82, term21717);
        setElement(term18515, 83, term21717);
        setElement(term18515, 84, term21717);
        setElement(term18515, 85, term21717);
        setElement(term18515, 86, term21717);
        setElement(term18515, 87, term21717);
        setElement(term18515, 88, term21717);
        setElement(term18515, 89, term21717);
        setElement(term18515, 90, term21717);
        setElement(term18515, 91, term21717);
        setElement(term18515, 92, term21717);
        setElement(term18515, 93, term21717);
        setElement(term18515, 94, term21717);
        setElement(term18515, 95, term21717);
        setElement(term18515, 96, term21717);
        setElement(term18515, 97, term21717);
        setElement(term18515, 98, term21717);
        setElement(term18515, 99, term21717);
        setElement(term18515, 100, term21717);
        setElement(term18515, 101, term21717);
        setElement(term18515, 102, term21717);
        setElement(term18515, 103, term21717);
        setElement(term18515, 104, term21717);
        setElement(term18515, 105, term21717);
        setElement(term18515, 106, term21717);
        setElement(term18515, 107, term21717);
        setElement(term18515, 108, term21717);
        setElement(term18515, 109, term21717);
        setElement(term18515, 110, term21717);
        setElement(term18515, 111, term21717);
        setElement(term18515, 112, term21717);
        setElement(term18515, 113, term21717);
        setElement(term18515, 114, term21717);
        setElement(term18515, 115, term21717);
        setElement(term18515, 116, term21717);
        setElement(term18515, 117, term21717);
        setElement(term18515, 118, term21717);
        setField(null, Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"), "nodeFactoryArray", term18515);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextNode", argTypes, term18641, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


