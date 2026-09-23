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
import java.lang.NullPointerException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Attribute_html_821208555151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199843;
     Object term199959;

    public Attribute_html_821208555151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term199843 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term199843, term199843.getClass(), "key", "");
        setField(term199843, term199843.getClass(), "val", "");
        term199959 = newInstance(Class.forName("java.io.Console$3"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[2];
        args[0] = term199959;
        args[1] = null;
        try {
            callMethod(klass, "html", argTypes, term199843, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


