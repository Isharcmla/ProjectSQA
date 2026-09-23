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
import java.util.LinkedHashMap;

public class Element_html_107840127090 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7901;

    public Element_html_107840127090() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7923 = new ArrayList();
        ((ArrayList) term7923).add((Object)null);
        ((ArrayList) term7923).add((Object)null);
        ((ArrayList) term7923).add((Object)null);
        ((ArrayList) term7923).add((Object)null);
        ((ArrayList) term7923).add((Object)null);
        ((ArrayList) term7923).add((Object)null);
        ((ArrayList) term7923).add((Object)null);
        LinkedHashMap term7928 = new LinkedHashMap();
        term7901 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7902 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7927 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7902, term7902.getClass(), "tagName", "wwAwLLcLPp");
        setBooleanField(term7902, term7902.getClass(), "isBlock", false);
        setBooleanField(term7902, term7902.getClass(), "formatAsBlock", false);
        setBooleanField(term7902, term7902.getClass(), "canContainInline", true);
        setBooleanField(term7902, term7902.getClass(), "empty", true);
        setBooleanField(term7902, term7902.getClass(), "selfClosing", true);
        setBooleanField(term7902, term7902.getClass(), "preserveWhitespace", false);
        setBooleanField(term7902, term7902.getClass(), "formList", true);
        setBooleanField(term7902, term7902.getClass(), "formSubmit", true);
        setField(term7901, term7901.getClass(), "tag", term7902);
        setField(term7901, term7901.getClass(), "parentNode", null);
        setField(term7901, term7901.getClass(), "childNodes", term7923);
        setField(term7927, term7927.getClass(), "attributes", term7928);
        setField(term7901, term7901.getClass(), "attributes", term7927);
        setField(term7901, term7901.getClass(), "baseUri", "ckQLZGFjMX");
        setIntField(term7901, term7901.getClass(), "siblingIndex", -507387516);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "html", argTypes, term7901, args);
    }

};


