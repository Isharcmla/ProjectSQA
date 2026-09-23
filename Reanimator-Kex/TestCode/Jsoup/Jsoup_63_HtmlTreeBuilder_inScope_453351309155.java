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

public class HtmlTreeBuilder_inScope_453351309155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63452;

    public HtmlTreeBuilder_inScope_453351309155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63452 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term63452, term63452.getClass(), "state", null);
        setField(term63452, term63452.getClass(), "originalState", null);
        setBooleanField(term63452, term63452.getClass(), "baseUriSetFromDoc", false);
        setField(term63452, term63452.getClass(), "headElement", null);
        setField(term63452, term63452.getClass(), "formElement", null);
        setField(term63452, term63452.getClass(), "contextElement", null);
        setField(term63452, term63452.getClass(), "formattingElements", null);
        setField(term63452, term63452.getClass(), "pendingTableCharacters", null);
        setField(term63452, term63452.getClass(), "emptyEnd", null);
        setBooleanField(term63452, term63452.getClass(), "framesetOk", false);
        setBooleanField(term63452, term63452.getClass(), "fosterInserts", false);
        setBooleanField(term63452, term63452.getClass(), "fragmentParsing", false);
        setField(term63452, term63452.getClass(), "specificScopeTarget", null);
        setField(term63452, term63452.getClass(), "reader", null);
        setField(term63452, term63452.getClass(), "tokeniser", null);
        setField(term63452, term63452.getClass(), "doc", null);
        setField(term63452, term63452.getClass(), "stack", null);
        setField(term63452, term63452.getClass(), "baseUri", null);
        setField(term63452, term63452.getClass(), "currentToken", null);
        setField(term63452, term63452.getClass(), "errors", null);
        setField(term63452, term63452.getClass(), "settings", null);
        setField(term63452, term63452.getClass(), "start", null);
        setField(term63452, term63452.getClass(), "end", null);
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
            callMethod(klass, "inScope", argTypes, term63452, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


