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

public class Element_html_107840127086 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7795;

    public Element_html_107840127086() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7818 = new ArrayList();
        ((ArrayList) term7818).add((Object)null);
        ((ArrayList) term7818).add((Object)null);
        ((ArrayList) term7818).add((Object)null);
        LinkedHashMap term7823 = new LinkedHashMap();
        term7795 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7796 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7822 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7796, term7796.getClass(), "tagName", "tKmrUDURku");
        setBooleanField(term7796, term7796.getClass(), "isBlock", true);
        setBooleanField(term7796, term7796.getClass(), "formatAsBlock", true);
        setBooleanField(term7796, term7796.getClass(), "canContainBlock", false);
        setBooleanField(term7796, term7796.getClass(), "canContainInline", true);
        setBooleanField(term7796, term7796.getClass(), "empty", false);
        setBooleanField(term7796, term7796.getClass(), "selfClosing", true);
        setBooleanField(term7796, term7796.getClass(), "preserveWhitespace", false);
        setBooleanField(term7796, term7796.getClass(), "formList", true);
        setBooleanField(term7796, term7796.getClass(), "formSubmit", true);
        setField(term7795, term7795.getClass(), "tag", term7796);
        setField(term7795, term7795.getClass(), "parentNode", null);
        setField(term7795, term7795.getClass(), "childNodes", term7818);
        setField(term7822, term7822.getClass(), "attributes", term7823);
        setField(term7795, term7795.getClass(), "attributes", term7822);
        setField(term7795, term7795.getClass(), "baseUri", "fIZsWucfXz");
        setIntField(term7795, term7795.getClass(), "siblingIndex", 1041916673);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "html", argTypes, term7795, args);
    }

};


