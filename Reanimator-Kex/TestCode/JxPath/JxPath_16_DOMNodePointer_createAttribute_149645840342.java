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
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DOMNodePointer_createAttribute_149645840342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term467802;

    public DOMNodePointer_createAttribute_149645840342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term467802 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term467914 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term468026 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term468138 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term468250 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term468362 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term468474 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term468586 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term468698 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term468810 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term468922 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term469034 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term469146 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term469258 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term469370 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term469482 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term467802, term467802.getClass(), "node", null);
        setField(term467802, term467802.getClass(), "id", null);
        setField(term467914, term467914.getClass(), "id", null);
        setField(term468026, term468026.getClass(), "id", null);
        setField(term468138, term468138.getClass(), "id", null);
        setField(term468250, term468250.getClass(), "id", null);
        setField(term468362, term468362.getClass(), "id", null);
        setField(term468474, term468474.getClass(), "id", null);
        setField(term468586, term468586.getClass(), "id", null);
        setField(term468698, term468698.getClass(), "id", null);
        setField(term468810, term468810.getClass(), "id", null);
        setField(term468922, term468922.getClass(), "id", null);
        setField(term469034, term469034.getClass(), "id", null);
        setField(term469146, term469146.getClass(), "id", null);
        setField(term469258, term469258.getClass(), "id", null);
        setField(term469370, term469370.getClass(), "id", null);
        setField(term469482, term469482.getClass(), "id", null);
        setField(term469482, term469482.getClass(), "parent", null);
        setField(term469370, term469370.getClass(), "parent", term469482);
        setField(term469258, term469258.getClass(), "parent", term469370);
        setField(term469146, term469146.getClass(), "parent", term469258);
        setField(term469034, term469034.getClass(), "parent", term469146);
        setField(term468922, term468922.getClass(), "parent", term469034);
        setField(term468810, term468810.getClass(), "parent", term468922);
        setField(term468698, term468698.getClass(), "parent", term468810);
        setField(term468586, term468586.getClass(), "parent", term468698);
        setField(term468474, term468474.getClass(), "parent", term468586);
        setField(term468362, term468362.getClass(), "parent", term468474);
        setField(term468250, term468250.getClass(), "parent", term468362);
        setField(term468138, term468138.getClass(), "parent", term468250);
        setField(term468026, term468026.getClass(), "parent", term468138);
        setField(term467914, term467914.getClass(), "parent", term468026);
        setField(term467802, term467802.getClass(), "parent", term467914);
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
        callMethod(klass, "createAttribute", argTypes, term467802, args);
    }

};


