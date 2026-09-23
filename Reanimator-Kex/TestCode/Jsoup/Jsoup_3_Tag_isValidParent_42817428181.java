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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;

public class Tag_isValidParent_42817428181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16490;
     Object term16331;
     Object term16647;
     Object term16650;

    public Tag_isValidParent_42817428181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16490 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term16490, term16490.getClass(), "canContainBlock", true);
        setBooleanField(term16490, term16490.getClass(), "canContainInline", true);
        setBooleanField(term16490, term16490.getClass(), "empty", true);
        setBooleanField(term16490, term16490.getClass(), "isBlock", true);
        setBooleanField(term16490, term16490.getClass(), "optionalClosing", true);
        setField(term16490, term16490.getClass(), "tagName", "");
        Object term16406 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term16406, term16406.getClass(), "canContainBlock", false);
        Object term16429 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term16429, term16429.getClass(), "canContainBlock", true);
        setBooleanField(term16429, term16429.getClass(), "canContainInline", true);
        setBooleanField(term16429, term16429.getClass(), "empty", true);
        setBooleanField(term16429, term16429.getClass(), "isBlock", true);
        setBooleanField(term16429, term16429.getClass(), "optionalClosing", true);
        setField(term16429, term16429.getClass(), "tagName", "java.lang.String");
        ArrayList term16383 = new ArrayList();
        ((ArrayList) term16383).add(term16406);
        ((ArrayList) term16383).add(term16429);
        ((ArrayList) term16383).add((Object)null);
        ((ArrayList) term16383).add(term16406);
        ((ArrayList) term16383).add(term16490);
        ((ArrayList) term16383).add((Object)null);
        ((ArrayList) term16383).add((Object)null);
        ((ArrayList) term16383).add((Object)null);
        ((ArrayList) term16383).add((Object)null);
        ((ArrayList) term16383).add((Object)null);
        ((ArrayList) term16383).add((Object)null);
        ((ArrayList) term16383).add((Object)null);
        ((ArrayList) term16383).add((Object)null);
        ((ArrayList) term16383).add((Object)null);
        ((ArrayList) term16383).add((Object)null);
        ((ArrayList) term16383).add((Object)null);
        term16331 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term16331, term16331.getClass(), "ancestors", term16383);
        term16647 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term16647, term16647.getClass(), "tagName", "");
        setBooleanField(term16647, term16647.getClass(), "isBlock", true);
        setBooleanField(term16647, term16647.getClass(), "canContainBlock", true);
        setBooleanField(term16647, term16647.getClass(), "canContainInline", true);
        setBooleanField(term16647, term16647.getClass(), "optionalClosing", true);
        setBooleanField(term16647, term16647.getClass(), "empty", true);
        setBooleanField(term16647, term16647.getClass(), "preserveWhitespace", false);
        setField(term16647, term16647.getClass(), "ancestors", null);
        Object term16653 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term16653, term16653.getClass(), "tagName", null);
        setBooleanField(term16653, term16653.getClass(), "isBlock", false);
        setBooleanField(term16653, term16653.getClass(), "canContainBlock", false);
        setBooleanField(term16653, term16653.getClass(), "canContainInline", false);
        setBooleanField(term16653, term16653.getClass(), "optionalClosing", false);
        setBooleanField(term16653, term16653.getClass(), "empty", false);
        setBooleanField(term16653, term16653.getClass(), "preserveWhitespace", false);
        setField(term16653, term16653.getClass(), "ancestors", null);
        Object term16654 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term16654, term16654.getClass(), "tagName", "");
        setBooleanField(term16654, term16654.getClass(), "isBlock", true);
        setBooleanField(term16654, term16654.getClass(), "canContainBlock", true);
        setBooleanField(term16654, term16654.getClass(), "canContainInline", true);
        setBooleanField(term16654, term16654.getClass(), "optionalClosing", true);
        setBooleanField(term16654, term16654.getClass(), "empty", true);
        setBooleanField(term16654, term16654.getClass(), "preserveWhitespace", false);
        setField(term16654, term16654.getClass(), "ancestors", null);
        Object term16656 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term16656, term16656.getClass(), "tagName", "");
        setBooleanField(term16656, term16656.getClass(), "isBlock", true);
        setBooleanField(term16656, term16656.getClass(), "canContainBlock", true);
        setBooleanField(term16656, term16656.getClass(), "canContainInline", true);
        setBooleanField(term16656, term16656.getClass(), "optionalClosing", true);
        setBooleanField(term16656, term16656.getClass(), "empty", true);
        setBooleanField(term16656, term16656.getClass(), "preserveWhitespace", false);
        setField(term16656, term16656.getClass(), "ancestors", null);
        ArrayList term16651 = new ArrayList();
        ((ArrayList) term16651).add(term16653);
        ((ArrayList) term16651).add(term16654);
        ((ArrayList) term16651).add((Object)null);
        ((ArrayList) term16651).add(term16653);
        ((ArrayList) term16651).add(term16656);
        ((ArrayList) term16651).add((Object)null);
        ((ArrayList) term16651).add((Object)null);
        ((ArrayList) term16651).add((Object)null);
        ((ArrayList) term16651).add((Object)null);
        ((ArrayList) term16651).add((Object)null);
        ((ArrayList) term16651).add((Object)null);
        ((ArrayList) term16651).add((Object)null);
        ((ArrayList) term16651).add((Object)null);
        ((ArrayList) term16651).add((Object)null);
        ((ArrayList) term16651).add((Object)null);
        ((ArrayList) term16651).add((Object)null);
        term16650 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term16650, term16650.getClass(), "tagName", null);
        setBooleanField(term16650, term16650.getClass(), "isBlock", false);
        setBooleanField(term16650, term16650.getClass(), "canContainBlock", false);
        setBooleanField(term16650, term16650.getClass(), "canContainInline", false);
        setBooleanField(term16650, term16650.getClass(), "optionalClosing", false);
        setBooleanField(term16650, term16650.getClass(), "empty", false);
        setBooleanField(term16650, term16650.getClass(), "preserveWhitespace", false);
        setField(term16650, term16650.getClass(), "ancestors", term16651);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = term16331;
        Object retValue = callMethod(klass, "isValidParent", argTypes, term16490, args);
        assertTrue(recursiveEquals(term16490, term16647));
        assertTrue(recursiveEquals(term16331, term16650));
        assertTrue(recursiveEquals(retValue, true));
    }

};


