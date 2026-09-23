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

public class Element_html_1078401270105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55469;

    public Element_html_1078401270105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term55495 = new ArrayList();
        ((ArrayList) term55495).add((Object)null);
        ((ArrayList) term55495).add((Object)null);
        ((ArrayList) term55495).add((Object)null);
        ((ArrayList) term55495).add((Object)null);
        term55469 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term55470 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term55491 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term55492 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term55493 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term55499 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term55501 = (Object[]) newArray("java.lang.String", 0);
        Object[] term55502 = (Object[]) newArray("java.lang.String", 0);
        setField(term55470, term55470.getClass(), "tagName", "doQLHkjpNm");
        setBooleanField(term55470, term55470.getClass(), "isBlock", true);
        setBooleanField(term55470, term55470.getClass(), "formatAsBlock", false);
        setBooleanField(term55470, term55470.getClass(), "canContainInline", true);
        setBooleanField(term55470, term55470.getClass(), "empty", true);
        setBooleanField(term55470, term55470.getClass(), "selfClosing", false);
        setBooleanField(term55470, term55470.getClass(), "preserveWhitespace", false);
        setBooleanField(term55470, term55470.getClass(), "formList", true);
        setBooleanField(term55470, term55470.getClass(), "formSubmit", false);
        setField(term55469, term55469.getClass(), "tag", term55470);
        setField(term55491, term55491.getClass(), "referent", null);
        setField(term55492, term55492.getClass(), "lock", term55493);
        setField(term55492, term55492.getClass(), "head", null);
        setLongField(term55492, term55492.getClass(), "queueLength", 1672578078364590450L);
        setField(term55491, term55491.getClass(), "queue", term55492);
        setField(term55491, term55491.getClass(), "next", null);
        setField(term55491, term55491.getClass(), "discovered", null);
        setField(term55469, term55469.getClass(), "shadowChildrenRef", term55491);
        setField(term55469, term55469.getClass(), "childNodes", term55495);
        setIntField(term55499, term55499.getClass(), "size", 954660603);
        setField(term55499, term55499.getClass(), "keys", term55501);
        setField(term55499, term55499.getClass(), "vals", term55502);
        setField(term55469, term55469.getClass(), "attributes", term55499);
        setField(term55469, term55469.getClass(), "baseUri", "lCyLIcSuom");
        setField(term55469, term55469.getClass(), "parentNode", null);
        setIntField(term55469, term55469.getClass(), "siblingIndex", -1351605385);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "html", argTypes, term55469, args);
    }

};


