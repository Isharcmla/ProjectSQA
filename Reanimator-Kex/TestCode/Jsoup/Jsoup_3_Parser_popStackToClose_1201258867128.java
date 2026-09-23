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

public class Parser_popStackToClose_1201258867128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87857;
     Object term88276;

    public Parser_popStackToClose_1201258867128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term88001 = newInstance(Class.forName("java.lang.Object"));
        Object term88077 = newInstance(Class.forName("java.lang.Object"));
        Object term88115 = newInstance(Class.forName("java.lang.Object"));
        Object term88153 = newInstance(Class.forName("java.lang.Object"));
        Object term88207 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term88230 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term88230, term88230.getClass(), "canContainBlock", true);
        setField(term88207, term88207.getClass(), "tag", term88230);
        LinkedList term87911 = new LinkedList();
        ((LinkedList) term87911).add(term88001);
        ((LinkedList) term87911).add((Object)null);
        ((LinkedList) term87911).add("byte[]");
        ((LinkedList) term87911).add((Object)null);
        ((LinkedList) term87911).add(term88077);
        ((LinkedList) term87911).add((Object)null);
        ((LinkedList) term87911).add((Object)null);
        ((LinkedList) term87911).add((Object)null);
        ((LinkedList) term87911).add(term88115);
        ((LinkedList) term87911).add((Object)null);
        ((LinkedList) term87911).add(term88153);
        ((LinkedList) term87911).add((Object)null);
        ((LinkedList) term87911).add((Object)null);
        ((LinkedList) term87911).add((Object)null);
        ((LinkedList) term87911).add((Object)null);
        ((LinkedList) term87911).add((Object)null);
        ((LinkedList) term87911).add((Object)null);
        ((LinkedList) term87911).add((Object)null);
        ((LinkedList) term87911).add((Object)null);
        ((LinkedList) term87911).add((Object)null);
        ((LinkedList) term87911).add((Object)null);
        ((LinkedList) term87911).add((Object)null);
        ((LinkedList) term87911).add((Object)null);
        ((LinkedList) term87911).add((Object)null);
        ((LinkedList) term87911).add((Object)null);
        ((LinkedList) term87911).add((Object)null);
        ((LinkedList) term87911).add((Object)null);
        ((LinkedList) term87911).add((Object)null);
        ((LinkedList) term87911).add((Object)null);
        ((LinkedList) term87911).add((Object)null);
        ((LinkedList) term87911).add((Object)null);
        ((LinkedList) term87911).add((Object)null);
        ((LinkedList) term87911).add((Object)null);
        ((LinkedList) term87911).add(term88207);
        term87857 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term87857, term87857.getClass(), "stack", term87911);
        term88276 = newInstance(Class.forName("org.jsoup.parser.Tag"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = term88276;
        try {
            callMethod(klass, "popStackToClose", argTypes, term87857, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


