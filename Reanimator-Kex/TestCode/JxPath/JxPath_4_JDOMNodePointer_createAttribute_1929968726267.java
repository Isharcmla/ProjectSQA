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

public class JDOMNodePointer_createAttribute_1929968726267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89462;

    public JDOMNodePointer_createAttribute_1929968726267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89462 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term89578 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term89694 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term89810 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term89926 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term90042 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term90158 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term90274 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term90390 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term90506 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term90622 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term90738 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term90854 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term90970 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term91086 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term91202 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term91318 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term89462, term89462.getClass(), "node", null);
        setField(term89462, term89462.getClass(), "id", null);
        setField(term89578, term89578.getClass(), "id", null);
        setField(term89694, term89694.getClass(), "id", null);
        setField(term89810, term89810.getClass(), "id", null);
        setField(term89926, term89926.getClass(), "id", null);
        setField(term90042, term90042.getClass(), "id", null);
        setField(term90158, term90158.getClass(), "id", null);
        setField(term90274, term90274.getClass(), "id", null);
        setField(term90390, term90390.getClass(), "id", null);
        setField(term90506, term90506.getClass(), "id", null);
        setField(term90622, term90622.getClass(), "id", null);
        setField(term90738, term90738.getClass(), "id", null);
        setField(term90854, term90854.getClass(), "id", null);
        setField(term90970, term90970.getClass(), "id", null);
        setField(term91086, term91086.getClass(), "id", null);
        setField(term91202, term91202.getClass(), "id", null);
        setField(term91318, term91318.getClass(), "id", "");
        setField(term91202, term91202.getClass(), "parent", term91318);
        setField(term91086, term91086.getClass(), "parent", term91202);
        setField(term90970, term90970.getClass(), "parent", term91086);
        setField(term90854, term90854.getClass(), "parent", term90970);
        setField(term90738, term90738.getClass(), "parent", term90854);
        setField(term90622, term90622.getClass(), "parent", term90738);
        setField(term90506, term90506.getClass(), "parent", term90622);
        setField(term90390, term90390.getClass(), "parent", term90506);
        setField(term90274, term90274.getClass(), "parent", term90390);
        setField(term90158, term90158.getClass(), "parent", term90274);
        setField(term90042, term90042.getClass(), "parent", term90158);
        setField(term89926, term89926.getClass(), "parent", term90042);
        setField(term89810, term89810.getClass(), "parent", term89926);
        setField(term89694, term89694.getClass(), "parent", term89810);
        setField(term89578, term89578.getClass(), "parent", term89694);
        setField(term89462, term89462.getClass(), "parent", term89578);
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
            callMethod(klass, "createAttribute", argTypes, term89462, args);
            assertTrue(false);
        }
        catch (JXPathException e) {
        }

    }

};


