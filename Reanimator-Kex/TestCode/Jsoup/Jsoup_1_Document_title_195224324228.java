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
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;

public class Document_title_195224324228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9034;
     Object term14381;

    public Document_title_195224324228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term9170 = new ArrayList();
        ((ArrayList) term9170).add((Object)null);
        term9034 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term9080 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term9080, term9080.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        setField(term9034, term9034.getClass(), "tag", term9080);
        setField(term9034, term9034.getClass(), "childNodes", term9170);
        ArrayList term14385 = new ArrayList();
        ((ArrayList) term14385).add((Object)null);
        term14381 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term14382 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term14382, term14382.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        setBooleanField(term14382, term14382.getClass(), "isBlock", false);
        setBooleanField(term14382, term14382.getClass(), "canContainBlock", false);
        setBooleanField(term14382, term14382.getClass(), "canContainInline", false);
        setBooleanField(term14382, term14382.getClass(), "optionalClosing", false);
        setBooleanField(term14382, term14382.getClass(), "empty", false);
        setBooleanField(term14382, term14382.getClass(), "preserveWhitespace", false);
        setField(term14382, term14382.getClass(), "ancestors", null);
        setField(term14381, term14381.getClass(), "tag", term14382);
        setField(term14381, term14381.getClass(), "classNames", null);
        setField(term14381, term14381.getClass(), "parentNode", null);
        setField(term14381, term14381.getClass(), "childNodes", term14385);
        setField(term14381, term14381.getClass(), "attributes", null);
        setField(term14381, term14381.getClass(), "baseUri", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "title", argTypes, term9034, args);
        assertTrue(recursiveEquals(term9034, term14381));
        assertTrue(recursiveEquals(retValue, ""));
    }

};
