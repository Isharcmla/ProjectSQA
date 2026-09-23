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

public class HtmlTreeBuilder_generateImpliedEndTags_1471943769167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86875;
     Object term369162;

    public HtmlTreeBuilder_generateImpliedEndTags_1471943769167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86875 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term86875, term86875.getClass(), "state", null);
        setField(term86875, term86875.getClass(), "originalState", null);
        setBooleanField(term86875, term86875.getClass(), "baseUriSetFromDoc", false);
        setField(term86875, term86875.getClass(), "headElement", null);
        setField(term86875, term86875.getClass(), "formElement", null);
        setField(term86875, term86875.getClass(), "contextElement", null);
        setField(term86875, term86875.getClass(), "formattingElements", null);
        setField(term86875, term86875.getClass(), "pendingTableCharacters", null);
        setField(term86875, term86875.getClass(), "emptyEnd", null);
        setBooleanField(term86875, term86875.getClass(), "framesetOk", false);
        setBooleanField(term86875, term86875.getClass(), "fosterInserts", false);
        setBooleanField(term86875, term86875.getClass(), "fragmentParsing", false);
        setField(term86875, term86875.getClass(), "specificScopeTarget", null);
        setField(term86875, term86875.getClass(), "parser", null);
        setField(term86875, term86875.getClass(), "reader", null);
        setField(term86875, term86875.getClass(), "tokeniser", null);
        setField(term86875, term86875.getClass(), "doc", null);
        setField(term86875, term86875.getClass(), "stack", null);
        setField(term86875, term86875.getClass(), "baseUri", null);
        setField(term86875, term86875.getClass(), "currentToken", null);
        setField(term86875, term86875.getClass(), "settings", null);
        setField(term86875, term86875.getClass(), "start", null);
        setField(term86875, term86875.getClass(), "end", null);
        term369162 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term369162, term369162.getClass(), "state", null);
        setField(term369162, term369162.getClass(), "originalState", null);
        setBooleanField(term369162, term369162.getClass(), "baseUriSetFromDoc", false);
        setField(term369162, term369162.getClass(), "headElement", null);
        setField(term369162, term369162.getClass(), "formElement", null);
        setField(term369162, term369162.getClass(), "contextElement", null);
        setField(term369162, term369162.getClass(), "formattingElements", null);
        setField(term369162, term369162.getClass(), "pendingTableCharacters", null);
        setField(term369162, term369162.getClass(), "emptyEnd", null);
        setBooleanField(term369162, term369162.getClass(), "framesetOk", false);
        setBooleanField(term369162, term369162.getClass(), "fosterInserts", false);
        setBooleanField(term369162, term369162.getClass(), "fragmentParsing", false);
        setField(term369162, term369162.getClass(), "specificScopeTarget", null);
        setField(term369162, term369162.getClass(), "parser", null);
        setField(term369162, term369162.getClass(), "reader", null);
        setField(term369162, term369162.getClass(), "tokeniser", null);
        setField(term369162, term369162.getClass(), "doc", null);
        setField(term369162, term369162.getClass(), "stack", null);
        setField(term369162, term369162.getClass(), "baseUri", null);
        setField(term369162, term369162.getClass(), "currentToken", null);
        setField(term369162, term369162.getClass(), "settings", null);
        setField(term369162, term369162.getClass(), "start", null);
        setField(term369162, term369162.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "generateImpliedEndTags", argTypes, term86875, args);
        assertTrue(recursiveEquals(term86875, term369162));
    }

};


