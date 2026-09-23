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
import java.lang.Object;

public class HtmlTreeBuilder_isSameFormattingElement_651705163261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term454190;
     Object term454242;
     Object term454378;
     Object term454552;
     Object term454553;
     Object term454560;

    public HtmlTreeBuilder_isSameFormattingElement_651705163261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term454190 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        term454242 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term454288 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term454288, term454288.getClass(), "tagName", "");
        setField(term454242, term454242.getClass(), "tag", term454288);
        term454378 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term454424 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term454424, term454424.getClass(), "tagName", "");
        setField(term454378, term454378.getClass(), "tag", term454424);
        term454552 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term454552, term454552.getClass(), "state", null);
        setField(term454552, term454552.getClass(), "originalState", null);
        setBooleanField(term454552, term454552.getClass(), "baseUriSetFromDoc", false);
        setField(term454552, term454552.getClass(), "headElement", null);
        setField(term454552, term454552.getClass(), "formElement", null);
        setField(term454552, term454552.getClass(), "contextElement", null);
        setField(term454552, term454552.getClass(), "formattingElements", null);
        setField(term454552, term454552.getClass(), "pendingTableCharacters", null);
        setField(term454552, term454552.getClass(), "emptyEnd", null);
        setBooleanField(term454552, term454552.getClass(), "framesetOk", false);
        setBooleanField(term454552, term454552.getClass(), "fosterInserts", false);
        setBooleanField(term454552, term454552.getClass(), "fragmentParsing", false);
        setField(term454552, term454552.getClass(), "specificScopeTarget", null);
        setField(term454552, term454552.getClass(), "parser", null);
        setField(term454552, term454552.getClass(), "reader", null);
        setField(term454552, term454552.getClass(), "tokeniser", null);
        setField(term454552, term454552.getClass(), "doc", null);
        setField(term454552, term454552.getClass(), "stack", null);
        setField(term454552, term454552.getClass(), "baseUri", null);
        setField(term454552, term454552.getClass(), "currentToken", null);
        setField(term454552, term454552.getClass(), "settings", null);
        setField(term454552, term454552.getClass(), "start", null);
        setField(term454552, term454552.getClass(), "end", null);
        term454553 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term454554 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term454557 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term454558 = (Object[]) newArray("java.lang.String", 0);
        Object[] term454559 = (Object[]) newArray("java.lang.String", 0);
        setField(term454554, term454554.getClass(), "tagName", "");
        setBooleanField(term454554, term454554.getClass(), "isBlock", false);
        setBooleanField(term454554, term454554.getClass(), "formatAsBlock", false);
        setBooleanField(term454554, term454554.getClass(), "canContainInline", false);
        setBooleanField(term454554, term454554.getClass(), "empty", false);
        setBooleanField(term454554, term454554.getClass(), "selfClosing", false);
        setBooleanField(term454554, term454554.getClass(), "preserveWhitespace", false);
        setBooleanField(term454554, term454554.getClass(), "formList", false);
        setBooleanField(term454554, term454554.getClass(), "formSubmit", false);
        setField(term454553, term454553.getClass(), "tag", term454554);
        setField(term454553, term454553.getClass(), "shadowChildrenRef", null);
        setField(term454553, term454553.getClass(), "childNodes", null);
        setIntField(term454557, term454557.getClass(), "size", 0);
        setField(term454557, term454557.getClass(), "keys", term454558);
        setField(term454557, term454557.getClass(), "vals", term454559);
        setField(term454553, term454553.getClass(), "attributes", term454557);
        setField(term454553, term454553.getClass(), "baseUri", null);
        setField(term454553, term454553.getClass(), "parentNode", null);
        setIntField(term454553, term454553.getClass(), "siblingIndex", 0);
        term454560 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term454561 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term454564 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term454565 = (Object[]) newArray("java.lang.String", 0);
        Object[] term454566 = (Object[]) newArray("java.lang.String", 0);
        setField(term454561, term454561.getClass(), "tagName", "");
        setBooleanField(term454561, term454561.getClass(), "isBlock", false);
        setBooleanField(term454561, term454561.getClass(), "formatAsBlock", false);
        setBooleanField(term454561, term454561.getClass(), "canContainInline", false);
        setBooleanField(term454561, term454561.getClass(), "empty", false);
        setBooleanField(term454561, term454561.getClass(), "selfClosing", false);
        setBooleanField(term454561, term454561.getClass(), "preserveWhitespace", false);
        setBooleanField(term454561, term454561.getClass(), "formList", false);
        setBooleanField(term454561, term454561.getClass(), "formSubmit", false);
        setField(term454560, term454560.getClass(), "tag", term454561);
        setField(term454560, term454560.getClass(), "shadowChildrenRef", null);
        setField(term454560, term454560.getClass(), "childNodes", null);
        setIntField(term454564, term454564.getClass(), "size", 0);
        setField(term454564, term454564.getClass(), "keys", term454565);
        setField(term454564, term454564.getClass(), "vals", term454566);
        setField(term454560, term454560.getClass(), "attributes", term454564);
        setField(term454560, term454560.getClass(), "baseUri", null);
        setField(term454560, term454560.getClass(), "parentNode", null);
        setIntField(term454560, term454560.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[2];
        args[0] = term454242;
        args[1] = term454378;
        Object retValue = callMethod(klass, "isSameFormattingElement", argTypes, term454190, args);
        assertTrue(recursiveEquals(term454190, term454552));
        assertTrue(recursiveEquals(term454242, term454553));
        assertTrue(recursiveEquals(term454378, term454560));
        assertTrue(recursiveEquals(retValue, true));
    }

};


