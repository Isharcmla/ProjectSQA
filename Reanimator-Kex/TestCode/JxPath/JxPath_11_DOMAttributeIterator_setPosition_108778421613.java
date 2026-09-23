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
     Object term538;
     Object term581;
     Object term2268;

    public DOMAttributeIterator_setPosition_108778421613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term576 = new ArrayList();
        term538 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term539 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term538, term538.getClass(), "parent", null);
        setField(term539, term539.getClass(), "prefix", "eZFUvlxvGV");
        setField(term539, term539.getClass(), "name", "BYqFIqCKAV");
        setField(term539, term539.getClass(), "qualifiedName", "vrQLuWIDJX");
        setField(term538, term538.getClass(), "name", term539);
        setField(term538, term538.getClass(), "attributes", term576);
        setIntField(term538, term538.getClass(), "position", -1922583790);
        term581 = new Integer(-616727354);
        ArrayList term2276 = new ArrayList();
        term2268 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term2269 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term2268, term2268.getClass(), "parent", null);
        setField(term2269, term2269.getClass(), "prefix", "eZFUvlxvGV");
        setField(term2269, term2269.getClass(), "name", "BYqFIqCKAV");
        setField(term2269, term2269.getClass(), "qualifiedName", "vrQLuWIDJX");
        setField(term2268, term2268.getClass(), "name", term2269);
        setField(term2268, term2268.getClass(), "attributes", term2276);
        setIntField(term2268, term2268.getClass(), "position", -616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term581;
        Object retValue = callMethod(klass, "setPosition", argTypes, term538, args);
        assertTrue(recursiveEquals(term538, term2268));
        assertTrue(recursiveEquals(term581, -616727354));
        assertTrue(recursiveEquals(retValue, false));
    }

};


