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
import java.lang.IllegalArgumentException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class FormElement_submit_9147046919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term304;

    public FormElement_submit_9147046919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term331 = new ArrayList();
        ((ArrayList) term331).add((Object)null);
        ((ArrayList) term331).add((Object)null);
        LinkedHashMap term336 = new LinkedHashMap();
        term304 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term305 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term306 = (Object[]) newArray("java.lang.Object", 0);
        Object term309 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term335 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term305, term305.getClass(), "elementData", term306);
        setIntField(term305, term305.getClass(), "size", 0);
        setIntField(term305, term305.getClass(), "modCount", 0);
        setField(term304, term304.getClass(), "elements", term305);
        setField(term309, term309.getClass(), "tagName", "hNxWaHcfhY");
        setBooleanField(term309, term309.getClass(), "isBlock", true);
        setBooleanField(term309, term309.getClass(), "formatAsBlock", true);
        setBooleanField(term309, term309.getClass(), "canContainBlock", true);
        setBooleanField(term309, term309.getClass(), "canContainInline", false);
        setBooleanField(term309, term309.getClass(), "empty", false);
        setBooleanField(term309, term309.getClass(), "selfClosing", false);
        setBooleanField(term309, term309.getClass(), "preserveWhitespace", true);
        setBooleanField(term309, term309.getClass(), "formList", true);
        setBooleanField(term309, term309.getClass(), "formSubmit", false);
        setField(term304, term304.getClass(), "tag", term309);
        setField(term304, term304.getClass(), "parentNode", null);
        setField(term304, term304.getClass(), "childNodes", term331);
        setField(term335, term335.getClass(), "attributes", term336);
        setField(term304, term304.getClass(), "attributes", term335);
        setField(term304, term304.getClass(), "baseUri", "BYqFIqCKAV");
        setIntField(term304, term304.getClass(), "siblingIndex", 391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "submit", argTypes, term304, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


