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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class HtmlTreeBuilder_clearStackToContext_518032978149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50583;

    public HtmlTreeBuilder_clearStackToContext_518032978149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50583 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term50583, term50583.getClass(), "state", null);
        setField(term50583, term50583.getClass(), "originalState", null);
        setBooleanField(term50583, term50583.getClass(), "baseUriSetFromDoc", false);
        setField(term50583, term50583.getClass(), "headElement", null);
        setField(term50583, term50583.getClass(), "formElement", null);
        setField(term50583, term50583.getClass(), "contextElement", null);
        setField(term50583, term50583.getClass(), "formattingElements", null);
        setField(term50583, term50583.getClass(), "pendingTableCharacters", null);
        setField(term50583, term50583.getClass(), "emptyEnd", null);
        setBooleanField(term50583, term50583.getClass(), "framesetOk", false);
        setBooleanField(term50583, term50583.getClass(), "fosterInserts", false);
        setBooleanField(term50583, term50583.getClass(), "fragmentParsing", false);
        setField(term50583, term50583.getClass(), "specificScopeTarget", null);
        setField(term50583, term50583.getClass(), "reader", null);
        setField(term50583, term50583.getClass(), "tokeniser", null);
        setField(term50583, term50583.getClass(), "doc", null);
        setField(term50583, term50583.getClass(), "stack", null);
        setField(term50583, term50583.getClass(), "baseUri", null);
        setField(term50583, term50583.getClass(), "currentToken", null);
        setField(term50583, term50583.getClass(), "errors", null);
        setField(term50583, term50583.getClass(), "settings", null);
        setField(term50583, term50583.getClass(), "start", null);
        setField(term50583, term50583.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "clearStackToContext", argTypes, term50583, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


