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
import java.lang.Boolean;
import java.util.LinkedList;
import java.lang.Object;
import java.util.ArrayList;

public class Parser_init_60704104120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25;
     Object term5837;

    public Parser_init_60704104120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25 = new Boolean(false);
        ArrayList term5843 = new ArrayList();
        Object term5840 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term5841 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term5842 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5844 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5841, term5841.getClass(), "escapeMode", null);
        setField(term5841, term5841.getClass(), "charset", null);
        setField(term5841, term5841.getClass(), "charsetEncoder", null);
        setField(term5841, term5841.getClass(), "this$0", term5840);
        setField(term5840, term5840.getClass(), "outputSettings", term5841);
        setField(term5842, term5842.getClass(), "tagName", null);
        setBooleanField(term5842, term5842.getClass(), "knownTag", false);
        setBooleanField(term5842, term5842.getClass(), "isBlock", false);
        setBooleanField(term5842, term5842.getClass(), "canContainBlock", true);
        setBooleanField(term5842, term5842.getClass(), "canContainInline", true);
        setBooleanField(term5842, term5842.getClass(), "optionalClosing", false);
        setBooleanField(term5842, term5842.getClass(), "empty", false);
        setBooleanField(term5842, term5842.getClass(), "selfClosing", false);
        setBooleanField(term5842, term5842.getClass(), "preserveWhitespace", false);
        setField(term5842, term5842.getClass(), "ancestors", null);
        setField(term5842, term5842.getClass(), "excludes", null);
        setBooleanField(term5842, term5842.getClass(), "directDescendant", false);
        setBooleanField(term5842, term5842.getClass(), "limitChildren", false);
        setField(term5840, term5840.getClass(), "tag", term5842);
        setField(term5840, term5840.getClass(), "classNames", null);
        setField(term5840, term5840.getClass(), "parentNode", null);
        setField(term5840, term5840.getClass(), "childNodes", term5843);
        setField(term5844, term5844.getClass(), "attributes", null);
        setField(term5840, term5840.getClass(), "attributes", term5844);
        setField(term5840, term5840.getClass(), "baseUri", "");
        setIntField(term5840, term5840.getClass(), "siblingIndex", 0);
        LinkedList term5838 = new LinkedList();
        ((LinkedList) term5838).add(term5840);
        term5837 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term5846 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term5837, term5837.getClass(), "stack", term5838);
        setField(term5846, term5846.getClass(), "queue", "PAEBtnZtTD");
        setIntField(term5846, term5846.getClass(), "pos", 0);
        setField(term5837, term5837.getClass(), "tq", term5846);
        setField(term5837, term5837.getClass(), "doc", term5840);
        setField(term5837, term5837.getClass(), "baseUri", "sjlJAEtRrb");
        setBooleanField(term5837, term5837.getClass(), "relaxed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = "PAEBtnZtTD";
        args[1] = "sjlJAEtRrb";
        args[2] = term25;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term5837));
        assertTrue(recursiveEquals(term25, false));
    }

};


