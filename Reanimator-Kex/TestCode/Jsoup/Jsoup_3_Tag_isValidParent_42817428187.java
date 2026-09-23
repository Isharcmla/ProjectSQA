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

public class Tag_isValidParent_42817428187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17632;
     Object term17678;
     Object term17844;
     Object term17845;

    public Tag_isValidParent_42817428187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17632 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term17632, term17632.getClass(), "canContainBlock", true);
        setBooleanField(term17632, term17632.getClass(), "canContainInline", true);
        setBooleanField(term17632, term17632.getClass(), "empty", false);
        setBooleanField(term17632, term17632.getClass(), "isBlock", false);
        setBooleanField(term17632, term17632.getClass(), "optionalClosing", true);
        Object term17753 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term17753, term17753.getClass(), "canContainBlock", false);
        Object term17776 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term17776, term17776.getClass(), "canContainBlock", true);
        setBooleanField(term17776, term17776.getClass(), "canContainInline", true);
        setBooleanField(term17776, term17776.getClass(), "empty", false);
        setBooleanField(term17776, term17776.getClass(), "isBlock", false);
        setBooleanField(term17776, term17776.getClass(), "optionalClosing", false);
        ArrayList term17730 = new ArrayList();
        ((ArrayList) term17730).add(term17753);
        ((ArrayList) term17730).add(term17776);
        term17678 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term17678, term17678.getClass(), "ancestors", term17730);
        term17844 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term17844, term17844.getClass(), "tagName", null);
        setBooleanField(term17844, term17844.getClass(), "isBlock", false);
        setBooleanField(term17844, term17844.getClass(), "canContainBlock", true);
        setBooleanField(term17844, term17844.getClass(), "canContainInline", true);
        setBooleanField(term17844, term17844.getClass(), "optionalClosing", true);
        setBooleanField(term17844, term17844.getClass(), "empty", false);
        setBooleanField(term17844, term17844.getClass(), "preserveWhitespace", false);
        setField(term17844, term17844.getClass(), "ancestors", null);
        Object term17848 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term17848, term17848.getClass(), "tagName", null);
        setBooleanField(term17848, term17848.getClass(), "isBlock", false);
        setBooleanField(term17848, term17848.getClass(), "canContainBlock", false);
        setBooleanField(term17848, term17848.getClass(), "canContainInline", false);
        setBooleanField(term17848, term17848.getClass(), "optionalClosing", false);
        setBooleanField(term17848, term17848.getClass(), "empty", false);
        setBooleanField(term17848, term17848.getClass(), "preserveWhitespace", false);
        setField(term17848, term17848.getClass(), "ancestors", null);
        Object term17849 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term17849, term17849.getClass(), "tagName", null);
        setBooleanField(term17849, term17849.getClass(), "isBlock", false);
        setBooleanField(term17849, term17849.getClass(), "canContainBlock", true);
        setBooleanField(term17849, term17849.getClass(), "canContainInline", true);
        setBooleanField(term17849, term17849.getClass(), "optionalClosing", false);
        setBooleanField(term17849, term17849.getClass(), "empty", false);
        setBooleanField(term17849, term17849.getClass(), "preserveWhitespace", false);
        setField(term17849, term17849.getClass(), "ancestors", null);
        ArrayList term17846 = new ArrayList();
        ((ArrayList) term17846).add(term17848);
        ((ArrayList) term17846).add(term17849);
        term17845 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term17845, term17845.getClass(), "tagName", null);
        setBooleanField(term17845, term17845.getClass(), "isBlock", false);
        setBooleanField(term17845, term17845.getClass(), "canContainBlock", false);
        setBooleanField(term17845, term17845.getClass(), "canContainInline", false);
        setBooleanField(term17845, term17845.getClass(), "optionalClosing", false);
        setBooleanField(term17845, term17845.getClass(), "empty", false);
        setBooleanField(term17845, term17845.getClass(), "preserveWhitespace", false);
        setField(term17845, term17845.getClass(), "ancestors", term17846);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = term17678;
        Object retValue = callMethod(klass, "isValidParent", argTypes, term17632, args);
        assertTrue(recursiveEquals(term17632, term17844));
        assertTrue(recursiveEquals(term17678, term17845));
        assertTrue(recursiveEquals(retValue, false));
    }

};


