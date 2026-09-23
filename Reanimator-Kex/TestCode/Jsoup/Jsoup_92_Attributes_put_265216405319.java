package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.Object;

public class Attributes_put_265216405319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5267777;
     Object term5267871;
     Object term5269366;
     Object term5269373;
     Object term5269334;

    public Attributes_put_265216405319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5267777 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5267147 = (Object[]) newArray("java.lang.String", 2);
        Object[] term5267150 = (Object[]) newArray("java.lang.String", 240);
        setIntField(term5267777, term5267777.getClass(), "size", 1);
        setElement(term5267147, 1, "");
        setField(term5267777, term5267777.getClass(), "keys", term5267147);
        setField(term5267777, term5267777.getClass(), "vals", term5267150);
        term5267871 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term5267871, term5267871.getClass(), "key", "");
        setField(term5267871, term5267871.getClass(), "val", "");
        term5269366 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5269367 = (Object[]) newArray("java.lang.String", 2);
        Object[] term5269370 = (Object[]) newArray("java.lang.String", 240);
        setIntField(term5269366, term5269366.getClass(), "size", 2);
        setElement(term5269367, 1, "");
        setField(term5269366, term5269366.getClass(), "keys", term5269367);
        setElement(term5269370, 1, "");
        setField(term5269366, term5269366.getClass(), "vals", term5269370);
        term5269373 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        Object term5269378 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5269379 = (Object[]) newArray("java.lang.String", 2);
        Object[] term5269382 = (Object[]) newArray("java.lang.String", 240);
        setField(term5269373, term5269373.getClass(), "key", "");
        setField(term5269373, term5269373.getClass(), "val", "");
        setIntField(term5269378, term5269378.getClass(), "size", 2);
        setElement(term5269379, 1, "");
        setField(term5269378, term5269378.getClass(), "keys", term5269379);
        setElement(term5269382, 1, "");
        setField(term5269378, term5269378.getClass(), "vals", term5269382);
        setField(term5269373, term5269373.getClass(), "parent", term5269378);
        term5269334 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5269336 = (Object[]) newArray("java.lang.String", 2);
        Object[] term5269339 = (Object[]) newArray("java.lang.String", 240);
        setIntField(term5269334, term5269334.getClass(), "size", 2);
        setElement(term5269336, 1, "");
        setField(term5269334, term5269334.getClass(), "keys", term5269336);
        setElement(term5269339, 1, "");
        setField(term5269334, term5269334.getClass(), "vals", term5269339);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attribute");
        Object[] args = new Object[1];
        args[0] = term5267871;
        Object retValue = callMethod(klass, "put", argTypes, term5267777, args);
        assertTrue(recursiveEquals(term5267777, term5269366));
        assertTrue(recursiveEquals(term5267871, term5269373));
        assertTrue(recursiveEquals(retValue, term5269334));
    }

};


