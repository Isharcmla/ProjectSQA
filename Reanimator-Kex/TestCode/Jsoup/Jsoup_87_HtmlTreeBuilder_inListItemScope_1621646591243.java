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

public class HtmlTreeBuilder_inListItemScope_1621646591243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term450301;
     Object term450436;

    public HtmlTreeBuilder_inListItemScope_1621646591243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term450353 = new ArrayList();
        term450301 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object[] term450200 = (Object[]) newArray("java.lang.String", 10);
        setField(term450301, term450301.getClass(), "specificScopeTarget", term450200);
        setField(term450301, term450301.getClass(), "stack", term450353);
        ArrayList term450438 = new ArrayList();
        term450436 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object[] term450437 = (Object[]) newArray("java.lang.String", 10);
        setField(term450436, term450436.getClass(), "state", null);
        setField(term450436, term450436.getClass(), "originalState", null);
        setBooleanField(term450436, term450436.getClass(), "baseUriSetFromDoc", false);
        setField(term450436, term450436.getClass(), "headElement", null);
        setField(term450436, term450436.getClass(), "formElement", null);
        setField(term450436, term450436.getClass(), "contextElement", null);
        setField(term450436, term450436.getClass(), "formattingElements", null);
        setField(term450436, term450436.getClass(), "pendingTableCharacters", null);
        setField(term450436, term450436.getClass(), "emptyEnd", null);
        setBooleanField(term450436, term450436.getClass(), "framesetOk", false);
        setBooleanField(term450436, term450436.getClass(), "fosterInserts", false);
        setBooleanField(term450436, term450436.getClass(), "fragmentParsing", false);
        setField(term450436, term450436.getClass(), "specificScopeTarget", term450437);
        setField(term450436, term450436.getClass(), "parser", null);
        setField(term450436, term450436.getClass(), "reader", null);
        setField(term450436, term450436.getClass(), "tokeniser", null);
        setField(term450436, term450436.getClass(), "doc", null);
        setField(term450436, term450436.getClass(), "stack", term450438);
        setField(term450436, term450436.getClass(), "baseUri", null);
        setField(term450436, term450436.getClass(), "currentToken", null);
        setField(term450436, term450436.getClass(), "settings", null);
        setField(term450436, term450436.getClass(), "start", null);
        setField(term450436, term450436.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "inListItemScope", argTypes, term450301, args);
        assertTrue(recursiveEquals(term450301, term450436));
    }

};


