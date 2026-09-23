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

public class HtmlTreeBuilder_getActiveFormattingElement_851320383274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226056;
     Object term226398;

    public HtmlTreeBuilder_getActiveFormattingElement_851320383274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term226108 = new ArrayList();
        term226056 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term226056, term226056.getClass(), "formattingElements", term226108);
        ArrayList term226399 = new ArrayList();
        term226398 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term226398, term226398.getClass(), "state", null);
        setField(term226398, term226398.getClass(), "originalState", null);
        setBooleanField(term226398, term226398.getClass(), "baseUriSetFromDoc", false);
        setField(term226398, term226398.getClass(), "headElement", null);
        setField(term226398, term226398.getClass(), "formElement", null);
        setField(term226398, term226398.getClass(), "contextElement", null);
        setField(term226398, term226398.getClass(), "formattingElements", term226399);
        setField(term226398, term226398.getClass(), "pendingTableCharacters", null);
        setField(term226398, term226398.getClass(), "emptyEnd", null);
        setBooleanField(term226398, term226398.getClass(), "framesetOk", false);
        setBooleanField(term226398, term226398.getClass(), "fosterInserts", false);
        setBooleanField(term226398, term226398.getClass(), "fragmentParsing", false);
        setField(term226398, term226398.getClass(), "specificScopeTarget", null);
        setField(term226398, term226398.getClass(), "reader", null);
        setField(term226398, term226398.getClass(), "tokeniser", null);
        setField(term226398, term226398.getClass(), "doc", null);
        setField(term226398, term226398.getClass(), "stack", null);
        setField(term226398, term226398.getClass(), "baseUri", null);
        setField(term226398, term226398.getClass(), "currentToken", null);
        setField(term226398, term226398.getClass(), "errors", null);
        setField(term226398, term226398.getClass(), "settings", null);
        setField(term226398, term226398.getClass(), "start", null);
        setField(term226398, term226398.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getActiveFormattingElement", argTypes, term226056, args);
        assertTrue(recursiveEquals(term226056, term226398));
        assertTrue(recursiveEquals(retValue, null));
    }

};


