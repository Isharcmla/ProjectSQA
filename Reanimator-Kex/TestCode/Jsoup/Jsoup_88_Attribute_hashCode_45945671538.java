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

public class Attribute_hashCode_45945671538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53009;
     Object term131461;

    public Attribute_hashCode_45945671538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53009 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        Object term53034 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term53036 = (Object[]) newArray("java.lang.String", 0);
        Object[] term53037 = (Object[]) newArray("java.lang.String", 0);
        setField(term53009, term53009.getClass(), "key", "xrwlQZdwCp");
        setField(term53009, term53009.getClass(), "val", "IDCWpPLRkE");
        setIntField(term53034, term53034.getClass(), "size", 1134449235);
        setField(term53034, term53034.getClass(), "keys", term53036);
        setField(term53034, term53034.getClass(), "vals", term53037);
        setField(term53009, term53009.getClass(), "parent", term53034);
        term131461 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        Object term131466 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term131467 = (Object[]) newArray("java.lang.String", 0);
        Object[] term131468 = (Object[]) newArray("java.lang.String", 0);
        setField(term131461, term131461.getClass(), "key", "xrwlQZdwCp");
        setField(term131461, term131461.getClass(), "val", "IDCWpPLRkE");
        setIntField(term131466, term131466.getClass(), "size", 1134449235);
        setField(term131466, term131466.getClass(), "keys", term131467);
        setField(term131466, term131466.getClass(), "vals", term131468);
        setField(term131461, term131461.getClass(), "parent", term131466);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term53009, args);
        assertTrue(recursiveEquals(term53009, term131461));
        assertTrue(recursiveEquals(retValue, -1479445609));
    }

};


