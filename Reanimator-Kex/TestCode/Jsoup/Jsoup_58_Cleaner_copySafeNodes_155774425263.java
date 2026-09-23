package org.jsoup.safety;

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
import static org.jsoup.safety.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Cleaner_copySafeNodes_155774425263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25118;
     Object term25170;
     Object term25306;

    public Cleaner_copySafeNodes_155774425263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25118 = newInstance(Class.forName("org.jsoup.safety.Cleaner"));
        term25170 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term25216 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term25216, term25216.getClass(), "tagName", "");
        setField(term25170, term25170.getClass(), "tag", term25216);
        setField(term25170, term25170.getClass(), "childNodes", null);
        term25306 = newInstance(Class.forName("org.jsoup.nodes.Element"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.safety.Cleaner");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[2];
        args[0] = term25170;
        args[1] = term25306;
        try {
            callMethod(klass, "copySafeNodes", argTypes, term25118, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


