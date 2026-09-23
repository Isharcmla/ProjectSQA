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

public class Element_textNodes_938431844108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1068;
     Object term10929;
     Object term10877;

    public Element_textNodes_938431844108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1091 = new ArrayList();
        ((ArrayList) term1091).add((Object)null);
        ((ArrayList) term1091).add((Object)null);
        LinkedHashMap term1096 = new LinkedHashMap();
        term1068 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1069 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1095 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1069, term1069.getClass(), "tagName", "MAcUBcBckh");
        setBooleanField(term1069, term1069.getClass(), "isBlock", true);
        setBooleanField(term1069, term1069.getClass(), "formatAsBlock", false);
        setBooleanField(term1069, term1069.getClass(), "canContainBlock", false);
        setBooleanField(term1069, term1069.getClass(), "canContainInline", true);
        setBooleanField(term1069, term1069.getClass(), "empty", true);
        setBooleanField(term1069, term1069.getClass(), "selfClosing", true);
        setBooleanField(term1069, term1069.getClass(), "preserveWhitespace", false);
        setBooleanField(term1069, term1069.getClass(), "formList", true);
        setBooleanField(term1069, term1069.getClass(), "formSubmit", false);
        setField(term1068, term1068.getClass(), "tag", term1069);
        setField(term1068, term1068.getClass(), "parentNode", null);
        setField(term1068, term1068.getClass(), "childNodes", term1091);
        setField(term1095, term1095.getClass(), "attributes", term1096);
        setField(term1068, term1068.getClass(), "attributes", term1095);
        setField(term1068, term1068.getClass(), "baseUri", "wGmYcqUkgE");
        setIntField(term1068, term1068.getClass(), "siblingIndex", 1585847225);
        ArrayList term10933 = new ArrayList();
        ((ArrayList) term10933).add((Object)null);
        ((ArrayList) term10933).add((Object)null);
        LinkedHashMap term10936 = new LinkedHashMap();
        term10929 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term10930 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term10935 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term10930, term10930.getClass(), "tagName", "MAcUBcBckh");
        setBooleanField(term10930, term10930.getClass(), "isBlock", true);
        setBooleanField(term10930, term10930.getClass(), "formatAsBlock", false);
        setBooleanField(term10930, term10930.getClass(), "canContainBlock", false);
        setBooleanField(term10930, term10930.getClass(), "canContainInline", true);
        setBooleanField(term10930, term10930.getClass(), "empty", true);
        setBooleanField(term10930, term10930.getClass(), "selfClosing", true);
        setBooleanField(term10930, term10930.getClass(), "preserveWhitespace", false);
        setBooleanField(term10930, term10930.getClass(), "formList", true);
        setBooleanField(term10930, term10930.getClass(), "formSubmit", false);
        setField(term10929, term10929.getClass(), "tag", term10930);
        setField(term10929, term10929.getClass(), "parentNode", null);
        setField(term10929, term10929.getClass(), "childNodes", term10933);
        setField(term10935, term10935.getClass(), "attributes", term10936);
        setField(term10929, term10929.getClass(), "attributes", term10935);
        setField(term10929, term10929.getClass(), "baseUri", "wGmYcqUkgE");
        setIntField(term10929, term10929.getClass(), "siblingIndex", 1585847225);
        ArrayList term10878 = new ArrayList();
        term10877 = newInstance(Class.forName("java.util.Collections$UnmodifiableRandomAccessList"));
        setField(term10877, term10877.getClass(), "list", term10878);
        setField(term10877, term10877.getClass(), "c", term10878);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "textNodes", argTypes, term1068, args);
        assertTrue(recursiveEquals(term1068, term10929));
        assertTrue(recursiveEquals(retValue, term10877));
    }

};


