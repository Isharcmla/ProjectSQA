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

public class Parser_popStackToClose_1201258867132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77458;
     Object term77877;

    public Parser_popStackToClose_1201258867132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term77602 = newInstance(Class.forName("java.lang.Object"));
        Object term77678 = newInstance(Class.forName("java.lang.Object"));
        Object term77716 = newInstance(Class.forName("java.lang.Object"));
        Object term77754 = newInstance(Class.forName("java.lang.Object"));
        Object term77808 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term77831 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term77831, term77831.getClass(), "canContainBlock", true);
        setField(term77808, term77808.getClass(), "tag", term77831);
        LinkedList term77512 = new LinkedList();
        ((LinkedList) term77512).add(term77602);
        ((LinkedList) term77512).add((Object)null);
        ((LinkedList) term77512).add("byte[]");
        ((LinkedList) term77512).add((Object)null);
        ((LinkedList) term77512).add(term77678);
        ((LinkedList) term77512).add((Object)null);
        ((LinkedList) term77512).add((Object)null);
        ((LinkedList) term77512).add((Object)null);
        ((LinkedList) term77512).add(term77716);
        ((LinkedList) term77512).add((Object)null);
        ((LinkedList) term77512).add(term77754);
        ((LinkedList) term77512).add((Object)null);
        ((LinkedList) term77512).add((Object)null);
        ((LinkedList) term77512).add((Object)null);
        ((LinkedList) term77512).add((Object)null);
        ((LinkedList) term77512).add((Object)null);
        ((LinkedList) term77512).add((Object)null);
        ((LinkedList) term77512).add((Object)null);
        ((LinkedList) term77512).add((Object)null);
        ((LinkedList) term77512).add((Object)null);
        ((LinkedList) term77512).add((Object)null);
        ((LinkedList) term77512).add((Object)null);
        ((LinkedList) term77512).add((Object)null);
        ((LinkedList) term77512).add((Object)null);
        ((LinkedList) term77512).add((Object)null);
        ((LinkedList) term77512).add((Object)null);
        ((LinkedList) term77512).add((Object)null);
        ((LinkedList) term77512).add((Object)null);
        ((LinkedList) term77512).add((Object)null);
        ((LinkedList) term77512).add((Object)null);
        ((LinkedList) term77512).add((Object)null);
        ((LinkedList) term77512).add((Object)null);
        ((LinkedList) term77512).add((Object)null);
        ((LinkedList) term77512).add(term77808);
        term77458 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term77458, term77458.getClass(), "stack", term77512);
        term77877 = newInstance(Class.forName("org.jsoup.parser.Tag"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = term77877;
        try {
            callMethod(klass, "popStackToClose", argTypes, term77458, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


