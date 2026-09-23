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

public class HtmlTreeBuilder_clearStackToContext_518032978216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term442310;
     Object term442505;

    public HtmlTreeBuilder_clearStackToContext_518032978216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term442362 = new ArrayList();
        term442310 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term442310, term442310.getClass(), "stack", term442362);
        ArrayList term442506 = new ArrayList();
        term442505 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term442505, term442505.getClass(), "state", null);
        setField(term442505, term442505.getClass(), "originalState", null);
        setBooleanField(term442505, term442505.getClass(), "baseUriSetFromDoc", false);
        setField(term442505, term442505.getClass(), "headElement", null);
        setField(term442505, term442505.getClass(), "formElement", null);
        setField(term442505, term442505.getClass(), "contextElement", null);
        setField(term442505, term442505.getClass(), "formattingElements", null);
        setField(term442505, term442505.getClass(), "pendingTableCharacters", null);
        setField(term442505, term442505.getClass(), "emptyEnd", null);
        setBooleanField(term442505, term442505.getClass(), "framesetOk", false);
        setBooleanField(term442505, term442505.getClass(), "fosterInserts", false);
        setBooleanField(term442505, term442505.getClass(), "fragmentParsing", false);
        setField(term442505, term442505.getClass(), "specificScopeTarget", null);
        setField(term442505, term442505.getClass(), "parser", null);
        setField(term442505, term442505.getClass(), "reader", null);
        setField(term442505, term442505.getClass(), "tokeniser", null);
        setField(term442505, term442505.getClass(), "doc", null);
        setField(term442505, term442505.getClass(), "stack", term442506);
        setField(term442505, term442505.getClass(), "baseUri", null);
        setField(term442505, term442505.getClass(), "currentToken", null);
        setField(term442505, term442505.getClass(), "settings", null);
        setField(term442505, term442505.getClass(), "start", null);
        setField(term442505, term442505.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "clearStackToContext", argTypes, term442310, args);
        assertTrue(recursiveEquals(term442310, term442505));
    }

};


