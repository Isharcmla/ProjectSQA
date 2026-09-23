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

public class HtmlTreeBuilder_removeFromActiveFormattingElements_1580466725182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96419;

    public HtmlTreeBuilder_removeFromActiveFormattingElements_1580466725182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96419 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term96419, term96419.getClass(), "state", null);
        setField(term96419, term96419.getClass(), "originalState", null);
        setBooleanField(term96419, term96419.getClass(), "baseUriSetFromDoc", false);
        setField(term96419, term96419.getClass(), "headElement", null);
        setField(term96419, term96419.getClass(), "formElement", null);
        setField(term96419, term96419.getClass(), "contextElement", null);
        setField(term96419, term96419.getClass(), "formattingElements", null);
        setField(term96419, term96419.getClass(), "pendingTableCharacters", null);
        setField(term96419, term96419.getClass(), "emptyEnd", null);
        setBooleanField(term96419, term96419.getClass(), "framesetOk", false);
        setBooleanField(term96419, term96419.getClass(), "fosterInserts", false);
        setBooleanField(term96419, term96419.getClass(), "fragmentParsing", false);
        setField(term96419, term96419.getClass(), "specificScopeTarget", null);
        setField(term96419, term96419.getClass(), "reader", null);
        setField(term96419, term96419.getClass(), "tokeniser", null);
        setField(term96419, term96419.getClass(), "doc", null);
        setField(term96419, term96419.getClass(), "stack", null);
        setField(term96419, term96419.getClass(), "baseUri", null);
        setField(term96419, term96419.getClass(), "currentToken", null);
        setField(term96419, term96419.getClass(), "errors", null);
        setField(term96419, term96419.getClass(), "settings", null);
        setField(term96419, term96419.getClass(), "start", null);
        setField(term96419, term96419.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "removeFromActiveFormattingElements", argTypes, term96419, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


