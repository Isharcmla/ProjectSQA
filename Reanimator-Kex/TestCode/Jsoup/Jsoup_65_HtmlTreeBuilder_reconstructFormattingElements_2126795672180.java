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

public class HtmlTreeBuilder_reconstructFormattingElements_2126795672180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93662;

    public HtmlTreeBuilder_reconstructFormattingElements_2126795672180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93662 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term93662, term93662.getClass(), "state", null);
        setField(term93662, term93662.getClass(), "originalState", null);
        setBooleanField(term93662, term93662.getClass(), "baseUriSetFromDoc", false);
        setField(term93662, term93662.getClass(), "headElement", null);
        setField(term93662, term93662.getClass(), "formElement", null);
        setField(term93662, term93662.getClass(), "contextElement", null);
        setField(term93662, term93662.getClass(), "formattingElements", null);
        setField(term93662, term93662.getClass(), "pendingTableCharacters", null);
        setField(term93662, term93662.getClass(), "emptyEnd", null);
        setBooleanField(term93662, term93662.getClass(), "framesetOk", false);
        setBooleanField(term93662, term93662.getClass(), "fosterInserts", false);
        setBooleanField(term93662, term93662.getClass(), "fragmentParsing", false);
        setField(term93662, term93662.getClass(), "specificScopeTarget", null);
        setField(term93662, term93662.getClass(), "reader", null);
        setField(term93662, term93662.getClass(), "tokeniser", null);
        setField(term93662, term93662.getClass(), "doc", null);
        setField(term93662, term93662.getClass(), "stack", null);
        setField(term93662, term93662.getClass(), "baseUri", null);
        setField(term93662, term93662.getClass(), "currentToken", null);
        setField(term93662, term93662.getClass(), "errors", null);
        setField(term93662, term93662.getClass(), "settings", null);
        setField(term93662, term93662.getClass(), "start", null);
        setField(term93662, term93662.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "reconstructFormattingElements", argTypes, term93662, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


