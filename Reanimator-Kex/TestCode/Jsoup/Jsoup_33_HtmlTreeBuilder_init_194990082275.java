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
import java.lang.Object;
import java.util.ArrayList;

public class HtmlTreeBuilder_init_194990082275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162160;

    public HtmlTreeBuilder_init_194990082275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term162162 = new ArrayList();
        term162160 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term162161 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term162160, term162160.getClass(), "state", null);
        setField(term162160, term162160.getClass(), "originalState", null);
        setBooleanField(term162160, term162160.getClass(), "baseUriSetFromDoc", false);
        setField(term162160, term162160.getClass(), "headElement", null);
        setField(term162160, term162160.getClass(), "formElement", null);
        setField(term162160, term162160.getClass(), "contextElement", null);
        setIntField(term162161, term162161.getClass(), "size", 0);
        setField(term162161, term162161.getClass(), "first", null);
        setField(term162161, term162161.getClass(), "last", null);
        setIntField(term162161, term162161.getClass(), "modCount", 0);
        setField(term162160, term162160.getClass(), "formattingElements", term162161);
        setField(term162160, term162160.getClass(), "pendingTableCharacters", term162162);
        setBooleanField(term162160, term162160.getClass(), "framesetOk", true);
        setBooleanField(term162160, term162160.getClass(), "fosterInserts", false);
        setBooleanField(term162160, term162160.getClass(), "fragmentParsing", false);
        setField(term162160, term162160.getClass(), "reader", null);
        setField(term162160, term162160.getClass(), "tokeniser", null);
        setField(term162160, term162160.getClass(), "doc", null);
        setField(term162160, term162160.getClass(), "stack", null);
        setField(term162160, term162160.getClass(), "baseUri", null);
        setField(term162160, term162160.getClass(), "currentToken", null);
        setField(term162160, term162160.getClass(), "errors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term162160));
    }

};


