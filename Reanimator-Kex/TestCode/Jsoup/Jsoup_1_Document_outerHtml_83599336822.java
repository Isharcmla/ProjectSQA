package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Document_outerHtml_83599336822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term911;

    public Document_outerHtml_83599336822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term933 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term933, term933.getClass(), "tagName", null);
        setBooleanField(term933, term933.getClass(), "isBlock", false);
        setBooleanField(term933, term933.getClass(), "canContainBlock", true);
        setBooleanField(term933, term933.getClass(), "canContainInline", false);
        setBooleanField(term933, term933.getClass(), "optionalClosing", false);
        setBooleanField(term933, term933.getClass(), "empty", true);
        setBooleanField(term933, term933.getClass(), "preserveWhitespace", false);
        setField(term933, term933.getClass(), "ancestors", null);
        Object term940 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term940, term940.getClass(), "tagName", null);
        setBooleanField(term940, term940.getClass(), "isBlock", false);
        setBooleanField(term940, term940.getClass(), "canContainBlock", false);
        setBooleanField(term940, term940.getClass(), "canContainInline", false);
        setBooleanField(term940, term940.getClass(), "optionalClosing", false);
        setBooleanField(term940, term940.getClass(), "empty", false);
        setBooleanField(term940, term940.getClass(), "preserveWhitespace", true);
        setField(term940, term940.getClass(), "ancestors", null);
        Object term947 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term947, term947.getClass(), "tagName", null);
        setBooleanField(term947, term947.getClass(), "isBlock", true);
        setBooleanField(term947, term947.getClass(), "canContainBlock", true);
        setBooleanField(term947, term947.getClass(), "canContainInline", false);
        setBooleanField(term947, term947.getClass(), "optionalClosing", true);
        setBooleanField(term947, term947.getClass(), "empty", true);
        setBooleanField(term947, term947.getClass(), "preserveWhitespace", false);
        setField(term947, term947.getClass(), "ancestors", null);
        Object term954 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term954, term954.getClass(), "tagName", null);
        setBooleanField(term954, term954.getClass(), "isBlock", true);
        setBooleanField(term954, term954.getClass(), "canContainBlock", false);
        setBooleanField(term954, term954.getClass(), "canContainInline", true);
        setBooleanField(term954, term954.getClass(), "optionalClosing", false);
        setBooleanField(term954, term954.getClass(), "empty", true);
        setBooleanField(term954, term954.getClass(), "preserveWhitespace", false);
        setField(term954, term954.getClass(), "ancestors", null);
        Object term961 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term961, term961.getClass(), "tagName", null);
        setBooleanField(term961, term961.getClass(), "isBlock", true);
        setBooleanField(term961, term961.getClass(), "canContainBlock", true);
        setBooleanField(term961, term961.getClass(), "canContainInline", true);
        setBooleanField(term961, term961.getClass(), "optionalClosing", false);
        setBooleanField(term961, term961.getClass(), "empty", false);
        setBooleanField(term961, term961.getClass(), "preserveWhitespace", false);
        setField(term961, term961.getClass(), "ancestors", null);
        Object term968 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term968, term968.getClass(), "tagName", null);
        setBooleanField(term968, term968.getClass(), "isBlock", false);
        setBooleanField(term968, term968.getClass(), "canContainBlock", false);
        setBooleanField(term968, term968.getClass(), "canContainInline", true);
        setBooleanField(term968, term968.getClass(), "optionalClosing", false);
        setBooleanField(term968, term968.getClass(), "empty", false);
        setBooleanField(term968, term968.getClass(), "preserveWhitespace", true);
        setField(term968, term968.getClass(), "ancestors", null);
        ArrayList term931 = new ArrayList();
        ((ArrayList) term931).add(term933);
        ((ArrayList) term931).add(term940);
        ((ArrayList) term931).add(term947);
        ((ArrayList) term931).add(term954);
        ((ArrayList) term931).add(term961);
        ((ArrayList) term931).add(term933);
        ((ArrayList) term931).add(term968);
        HashMap term978 = new HashMap();
        Set<Object> term5563 =  ((Map) term978).keySet();
        HashSet term977 = new HashSet((Collection<? extends Object>) term5563);
        ArrayList term1000 = new ArrayList();
        ((ArrayList) term1000).add((Object)null);
        ((ArrayList) term1000).add((Object)null);
        ((ArrayList) term1000).add((Object)null);
        ((ArrayList) term1000).add((Object)null);
        ((ArrayList) term1000).add((Object)null);
        ((ArrayList) term1000).add((Object)null);
        ((ArrayList) term1000).add((Object)null);
        LinkedHashMap term1005 = new LinkedHashMap();
        term911 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term912 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1004 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term912, term912.getClass(), "tagName", "MvRIxilFMJ");
        setBooleanField(term912, term912.getClass(), "isBlock", false);
        setBooleanField(term912, term912.getClass(), "canContainBlock", true);
        setBooleanField(term912, term912.getClass(), "canContainInline", false);
        setBooleanField(term912, term912.getClass(), "optionalClosing", true);
        setBooleanField(term912, term912.getClass(), "empty", true);
        setBooleanField(term912, term912.getClass(), "preserveWhitespace", false);
        setField(term912, term912.getClass(), "ancestors", term931);
        setField(term911, term911.getClass(), "tag", term912);
        setField(term911, term911.getClass(), "classNames", term977);
        setField(term911, term911.getClass(), "parentNode", null);
        setField(term911, term911.getClass(), "childNodes", term1000);
        setField(term1004, term1004.getClass(), "attributes", term1005);
        setField(term911, term911.getClass(), "attributes", term1004);
        setField(term911, term911.getClass(), "baseUri", "gCWtLVKVVe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "outerHtml", argTypes, term911, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
