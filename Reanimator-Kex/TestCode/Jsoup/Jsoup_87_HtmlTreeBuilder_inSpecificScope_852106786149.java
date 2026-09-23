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

public class HtmlTreeBuilder_inSpecificScope_852106786149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62207;

    public HtmlTreeBuilder_inSpecificScope_852106786149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62207 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term62207, term62207.getClass(), "state", null);
        setField(term62207, term62207.getClass(), "originalState", null);
        setBooleanField(term62207, term62207.getClass(), "baseUriSetFromDoc", false);
        setField(term62207, term62207.getClass(), "headElement", null);
        setField(term62207, term62207.getClass(), "formElement", null);
        setField(term62207, term62207.getClass(), "contextElement", null);
        setField(term62207, term62207.getClass(), "formattingElements", null);
        setField(term62207, term62207.getClass(), "pendingTableCharacters", null);
        setField(term62207, term62207.getClass(), "emptyEnd", null);
        setBooleanField(term62207, term62207.getClass(), "framesetOk", false);
        setBooleanField(term62207, term62207.getClass(), "fosterInserts", false);
        setBooleanField(term62207, term62207.getClass(), "fragmentParsing", false);
        setField(term62207, term62207.getClass(), "specificScopeTarget", null);
        setField(term62207, term62207.getClass(), "parser", null);
        setField(term62207, term62207.getClass(), "reader", null);
        setField(term62207, term62207.getClass(), "tokeniser", null);
        setField(term62207, term62207.getClass(), "doc", null);
        setField(term62207, term62207.getClass(), "stack", null);
        setField(term62207, term62207.getClass(), "baseUri", null);
        setField(term62207, term62207.getClass(), "currentToken", null);
        setField(term62207, term62207.getClass(), "settings", null);
        setField(term62207, term62207.getClass(), "start", null);
        setField(term62207, term62207.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "inSpecificScope", argTypes, term62207, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


