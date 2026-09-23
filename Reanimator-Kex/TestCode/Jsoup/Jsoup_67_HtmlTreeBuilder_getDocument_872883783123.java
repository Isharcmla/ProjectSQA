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

public class HtmlTreeBuilder_getDocument_872883783123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14075;
     Object term118333;

    public HtmlTreeBuilder_getDocument_872883783123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14075 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term14075, term14075.getClass(), "state", null);
        setField(term14075, term14075.getClass(), "originalState", null);
        setBooleanField(term14075, term14075.getClass(), "baseUriSetFromDoc", false);
        setField(term14075, term14075.getClass(), "headElement", null);
        setField(term14075, term14075.getClass(), "formElement", null);
        setField(term14075, term14075.getClass(), "contextElement", null);
        setField(term14075, term14075.getClass(), "formattingElements", null);
        setField(term14075, term14075.getClass(), "pendingTableCharacters", null);
        setField(term14075, term14075.getClass(), "emptyEnd", null);
        setBooleanField(term14075, term14075.getClass(), "framesetOk", false);
        setBooleanField(term14075, term14075.getClass(), "fosterInserts", false);
        setBooleanField(term14075, term14075.getClass(), "fragmentParsing", false);
        setField(term14075, term14075.getClass(), "specificScopeTarget", null);
        setField(term14075, term14075.getClass(), "reader", null);
        setField(term14075, term14075.getClass(), "tokeniser", null);
        setField(term14075, term14075.getClass(), "doc", null);
        setField(term14075, term14075.getClass(), "stack", null);
        setField(term14075, term14075.getClass(), "baseUri", null);
        setField(term14075, term14075.getClass(), "currentToken", null);
        setField(term14075, term14075.getClass(), "errors", null);
        setField(term14075, term14075.getClass(), "settings", null);
        setField(term14075, term14075.getClass(), "start", null);
        setField(term14075, term14075.getClass(), "end", null);
        term118333 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term118333, term118333.getClass(), "state", null);
        setField(term118333, term118333.getClass(), "originalState", null);
        setBooleanField(term118333, term118333.getClass(), "baseUriSetFromDoc", false);
        setField(term118333, term118333.getClass(), "headElement", null);
        setField(term118333, term118333.getClass(), "formElement", null);
        setField(term118333, term118333.getClass(), "contextElement", null);
        setField(term118333, term118333.getClass(), "formattingElements", null);
        setField(term118333, term118333.getClass(), "pendingTableCharacters", null);
        setField(term118333, term118333.getClass(), "emptyEnd", null);
        setBooleanField(term118333, term118333.getClass(), "framesetOk", false);
        setBooleanField(term118333, term118333.getClass(), "fosterInserts", false);
        setBooleanField(term118333, term118333.getClass(), "fragmentParsing", false);
        setField(term118333, term118333.getClass(), "specificScopeTarget", null);
        setField(term118333, term118333.getClass(), "reader", null);
        setField(term118333, term118333.getClass(), "tokeniser", null);
        setField(term118333, term118333.getClass(), "doc", null);
        setField(term118333, term118333.getClass(), "stack", null);
        setField(term118333, term118333.getClass(), "baseUri", null);
        setField(term118333, term118333.getClass(), "currentToken", null);
        setField(term118333, term118333.getClass(), "errors", null);
        setField(term118333, term118333.getClass(), "settings", null);
        setField(term118333, term118333.getClass(), "start", null);
        setField(term118333, term118333.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDocument", argTypes, term14075, args);
        assertTrue(recursiveEquals(term14075, term118333));
        assertTrue(recursiveEquals(retValue, null));
    }

};


