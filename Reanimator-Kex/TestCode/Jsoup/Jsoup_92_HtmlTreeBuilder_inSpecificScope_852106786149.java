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
     Object term64462;

    public HtmlTreeBuilder_inSpecificScope_852106786149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64462 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term64462, term64462.getClass(), "state", null);
        setField(term64462, term64462.getClass(), "originalState", null);
        setBooleanField(term64462, term64462.getClass(), "baseUriSetFromDoc", false);
        setField(term64462, term64462.getClass(), "headElement", null);
        setField(term64462, term64462.getClass(), "formElement", null);
        setField(term64462, term64462.getClass(), "contextElement", null);
        setField(term64462, term64462.getClass(), "formattingElements", null);
        setField(term64462, term64462.getClass(), "pendingTableCharacters", null);
        setField(term64462, term64462.getClass(), "emptyEnd", null);
        setBooleanField(term64462, term64462.getClass(), "framesetOk", false);
        setBooleanField(term64462, term64462.getClass(), "fosterInserts", false);
        setBooleanField(term64462, term64462.getClass(), "fragmentParsing", false);
        setField(term64462, term64462.getClass(), "specificScopeTarget", null);
        setField(term64462, term64462.getClass(), "parser", null);
        setField(term64462, term64462.getClass(), "reader", null);
        setField(term64462, term64462.getClass(), "tokeniser", null);
        setField(term64462, term64462.getClass(), "doc", null);
        setField(term64462, term64462.getClass(), "stack", null);
        setField(term64462, term64462.getClass(), "baseUri", null);
        setField(term64462, term64462.getClass(), "currentToken", null);
        setField(term64462, term64462.getClass(), "settings", null);
        setField(term64462, term64462.getClass(), "start", null);
        setField(term64462, term64462.getClass(), "end", null);
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
            callMethod(klass, "inSpecificScope", argTypes, term64462, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


