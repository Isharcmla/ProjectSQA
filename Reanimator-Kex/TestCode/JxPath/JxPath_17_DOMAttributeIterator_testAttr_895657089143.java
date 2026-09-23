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

public class DOMAttributeIterator_testAttr_895657089143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54551;
     Object term54785;

    public DOMAttributeIterator_testAttr_895657089143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54551 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term54625 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term54625, term54625.getClass(), "name", "         ");
        setField(term54625, term54625.getClass(), "prefix", "");
        setField(term54551, term54551.getClass(), "name", term54625);
        term54785 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.AttrImpl"));
        setField(term54785, term54785.getClass(), "prefix", "                                         ");
        setField(term54785, term54785.getClass(), "localpart", null);
        setField(term54785, term54785.getClass(), "rawname", "         ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Attr");
        Object[] args = new Object[1];
        args[0] = term54785;
        try {
            callMethod(klass, "testAttr", argTypes, term54551, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


