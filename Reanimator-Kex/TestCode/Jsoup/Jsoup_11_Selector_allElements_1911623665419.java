package org.jsoup.select;

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
import static org.jsoup.select.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.select.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;

public class Selector_allElements_1911623665419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term729081;
     Object term755453;
     Object term755442;

    public Selector_allElements_1911623665419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term729185 = new ArrayList();
        term729081 = newInstance(Class.forName("org.jsoup.select.Selector"));
        Object term729133 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term729133, term729133.getClass(), "childNodes", term729185);
        setField(term729081, term729081.getClass(), "root", term729133);
        ArrayList term755455 = new ArrayList();
        term755453 = newInstance(Class.forName("org.jsoup.select.Selector"));
        Object term755454 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term755454, term755454.getClass(), "tag", null);
        setField(term755454, term755454.getClass(), "classNames", null);
        setField(term755454, term755454.getClass(), "parentNode", null);
        setField(term755454, term755454.getClass(), "childNodes", term755455);
        setField(term755454, term755454.getClass(), "attributes", null);
        setField(term755454, term755454.getClass(), "baseUri", null);
        setIntField(term755454, term755454.getClass(), "siblingIndex", 0);
        setField(term755453, term755453.getClass(), "root", term755454);
        setField(term755453, term755453.getClass(), "elements", null);
        setField(term755453, term755453.getClass(), "query", null);
        setField(term755453, term755453.getClass(), "tq", null);
        ArrayList term755446 = new ArrayList();
        Object term755445 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term755445, term755445.getClass(), "tag", null);
        setField(term755445, term755445.getClass(), "classNames", null);
        setField(term755445, term755445.getClass(), "parentNode", null);
        setField(term755445, term755445.getClass(), "childNodes", term755446);
        setField(term755445, term755445.getClass(), "attributes", null);
        setField(term755445, term755445.getClass(), "baseUri", null);
        setIntField(term755445, term755445.getClass(), "siblingIndex", 0);
        ArrayList term755443 = new ArrayList();
        ((ArrayList) term755443).add(term755445);
        term755442 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term755442, term755442.getClass(), "contents", term755443);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "allElements", argTypes, term729081, args);
        assertTrue(recursiveEquals(term729081, term755453));
        assertTrue(recursiveEquals(retValue, term755442));
    }

};


