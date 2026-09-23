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

public class DOMAttributeIterator_getAttribute_539782597286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2031878;
     Object term2032304;

    public DOMAttributeIterator_getAttribute_539782597286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2031878 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term2032004 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        Object term2032132 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.LangAttributePointer"));
        Object term2032230 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2032004, term2032004.getClass(), "namespaceResolver", null);
        setField(term2032132, term2032132.getClass(), "namespaceResolver", term2032230);
        setField(term2032004, term2032004.getClass(), "parent", term2032132);
        setField(term2031878, term2031878.getClass(), "parent", term2032004);
        term2032304 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term2032304, term2032304.getClass(), "prefix", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Element");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2032304;
        try {
            callMethod(klass, "getAttribute", argTypes, term2031878, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


