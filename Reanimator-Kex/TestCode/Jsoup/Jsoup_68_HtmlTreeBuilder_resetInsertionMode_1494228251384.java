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
import java.lang.Object;
import java.lang.String;

public class HtmlTreeBuilder_resetInsertionMode_1494228251384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term307906;
     Object term308247;

    public HtmlTreeBuilder_resetInsertionMode_1494228251384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term308048 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term308094 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term308094, term308094.getClass(), "tagName", "body");
        setField(term308048, term308048.getClass(), "tag", term308094);
        ArrayList term307958 = new ArrayList();
        ((ArrayList) term307958).add("table");
        ((ArrayList) term307958).add(term308048);
        term307906 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term307906, term307906.getClass(), "stack", term307958);
        Class<? extends Object> term308267 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term308266 = ((Class) term308267).getDeclaredField((String) "InBody");
        ((Field) term308266).setAccessible(true);
        Object enum586 = ((Field) term308266).get((Object) null);
        Object term308255 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term308256 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term308256, term308256.getClass(), "tagName", null);
        setBooleanField(term308256, term308256.getClass(), "isBlock", false);
        setBooleanField(term308256, term308256.getClass(), "formatAsBlock", false);
        setBooleanField(term308256, term308256.getClass(), "canContainInline", false);
        setBooleanField(term308256, term308256.getClass(), "empty", false);
        setBooleanField(term308256, term308256.getClass(), "selfClosing", false);
        setBooleanField(term308256, term308256.getClass(), "preserveWhitespace", false);
        setBooleanField(term308256, term308256.getClass(), "formList", false);
        setBooleanField(term308256, term308256.getClass(), "formSubmit", false);
        setField(term308255, term308255.getClass(), "tag", term308256);
        setField(term308255, term308255.getClass(), "shadowChildrenRef", null);
        setField(term308255, term308255.getClass(), "childNodes", null);
        setField(term308255, term308255.getClass(), "attributes", null);
        setField(term308255, term308255.getClass(), "baseUri", null);
        setField(term308255, term308255.getClass(), "parentNode", null);
        setIntField(term308255, term308255.getClass(), "siblingIndex", 0);
        ArrayList term308251 = new ArrayList();
        ((ArrayList) term308251).add("table");
        ((ArrayList) term308251).add(term308255);
        term308247 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term308247, term308247.getClass(), "state", enum586);
        setField(term308247, term308247.getClass(), "originalState", null);
        setBooleanField(term308247, term308247.getClass(), "baseUriSetFromDoc", false);
        setField(term308247, term308247.getClass(), "headElement", null);
        setField(term308247, term308247.getClass(), "formElement", null);
        setField(term308247, term308247.getClass(), "contextElement", null);
        setField(term308247, term308247.getClass(), "formattingElements", null);
        setField(term308247, term308247.getClass(), "pendingTableCharacters", null);
        setField(term308247, term308247.getClass(), "emptyEnd", null);
        setBooleanField(term308247, term308247.getClass(), "framesetOk", false);
        setBooleanField(term308247, term308247.getClass(), "fosterInserts", false);
        setBooleanField(term308247, term308247.getClass(), "fragmentParsing", false);
        setField(term308247, term308247.getClass(), "specificScopeTarget", null);
        setField(term308247, term308247.getClass(), "reader", null);
        setField(term308247, term308247.getClass(), "tokeniser", null);
        setField(term308247, term308247.getClass(), "doc", null);
        setField(term308247, term308247.getClass(), "stack", term308251);
        setField(term308247, term308247.getClass(), "baseUri", null);
        setField(term308247, term308247.getClass(), "currentToken", null);
        setField(term308247, term308247.getClass(), "errors", null);
        setField(term308247, term308247.getClass(), "settings", null);
        setField(term308247, term308247.getClass(), "start", null);
        setField(term308247, term308247.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "resetInsertionMode", argTypes, term307906, args);
        assertTrue(recursiveEquals(term307906, term308247));
    }

};


