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

public class HtmlTreeBuilder_getHeadElement_1376057265159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78846;
     Object term192970;

    public HtmlTreeBuilder_getHeadElement_1376057265159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78846 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term78846, term78846.getClass(), "state", null);
        setField(term78846, term78846.getClass(), "originalState", null);
        setBooleanField(term78846, term78846.getClass(), "baseUriSetFromDoc", false);
        setField(term78846, term78846.getClass(), "headElement", null);
        setField(term78846, term78846.getClass(), "formElement", null);
        setField(term78846, term78846.getClass(), "contextElement", null);
        setField(term78846, term78846.getClass(), "formattingElements", null);
        setField(term78846, term78846.getClass(), "pendingTableCharacters", null);
        setField(term78846, term78846.getClass(), "emptyEnd", null);
        setBooleanField(term78846, term78846.getClass(), "framesetOk", false);
        setBooleanField(term78846, term78846.getClass(), "fosterInserts", false);
        setBooleanField(term78846, term78846.getClass(), "fragmentParsing", false);
        setField(term78846, term78846.getClass(), "specificScopeTarget", null);
        setField(term78846, term78846.getClass(), "parser", null);
        setField(term78846, term78846.getClass(), "reader", null);
        setField(term78846, term78846.getClass(), "tokeniser", null);
        setField(term78846, term78846.getClass(), "doc", null);
        setField(term78846, term78846.getClass(), "stack", null);
        setField(term78846, term78846.getClass(), "baseUri", null);
        setField(term78846, term78846.getClass(), "currentToken", null);
        setField(term78846, term78846.getClass(), "settings", null);
        setField(term78846, term78846.getClass(), "start", null);
        setField(term78846, term78846.getClass(), "end", null);
        term192970 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term192970, term192970.getClass(), "state", null);
        setField(term192970, term192970.getClass(), "originalState", null);
        setBooleanField(term192970, term192970.getClass(), "baseUriSetFromDoc", false);
        setField(term192970, term192970.getClass(), "headElement", null);
        setField(term192970, term192970.getClass(), "formElement", null);
        setField(term192970, term192970.getClass(), "contextElement", null);
        setField(term192970, term192970.getClass(), "formattingElements", null);
        setField(term192970, term192970.getClass(), "pendingTableCharacters", null);
        setField(term192970, term192970.getClass(), "emptyEnd", null);
        setBooleanField(term192970, term192970.getClass(), "framesetOk", false);
        setBooleanField(term192970, term192970.getClass(), "fosterInserts", false);
        setBooleanField(term192970, term192970.getClass(), "fragmentParsing", false);
        setField(term192970, term192970.getClass(), "specificScopeTarget", null);
        setField(term192970, term192970.getClass(), "parser", null);
        setField(term192970, term192970.getClass(), "reader", null);
        setField(term192970, term192970.getClass(), "tokeniser", null);
        setField(term192970, term192970.getClass(), "doc", null);
        setField(term192970, term192970.getClass(), "stack", null);
        setField(term192970, term192970.getClass(), "baseUri", null);
        setField(term192970, term192970.getClass(), "currentToken", null);
        setField(term192970, term192970.getClass(), "settings", null);
        setField(term192970, term192970.getClass(), "start", null);
        setField(term192970, term192970.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getHeadElement", argTypes, term78846, args);
        assertTrue(recursiveEquals(term78846, term192970));
        assertTrue(recursiveEquals(retValue, null));
    }

};


