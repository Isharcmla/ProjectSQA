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
import java.lang.Integer;

public class DOMAttributeIterator_setPosition_108778421613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term471;
     Object term514;
     Object term2171;

    public DOMAttributeIterator_setPosition_108778421613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term509 = new ArrayList();
        term471 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term472 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term471, term471.getClass(), "parent", null);
        setField(term472, term472.getClass(), "prefix", "hNxWaHcfhY");
        setField(term472, term472.getClass(), "name", "RkybSrpybU");
        setField(term472, term472.getClass(), "qualifiedName", "xOEqzGAmDU");
        setField(term471, term471.getClass(), "name", term472);
        setField(term471, term471.getClass(), "attributes", term509);
        setIntField(term471, term471.getClass(), "position", -1922583790);
        term514 = new Integer(-616727354);
        ArrayList term2179 = new ArrayList();
        term2171 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term2172 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term2171, term2171.getClass(), "parent", null);
        setField(term2172, term2172.getClass(), "prefix", "hNxWaHcfhY");
        setField(term2172, term2172.getClass(), "name", "RkybSrpybU");
        setField(term2172, term2172.getClass(), "qualifiedName", "xOEqzGAmDU");
        setField(term2171, term2171.getClass(), "name", term2172);
        setField(term2171, term2171.getClass(), "attributes", term2179);
        setIntField(term2171, term2171.getClass(), "position", -616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term514;
        Object retValue = callMethod(klass, "setPosition", argTypes, term471, args);
        assertTrue(recursiveEquals(term471, term2171));
        assertTrue(recursiveEquals(term514, -616727354));
        assertTrue(recursiveEquals(retValue, false));
    }

};


