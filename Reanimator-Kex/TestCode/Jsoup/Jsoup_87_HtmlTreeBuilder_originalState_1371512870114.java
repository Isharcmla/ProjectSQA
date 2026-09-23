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

public class HtmlTreeBuilder_originalState_1371512870114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12713;
     Object term296225;

    public HtmlTreeBuilder_originalState_1371512870114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12713 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term12713, term12713.getClass(), "state", null);
        setField(term12713, term12713.getClass(), "originalState", null);
        setBooleanField(term12713, term12713.getClass(), "baseUriSetFromDoc", false);
        setField(term12713, term12713.getClass(), "headElement", null);
        setField(term12713, term12713.getClass(), "formElement", null);
        setField(term12713, term12713.getClass(), "contextElement", null);
        setField(term12713, term12713.getClass(), "formattingElements", null);
        setField(term12713, term12713.getClass(), "pendingTableCharacters", null);
        setField(term12713, term12713.getClass(), "emptyEnd", null);
        setBooleanField(term12713, term12713.getClass(), "framesetOk", false);
        setBooleanField(term12713, term12713.getClass(), "fosterInserts", false);
        setBooleanField(term12713, term12713.getClass(), "fragmentParsing", false);
        setField(term12713, term12713.getClass(), "specificScopeTarget", null);
        setField(term12713, term12713.getClass(), "parser", null);
        setField(term12713, term12713.getClass(), "reader", null);
        setField(term12713, term12713.getClass(), "tokeniser", null);
        setField(term12713, term12713.getClass(), "doc", null);
        setField(term12713, term12713.getClass(), "stack", null);
        setField(term12713, term12713.getClass(), "baseUri", null);
        setField(term12713, term12713.getClass(), "currentToken", null);
        setField(term12713, term12713.getClass(), "settings", null);
        setField(term12713, term12713.getClass(), "start", null);
        setField(term12713, term12713.getClass(), "end", null);
        term296225 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term296225, term296225.getClass(), "state", null);
        setField(term296225, term296225.getClass(), "originalState", null);
        setBooleanField(term296225, term296225.getClass(), "baseUriSetFromDoc", false);
        setField(term296225, term296225.getClass(), "headElement", null);
        setField(term296225, term296225.getClass(), "formElement", null);
        setField(term296225, term296225.getClass(), "contextElement", null);
        setField(term296225, term296225.getClass(), "formattingElements", null);
        setField(term296225, term296225.getClass(), "pendingTableCharacters", null);
        setField(term296225, term296225.getClass(), "emptyEnd", null);
        setBooleanField(term296225, term296225.getClass(), "framesetOk", false);
        setBooleanField(term296225, term296225.getClass(), "fosterInserts", false);
        setBooleanField(term296225, term296225.getClass(), "fragmentParsing", false);
        setField(term296225, term296225.getClass(), "specificScopeTarget", null);
        setField(term296225, term296225.getClass(), "parser", null);
        setField(term296225, term296225.getClass(), "reader", null);
        setField(term296225, term296225.getClass(), "tokeniser", null);
        setField(term296225, term296225.getClass(), "doc", null);
        setField(term296225, term296225.getClass(), "stack", null);
        setField(term296225, term296225.getClass(), "baseUri", null);
        setField(term296225, term296225.getClass(), "currentToken", null);
        setField(term296225, term296225.getClass(), "settings", null);
        setField(term296225, term296225.getClass(), "start", null);
        setField(term296225, term296225.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "originalState", argTypes, term12713, args);
        assertTrue(recursiveEquals(term12713, term296225));
        assertTrue(recursiveEquals(retValue, null));
    }

};


