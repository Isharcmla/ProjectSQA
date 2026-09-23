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
import java.util.LinkedHashMap;

public class Element_parents_1239311084104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term848;
     Object term10030;
     Object term9978;

    public Element_parents_1239311084104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term871 = new ArrayList();
        ((ArrayList) term871).add((Object)null);
        LinkedHashMap term876 = new LinkedHashMap();
        term848 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term849 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term875 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term849, term849.getClass(), "tagName", "YRHGsAkhxb");
        setBooleanField(term849, term849.getClass(), "isBlock", false);
        setBooleanField(term849, term849.getClass(), "formatAsBlock", true);
        setBooleanField(term849, term849.getClass(), "canContainBlock", true);
        setBooleanField(term849, term849.getClass(), "canContainInline", false);
        setBooleanField(term849, term849.getClass(), "empty", false);
        setBooleanField(term849, term849.getClass(), "selfClosing", true);
        setBooleanField(term849, term849.getClass(), "preserveWhitespace", true);
        setBooleanField(term849, term849.getClass(), "formList", true);
        setBooleanField(term849, term849.getClass(), "formSubmit", false);
        setField(term848, term848.getClass(), "tag", term849);
        setField(term848, term848.getClass(), "parentNode", null);
        setField(term848, term848.getClass(), "childNodes", term871);
        setField(term875, term875.getClass(), "attributes", term876);
        setField(term848, term848.getClass(), "attributes", term875);
        setField(term848, term848.getClass(), "baseUri", "nHXjMycHlU");
        setIntField(term848, term848.getClass(), "siblingIndex", -1339778481);
        ArrayList term10034 = new ArrayList();
        ((ArrayList) term10034).add((Object)null);
        LinkedHashMap term10037 = new LinkedHashMap();
        term10030 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term10031 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term10036 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term10031, term10031.getClass(), "tagName", "YRHGsAkhxb");
        setBooleanField(term10031, term10031.getClass(), "isBlock", false);
        setBooleanField(term10031, term10031.getClass(), "formatAsBlock", true);
        setBooleanField(term10031, term10031.getClass(), "canContainBlock", true);
        setBooleanField(term10031, term10031.getClass(), "canContainInline", false);
        setBooleanField(term10031, term10031.getClass(), "empty", false);
        setBooleanField(term10031, term10031.getClass(), "selfClosing", true);
        setBooleanField(term10031, term10031.getClass(), "preserveWhitespace", true);
        setBooleanField(term10031, term10031.getClass(), "formList", true);
        setBooleanField(term10031, term10031.getClass(), "formSubmit", false);
        setField(term10030, term10030.getClass(), "tag", term10031);
        setField(term10030, term10030.getClass(), "parentNode", null);
        setField(term10030, term10030.getClass(), "childNodes", term10034);
        setField(term10036, term10036.getClass(), "attributes", term10037);
        setField(term10030, term10030.getClass(), "attributes", term10036);
        setField(term10030, term10030.getClass(), "baseUri", "nHXjMycHlU");
        setIntField(term10030, term10030.getClass(), "siblingIndex", -1339778481);
        term9978 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term9979 = (Object[]) newArray("java.lang.Object", 0);
        setField(term9978, term9978.getClass(), "elementData", term9979);
        setIntField(term9978, term9978.getClass(), "size", 0);
        setIntField(term9978, term9978.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "parents", argTypes, term848, args);
        assertTrue(recursiveEquals(term848, term10030));
        assertTrue(recursiveEquals(retValue, term9978));
    }

};


