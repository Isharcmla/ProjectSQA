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
import java.lang.NullPointerException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_lastElementSibling_936429029132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2948;

    public Element_lastElementSibling_936429029132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2971 = new ArrayList();
        ((ArrayList) term2971).add((Object)null);
        LinkedHashMap term2976 = new LinkedHashMap();
        term2948 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2949 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2975 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2949, term2949.getClass(), "tagName", "vGiuZVPJNH");
        setBooleanField(term2949, term2949.getClass(), "isBlock", false);
        setBooleanField(term2949, term2949.getClass(), "formatAsBlock", true);
        setBooleanField(term2949, term2949.getClass(), "canContainBlock", true);
        setBooleanField(term2949, term2949.getClass(), "canContainInline", false);
        setBooleanField(term2949, term2949.getClass(), "empty", false);
        setBooleanField(term2949, term2949.getClass(), "selfClosing", false);
        setBooleanField(term2949, term2949.getClass(), "preserveWhitespace", false);
        setBooleanField(term2949, term2949.getClass(), "formList", true);
        setBooleanField(term2949, term2949.getClass(), "formSubmit", true);
        setField(term2948, term2948.getClass(), "tag", term2949);
        setField(term2948, term2948.getClass(), "parentNode", null);
        setField(term2948, term2948.getClass(), "childNodes", term2971);
        setField(term2975, term2975.getClass(), "attributes", term2976);
        setField(term2948, term2948.getClass(), "attributes", term2975);
        setField(term2948, term2948.getClass(), "baseUri", "FwPbDZcHmB");
        setIntField(term2948, term2948.getClass(), "siblingIndex", 679763016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "lastElementSibling", argTypes, term2948, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


