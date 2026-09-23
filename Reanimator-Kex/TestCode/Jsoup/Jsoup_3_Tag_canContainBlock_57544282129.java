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

public class Tag_canContainBlock_57544282129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term353;
     Object term2463;

    public Tag_canContainBlock_57544282129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term382 = new ArrayList();
        ((ArrayList) term382).add((Object)null);
        ((ArrayList) term382).add((Object)null);
        ((ArrayList) term382).add((Object)null);
        ((ArrayList) term382).add((Object)null);
        ((ArrayList) term382).add((Object)null);
        ((ArrayList) term382).add((Object)null);
        ((ArrayList) term382).add((Object)null);
        ((ArrayList) term382).add((Object)null);
        Object term374 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term374, term374.getClass(), "tagName", "");
        setBooleanField(term374, term374.getClass(), "isBlock", false);
        setBooleanField(term374, term374.getClass(), "canContainBlock", false);
        setBooleanField(term374, term374.getClass(), "canContainInline", false);
        setBooleanField(term374, term374.getClass(), "optionalClosing", false);
        setBooleanField(term374, term374.getClass(), "empty", false);
        setBooleanField(term374, term374.getClass(), "preserveWhitespace", false);
        setField(term374, term374.getClass(), "ancestors", term382);
        ArrayList term393 = new ArrayList();
        ((ArrayList) term393).add((Object)null);
        ((ArrayList) term393).add((Object)null);
        ((ArrayList) term393).add((Object)null);
        ((ArrayList) term393).add((Object)null);
        ((ArrayList) term393).add((Object)null);
        ((ArrayList) term393).add((Object)null);
        ((ArrayList) term393).add((Object)null);
        ((ArrayList) term393).add((Object)null);
        ((ArrayList) term393).add((Object)null);
        Object term385 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term385, term385.getClass(), "tagName", "");
        setBooleanField(term385, term385.getClass(), "isBlock", true);
        setBooleanField(term385, term385.getClass(), "canContainBlock", true);
        setBooleanField(term385, term385.getClass(), "canContainInline", true);
        setBooleanField(term385, term385.getClass(), "optionalClosing", false);
        setBooleanField(term385, term385.getClass(), "empty", false);
        setBooleanField(term385, term385.getClass(), "preserveWhitespace", false);
        setField(term385, term385.getClass(), "ancestors", term393);
        ArrayList term404 = new ArrayList();
        ((ArrayList) term404).add((Object)null);
        ((ArrayList) term404).add((Object)null);
        ((ArrayList) term404).add((Object)null);
        ((ArrayList) term404).add((Object)null);
        ((ArrayList) term404).add((Object)null);
        ((ArrayList) term404).add((Object)null);
        Object term396 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term396, term396.getClass(), "tagName", "");
        setBooleanField(term396, term396.getClass(), "isBlock", false);
        setBooleanField(term396, term396.getClass(), "canContainBlock", false);
        setBooleanField(term396, term396.getClass(), "canContainInline", false);
        setBooleanField(term396, term396.getClass(), "optionalClosing", false);
        setBooleanField(term396, term396.getClass(), "empty", true);
        setBooleanField(term396, term396.getClass(), "preserveWhitespace", true);
        setField(term396, term396.getClass(), "ancestors", term404);
        ArrayList term372 = new ArrayList();
        ((ArrayList) term372).add(term374);
        ((ArrayList) term372).add(term385);
        ((ArrayList) term372).add(term396);
        ((ArrayList) term372).add(term353);
        term353 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term353, term353.getClass(), "tagName", "gGSMzuGICf");
        setBooleanField(term353, term353.getClass(), "isBlock", false);
        setBooleanField(term353, term353.getClass(), "canContainBlock", true);
        setBooleanField(term353, term353.getClass(), "canContainInline", false);
        setBooleanField(term353, term353.getClass(), "optionalClosing", false);
        setBooleanField(term353, term353.getClass(), "empty", true);
        setBooleanField(term353, term353.getClass(), "preserveWhitespace", false);
        setField(term353, term353.getClass(), "ancestors", term372);
        ArrayList term2470 = new ArrayList();
        ((ArrayList) term2470).add((Object)null);
        ((ArrayList) term2470).add((Object)null);
        ((ArrayList) term2470).add((Object)null);
        ((ArrayList) term2470).add((Object)null);
        ((ArrayList) term2470).add((Object)null);
        ((ArrayList) term2470).add((Object)null);
        ((ArrayList) term2470).add((Object)null);
        ((ArrayList) term2470).add((Object)null);
        Object term2468 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2468, term2468.getClass(), "tagName", "");
        setBooleanField(term2468, term2468.getClass(), "isBlock", false);
        setBooleanField(term2468, term2468.getClass(), "canContainBlock", false);
        setBooleanField(term2468, term2468.getClass(), "canContainInline", false);
        setBooleanField(term2468, term2468.getClass(), "optionalClosing", false);
        setBooleanField(term2468, term2468.getClass(), "empty", false);
        setBooleanField(term2468, term2468.getClass(), "preserveWhitespace", false);
        setField(term2468, term2468.getClass(), "ancestors", term2470);
        ArrayList term2473 = new ArrayList();
        ((ArrayList) term2473).add((Object)null);
        ((ArrayList) term2473).add((Object)null);
        ((ArrayList) term2473).add((Object)null);
        ((ArrayList) term2473).add((Object)null);
        ((ArrayList) term2473).add((Object)null);
        ((ArrayList) term2473).add((Object)null);
        ((ArrayList) term2473).add((Object)null);
        ((ArrayList) term2473).add((Object)null);
        ((ArrayList) term2473).add((Object)null);
        Object term2471 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2471, term2471.getClass(), "tagName", "");
        setBooleanField(term2471, term2471.getClass(), "isBlock", true);
        setBooleanField(term2471, term2471.getClass(), "canContainBlock", true);
        setBooleanField(term2471, term2471.getClass(), "canContainInline", true);
        setBooleanField(term2471, term2471.getClass(), "optionalClosing", false);
        setBooleanField(term2471, term2471.getClass(), "empty", false);
        setBooleanField(term2471, term2471.getClass(), "preserveWhitespace", false);
        setField(term2471, term2471.getClass(), "ancestors", term2473);
        ArrayList term2476 = new ArrayList();
        ((ArrayList) term2476).add((Object)null);
        ((ArrayList) term2476).add((Object)null);
        ((ArrayList) term2476).add((Object)null);
        ((ArrayList) term2476).add((Object)null);
        ((ArrayList) term2476).add((Object)null);
        ((ArrayList) term2476).add((Object)null);
        Object term2474 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2474, term2474.getClass(), "tagName", "");
        setBooleanField(term2474, term2474.getClass(), "isBlock", false);
        setBooleanField(term2474, term2474.getClass(), "canContainBlock", false);
        setBooleanField(term2474, term2474.getClass(), "canContainInline", false);
        setBooleanField(term2474, term2474.getClass(), "optionalClosing", false);
        setBooleanField(term2474, term2474.getClass(), "empty", true);
        setBooleanField(term2474, term2474.getClass(), "preserveWhitespace", true);
        setField(term2474, term2474.getClass(), "ancestors", term2476);
        ArrayList term2466 = new ArrayList();
        ((ArrayList) term2466).add(term2468);
        ((ArrayList) term2466).add(term2471);
        ((ArrayList) term2466).add(term2474);
        ((ArrayList) term2466).add((Object)null);
        term2463 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2463, term2463.getClass(), "tagName", "gGSMzuGICf");
        setBooleanField(term2463, term2463.getClass(), "isBlock", false);
        setBooleanField(term2463, term2463.getClass(), "canContainBlock", true);
        setBooleanField(term2463, term2463.getClass(), "canContainInline", false);
        setBooleanField(term2463, term2463.getClass(), "optionalClosing", false);
        setBooleanField(term2463, term2463.getClass(), "empty", true);
        setBooleanField(term2463, term2463.getClass(), "preserveWhitespace", false);
        setField(term2463, term2463.getClass(), "ancestors", term2466);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "canContainBlock", argTypes, term353, args);
        assertTrue(recursiveEquals(term353, term2463));
    }

};


