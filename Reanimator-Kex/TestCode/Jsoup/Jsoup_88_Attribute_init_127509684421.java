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
     Object term53308;
     Object term53320;

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
        term53308 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        Object term53313 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term53314 = (Object[]) newArray("java.lang.String", 0);
        Object[] term53315 = (Object[]) newArray("java.lang.String", 0);
        setField(term53308, term53308.getClass(), "key", "MuLcgQHgqz");
        setField(term53308, term53308.getClass(), "val", "xxtlPwDYFs");
        setIntField(term53313, term53313.getClass(), "size", 568599855);
        setField(term53313, term53313.getClass(), "keys", term53314);
        setField(term53313, term53313.getClass(), "vals", term53315);
        setField(term53308, term53308.getClass(), "parent", term53313);
        term53320 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term53321 = (Object[]) newArray("java.lang.String", 0);
        Object[] term53322 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term53320, term53320.getClass(), "size", 568599855);
        setField(term53320, term53320.getClass(), "keys", term53321);
        setField(term53320, term53320.getClass(), "vals", term53322);
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
        assertTrue(recursiveEquals(instance, term53308));
        assertTrue(recursiveEquals(term69, term53320));
    }

};


