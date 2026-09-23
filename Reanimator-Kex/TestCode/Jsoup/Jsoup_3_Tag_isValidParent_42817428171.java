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

public class Tag_isValidParent_42817428171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13778;
     Object term13824;
     Object term13945;
     Object term13946;

    public Tag_isValidParent_42817428171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13778 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term13778, term13778.getClass(), "canContainBlock", true);
        setBooleanField(term13778, term13778.getClass(), "canContainInline", false);
        setBooleanField(term13778, term13778.getClass(), "empty", true);
        setBooleanField(term13778, term13778.getClass(), "isBlock", true);
        Object term13899 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term13899, term13899.getClass(), "canContainBlock", true);
        setBooleanField(term13899, term13899.getClass(), "canContainInline", false);
        setBooleanField(term13899, term13899.getClass(), "empty", true);
        setBooleanField(term13899, term13899.getClass(), "isBlock", false);
        ArrayList term13876 = new ArrayList();
        ((ArrayList) term13876).add(term13899);
        term13824 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term13824, term13824.getClass(), "ancestors", term13876);
        term13945 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term13945, term13945.getClass(), "tagName", null);
        setBooleanField(term13945, term13945.getClass(), "isBlock", true);
        setBooleanField(term13945, term13945.getClass(), "canContainBlock", true);
        setBooleanField(term13945, term13945.getClass(), "canContainInline", false);
        setBooleanField(term13945, term13945.getClass(), "optionalClosing", false);
        setBooleanField(term13945, term13945.getClass(), "empty", true);
        setBooleanField(term13945, term13945.getClass(), "preserveWhitespace", false);
        setField(term13945, term13945.getClass(), "ancestors", null);
        Object term13949 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term13949, term13949.getClass(), "tagName", null);
        setBooleanField(term13949, term13949.getClass(), "isBlock", false);
        setBooleanField(term13949, term13949.getClass(), "canContainBlock", true);
        setBooleanField(term13949, term13949.getClass(), "canContainInline", false);
        setBooleanField(term13949, term13949.getClass(), "optionalClosing", false);
        setBooleanField(term13949, term13949.getClass(), "empty", true);
        setBooleanField(term13949, term13949.getClass(), "preserveWhitespace", false);
        setField(term13949, term13949.getClass(), "ancestors", null);
        ArrayList term13947 = new ArrayList();
        ((ArrayList) term13947).add(term13949);
        term13946 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term13946, term13946.getClass(), "tagName", null);
        setBooleanField(term13946, term13946.getClass(), "isBlock", false);
        setBooleanField(term13946, term13946.getClass(), "canContainBlock", false);
        setBooleanField(term13946, term13946.getClass(), "canContainInline", false);
        setBooleanField(term13946, term13946.getClass(), "optionalClosing", false);
        setBooleanField(term13946, term13946.getClass(), "empty", false);
        setBooleanField(term13946, term13946.getClass(), "preserveWhitespace", false);
        setField(term13946, term13946.getClass(), "ancestors", term13947);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = term13824;
        Object retValue = callMethod(klass, "isValidParent", argTypes, term13778, args);
        assertTrue(recursiveEquals(term13778, term13945));
        assertTrue(recursiveEquals(term13824, term13946));
        assertTrue(recursiveEquals(retValue, false));
    }

};


