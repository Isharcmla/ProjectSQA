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
import java.lang.NullPointerException;
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JDOMNodePointer_createAttribute_1929968726293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term922443;

    public JDOMNodePointer_createAttribute_1929968726293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term922443 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term922531 = newInstance(Class.forName("org.apache.commons.jxpath.JXPathException"));
        Object term922647 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term922763 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term922879 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term922995 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term923111 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term923227 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term923343 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term923459 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term923575 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term923691 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term923807 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term923923 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term924039 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term924155 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term924271 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term924387 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term924503 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term924619 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term924735 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term924851 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term924967 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term925083 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term925199 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term925315 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term925431 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term925547 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term925635 = newInstance(Class.forName("org.apache.commons.jxpath.JXPathException"));
        Object term925761 = newInstance(Class.forName("org.apache.commons.jxpath.JXPathException"));
        Object term925799 = newInstance(Class.forName("org.jdom.Element"));
        setField(term922443, term922443.getClass(), "node", term922531);
        setField(term922443, term922443.getClass(), "id", null);
        setField(term922647, term922647.getClass(), "id", null);
        setField(term922763, term922763.getClass(), "id", null);
        setField(term922879, term922879.getClass(), "id", null);
        setField(term922995, term922995.getClass(), "id", null);
        setField(term923111, term923111.getClass(), "id", null);
        setField(term923227, term923227.getClass(), "id", null);
        setField(term923343, term923343.getClass(), "id", null);
        setField(term923459, term923459.getClass(), "id", null);
        setField(term923575, term923575.getClass(), "id", null);
        setField(term923691, term923691.getClass(), "id", null);
        setField(term923807, term923807.getClass(), "id", null);
        setField(term923923, term923923.getClass(), "id", null);
        setField(term924039, term924039.getClass(), "id", null);
        setField(term924155, term924155.getClass(), "id", null);
        setField(term924271, term924271.getClass(), "id", null);
        setField(term924387, term924387.getClass(), "id", null);
        setField(term924503, term924503.getClass(), "id", null);
        setField(term924619, term924619.getClass(), "id", null);
        setField(term924735, term924735.getClass(), "id", null);
        setField(term924851, term924851.getClass(), "id", null);
        setField(term924967, term924967.getClass(), "id", null);
        setField(term925083, term925083.getClass(), "id", null);
        setField(term925199, term925199.getClass(), "id", null);
        setField(term925315, term925315.getClass(), "id", null);
        setField(term925431, term925431.getClass(), "id", null);
        setField(term925547, term925547.getClass(), "id", null);
        setField(term925547, term925547.getClass(), "parent", null);
        setField(term925547, term925547.getClass(), "node", null);
        setField(term925431, term925431.getClass(), "parent", term925547);
        setField(term925431, term925431.getClass(), "node", null);
        setField(term925315, term925315.getClass(), "parent", term925431);
        setField(term925315, term925315.getClass(), "node", null);
        setField(term925199, term925199.getClass(), "parent", term925315);
        setField(term925199, term925199.getClass(), "node", null);
        setField(term925083, term925083.getClass(), "parent", term925199);
        setField(term925083, term925083.getClass(), "node", term925635);
        setField(term924967, term924967.getClass(), "parent", term925083);
        setField(term924967, term924967.getClass(), "node", null);
        setField(term924851, term924851.getClass(), "parent", term924967);
        setField(term924851, term924851.getClass(), "node", null);
        setField(term924735, term924735.getClass(), "parent", term924851);
        setField(term924735, term924735.getClass(), "node", null);
        setField(term924619, term924619.getClass(), "parent", term924735);
        setField(term924619, term924619.getClass(), "node", null);
        setField(term924503, term924503.getClass(), "parent", term924619);
        setField(term924503, term924503.getClass(), "node", null);
        setField(term924387, term924387.getClass(), "parent", term924503);
        setField(term924387, term924387.getClass(), "node", null);
        setField(term924271, term924271.getClass(), "parent", term924387);
        setField(term924271, term924271.getClass(), "node", null);
        setField(term924155, term924155.getClass(), "parent", term924271);
        setField(term924155, term924155.getClass(), "node", term922647);
        setField(term924039, term924039.getClass(), "parent", term924155);
        setField(term924039, term924039.getClass(), "node", null);
        setField(term923923, term923923.getClass(), "parent", term924039);
        setField(term923923, term923923.getClass(), "node", null);
        setField(term923807, term923807.getClass(), "parent", term923923);
        setField(term923807, term923807.getClass(), "node", null);
        setField(term923691, term923691.getClass(), "parent", term923807);
        setField(term923691, term923691.getClass(), "node", "");
        setField(term923575, term923575.getClass(), "parent", term923691);
        setField(term923575, term923575.getClass(), "node", null);
        setField(term923459, term923459.getClass(), "parent", term923575);
        setField(term923459, term923459.getClass(), "node", null);
        setField(term923343, term923343.getClass(), "parent", term923459);
        setField(term923343, term923343.getClass(), "node", term925761);
        setField(term923227, term923227.getClass(), "parent", term923343);
        setField(term923227, term923227.getClass(), "node", term925799);
        setField(term923111, term923111.getClass(), "parent", term923227);
        setField(term922995, term922995.getClass(), "parent", term923111);
        setField(term922879, term922879.getClass(), "parent", term922995);
        setField(term922763, term922763.getClass(), "parent", term922879);
        setField(term922647, term922647.getClass(), "parent", term922763);
        setField(term922443, term922443.getClass(), "parent", term922647);
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
            callMethod(klass, "createAttribute", argTypes, term922443, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


