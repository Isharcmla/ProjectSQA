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

public class Attributes_putIgnoreCase_1473599146189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term355060;
     Object term355151;

    public Attributes_putIgnoreCase_1473599146189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term355060 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term354959 = (Object[]) newArray("java.lang.String", 128);
        Object[] term354961 = (Object[]) newArray("java.lang.String", 106);
        setIntField(term355060, term355060.getClass(), "size", 1);
        setElement(term354959, 0, "");
        setField(term355060, term355060.getClass(), "keys", term354959);
        setField(term355060, term355060.getClass(), "vals", term354961);
        term355151 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term355152 = (Object[]) newArray("java.lang.String", 128);
        Object[] term355155 = (Object[]) newArray("java.lang.String", 106);
        setIntField(term355151, term355151.getClass(), "size", 1);
        setElement(term355152, 0, "");
        setField(term355151, term355151.getClass(), "keys", term355152);
        setField(term355151, term355151.getClass(), "vals", term355155);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = null;
        callMethod(klass, "putIgnoreCase", argTypes, term355060, args);
        assertTrue(recursiveEquals(term355060, term355151));
    }

};


