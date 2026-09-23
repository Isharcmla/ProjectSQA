package org.jsoup.parser;

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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.util.ArrayList;

public class Parser_addChildToParent_71584410997 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52957;
     Object term53153;

    public Parser_addChildToParent_71584410997() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term53011 = new LinkedList();
        term52957 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term52957, term52957.getClass(), "stack", term53011);
        setField(term52957, term52957.getClass(), "baseUri", "org.vorpal.research.kex.intrinsics.internal.ObjectGenerator");
        Object term53274 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        ArrayList term53228 = new ArrayList();
        ((ArrayList) term53228).add(term53274);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add("byte");
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        ((ArrayList) term53228).add((Object)null);
        term53153 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term53176 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term53176, term53176.getClass(), "ancestors", term53228);
        setBooleanField(term53176, term53176.getClass(), "canContainBlock", true);
        setBooleanField(term53176, term53176.getClass(), "canContainInline", true);
        setField(term53153, term53153.getClass(), "tag", term53176);
        setField(term53153, term53153.getClass(), "parentNode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term53153;
        args[1] = false;
        try {
            callMethod(klass, "addChildToParent", argTypes, term52957, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


