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
import static org.apache.commons.jxpath.ri.model.dom.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;

public class DOMAttributeIterator_getPosition_31365111412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term465;
     Object term2152;

    public DOMAttributeIterator_getPosition_31365111412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term503 = new ArrayList();
        term465 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term466 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term465, term465.getClass(), "parent", null);
        setField(term466, term466.getClass(), "prefix", "hNxWaHcfhY");
        setField(term466, term466.getClass(), "name", "RkybSrpybU");
        setField(term466, term466.getClass(), "qualifiedName", "xOEqzGAmDU");
        setField(term465, term465.getClass(), "name", term466);
        setField(term465, term465.getClass(), "attributes", term503);
        setIntField(term465, term465.getClass(), "position", 391863371);
        ArrayList term2160 = new ArrayList();
        term2152 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term2153 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term2152, term2152.getClass(), "parent", null);
        setField(term2153, term2153.getClass(), "prefix", "hNxWaHcfhY");
        setField(term2153, term2153.getClass(), "name", "RkybSrpybU");
        setField(term2153, term2153.getClass(), "qualifiedName", "xOEqzGAmDU");
        setField(term2152, term2152.getClass(), "name", term2153);
        setField(term2152, term2152.getClass(), "attributes", term2160);
        setIntField(term2152, term2152.getClass(), "position", 391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPosition", argTypes, term465, args);
        assertTrue(recursiveEquals(term465, term2152));
        assertTrue(recursiveEquals(retValue, 391863371));
    }

};


