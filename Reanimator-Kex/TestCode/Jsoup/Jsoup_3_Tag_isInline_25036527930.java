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

public class Tag_isInline_25036527930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term419;
     Object term2554;

    public Tag_isInline_25036527930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term448 = new ArrayList();
        ((ArrayList) term448).add((Object)null);
        ((ArrayList) term448).add((Object)null);
        ((ArrayList) term448).add((Object)null);
        ((ArrayList) term448).add((Object)null);
        Object term440 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term440, term440.getClass(), "tagName", "");
        setBooleanField(term440, term440.getClass(), "isBlock", false);
        setBooleanField(term440, term440.getClass(), "canContainBlock", false);
        setBooleanField(term440, term440.getClass(), "canContainInline", true);
        setBooleanField(term440, term440.getClass(), "optionalClosing", true);
        setBooleanField(term440, term440.getClass(), "empty", true);
        setBooleanField(term440, term440.getClass(), "preserveWhitespace", true);
        setField(term440, term440.getClass(), "ancestors", term448);
        ArrayList term459 = new ArrayList();
        ((ArrayList) term459).add((Object)null);
        ((ArrayList) term459).add((Object)null);
        Object term451 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term451, term451.getClass(), "tagName", "");
        setBooleanField(term451, term451.getClass(), "isBlock", false);
        setBooleanField(term451, term451.getClass(), "canContainBlock", true);
        setBooleanField(term451, term451.getClass(), "canContainInline", true);
        setBooleanField(term451, term451.getClass(), "optionalClosing", false);
        setBooleanField(term451, term451.getClass(), "empty", true);
        setBooleanField(term451, term451.getClass(), "preserveWhitespace", true);
        setField(term451, term451.getClass(), "ancestors", term459);
        ArrayList term438 = new ArrayList();
        ((ArrayList) term438).add(term440);
        ((ArrayList) term438).add(term440);
        ((ArrayList) term438).add(term451);
        term419 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term419, term419.getClass(), "tagName", "UoYtihxVaS");
        setBooleanField(term419, term419.getClass(), "isBlock", true);
        setBooleanField(term419, term419.getClass(), "canContainBlock", true);
        setBooleanField(term419, term419.getClass(), "canContainInline", true);
        setBooleanField(term419, term419.getClass(), "optionalClosing", true);
        setBooleanField(term419, term419.getClass(), "empty", false);
        setBooleanField(term419, term419.getClass(), "preserveWhitespace", true);
        setField(term419, term419.getClass(), "ancestors", term438);
        ArrayList term2561 = new ArrayList();
        ((ArrayList) term2561).add((Object)null);
        ((ArrayList) term2561).add((Object)null);
        ((ArrayList) term2561).add((Object)null);
        ((ArrayList) term2561).add((Object)null);
        Object term2559 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2559, term2559.getClass(), "tagName", "");
        setBooleanField(term2559, term2559.getClass(), "isBlock", false);
        setBooleanField(term2559, term2559.getClass(), "canContainBlock", false);
        setBooleanField(term2559, term2559.getClass(), "canContainInline", true);
        setBooleanField(term2559, term2559.getClass(), "optionalClosing", true);
        setBooleanField(term2559, term2559.getClass(), "empty", true);
        setBooleanField(term2559, term2559.getClass(), "preserveWhitespace", true);
        setField(term2559, term2559.getClass(), "ancestors", term2561);
        ArrayList term2564 = new ArrayList();
        ((ArrayList) term2564).add((Object)null);
        ((ArrayList) term2564).add((Object)null);
        Object term2562 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2562, term2562.getClass(), "tagName", "");
        setBooleanField(term2562, term2562.getClass(), "isBlock", false);
        setBooleanField(term2562, term2562.getClass(), "canContainBlock", true);
        setBooleanField(term2562, term2562.getClass(), "canContainInline", true);
        setBooleanField(term2562, term2562.getClass(), "optionalClosing", false);
        setBooleanField(term2562, term2562.getClass(), "empty", true);
        setBooleanField(term2562, term2562.getClass(), "preserveWhitespace", true);
        setField(term2562, term2562.getClass(), "ancestors", term2564);
        ArrayList term2557 = new ArrayList();
        ((ArrayList) term2557).add(term2559);
        ((ArrayList) term2557).add(term2559);
        ((ArrayList) term2557).add(term2562);
        term2554 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2554, term2554.getClass(), "tagName", "UoYtihxVaS");
        setBooleanField(term2554, term2554.getClass(), "isBlock", true);
        setBooleanField(term2554, term2554.getClass(), "canContainBlock", true);
        setBooleanField(term2554, term2554.getClass(), "canContainInline", true);
        setBooleanField(term2554, term2554.getClass(), "optionalClosing", true);
        setBooleanField(term2554, term2554.getClass(), "empty", false);
        setBooleanField(term2554, term2554.getClass(), "preserveWhitespace", true);
        setField(term2554, term2554.getClass(), "ancestors", term2557);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isInline", argTypes, term419, args);
        assertTrue(recursiveEquals(term419, term2554));
        assertTrue(recursiveEquals(retValue, false));
    }

};


