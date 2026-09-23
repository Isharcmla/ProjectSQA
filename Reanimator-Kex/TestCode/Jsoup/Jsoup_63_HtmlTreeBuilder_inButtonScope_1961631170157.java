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

public class HtmlTreeBuilder_inButtonScope_1961631170157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65791;

    public HtmlTreeBuilder_inButtonScope_1961631170157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65791 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term65791, term65791.getClass(), "state", null);
        setField(term65791, term65791.getClass(), "originalState", null);
        setBooleanField(term65791, term65791.getClass(), "baseUriSetFromDoc", false);
        setField(term65791, term65791.getClass(), "headElement", null);
        setField(term65791, term65791.getClass(), "formElement", null);
        setField(term65791, term65791.getClass(), "contextElement", null);
        setField(term65791, term65791.getClass(), "formattingElements", null);
        setField(term65791, term65791.getClass(), "pendingTableCharacters", null);
        setField(term65791, term65791.getClass(), "emptyEnd", null);
        setBooleanField(term65791, term65791.getClass(), "framesetOk", false);
        setBooleanField(term65791, term65791.getClass(), "fosterInserts", false);
        setBooleanField(term65791, term65791.getClass(), "fragmentParsing", false);
        setField(term65791, term65791.getClass(), "specificScopeTarget", null);
        setField(term65791, term65791.getClass(), "reader", null);
        setField(term65791, term65791.getClass(), "tokeniser", null);
        setField(term65791, term65791.getClass(), "doc", null);
        setField(term65791, term65791.getClass(), "stack", null);
        setField(term65791, term65791.getClass(), "baseUri", null);
        setField(term65791, term65791.getClass(), "currentToken", null);
        setField(term65791, term65791.getClass(), "errors", null);
        setField(term65791, term65791.getClass(), "settings", null);
        setField(term65791, term65791.getClass(), "start", null);
        setField(term65791, term65791.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "inButtonScope", argTypes, term65791, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


