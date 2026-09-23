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

public class Tag_register_3436246341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1113;
     Object term4042;
     Object term4001;

    public Tag_register_3436246341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1142 = new ArrayList();
        ((ArrayList) term1142).add((Object)null);
        Object term1134 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1134, term1134.getClass(), "tagName", "");
        setBooleanField(term1134, term1134.getClass(), "isBlock", false);
        setBooleanField(term1134, term1134.getClass(), "canContainBlock", false);
        setBooleanField(term1134, term1134.getClass(), "canContainInline", false);
        setBooleanField(term1134, term1134.getClass(), "optionalClosing", false);
        setBooleanField(term1134, term1134.getClass(), "empty", true);
        setBooleanField(term1134, term1134.getClass(), "preserveWhitespace", false);
        setField(term1134, term1134.getClass(), "ancestors", term1142);
        ArrayList term1153 = new ArrayList();
        ((ArrayList) term1153).add((Object)null);
        Object term1145 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1145, term1145.getClass(), "tagName", "");
        setBooleanField(term1145, term1145.getClass(), "isBlock", false);
        setBooleanField(term1145, term1145.getClass(), "canContainBlock", true);
        setBooleanField(term1145, term1145.getClass(), "canContainInline", false);
        setBooleanField(term1145, term1145.getClass(), "optionalClosing", false);
        setBooleanField(term1145, term1145.getClass(), "empty", false);
        setBooleanField(term1145, term1145.getClass(), "preserveWhitespace", true);
        setField(term1145, term1145.getClass(), "ancestors", term1153);
        ArrayList term1132 = new ArrayList();
        ((ArrayList) term1132).add(term1134);
        ((ArrayList) term1132).add(term1134);
        ((ArrayList) term1132).add(term1145);
        term1113 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1113, term1113.getClass(), "tagName", "wfaXBpWAUH");
        setBooleanField(term1113, term1113.getClass(), "isBlock", true);
        setBooleanField(term1113, term1113.getClass(), "canContainBlock", true);
        setBooleanField(term1113, term1113.getClass(), "canContainInline", false);
        setBooleanField(term1113, term1113.getClass(), "optionalClosing", true);
        setBooleanField(term1113, term1113.getClass(), "empty", false);
        setBooleanField(term1113, term1113.getClass(), "preserveWhitespace", false);
        setField(term1113, term1113.getClass(), "ancestors", term1132);
        ArrayList term4049 = new ArrayList();
        ((ArrayList) term4049).add((Object)null);
        Object term4047 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term4047, term4047.getClass(), "tagName", "");
        setBooleanField(term4047, term4047.getClass(), "isBlock", true);
        setBooleanField(term4047, term4047.getClass(), "canContainBlock", true);
        setBooleanField(term4047, term4047.getClass(), "canContainInline", true);
        setBooleanField(term4047, term4047.getClass(), "optionalClosing", false);
        setBooleanField(term4047, term4047.getClass(), "empty", false);
        setBooleanField(term4047, term4047.getClass(), "preserveWhitespace", false);
        setField(term4047, term4047.getClass(), "ancestors", term4049);
        ArrayList term4045 = new ArrayList();
        ((ArrayList) term4045).add(term4047);
        term4042 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term4042, term4042.getClass(), "tagName", "wfaXBpWAUH");
        setBooleanField(term4042, term4042.getClass(), "isBlock", true);
        setBooleanField(term4042, term4042.getClass(), "canContainBlock", true);
        setBooleanField(term4042, term4042.getClass(), "canContainInline", false);
        setBooleanField(term4042, term4042.getClass(), "optionalClosing", true);
        setBooleanField(term4042, term4042.getClass(), "empty", false);
        setBooleanField(term4042, term4042.getClass(), "preserveWhitespace", false);
        setField(term4042, term4042.getClass(), "ancestors", term4045);
        ArrayList term4030 = new ArrayList();
        ((ArrayList) term4030).add((Object)null);
        Object term4022 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term4022, term4022.getClass(), "tagName", "");
        setBooleanField(term4022, term4022.getClass(), "isBlock", true);
        setBooleanField(term4022, term4022.getClass(), "canContainBlock", true);
        setBooleanField(term4022, term4022.getClass(), "canContainInline", true);
        setBooleanField(term4022, term4022.getClass(), "optionalClosing", false);
        setBooleanField(term4022, term4022.getClass(), "empty", false);
        setBooleanField(term4022, term4022.getClass(), "preserveWhitespace", false);
        setField(term4022, term4022.getClass(), "ancestors", term4030);
        ArrayList term4020 = new ArrayList();
        ((ArrayList) term4020).add(term4022);
        term4001 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term4001, term4001.getClass(), "tagName", "wfaXBpWAUH");
        setBooleanField(term4001, term4001.getClass(), "isBlock", true);
        setBooleanField(term4001, term4001.getClass(), "canContainBlock", true);
        setBooleanField(term4001, term4001.getClass(), "canContainInline", false);
        setBooleanField(term4001, term4001.getClass(), "optionalClosing", true);
        setBooleanField(term4001, term4001.getClass(), "empty", false);
        setBooleanField(term4001, term4001.getClass(), "preserveWhitespace", false);
        setField(term4001, term4001.getClass(), "ancestors", term4020);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = term1113;
        Object retValue = callMethod(klass, "register", argTypes, null, args);
        assertTrue(recursiveEquals(term1113, term4042));
        assertTrue(recursiveEquals(retValue, term4001));
    }

};


