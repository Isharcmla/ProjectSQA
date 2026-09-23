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
import java.util.ArrayList;

public class Cleaner_copySafeNodes_155774425239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17468;
     Object term17520;
     Object term17708;

    public Cleaner_copySafeNodes_155774425239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17468 = newInstance(Class.forName("org.jsoup.safety.Cleaner"));
        ArrayList term17656 = new ArrayList();
        term17520 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term17566 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term17566, term17566.getClass(), "tagName", "");
        setField(term17520, term17520.getClass(), "tag", term17566);
        setField(term17520, term17520.getClass(), "childNodes", term17656);
        term17708 = newInstance(Class.forName("org.jsoup.nodes.Element"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.safety.Cleaner");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[2];
        args[0] = term17520;
        args[1] = term17708;
        try {
            callMethod(klass, "copySafeNodes", argTypes, term17468, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


