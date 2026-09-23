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

public class Element_text_125384701748 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5457;

    public Element_text_125384701748() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5479 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term5479, term5479.getClass(), "tagName", null);
        setBooleanField(term5479, term5479.getClass(), "isBlock", true);
        setBooleanField(term5479, term5479.getClass(), "canContainBlock", false);
        setBooleanField(term5479, term5479.getClass(), "canContainInline", false);
        setBooleanField(term5479, term5479.getClass(), "optionalClosing", true);
        setBooleanField(term5479, term5479.getClass(), "empty", false);
        setBooleanField(term5479, term5479.getClass(), "preserveWhitespace", true);
        setField(term5479, term5479.getClass(), "ancestors", null);
        Object term5486 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term5486, term5486.getClass(), "tagName", null);
        setBooleanField(term5486, term5486.getClass(), "isBlock", true);
        setBooleanField(term5486, term5486.getClass(), "canContainBlock", false);
        setBooleanField(term5486, term5486.getClass(), "canContainInline", false);
        setBooleanField(term5486, term5486.getClass(), "optionalClosing", true);
        setBooleanField(term5486, term5486.getClass(), "empty", false);
        setBooleanField(term5486, term5486.getClass(), "preserveWhitespace", false);
        setField(term5486, term5486.getClass(), "ancestors", null);
        Object term5493 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term5493, term5493.getClass(), "tagName", null);
        setBooleanField(term5493, term5493.getClass(), "isBlock", true);
        setBooleanField(term5493, term5493.getClass(), "canContainBlock", false);
        setBooleanField(term5493, term5493.getClass(), "canContainInline", false);
        setBooleanField(term5493, term5493.getClass(), "optionalClosing", false);
        setBooleanField(term5493, term5493.getClass(), "empty", false);
        setBooleanField(term5493, term5493.getClass(), "preserveWhitespace", false);
        setField(term5493, term5493.getClass(), "ancestors", null);
        ArrayList term5477 = new ArrayList();
        ((ArrayList) term5477).add(term5479);
        ((ArrayList) term5477).add(term5479);
        ((ArrayList) term5477).add(term5486);
        ((ArrayList) term5477).add(term5493);
        HashMap term5503 = new HashMap();
        Set<Object> term5564 =  ((Map) term5503).keySet();
        HashSet term5502 = new HashSet((Collection<? extends Object>) term5564);
        ArrayList term5519 = new ArrayList();
        ((ArrayList) term5519).add((Object)null);
        ((ArrayList) term5519).add((Object)null);
        ((ArrayList) term5519).add((Object)null);
        ((ArrayList) term5519).add((Object)null);
        LinkedHashMap term5524 = new LinkedHashMap();
        term5457 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5458 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5523 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5458, term5458.getClass(), "tagName", "BOvgwHfoHQ");
        setBooleanField(term5458, term5458.getClass(), "isBlock", true);
        setBooleanField(term5458, term5458.getClass(), "canContainBlock", true);
        setBooleanField(term5458, term5458.getClass(), "canContainInline", false);
        setBooleanField(term5458, term5458.getClass(), "optionalClosing", false);
        setBooleanField(term5458, term5458.getClass(), "empty", false);
        setBooleanField(term5458, term5458.getClass(), "preserveWhitespace", true);
        setField(term5458, term5458.getClass(), "ancestors", term5477);
        setField(term5457, term5457.getClass(), "tag", term5458);
        setField(term5457, term5457.getClass(), "classNames", term5502);
        setField(term5457, term5457.getClass(), "parentNode", null);
        setField(term5457, term5457.getClass(), "childNodes", term5519);
        setField(term5523, term5523.getClass(), "attributes", term5524);
        setField(term5457, term5457.getClass(), "attributes", term5523);
        setField(term5457, term5457.getClass(), "baseUri", "HvxahUfZcJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WkLpmqoQxy";
        callMethod(klass, "text", argTypes, term5457, args);
    }

};


