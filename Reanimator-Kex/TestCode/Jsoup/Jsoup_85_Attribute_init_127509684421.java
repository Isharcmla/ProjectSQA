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

public class Attribute_init_127509684421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69;
     Object term53284;
     Object term53296;

    public Attribute_init_127509684421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term71 = (Object[]) newArray("java.lang.String", 0);
        Object[] term72 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term69, term69.getClass(), "size", 568599855);
        setField(term69, term69.getClass(), "keys", term71);
        setField(term69, term69.getClass(), "vals", term72);
        term53284 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        Object term53289 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term53290 = (Object[]) newArray("java.lang.String", 0);
        Object[] term53291 = (Object[]) newArray("java.lang.String", 0);
        setField(term53284, term53284.getClass(), "key", "MuLcgQHgqz");
        setField(term53284, term53284.getClass(), "val", "xxtlPwDYFs");
        setIntField(term53289, term53289.getClass(), "size", 568599855);
        setField(term53289, term53289.getClass(), "keys", term53290);
        setField(term53289, term53289.getClass(), "vals", term53291);
        setField(term53284, term53284.getClass(), "parent", term53289);
        term53296 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term53297 = (Object[]) newArray("java.lang.String", 0);
        Object[] term53298 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term53296, term53296.getClass(), "size", 568599855);
        setField(term53296, term53296.getClass(), "keys", term53297);
        setField(term53296, term53296.getClass(), "vals", term53298);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.jsoup.nodes.Attributes");
        Object[] args = new Object[3];
        args[0] = "MuLcgQHgqz";
        args[1] = "xxtlPwDYFs";
        args[2] = term69;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term53284));
        assertTrue(recursiveEquals(term69, term53296));
    }

};


