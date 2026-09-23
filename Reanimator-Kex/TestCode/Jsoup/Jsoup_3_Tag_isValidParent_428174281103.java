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

public class Tag_isValidParent_428174281103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22383;
     Object term22467;
     Object term22761;
     Object term22764;

    public Tag_isValidParent_428174281103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22383 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term22383, term22383.getClass(), "canContainBlock", true);
        setBooleanField(term22383, term22383.getClass(), "canContainInline", false);
        setBooleanField(term22383, term22383.getClass(), "empty", true);
        setBooleanField(term22383, term22383.getClass(), "isBlock", true);
        setBooleanField(term22383, term22383.getClass(), "optionalClosing", false);
        setField(term22383, term22383.getClass(), "tagName", "java.lang.String");
        Object term22542 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term22542, term22542.getClass(), "canContainBlock", false);
        Object term22565 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term22565, term22565.getClass(), "canContainBlock", true);
        setBooleanField(term22565, term22565.getClass(), "canContainInline", false);
        setBooleanField(term22565, term22565.getClass(), "empty", true);
        setBooleanField(term22565, term22565.getClass(), "isBlock", true);
        setBooleanField(term22565, term22565.getClass(), "optionalClosing", false);
        setField(term22565, term22565.getClass(), "tagName", null);
        Object term22588 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term22588, term22588.getClass(), "canContainBlock", true);
        setBooleanField(term22588, term22588.getClass(), "canContainInline", true);
        Object term22611 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term22611, term22611.getClass(), "canContainBlock", true);
        setBooleanField(term22611, term22611.getClass(), "canContainInline", false);
        setBooleanField(term22611, term22611.getClass(), "empty", true);
        ArrayList term22519 = new ArrayList();
        ((ArrayList) term22519).add(term22542);
        ((ArrayList) term22519).add(term22565);
        ((ArrayList) term22519).add(term22588);
        ((ArrayList) term22519).add(term22611);
        term22467 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term22467, term22467.getClass(), "ancestors", term22519);
        term22761 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term22761, term22761.getClass(), "tagName", "java.lang.String");
        setBooleanField(term22761, term22761.getClass(), "isBlock", true);
        setBooleanField(term22761, term22761.getClass(), "canContainBlock", true);
        setBooleanField(term22761, term22761.getClass(), "canContainInline", false);
        setBooleanField(term22761, term22761.getClass(), "optionalClosing", false);
        setBooleanField(term22761, term22761.getClass(), "empty", true);
        setBooleanField(term22761, term22761.getClass(), "preserveWhitespace", false);
        setField(term22761, term22761.getClass(), "ancestors", null);
        Object term22767 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term22767, term22767.getClass(), "tagName", null);
        setBooleanField(term22767, term22767.getClass(), "isBlock", false);
        setBooleanField(term22767, term22767.getClass(), "canContainBlock", false);
        setBooleanField(term22767, term22767.getClass(), "canContainInline", false);
        setBooleanField(term22767, term22767.getClass(), "optionalClosing", false);
        setBooleanField(term22767, term22767.getClass(), "empty", false);
        setBooleanField(term22767, term22767.getClass(), "preserveWhitespace", false);
        setField(term22767, term22767.getClass(), "ancestors", null);
        Object term22768 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term22768, term22768.getClass(), "tagName", null);
        setBooleanField(term22768, term22768.getClass(), "isBlock", true);
        setBooleanField(term22768, term22768.getClass(), "canContainBlock", true);
        setBooleanField(term22768, term22768.getClass(), "canContainInline", false);
        setBooleanField(term22768, term22768.getClass(), "optionalClosing", false);
        setBooleanField(term22768, term22768.getClass(), "empty", true);
        setBooleanField(term22768, term22768.getClass(), "preserveWhitespace", false);
        setField(term22768, term22768.getClass(), "ancestors", null);
        Object term22769 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term22769, term22769.getClass(), "tagName", null);
        setBooleanField(term22769, term22769.getClass(), "isBlock", false);
        setBooleanField(term22769, term22769.getClass(), "canContainBlock", true);
        setBooleanField(term22769, term22769.getClass(), "canContainInline", true);
        setBooleanField(term22769, term22769.getClass(), "optionalClosing", false);
        setBooleanField(term22769, term22769.getClass(), "empty", false);
        setBooleanField(term22769, term22769.getClass(), "preserveWhitespace", false);
        setField(term22769, term22769.getClass(), "ancestors", null);
        Object term22770 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term22770, term22770.getClass(), "tagName", null);
        setBooleanField(term22770, term22770.getClass(), "isBlock", false);
        setBooleanField(term22770, term22770.getClass(), "canContainBlock", true);
        setBooleanField(term22770, term22770.getClass(), "canContainInline", false);
        setBooleanField(term22770, term22770.getClass(), "optionalClosing", false);
        setBooleanField(term22770, term22770.getClass(), "empty", true);
        setBooleanField(term22770, term22770.getClass(), "preserveWhitespace", false);
        setField(term22770, term22770.getClass(), "ancestors", null);
        ArrayList term22765 = new ArrayList();
        ((ArrayList) term22765).add(term22767);
        ((ArrayList) term22765).add(term22768);
        ((ArrayList) term22765).add(term22769);
        ((ArrayList) term22765).add(term22770);
        term22764 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term22764, term22764.getClass(), "tagName", null);
        setBooleanField(term22764, term22764.getClass(), "isBlock", false);
        setBooleanField(term22764, term22764.getClass(), "canContainBlock", false);
        setBooleanField(term22764, term22764.getClass(), "canContainInline", false);
        setBooleanField(term22764, term22764.getClass(), "optionalClosing", false);
        setBooleanField(term22764, term22764.getClass(), "empty", false);
        setBooleanField(term22764, term22764.getClass(), "preserveWhitespace", false);
        setField(term22764, term22764.getClass(), "ancestors", term22765);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = term22467;
        Object retValue = callMethod(klass, "isValidParent", argTypes, term22383, args);
        assertTrue(recursiveEquals(term22383, term22761));
        assertTrue(recursiveEquals(term22467, term22764));
        assertTrue(recursiveEquals(retValue, false));
    }

};


