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

public class HtmlTreeBuilder_onStack_554151082193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195612;
     Object term195830;

    public HtmlTreeBuilder_onStack_554151082193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term195664 = new ArrayList();
        term195612 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term195612, term195612.getClass(), "stack", term195664);
        ArrayList term195831 = new ArrayList();
        term195830 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term195830, term195830.getClass(), "state", null);
        setField(term195830, term195830.getClass(), "originalState", null);
        setBooleanField(term195830, term195830.getClass(), "baseUriSetFromDoc", false);
        setField(term195830, term195830.getClass(), "headElement", null);
        setField(term195830, term195830.getClass(), "formElement", null);
        setField(term195830, term195830.getClass(), "contextElement", null);
        setField(term195830, term195830.getClass(), "formattingElements", null);
        setField(term195830, term195830.getClass(), "pendingTableCharacters", null);
        setField(term195830, term195830.getClass(), "emptyEnd", null);
        setBooleanField(term195830, term195830.getClass(), "framesetOk", false);
        setBooleanField(term195830, term195830.getClass(), "fosterInserts", false);
        setBooleanField(term195830, term195830.getClass(), "fragmentParsing", false);
        setField(term195830, term195830.getClass(), "specificScopeTarget", null);
        setField(term195830, term195830.getClass(), "reader", null);
        setField(term195830, term195830.getClass(), "tokeniser", null);
        setField(term195830, term195830.getClass(), "doc", null);
        setField(term195830, term195830.getClass(), "stack", term195831);
        setField(term195830, term195830.getClass(), "baseUri", null);
        setField(term195830, term195830.getClass(), "currentToken", null);
        setField(term195830, term195830.getClass(), "errors", null);
        setField(term195830, term195830.getClass(), "settings", null);
        setField(term195830, term195830.getClass(), "start", null);
        setField(term195830, term195830.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "onStack", argTypes, term195612, args);
        assertTrue(recursiveEquals(term195612, term195830));
    }

};


