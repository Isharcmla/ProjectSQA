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

public class HtmlTreeBuilder_inScope_453351309159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65464;

    public HtmlTreeBuilder_inScope_453351309159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65464 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term65464, term65464.getClass(), "state", null);
        setField(term65464, term65464.getClass(), "originalState", null);
        setBooleanField(term65464, term65464.getClass(), "baseUriSetFromDoc", false);
        setField(term65464, term65464.getClass(), "headElement", null);
        setField(term65464, term65464.getClass(), "formElement", null);
        setField(term65464, term65464.getClass(), "contextElement", null);
        setField(term65464, term65464.getClass(), "formattingElements", null);
        setField(term65464, term65464.getClass(), "pendingTableCharacters", null);
        setField(term65464, term65464.getClass(), "emptyEnd", null);
        setBooleanField(term65464, term65464.getClass(), "framesetOk", false);
        setBooleanField(term65464, term65464.getClass(), "fosterInserts", false);
        setBooleanField(term65464, term65464.getClass(), "fragmentParsing", false);
        setField(term65464, term65464.getClass(), "specificScopeTarget", null);
        setField(term65464, term65464.getClass(), "reader", null);
        setField(term65464, term65464.getClass(), "tokeniser", null);
        setField(term65464, term65464.getClass(), "doc", null);
        setField(term65464, term65464.getClass(), "stack", null);
        setField(term65464, term65464.getClass(), "baseUri", null);
        setField(term65464, term65464.getClass(), "currentToken", null);
        setField(term65464, term65464.getClass(), "errors", null);
        setField(term65464, term65464.getClass(), "settings", null);
        setField(term65464, term65464.getClass(), "start", null);
        setField(term65464, term65464.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "inScope", argTypes, term65464, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


