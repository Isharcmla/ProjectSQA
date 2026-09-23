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

public class HtmlTreeBuilder_removeFromActiveFormattingElements_1580466725228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205441;
     Object term208016;

    public HtmlTreeBuilder_removeFromActiveFormattingElements_1580466725228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term205493 = new ArrayList();
        term205441 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term205441, term205441.getClass(), "formattingElements", term205493);
        ArrayList term208029 = new ArrayList();
        term208016 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term208016, term208016.getClass(), "state", null);
        setField(term208016, term208016.getClass(), "originalState", null);
        setBooleanField(term208016, term208016.getClass(), "baseUriSetFromDoc", false);
        setField(term208016, term208016.getClass(), "headElement", null);
        setField(term208016, term208016.getClass(), "formElement", null);
        setField(term208016, term208016.getClass(), "contextElement", null);
        setField(term208016, term208016.getClass(), "formattingElements", term208029);
        setField(term208016, term208016.getClass(), "pendingTableCharacters", null);
        setField(term208016, term208016.getClass(), "emptyEnd", null);
        setBooleanField(term208016, term208016.getClass(), "framesetOk", false);
        setBooleanField(term208016, term208016.getClass(), "fosterInserts", false);
        setBooleanField(term208016, term208016.getClass(), "fragmentParsing", false);
        setField(term208016, term208016.getClass(), "specificScopeTarget", null);
        setField(term208016, term208016.getClass(), "reader", null);
        setField(term208016, term208016.getClass(), "tokeniser", null);
        setField(term208016, term208016.getClass(), "doc", null);
        setField(term208016, term208016.getClass(), "stack", null);
        setField(term208016, term208016.getClass(), "baseUri", null);
        setField(term208016, term208016.getClass(), "currentToken", null);
        setField(term208016, term208016.getClass(), "errors", null);
        setField(term208016, term208016.getClass(), "settings", null);
        setField(term208016, term208016.getClass(), "start", null);
        setField(term208016, term208016.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "removeFromActiveFormattingElements", argTypes, term205441, args);
        assertTrue(recursiveEquals(term205441, term208016));
    }

};


