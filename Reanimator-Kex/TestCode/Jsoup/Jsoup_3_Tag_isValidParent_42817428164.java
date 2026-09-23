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

public class Tag_isValidParent_42817428164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10877;
     Object term10938;
     Object term11421;
     Object term11424;

    public Tag_isValidParent_42817428164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10877 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term10877, term10877.getClass(), "canContainBlock", false);
        setBooleanField(term10877, term10877.getClass(), "canContainInline", true);
        setBooleanField(term10877, term10877.getClass(), "empty", false);
        setBooleanField(term10877, term10877.getClass(), "isBlock", true);
        setBooleanField(term10877, term10877.getClass(), "optionalClosing", true);
        setField(term10877, term10877.getClass(), "tagName", "byte[]");
        Object term11013 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term11013, term11013.getClass(), "canContainBlock", true);
        Object term11036 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term11036, term11036.getClass(), "canContainBlock", false);
        setBooleanField(term11036, term11036.getClass(), "canContainInline", true);
        setBooleanField(term11036, term11036.getClass(), "empty", false);
        setBooleanField(term11036, term11036.getClass(), "isBlock", true);
        setBooleanField(term11036, term11036.getClass(), "optionalClosing", true);
        setField(term11036, term11036.getClass(), "tagName", null);
        Object term11059 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term11059, term11059.getClass(), "canContainBlock", true);
        Object term11082 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term11082, term11082.getClass(), "canContainBlock", false);
        setBooleanField(term11082, term11082.getClass(), "canContainInline", false);
        Object term11105 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term11105, term11105.getClass(), "canContainBlock", false);
        setBooleanField(term11105, term11105.getClass(), "canContainInline", true);
        setBooleanField(term11105, term11105.getClass(), "empty", false);
        setBooleanField(term11105, term11105.getClass(), "isBlock", true);
        setBooleanField(term11105, term11105.getClass(), "optionalClosing", true);
        setField(term11105, term11105.getClass(), "tagName", null);
        Object term11128 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term11128, term11128.getClass(), "canContainBlock", false);
        setBooleanField(term11128, term11128.getClass(), "canContainInline", false);
        ArrayList term10990 = new ArrayList();
        ((ArrayList) term10990).add(term11013);
        ((ArrayList) term10990).add(term11036);
        ((ArrayList) term10990).add(term10938);
        ((ArrayList) term10990).add(term11059);
        ((ArrayList) term10990).add(term11082);
        ((ArrayList) term10990).add(term11105);
        ((ArrayList) term10990).add(term11128);
        ((ArrayList) term10990).add((Object)null);
        term10938 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term10938, term10938.getClass(), "ancestors", term10990);
        setBooleanField(term10938, term10938.getClass(), "canContainBlock", false);
        setBooleanField(term10938, term10938.getClass(), "canContainInline", false);
        term11421 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term11421, term11421.getClass(), "tagName", "byte[]");
        setBooleanField(term11421, term11421.getClass(), "isBlock", true);
        setBooleanField(term11421, term11421.getClass(), "canContainBlock", false);
        setBooleanField(term11421, term11421.getClass(), "canContainInline", true);
        setBooleanField(term11421, term11421.getClass(), "optionalClosing", true);
        setBooleanField(term11421, term11421.getClass(), "empty", false);
        setBooleanField(term11421, term11421.getClass(), "preserveWhitespace", false);
        setField(term11421, term11421.getClass(), "ancestors", null);
        Object term11427 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term11427, term11427.getClass(), "tagName", null);
        setBooleanField(term11427, term11427.getClass(), "isBlock", false);
        setBooleanField(term11427, term11427.getClass(), "canContainBlock", true);
        setBooleanField(term11427, term11427.getClass(), "canContainInline", false);
        setBooleanField(term11427, term11427.getClass(), "optionalClosing", false);
        setBooleanField(term11427, term11427.getClass(), "empty", false);
        setBooleanField(term11427, term11427.getClass(), "preserveWhitespace", false);
        setField(term11427, term11427.getClass(), "ancestors", null);
        Object term11428 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term11428, term11428.getClass(), "tagName", null);
        setBooleanField(term11428, term11428.getClass(), "isBlock", true);
        setBooleanField(term11428, term11428.getClass(), "canContainBlock", false);
        setBooleanField(term11428, term11428.getClass(), "canContainInline", true);
        setBooleanField(term11428, term11428.getClass(), "optionalClosing", true);
        setBooleanField(term11428, term11428.getClass(), "empty", false);
        setBooleanField(term11428, term11428.getClass(), "preserveWhitespace", false);
        setField(term11428, term11428.getClass(), "ancestors", null);
        Object term11429 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term11429, term11429.getClass(), "tagName", null);
        setBooleanField(term11429, term11429.getClass(), "isBlock", false);
        setBooleanField(term11429, term11429.getClass(), "canContainBlock", true);
        setBooleanField(term11429, term11429.getClass(), "canContainInline", false);
        setBooleanField(term11429, term11429.getClass(), "optionalClosing", false);
        setBooleanField(term11429, term11429.getClass(), "empty", false);
        setBooleanField(term11429, term11429.getClass(), "preserveWhitespace", false);
        setField(term11429, term11429.getClass(), "ancestors", null);
        Object term11430 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term11430, term11430.getClass(), "tagName", null);
        setBooleanField(term11430, term11430.getClass(), "isBlock", false);
        setBooleanField(term11430, term11430.getClass(), "canContainBlock", false);
        setBooleanField(term11430, term11430.getClass(), "canContainInline", false);
        setBooleanField(term11430, term11430.getClass(), "optionalClosing", false);
        setBooleanField(term11430, term11430.getClass(), "empty", false);
        setBooleanField(term11430, term11430.getClass(), "preserveWhitespace", false);
        setField(term11430, term11430.getClass(), "ancestors", null);
        Object term11431 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term11431, term11431.getClass(), "tagName", null);
        setBooleanField(term11431, term11431.getClass(), "isBlock", true);
        setBooleanField(term11431, term11431.getClass(), "canContainBlock", false);
        setBooleanField(term11431, term11431.getClass(), "canContainInline", true);
        setBooleanField(term11431, term11431.getClass(), "optionalClosing", true);
        setBooleanField(term11431, term11431.getClass(), "empty", false);
        setBooleanField(term11431, term11431.getClass(), "preserveWhitespace", false);
        setField(term11431, term11431.getClass(), "ancestors", null);
        Object term11432 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term11432, term11432.getClass(), "tagName", null);
        setBooleanField(term11432, term11432.getClass(), "isBlock", false);
        setBooleanField(term11432, term11432.getClass(), "canContainBlock", false);
        setBooleanField(term11432, term11432.getClass(), "canContainInline", false);
        setBooleanField(term11432, term11432.getClass(), "optionalClosing", false);
        setBooleanField(term11432, term11432.getClass(), "empty", false);
        setBooleanField(term11432, term11432.getClass(), "preserveWhitespace", false);
        setField(term11432, term11432.getClass(), "ancestors", null);
        ArrayList term11425 = new ArrayList();
        ((ArrayList) term11425).add(term11427);
        ((ArrayList) term11425).add(term11428);
        ((ArrayList) term11425).add((Object)null);
        ((ArrayList) term11425).add(term11429);
        ((ArrayList) term11425).add(term11430);
        ((ArrayList) term11425).add(term11431);
        ((ArrayList) term11425).add(term11432);
        ((ArrayList) term11425).add((Object)null);
        term11424 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term11424, term11424.getClass(), "tagName", null);
        setBooleanField(term11424, term11424.getClass(), "isBlock", false);
        setBooleanField(term11424, term11424.getClass(), "canContainBlock", false);
        setBooleanField(term11424, term11424.getClass(), "canContainInline", false);
        setBooleanField(term11424, term11424.getClass(), "optionalClosing", false);
        setBooleanField(term11424, term11424.getClass(), "empty", false);
        setBooleanField(term11424, term11424.getClass(), "preserveWhitespace", false);
        setField(term11424, term11424.getClass(), "ancestors", term11425);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = term10938;
        Object retValue = callMethod(klass, "isValidParent", argTypes, term10877, args);
        assertTrue(recursiveEquals(term10877, term11421));
        assertTrue(recursiveEquals(term10938, term11424));
        assertTrue(recursiveEquals(retValue, false));
    }

};


