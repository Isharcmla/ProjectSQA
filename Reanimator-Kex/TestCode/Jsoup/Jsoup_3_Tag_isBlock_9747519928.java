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

public class Tag_isBlock_9747519928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276;
     Object term2436;

    public Tag_isBlock_9747519928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term305 = new ArrayList();
        ((ArrayList) term305).add((Object)null);
        ((ArrayList) term305).add((Object)null);
        ((ArrayList) term305).add((Object)null);
        ((ArrayList) term305).add((Object)null);
        ((ArrayList) term305).add((Object)null);
        ((ArrayList) term305).add((Object)null);
        Object term297 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term297, term297.getClass(), "tagName", "");
        setBooleanField(term297, term297.getClass(), "isBlock", true);
        setBooleanField(term297, term297.getClass(), "canContainBlock", true);
        setBooleanField(term297, term297.getClass(), "canContainInline", false);
        setBooleanField(term297, term297.getClass(), "optionalClosing", false);
        setBooleanField(term297, term297.getClass(), "empty", false);
        setBooleanField(term297, term297.getClass(), "preserveWhitespace", false);
        setField(term297, term297.getClass(), "ancestors", term305);
        ArrayList term316 = new ArrayList();
        ((ArrayList) term316).add((Object)null);
        ((ArrayList) term316).add((Object)null);
        ((ArrayList) term316).add((Object)null);
        ((ArrayList) term316).add((Object)null);
        ((ArrayList) term316).add((Object)null);
        Object term308 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term308, term308.getClass(), "tagName", "");
        setBooleanField(term308, term308.getClass(), "isBlock", true);
        setBooleanField(term308, term308.getClass(), "canContainBlock", true);
        setBooleanField(term308, term308.getClass(), "canContainInline", false);
        setBooleanField(term308, term308.getClass(), "optionalClosing", false);
        setBooleanField(term308, term308.getClass(), "empty", false);
        setBooleanField(term308, term308.getClass(), "preserveWhitespace", false);
        setField(term308, term308.getClass(), "ancestors", term316);
        ArrayList term327 = new ArrayList();
        ((ArrayList) term327).add((Object)null);
        ((ArrayList) term327).add((Object)null);
        ((ArrayList) term327).add((Object)null);
        ((ArrayList) term327).add((Object)null);
        ((ArrayList) term327).add((Object)null);
        Object term319 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term319, term319.getClass(), "tagName", "");
        setBooleanField(term319, term319.getClass(), "isBlock", true);
        setBooleanField(term319, term319.getClass(), "canContainBlock", false);
        setBooleanField(term319, term319.getClass(), "canContainInline", false);
        setBooleanField(term319, term319.getClass(), "optionalClosing", true);
        setBooleanField(term319, term319.getClass(), "empty", false);
        setBooleanField(term319, term319.getClass(), "preserveWhitespace", false);
        setField(term319, term319.getClass(), "ancestors", term327);
        ArrayList term338 = new ArrayList();
        ((ArrayList) term338).add((Object)null);
        Object term330 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term330, term330.getClass(), "tagName", "");
        setBooleanField(term330, term330.getClass(), "isBlock", true);
        setBooleanField(term330, term330.getClass(), "canContainBlock", true);
        setBooleanField(term330, term330.getClass(), "canContainInline", true);
        setBooleanField(term330, term330.getClass(), "optionalClosing", true);
        setBooleanField(term330, term330.getClass(), "empty", false);
        setBooleanField(term330, term330.getClass(), "preserveWhitespace", false);
        setField(term330, term330.getClass(), "ancestors", term338);
        ArrayList term295 = new ArrayList();
        ((ArrayList) term295).add(term297);
        ((ArrayList) term295).add(term308);
        ((ArrayList) term295).add(term319);
        ((ArrayList) term295).add(term297);
        ((ArrayList) term295).add(term330);
        ((ArrayList) term295).add(term319);
        term276 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term276, term276.getClass(), "tagName", "AijpHYOFuy");
        setBooleanField(term276, term276.getClass(), "isBlock", false);
        setBooleanField(term276, term276.getClass(), "canContainBlock", true);
        setBooleanField(term276, term276.getClass(), "canContainInline", false);
        setBooleanField(term276, term276.getClass(), "optionalClosing", false);
        setBooleanField(term276, term276.getClass(), "empty", true);
        setBooleanField(term276, term276.getClass(), "preserveWhitespace", true);
        setField(term276, term276.getClass(), "ancestors", term295);
        ArrayList term2443 = new ArrayList();
        ((ArrayList) term2443).add((Object)null);
        ((ArrayList) term2443).add((Object)null);
        ((ArrayList) term2443).add((Object)null);
        ((ArrayList) term2443).add((Object)null);
        ((ArrayList) term2443).add((Object)null);
        ((ArrayList) term2443).add((Object)null);
        Object term2441 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2441, term2441.getClass(), "tagName", "");
        setBooleanField(term2441, term2441.getClass(), "isBlock", true);
        setBooleanField(term2441, term2441.getClass(), "canContainBlock", true);
        setBooleanField(term2441, term2441.getClass(), "canContainInline", false);
        setBooleanField(term2441, term2441.getClass(), "optionalClosing", false);
        setBooleanField(term2441, term2441.getClass(), "empty", false);
        setBooleanField(term2441, term2441.getClass(), "preserveWhitespace", false);
        setField(term2441, term2441.getClass(), "ancestors", term2443);
        ArrayList term2446 = new ArrayList();
        ((ArrayList) term2446).add((Object)null);
        ((ArrayList) term2446).add((Object)null);
        ((ArrayList) term2446).add((Object)null);
        ((ArrayList) term2446).add((Object)null);
        ((ArrayList) term2446).add((Object)null);
        Object term2444 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2444, term2444.getClass(), "tagName", "");
        setBooleanField(term2444, term2444.getClass(), "isBlock", true);
        setBooleanField(term2444, term2444.getClass(), "canContainBlock", true);
        setBooleanField(term2444, term2444.getClass(), "canContainInline", false);
        setBooleanField(term2444, term2444.getClass(), "optionalClosing", false);
        setBooleanField(term2444, term2444.getClass(), "empty", false);
        setBooleanField(term2444, term2444.getClass(), "preserveWhitespace", false);
        setField(term2444, term2444.getClass(), "ancestors", term2446);
        ArrayList term2449 = new ArrayList();
        ((ArrayList) term2449).add((Object)null);
        ((ArrayList) term2449).add((Object)null);
        ((ArrayList) term2449).add((Object)null);
        ((ArrayList) term2449).add((Object)null);
        ((ArrayList) term2449).add((Object)null);
        Object term2447 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2447, term2447.getClass(), "tagName", "");
        setBooleanField(term2447, term2447.getClass(), "isBlock", true);
        setBooleanField(term2447, term2447.getClass(), "canContainBlock", false);
        setBooleanField(term2447, term2447.getClass(), "canContainInline", false);
        setBooleanField(term2447, term2447.getClass(), "optionalClosing", true);
        setBooleanField(term2447, term2447.getClass(), "empty", false);
        setBooleanField(term2447, term2447.getClass(), "preserveWhitespace", false);
        setField(term2447, term2447.getClass(), "ancestors", term2449);
        ArrayList term2452 = new ArrayList();
        ((ArrayList) term2452).add((Object)null);
        Object term2450 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2450, term2450.getClass(), "tagName", "");
        setBooleanField(term2450, term2450.getClass(), "isBlock", true);
        setBooleanField(term2450, term2450.getClass(), "canContainBlock", true);
        setBooleanField(term2450, term2450.getClass(), "canContainInline", true);
        setBooleanField(term2450, term2450.getClass(), "optionalClosing", true);
        setBooleanField(term2450, term2450.getClass(), "empty", false);
        setBooleanField(term2450, term2450.getClass(), "preserveWhitespace", false);
        setField(term2450, term2450.getClass(), "ancestors", term2452);
        ArrayList term2439 = new ArrayList();
        ((ArrayList) term2439).add(term2441);
        ((ArrayList) term2439).add(term2444);
        ((ArrayList) term2439).add(term2447);
        ((ArrayList) term2439).add(term2441);
        ((ArrayList) term2439).add(term2450);
        ((ArrayList) term2439).add(term2447);
        term2436 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2436, term2436.getClass(), "tagName", "AijpHYOFuy");
        setBooleanField(term2436, term2436.getClass(), "isBlock", false);
        setBooleanField(term2436, term2436.getClass(), "canContainBlock", true);
        setBooleanField(term2436, term2436.getClass(), "canContainInline", false);
        setBooleanField(term2436, term2436.getClass(), "optionalClosing", false);
        setBooleanField(term2436, term2436.getClass(), "empty", true);
        setBooleanField(term2436, term2436.getClass(), "preserveWhitespace", true);
        setField(term2436, term2436.getClass(), "ancestors", term2439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBlock", argTypes, term276, args);
        assertTrue(recursiveEquals(term276, term2436));
    }

};


