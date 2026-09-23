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
import java.util.ArrayList;

public class DOMAttributeIterator_testAttr_8956570898 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68;

    public DOMAttributeIterator_testAttr_8956570898() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term106 = new ArrayList();
        term68 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term69 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term68, term68.getClass(), "parent", null);
        setField(term69, term69.getClass(), "prefix", "xxtlPwDYFs");
        setField(term69, term69.getClass(), "name", "jJCZpVmanW");
        setField(term69, term69.getClass(), "qualifiedName", "EGtDIRbSSb");
        setField(term68, term68.getClass(), "name", term69);
        setField(term68, term68.getClass(), "attributes", term106);
        setIntField(term68, term68.getClass(), "position", 568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Attr");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "testAttr", argTypes, term68, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


