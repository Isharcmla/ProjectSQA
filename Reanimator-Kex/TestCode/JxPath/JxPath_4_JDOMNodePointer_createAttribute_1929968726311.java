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

public class JDOMNodePointer_createAttribute_1929968726311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1559806;

    public JDOMNodePointer_createAttribute_1929968726311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1559806 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1559922 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1560038 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1560154 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1560270 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1560386 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1560502 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1560618 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1560734 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1560850 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1560966 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1561082 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1561198 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1561314 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1561430 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1561546 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1561662 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1561778 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1561894 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term1559806, term1559806.getClass(), "node", null);
        setField(term1559806, term1559806.getClass(), "id", null);
        setField(term1559922, term1559922.getClass(), "id", null);
        setField(term1560038, term1560038.getClass(), "id", null);
        setField(term1560154, term1560154.getClass(), "id", null);
        setField(term1560270, term1560270.getClass(), "id", null);
        setField(term1560386, term1560386.getClass(), "id", null);
        setField(term1560502, term1560502.getClass(), "id", null);
        setField(term1560618, term1560618.getClass(), "id", null);
        setField(term1560734, term1560734.getClass(), "id", null);
        setField(term1560850, term1560850.getClass(), "id", null);
        setField(term1560966, term1560966.getClass(), "id", null);
        setField(term1561082, term1561082.getClass(), "id", null);
        setField(term1561198, term1561198.getClass(), "id", null);
        setField(term1561314, term1561314.getClass(), "id", null);
        setField(term1561430, term1561430.getClass(), "id", null);
        setField(term1561546, term1561546.getClass(), "id", null);
        setField(term1561662, term1561662.getClass(), "id", null);
        setField(term1561778, term1561778.getClass(), "id", null);
        setField(term1561894, term1561894.getClass(), "id", "");
        setField(term1561778, term1561778.getClass(), "parent", term1561894);
        setField(term1561662, term1561662.getClass(), "parent", term1561778);
        setField(term1561546, term1561546.getClass(), "parent", term1561662);
        setField(term1561430, term1561430.getClass(), "parent", term1561546);
        setField(term1561314, term1561314.getClass(), "parent", term1561430);
        setField(term1561198, term1561198.getClass(), "parent", term1561314);
        setField(term1561082, term1561082.getClass(), "parent", term1561198);
        setField(term1560966, term1560966.getClass(), "parent", term1561082);
        setField(term1560850, term1560850.getClass(), "parent", term1560966);
        setField(term1560734, term1560734.getClass(), "parent", term1560850);
        setField(term1560618, term1560618.getClass(), "parent", term1560734);
        setField(term1560502, term1560502.getClass(), "parent", term1560618);
        setField(term1560386, term1560386.getClass(), "parent", term1560502);
        setField(term1560270, term1560270.getClass(), "parent", term1560386);
        setField(term1560154, term1560154.getClass(), "parent", term1560270);
        setField(term1560038, term1560038.getClass(), "parent", term1560154);
        setField(term1559922, term1559922.getClass(), "parent", term1560038);
        setField(term1559806, term1559806.getClass(), "parent", term1559922);
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
            callMethod(klass, "createAttribute", argTypes, term1559806, args);
            assertTrue(false);
        }
        catch (JXPathException e) {
        }

    }

};


