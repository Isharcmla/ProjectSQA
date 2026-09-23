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

public class HtmlTreeBuilder_getStack_1760106259132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39221;
     Object term163481;

    public HtmlTreeBuilder_getStack_1760106259132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39221 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term39221, term39221.getClass(), "state", null);
        setField(term39221, term39221.getClass(), "originalState", null);
        setBooleanField(term39221, term39221.getClass(), "baseUriSetFromDoc", false);
        setField(term39221, term39221.getClass(), "headElement", null);
        setField(term39221, term39221.getClass(), "formElement", null);
        setField(term39221, term39221.getClass(), "contextElement", null);
        setField(term39221, term39221.getClass(), "formattingElements", null);
        setField(term39221, term39221.getClass(), "pendingTableCharacters", null);
        setField(term39221, term39221.getClass(), "emptyEnd", null);
        setBooleanField(term39221, term39221.getClass(), "framesetOk", false);
        setBooleanField(term39221, term39221.getClass(), "fosterInserts", false);
        setBooleanField(term39221, term39221.getClass(), "fragmentParsing", false);
        setField(term39221, term39221.getClass(), "specificScopeTarget", null);
        setField(term39221, term39221.getClass(), "parser", null);
        setField(term39221, term39221.getClass(), "reader", null);
        setField(term39221, term39221.getClass(), "tokeniser", null);
        setField(term39221, term39221.getClass(), "doc", null);
        setField(term39221, term39221.getClass(), "stack", null);
        setField(term39221, term39221.getClass(), "baseUri", null);
        setField(term39221, term39221.getClass(), "currentToken", null);
        setField(term39221, term39221.getClass(), "settings", null);
        setField(term39221, term39221.getClass(), "start", null);
        setField(term39221, term39221.getClass(), "end", null);
        term163481 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term163481, term163481.getClass(), "state", null);
        setField(term163481, term163481.getClass(), "originalState", null);
        setBooleanField(term163481, term163481.getClass(), "baseUriSetFromDoc", false);
        setField(term163481, term163481.getClass(), "headElement", null);
        setField(term163481, term163481.getClass(), "formElement", null);
        setField(term163481, term163481.getClass(), "contextElement", null);
        setField(term163481, term163481.getClass(), "formattingElements", null);
        setField(term163481, term163481.getClass(), "pendingTableCharacters", null);
        setField(term163481, term163481.getClass(), "emptyEnd", null);
        setBooleanField(term163481, term163481.getClass(), "framesetOk", false);
        setBooleanField(term163481, term163481.getClass(), "fosterInserts", false);
        setBooleanField(term163481, term163481.getClass(), "fragmentParsing", false);
        setField(term163481, term163481.getClass(), "specificScopeTarget", null);
        setField(term163481, term163481.getClass(), "parser", null);
        setField(term163481, term163481.getClass(), "reader", null);
        setField(term163481, term163481.getClass(), "tokeniser", null);
        setField(term163481, term163481.getClass(), "doc", null);
        setField(term163481, term163481.getClass(), "stack", null);
        setField(term163481, term163481.getClass(), "baseUri", null);
        setField(term163481, term163481.getClass(), "currentToken", null);
        setField(term163481, term163481.getClass(), "settings", null);
        setField(term163481, term163481.getClass(), "start", null);
        setField(term163481, term163481.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getStack", argTypes, term39221, args);
        assertTrue(recursiveEquals(term39221, term163481));
        assertTrue(recursiveEquals(retValue, null));
    }

};


